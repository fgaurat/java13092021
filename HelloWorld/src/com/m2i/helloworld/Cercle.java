package com.m2i.helloworld;

public class Cercle implements ICalcMath{
	
	private int rayon;

	public Cercle(int rayon) {
		super();
		this.rayon = rayon;
	}
	
	public Cercle() {
		super();
		this.rayon = 0;
	}

	/**
	 * @return the rayon
	 */
	public int getRayon() {
		return rayon;
	}

	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + this.rayon + "]";
	}

	@Override
	public double getSurface() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(this.rayon, 2);
	}
	

	
}
