package com.m2i.tpgenerics;

public class Main {

	public static void main(String[] args) {
		
		
		Rectangle<Integer> r = new Rectangle<Integer>(1,2);
		
		System.out.println(r.getSurface());
		Rectangle<Double> r2 = new Rectangle<Double>(1.3,2.6);
		
		System.out.println(r2);
		System.out.println(r2.getSurface());
		
		Rectangle<Integer> r3 = new Rectangle<Integer>();
		System.out.println(r3);

		
	}

}
