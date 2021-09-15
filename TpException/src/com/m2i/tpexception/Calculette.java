package com.m2i.tpexception;

public class Calculette {
	
	
	public static double division(int a, int b) throws Exception{

		if (b==0) {
//			Exception e = new Exception("Division par Zéro !");
//			throw e;
			throw new Exception("Division par Zéro !");
		}
		else if (b==12){
			throw new DivBy12Exception();
		}
		return a/b;
	}
}
