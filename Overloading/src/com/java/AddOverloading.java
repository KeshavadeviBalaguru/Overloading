package com.java;

class AddFunction
{
	void add(int i,int j)
	{
		int s=i+j;
		System.out.println("The Sum of" +i+" and "+j+ " is = " +s);
	}
	void add(float i,float j)
	{
		float s=i+j;
		System.out.println("The Sum of" +i+" and "+j+ " is = " +s);
	}
	void add(double i,double j)
	{

		double s=i+j;
		System.out.println("The Sum of " +i+" and "+j+ " is = "+s);
	}
	
}
public class AddOverloading {

	public static void main(String[] args) {
		AddFunction af=new AddFunction();
		af.add(2, 5);
		af.add(4f, 7f);
		af.add(6, 12);
		// TODO Auto-generated method stub

	}

}
