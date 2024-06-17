package com.Day27;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtil {

	public static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static boolean isPalindrome(String string) {
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equals(reversed);
    }

    public static String toUpper(String string) {
        return string.toUpperCase();
    }

    public static boolean isEmpty(String string) {
        return string.isEmpty();
    }

}
