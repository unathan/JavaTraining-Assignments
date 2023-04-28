package com.ericsson.java.training.collections;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

class Product {
	private Integer id;
	private String name;

	private float price;
	private String category;

	public Product() {
	}

	public Product(Integer id, String name, float price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	public void print()
	{
		System.out.println("========================");
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.category);
		System.out.println("========================");
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}

}

public class ProductManagementApp {
	HashMap<Integer, Product> myProdList = new HashMap<Integer, Product>();
	public void add(Integer pId, String pName, float pPrice, String pCat)
	{
		Product nProd = new Product(pId, pName, pPrice, pCat); 
		myProdList.put(pId, nProd);
	}
	public void Update(Integer pId, String pName, float pPrice, String pCat)
	{
		Product nProd = new Product(pId, pName, pPrice, pCat); 
		myProdList.replace(pId, nProd);
	}
	public Product Get(Integer pId)
	{
		Product rProd = myProdList.get(pId);
		return rProd;
	}
	public void Delete(Integer pId)
	{
		 myProdList.remove(pId);
	}
	public HashMap<Integer, Product> GetAll()
	{
		return myProdList;
	}
	
	public HashMap<Integer, Product> GetBetween(float pPriceStart, float pPriceEnd)
	{
		HashMap<Integer, Product> demandList = new HashMap<Integer, Product>();
		for(HashMap.Entry mEntry:myProdList.entrySet())
		{
			Product currProd = (Product) mEntry.getValue();
			if ((currProd.getPrice() > pPriceStart) && (currProd.getPrice() < pPriceEnd))
			{
				demandList.put( currProd.getId(), currProd);
			}
					
		}
		
		return demandList;
	}
	public static void main(String[] args) {
		// HashMap<int,int> myM = new HashMap<>();
		ProductManagementApp pmApp = new ProductManagementApp();
		Scanner scan = new Scanner(System.in);
		Integer lCon = 0;
		do 
		{
		System.out.println("Select the operation\n 1.Add\n 2.Update\n3.Delete\n4.Get\n5.GetAll\n6.GetAllBetween\n");
		Integer operSel = scan.nextInt();
		switch (operSel) {
		case 1: {
			//Add
			System.out.println("Enter Details to add Product");
			System.out.println("Enter Product ID");
			Integer lPid = scan.nextInt();
			System.out.println("Enter Product Name");
			String lPname = scan.next();
			System.out.println("Enter Product Price");
			float lPprice = scan.nextFloat();
			System.out.println("Enter Product Category");
			String lPcat = scan.next();
			pmApp.add(lPid,lPname,lPprice,lPcat);
			break;
		}
		case 2: {
			//Update
			System.out.println("Enter Details to Update Product");
			System.out.println("Enter Product ID");
			Integer lPid = scan.nextInt();
			System.out.println("Enter Product Name");
			String lPname = scan.next();
			System.out.println("Enter Product Price");
			float lPprice = scan.nextFloat();
			System.out.println("Enter Product Category");
			String lPcat = scan.next();
			pmApp.Update(lPid,lPname,lPprice,lPcat);
			break;
		}
		case 3: {
			//Delete a Product
			System.out.println("Enter Details to delete a Product");
			System.out.println("Enter Product ID");
			Integer lPid = scan.nextInt();
			pmApp.Delete(lPid);
			break;
		}
		case 4: {
			//Get
			System.out.println("Enter Details to get a Product");
			System.out.println("Enter Product ID");
			Integer lPid = scan.nextInt();
			Product gProd = pmApp.Get(lPid);
			gProd.print();
			break;
		}
		case 5: {
			//getAll
			//System.out.println(pmApp.GetAll());
			HashMap<Integer, Product> dList = pmApp.GetAll();
			for(HashMap.Entry mEntry:dList.entrySet())
			{
				Product lProd = (Product) mEntry.getValue();
				lProd.print();
			}
			break;
		}
		case 6: {
			//GetBetween
			System.out.println("Enter Product starting Price");
			float lPpriceStart = scan.nextFloat();
			System.out.println("Enter Product Ending Price");
			float lPpriceEnd = scan.nextFloat();
			//System.out.println(pmApp.GetBetween(lPpriceStart, lPpriceEnd));
			HashMap<Integer, Product> dList = pmApp.GetBetween(lPpriceStart, lPpriceEnd);
			for(HashMap.Entry mEntry:dList.entrySet())
			{
				Product lProd = (Product) mEntry.getValue();
				lProd.print();
			}
			break;
		}
		default: {
			System.out.println("Invalid Selection");
		}
		}
		System.out.println("Enter 1 to continue or 0 to exit");
		lCon = scan.nextInt();
		}while(lCon == 1);
		scan.close();
	}

}
