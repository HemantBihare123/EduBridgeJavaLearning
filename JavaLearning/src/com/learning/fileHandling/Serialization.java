package com.learning.fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

// writeObject method 
public class Serialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101, "Arjun", 25000);
		File file = new File("D:\\filecreation3.txt");
		OutputStream out = new FileOutputStream(file);
		ObjectOutputStream outputStream = new ObjectOutputStream(out);
		outputStream.writeObject(emp);
		outputStream.close();
		System.out.println("Object serialized successfully");

	}

}
