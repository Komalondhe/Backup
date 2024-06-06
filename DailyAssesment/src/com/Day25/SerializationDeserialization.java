package com.Day25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.Day24.Person;

public class SerializationDeserialization {

	public static void main(String[] args) {
		Person  person=new Person("komal",22);
		String filenameString="person.user";
		try (FileOutputStream fileOutputStream=new FileOutputStream(filenameString);
				ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream)){
			outputStream.writeObject(person);
			System.out.println("Serilized data is saved in:"+filenameString);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		Person deserializationPerson=null;
		try(FileInputStream fileInput=new FileInputStream(filenameString);
				ObjectInputStream in=new ObjectInputStream(fileInput)
				) {
			deserializationPerson=(Person) in.readObject();
			
			
		} catch ( IOException | ClassNotFoundException i) {
			i.printStackTrace();
			
		}
		System.out.println("Deserialization person: " +deserializationPerson);
		

	}
	 static class Person implements Serializable{
		 private static final long SerialVersionUID=1L;
		 private String nameString;
		 private int age;
		public Person(String nameString, int age) {
			super();
			this.nameString = nameString;
			this.age = age;
		}
		public String getNameString() {
			return nameString;
		}
		
		public int getAge() {
			return age;
		}
		@Override
		public String toString() {
			return "Person{name='"+nameString+"',age="+age+"}";
			
		}
		 
	 }

}
