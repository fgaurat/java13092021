package com.m2i.tpcollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5,6);
		Rectangle r2 = new Rectangle(15,16);
		Rectangle r3 = new Rectangle(25,26);
		Rectangle r4 = new Rectangle(7,8);
		
		//List<Rectangle> arr = new ArrayList<Rectangle>();
		List<Rectangle> arr = new LinkedList<Rectangle>();
		
		arr.add(r1);
		arr.add(r2);
		arr.add(r3);
		arr.add(r4);
		
		
		System.out.println(arr.get(1));
		System.out.println(arr.size());
		
		/*
		for(int i =0;i<10;i++) {
			System.out.println(i);
		}*/
		System.out.println("Boucle for");
		for(Rectangle r:arr) {
			
			System.out.println(r);
		}
		
		
		// arr.forEach(new Consumer<Rectangle>() {});
		
		System.out.println("méthode forEach");
		arr.stream().forEach(new Consumer<Rectangle>() {

			@Override
			public void accept(Rectangle t) {
				System.out.println(t);
				
			}
		});
		
		System.out.println("méthode forEach avec lambda");
		arr.stream().forEach(
			(Rectangle t) ->{
				System.out.println(t);				
			}
		);

		
		arr.stream().forEach((Rectangle t) -> {System.out.println(t);});
		
		arr.stream().forEach(t -> {System.out.println(t);});
		
		System.out.println("méthode forEach avec method reference");
		
		arr.stream().forEach(System.out::println);
		
		System.out.println("méthode filter avec method reference");
		List<Rectangle> filteredRectangle = arr.stream()
													.filter( r-> r.getSurface()<100)
													.collect(Collectors.toList());
		
		for(Rectangle r:filteredRectangle) {
			System.out.println(r);
		}

		List<Double> allSurfaces = arr.stream()
				.filter( r-> r.getSurface()<100)
				.map(r -> r.getSurface())
				.collect(Collectors.toList());

		for(Double d:allSurfaces) {
			System.out.println(d);
		}

		
		/*
		Map<String, Rectangle> m = new HashMap<String, Rectangle>();
		
		m.put("r1", r1);
		m.put("r2", r2);
		m.put("r3", r3);
		
		System.out.println(m);
		
		Rectangle r = m.get("r1");
		System.out.println(r);
		*/
		
		
		

	}

}
