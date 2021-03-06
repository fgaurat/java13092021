package com.m2i.tpgenerics;

import java.io.Serializable;

// RectangleGeometrique => PascalCase , UpperCamelCase 
// rectangleGeometrique => camelCase
// rectangle_geometrique => snake Case  
// rectangle-geometrique => kebab-case 



//Classes et Interfaces UpperCamelCase
public class Rectangle<T extends Number> implements ICalcMath{
	
	private T longueur;
	private T largeur;
	private static int cpt=0;
	
	// Constructeur par défaut
	public Rectangle(){
		System.out.println("public Rectangle()");
		this.longueur = (T)Integer.valueOf(0);
		this.largeur= (T)Integer.valueOf(0);
		cpt++;
				
	}
	
	public Rectangle(T longueur, T largeur){
		System.out.println("public Rectangle(T longueur, T largeur)");
		this.longueur = longueur;
		this.largeur = largeur;
		cpt++;
	}
	
	
	/**
	 * @return the longueur
	 */
	public T getLongueur() {
		return longueur;
	}
	
	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(T longueur) {
		this.longueur = longueur;
	}
	
	/**
	 * @author fgaurat
	 * @return the largeur
	 */
	public T getLargeur() {
		return largeur;
	}
	
	
	/**
	 * set the largeur value
	 * 
	 * @param largeur the largeur to set
	 */
	public void setLargeur(T largeur) {

		
		this.largeur = largeur;
	}
	
	
	public static int getCpt() {
		return cpt;
	}
	
	
	public double getSurface() {
		return this.longueur.doubleValue() * this.largeur.doubleValue();
	}
	
	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
				
		// TODO Auto-generated method stub
		return this.longueur == r.longueur && this.largeur == r.largeur; 
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "Rectangle longueur : "+this.longueur+", largeur : "+this.largeur;
	}
	

}
