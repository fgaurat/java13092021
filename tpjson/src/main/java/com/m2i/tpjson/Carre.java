package com.m2i.tpjson;

public class Carre extends Rectangle {

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
