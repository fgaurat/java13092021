package com.m2i.tpjson;

// RectangleGeometrique => PascalCase , UpperCamelCase 

// rectangleGeometrique => camelCase
// rectangle_geometrique => snake Case  
// rectangle-geometrique => kebab-case 

//Classes et Interfaces UpperCamelCase
public class Rectangle implements ICalcMath {

	private int longueur;
	private int largeur;
	private static int cpt = 0;

	// Constructeur par défaut

	public Rectangle() {
		System.out.println("public Rectangle()");
		this.longueur = 0;
		this.largeur = 0;
		cpt++;

	}

	public Rectangle(int longueur, int largeur) {
		System.out.println("public Rectangle(int longueur, int largeur)");
		this.longueur = longueur;
		this.largeur = largeur;
		cpt++;
	}

	/**
	 * @return the longueur
	 */
	public int getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(int longueur) {
		if (longueur > 0) {
			this.longueur = longueur;
		}
	}

	/**
	 * @author fgaurat
	 * @return the largeur
	 */
	public int getLargeur() {
		return largeur;
	}

	/**
	 * set the largeur value
	 * 
	 * @param largeur the largeur to set
	 */
	public void setLargeur(int largeur) {

		this.largeur = largeur;
	}

	public static int getCpt() {
		return cpt;
	}

	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle) obj;

		// TODO Auto-generated method stub
		return this.longueur == r.longueur && this.largeur == r.largeur;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "Rectangle longueur : " + this.longueur + ", largeur : " + this.largeur;
	}

	@Override
	public double getSurface() {
		// TODO Auto-generated method stub
		return this.longueur * this.largeur;
	}
}
