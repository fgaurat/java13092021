package com.m2i.tpexception;

public class Calculette {
	
	
	public static double division(int a, int b) throws Exception {

		if (b==0) {
			Exception e = new Exception("Division par Zéro !");
			throw e;
		}
		return a/b;
	}
}
