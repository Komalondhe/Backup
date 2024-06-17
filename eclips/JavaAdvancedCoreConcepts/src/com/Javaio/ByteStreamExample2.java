package com.Javaio;

//Byte Stream Example
//Writing to a File using FileOutputStream:
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample2 {// To Write
  public static void main(String[] args) {
      try (FileOutputStream outputStream = new FileOutputStream("example.txt")) {
          String text = "Hello, World!";
          outputStream.write(text.getBytes());
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}