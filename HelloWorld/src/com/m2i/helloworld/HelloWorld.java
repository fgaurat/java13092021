package com.m2i.helloworld;

public class HelloWorld {

	
	
	
	public static void main(String[] args) {
		MaFenetre f = new MaFenetre();
	}
	
	
	
	
	public static void showSurface(ICalcMath r) {
		System.out.println("showSurface");
		// System.out.println(r.toString());
		System.out.println(r.getSurface());
	}
	
	public static void main_herit_interface(String[] args) {
		
		Rectangle r = new Rectangle(6,5);
		Carre c = new Carre(2);
		Cercle ce = new Cercle(2);
		
		// Rectangle r2 = new Carre(5);
		
		
		
		
		showSurface(r);
		showSurface(c);
		showSurface(ce);
		System.out.println(ce);
		System.out.println(ce.getSurface());
		
	}	
	
	public static void main_obj(String[] args) {
		System.out.println("Hello World");
		

		Carre c = new Carre(2);
		System.out.println(c);
		System.out.println(c.getSurface());

		//Appel du constructeur
//		Rectangle r = new Rectangle(6,5);
//		Rectangle r1 = new Rectangle();
//		System.out.println(r);
//		System.out.println(r1);

		Rectangle r2 = new Rectangle(5,6);
		Rectangle r3 = new Rectangle(5,6);
		
		System.out.println(r2);
		System.out.println(r3);
		
		if(r2==r3) {
			System.out.println("ok");
		}
		else {
			System.out.println("ko");
		}

		if(r2.equals(r3)) {
			System.out.println("ok equals");
		}
		else {
			System.out.println("ko equals");
		}
		
		//		System.out.println(Rectangle.getCpt());
//		System.out.println(Rectangle.getCpt());
		
		// System.out.println("nb rectangles : "+Rectangle.cpt); // 2
		//System.out.println(r.getLongueur());
		//		System.out.println(r.getLargeur());
		//System.out.println(r.getSurface());
		//System.out.println(r1.getSurface());
		
		
		
//		RectangleSingleton rs = RectangleSingleton.getInstance();
//		RectangleSingleton rs1 = RectangleSingleton.getInstance();
//		
//		System.out.println(rs);
//		System.out.println(rs1);
		
		
		
	}

}
