package com.m2i.tpexception;

public class CallCalculette {

	
	public static double callDivision(int a,int b) {
		double result = 0;
		try {
			
			result =Calculette.division(a, b);
		}
		finally {
			
			System.out.println("finally result "+result);
		}
		return result ;
		
		
	}
	
}
