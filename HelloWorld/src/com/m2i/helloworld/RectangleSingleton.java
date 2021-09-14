package com.m2i.helloworld;


// RectangleGeometrique => PascalCase , UpperCamelCase 
// rectangleGeometrique => camelCase
// rectangle_geometrique => snake Case  
// rectangle-geometrique => kebab-case 



//Classes et Interfaces UpperCamelCase
public class RectangleSingleton {
	
	private int longueur;
	private int largeur;
	private static RectangleSingleton instance=null;	
	
	
	// Constructeur par défaut

	private RectangleSingleton(){
		System.out.println("public RectangleSingleton()");
		this.longueur = 0;
		this.largeur= 0;
				
	}
	
	private RectangleSingleton(int longueur, int largeur){
		System.out.println("public RectangleSingleton(int longueur, int largeur)");
		this.longueur = longueur;
		this.largeur = largeur;
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
		this.longueur = longueur;
	}
	
	/**
	 * @return the largeur
	 */
	public int getLargeur() {
		return largeur;
	}
	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	
	
	public int getSurface() {
		return this.longueur * this.largeur;
	}
	
	public static RectangleSingleton getInstance() {
		
		if (instance == null) {
			instance =new RectangleSingleton(); 
		}
		return instance; 
	}

}
