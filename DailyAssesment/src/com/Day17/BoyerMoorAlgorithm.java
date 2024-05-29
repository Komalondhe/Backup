package com.Day17;
public class BoyerMoorAlgorithm {
public static int boyerMooreLastOccurrence(String text, String
pattern) {
int textLength = text.length();
int patternLength = pattern.length();
if (patternLength > textLength) {
return -1; // Pattern is longer than text, no match possible
}
int[] badChar = createBadCharTable(pattern);
int lastIndex = -1;
int shift = 0;
while (shift <= (textLength - patternLength)) {
int j = patternLength - 1;
while (j >= 0 && pattern.charAt(j) == text.charAt(shift + j)) {
j--;
}
if (j < 0) {
lastIndex = shift;
shift += (shift + patternLength < textLength) ?
patternLength - badChar[text.charAt(shift + patternLength)] : 1;
} else {
shift += Math.max(1, j - badChar[text.charAt(shift + j)]);
}
}
return lastIndex;
}
private static int[] createBadCharTable(String pattern) {
final int ALPHABET_SIZE = 256; // Assuming ASCII characterset
int[] badChar = new int[ALPHABET_SIZE];
for (int i = 0; i < ALPHABET_SIZE; i++) {
badChar[i] = -1;
}
for (int i = 0; i < pattern.length(); i++) {
badChar[pattern.charAt(i)] = i;
}
return badChar;
}
public static void main(String[] args) {
String text = "ABABDABACDABABCABAB";
String pattern = "ABABCABAB";
int lastIndex = boyerMooreLastOccurrence(text, pattern);
if (lastIndex != -1) {
System.out.println("Last occurrence of pattern found atindex " + lastIndex);
} else {
System.out.println("Pattern not found in the text.");
}
}
}
