package com.Day16;
import java.util.ArrayList;
import java.util.List;
public class NaivePatternSearch {
public static class SearchResult {
List<Integer> occurrences;
int comparisons;
public SearchResult(List<Integer> occurrences, int comparisons) {
this.occurrences = occurrences;
this.comparisons = comparisons;
}
@Override
public String toString() {
return "Occurrences: " + occurrences + "\nComparisons: " + comparisons;
}
}
public static SearchResult naivePatternSearch(String text, String pattern) {
int textLength = text.length();
int patternLength = pattern.length();
int comparisons = 0;
List<Integer> occurrences = new ArrayList<>();
for (int i = 0; i <= textLength - patternLength; i++) {
boolean match = true;
for (int j = 0; j < patternLength; j++) {
comparisons++;
if (text.charAt(i + j) != pattern.charAt(j)) {
match = false;
break;
}
}
if (match) {
occurrences.add(i);
}
}
return new SearchResult(occurrences, comparisons);
}
public static void main(String[] args) {
String text = "ABABDABACDABABCABAB";
String pattern = "ABABCABAB";
SearchResult result = naivePatternSearch(text, pattern);
System.out.println(result);
}
}
