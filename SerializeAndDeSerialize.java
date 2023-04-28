package com.ericsson.java.training;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class SerializeAndDeSerialize  {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileOutputStream fOs = new FileOutputStream("MyProduct.obj");
		ObjectOutputStream oOs = new ObjectOutputStream(fOs);
		product prod = new product(1, "Mobile", 1000);
		oOs.writeObject(prod);
		oOs.close();
		fOs.close();
		
		FileInputStream fIs = new FileInputStream("MyProduct.obj");
		ObjectInputStream oIs = new ObjectInputStream(fIs);
		product prod1 = (product)oIs.readObject();
		System.out.println(prod1.toString());
		oIs.close();
		fIs.close();
	}

}
