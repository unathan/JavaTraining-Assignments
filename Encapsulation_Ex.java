package com.ericsson.java.training;
import java.io.Serializable;
class product implements Serializable
{
	private int id;
	private String name;
	private float price;
	
	
	public product() {
		
	}

	public product(int id, String name, float price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if (0 < id)
			this.id = id;
		else
			System.out.println("Invalid input for ID");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
public class Encapsulation_Ex {

	public static void main(String[] args) {
		product watch = new product();
		watch.setId(-1);
		watch.setId(1);
		watch.setName("FastTrack");
		watch.setPrice(5000);
		System.out.println(watch.getId()+" "+ watch.getName()+" "+ watch.getPrice());

	}

}
