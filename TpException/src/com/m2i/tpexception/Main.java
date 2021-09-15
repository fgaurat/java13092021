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
		
			System.err.println("Erreur !");
			System.err.println(e);
		}
		
		
			

	}

}
