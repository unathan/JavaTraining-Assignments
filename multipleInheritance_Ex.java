package com.ericsson.java.training;
interface parentA
{
	//int var = 10;
	public void m1();
}
interface parentB
{
	//int var = 10;
	public void m1();
}
class child implements parentA, parentB
{
	//int var = 20;
	public void m1()
	{
		
	}
  public void print()
  {
	 // System.out.println(var);
  }
}
public class multipleInheritance_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
