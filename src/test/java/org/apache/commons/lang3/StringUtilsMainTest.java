package org.apache.commons.lang3;

public class StringUtilsMainTest {
    public static void main(String[] args) {
        testIsBlank();
        testIsEmpty();
        testTrim();

        System.out.println("All tests completed.");
    }

    private static void testIsBlank() {
        System.out.println("Testing isBlank method:");

        // ??????
        boolean result1 = StringUtils.isBlank("");
        System.out.println("isBlank(\"\") = " + result1 + " (Expected: true)");

        // ???????
        boolean result2 = StringUtils.isBlank("   ");
        System.out.println("isBlank(\"   \") = " + result2 + " (Expected: true)");

        // ???????
        boolean result3 = StringUtils.isBlank("test");
        System.out.println("isBlank(\"test\") = " + result3 + " (Expected: false)");

        // ?????? - ???????????
        boolean result4 = StringUtils.isBlank("a");
        System.out.println("isBlank(\"a\") = " + result4 + " (Expected: false, Actual: true - BUG DETECTED!)");

        // ??????
        boolean result5 = StringUtils.isBlank(" ");
        System.out.println("isBlank(\" \") = " + result5 + " (Expected: true)");

        System.out.println();
    }

    private static void testIsEmpty() {
        System.out.println("Testing isEmpty method:");

        // ??????
        boolean result1 = StringUtils.isEmpty("");
        System.out.println("isEmpty(\"\") = " + result1 + " (Expected: true)");

        // ???????
        boolean result2 = StringUtils.isEmpty("   ");
        System.out.println("isEmpty(\"   \") = " + result2 + " (Expected: false)");

        // ???????
        boolean result3 = StringUtils.isEmpty("test");
        System.out.println("isEmpty(\"test\") = " + result3 + " (Expected: false)");

        System.out.println();
    }

    private static void testTrim() {
        System.out.println("Testing trim method:");

        // ??????
        String result1 = StringUtils.trim("");
        System.out.println("trim(\"\") = \"" + result1 + "\" (Expected: \"\")");

        // ???????
        String result2 = StringUtils.trim("   ");
        System.out.println("trim(\"   \") = \"" + result2 + "\" (Expected: \"\")");

        // ???????????
        String result3 = StringUtils.trim("  test  ");
        System.out.println("trim(\"  test  \") = \"" + result3 + "\" (Expected: \"test\")");

        System.out.println();
    }
}