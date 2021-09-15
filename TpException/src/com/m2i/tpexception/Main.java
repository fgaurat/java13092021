package com.m2i.tpexception;

public class Main {

	public static void main(String[] args) {
			
		try{	
			int a =2;
			int b =0;
			int c = a/b;
			System.out.println(c);
			
		}

		catch(ArithmeticException e) {
			System.out.println("ArithmeticException !");
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Exception !");
			System.out.println(e);
		}
		finally {
			System.out.println("après finally");
		}
		
		System.out.println("après");
		
			

	}

}
