package com.m2i.tpexception;

public class CallCalculette {

	public static double callDivision(int a, int b) throws Exception {
		double result = 0;
		try {

			result = Calculette.division(a, b);
		}

		catch (Exception e) {
			System.out.println("Dans le catch CallCalculette");
			throw e;
		} finally {

			System.out.println("finally result " + result);

		}
		return result;

	}

}
