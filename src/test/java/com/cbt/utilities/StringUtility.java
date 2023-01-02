package com.cbt.utilities;

public class StringUtility {
    //5. Create class StringUtility under utilities package.
    //6. Create a public static method verify Equals which takes twos string arguments,
    //expected and actual.
    //7. The method prints`PASS`if both strings are equals to each other.Else it prints
    // FAIL` and it also prints the values of both arguments.

    public static void verifyEquals(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
    }
}
