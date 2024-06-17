package com.Day27;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilTest {

	@Test
    public void testReverse() {
        assertEquals("olleh", StringUtil.reverse("hello"));
        assertEquals("", StringUtil.reverse(""));
        assertEquals("a", StringUtil.reverse("a"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(StringUtil.isPalindrome("madam"));
        assertFalse(StringUtil.isPalindrome("hello"));
        assertTrue(StringUtil.isPalindrome(""));
    }

    @Test
    public void testToUpper() {
        assertEquals("HELLO", StringUtil.toUpper("hello"));
        assertEquals("HELLO", StringUtil.toUpper("Hello"));
        assertEquals("", StringUtil.toUpper(""));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtil.isEmpty(""));
        assertFalse(StringUtil.isEmpty("hello"));
        assertFalse(StringUtil.isEmpty(" "));
    }

}
