package com.m2i.tpio;

public class Carre extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2268951786825920512L;
	private int cote;

	public Carre(int cote) {
		super(cote, cote);
		System.out.println("public Carre(int cote)");

		this.cote = cote;
	}

	public Carre() {
		// super();
		System.out.println("public Carre()");
		this.cote = 0;
	}

	/**
	 * @return the cote
	 */
	public int getCote() {
		return cote;
	}

	/**
	 * @param cote the cote to set
	 */
	public void setCote(int cote) {
		super.setLargeur(cote);
		super.setLongueur(cote);

		this.cote = cote;
	}

	@Override
	public String toString() {
		return "Carre [cote=" + cote + "]";
	}

}
