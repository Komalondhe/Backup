package com.Day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class FileReadWrite {
	public static void main(String args[]) throws IOException {
		String input="C:\\Users\\Administrator\\eclipse-wiproPractise\\JavaAdvancedCoreConcepts\\input.txt";
		String output="output.txt";
		Map<String,Integer>wordCountMap=new HashMap<>();
		try (BufferedReader reader=new BufferedReader(new FileReader(input))){
			String lineString;
			while((lineString=reader.readLine())!=null) {
				String[]words=lineString.split("\\W+");
				for(String word:words) {
					if(word.isEmpty()) {
						continue;
					}
					word=word.toLowerCase();
					wordCountMap.put(word, wordCountMap.getOrDefault(words,0)+1);
					
					
				}
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		try (BufferedWriter writer=new BufferedWriter(new FileWriter(output))){
			for(Map.Entry<String, Integer>entry:wordCountMap.entrySet()) {
			writer.write(entry.getKey()+":"+entry.getValue());
			writer.newLine();}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}

}
