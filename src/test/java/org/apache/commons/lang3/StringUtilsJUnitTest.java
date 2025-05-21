package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsJUnitTest {

    @Test
    public void testIsBlankWithEmptyString() {
        assertTrue("Empty string should be blank", StringUtils.isBlank(""));
    }

    @Test
    public void testIsBlankWithWhitespace() {
        assertTrue("Whitespace string should be blank", StringUtils.isBlank("   "));
    }

    @Test
    public void testIsBlankWithNormalString() {
        assertFalse("Normal string should not be blank", StringUtils.isBlank("test"));
    }

    @Test
    public void testIsBlankWithSingleCharacter() {
        // ??????????????????
        assertFalse("Single character should not be blank", StringUtils.isBlank("a"));
    }

    @Test
    public void testIsBlankWithSingleWhitespace() {
        assertTrue("Single whitespace should be blank", StringUtils.isBlank(" "));
    }

    @Test
    public void testIsEmptyWithEmptyString() {
        assertTrue("Empty string should be empty", StringUtils.isEmpty(""));
    }

    @Test
    public void testIsEmptyWithWhitespace() {
        assertFalse("Whitespace string should not be empty", StringUtils.isEmpty("   "));
    }

    @Test
    public void testIsEmptyWithNormalString() {
        assertFalse("Normal string should not be empty", StringUtils.isEmpty("test"));
    }

    @Test
    public void testTrimWithEmptyString() {
        assertEquals("Trimming empty string should return empty string", "", StringUtils.trim(""));
    }

    @Test
    public void testTrimWithWhitespace() {
        assertEquals("Trimming whitespace should return empty string", "", StringUtils.trim("   "));
    }

    @Test
    public void testTrimWithPaddedString() {
        assertEquals("Trimming padded string should return trimmed string", "test", StringUtils.trim("  test  "));
    }
}