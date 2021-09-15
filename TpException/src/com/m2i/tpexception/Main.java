package com.m2i.tpexception;

public class Main {

	public static void main(String[] args) {
		int a = 2;
		int b = 12;
		int c = a / b;
		double r = 0;
		try {
			r = Calculette.division(a, b);

		} catch (DivBy12Exception e) {
			// System.err.println(e);
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(r);

	}

	public static void main_01(String[] args) {

		try {
			int a = 2;
			int b = 0;
			// int c = a/b;
			// double c = Calculette.division(a, b);
			double c = CallCalculette.callDivision(a, b);
			System.out.println(c);

		}

		catch (ArithmeticException e) {
			System.out.println("ArithmeticException !");
			System.out.println(e);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception !");
			System.out.println(e);
			e.printStackTrace();
		}

		System.out.println("après");

	}

}
