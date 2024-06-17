package com.Day25;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadWriteWithNIO {

	public static void main(String[] args) {
		String inputFile="input.txt";
		String outputFile="output.txt";
		Path inputPath=Paths.get("C:\\Users\\Administrator\\eclipse-wiproPractise\\JavaAdvancedCoreConcepts");
		Path outputPath=Paths.get("C:\\Users\\Administrator\\eclipse-wiproPractise\\JavaAdvancedCoreConcepts");
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		try (FileChannel inputChannel=FileChannel.open(inputPath, StandardOpenOption.READ);
				FileChannel outputChannel=FileChannel.open(outputPath, StandardOpenOption.CREATE,StandardOpenOption.WRITE)){

			while(inputChannel.read(buffer)>0) {
				buffer.flip();
				
				outputChannel.write(buffer);
				buffer.clear();
			}
			System.out.println("File content copied from "+inputFile+"to"+outputFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
