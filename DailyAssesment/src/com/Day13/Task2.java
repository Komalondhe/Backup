package com.Day13;


import java.util.HashMap;
import java.util.Map;
class TrieNode {
Map<Character, TrieNode> children;
boolean isEndOfWord;
public TrieNode() {
children = new HashMap<>();
isEndOfWord = false;
}
}
class Trie {
private TrieNode root;
public Trie() {
root = new TrieNode();
}
// Method to insert a word into the trie
public void insert(String word) {
TrieNode current = root;
for (char c : word.toCharArray()) {
current.children.putIfAbsent(c, new TrieNode());
current = current.children.get(c);
}
current.isEndOfWord = true;
}
// Method to check if there is any word in the trie that starts with
//the given prefix
public boolean startsWith(String prefix) {
TrieNode current = root;
for (char c : prefix.toCharArray()) {
current = current.children.get(c);
if (current == null) {
return false;
}
}
return true;
}
}
// Test the implementation
public class Task2 {
public static void main(String[] args) {
Trie trie = new Trie();
trie.insert("apple");
trie.insert("app");
trie.insert("application");
trie.insert("banana");
System.out.println(trie.startsWith("app"));
System.out.println(trie.startsWith("ban"));
System.out.println(trie.startsWith("bat"));
System.out.println(trie.startsWith("applepie"));
}
}
