package com.moteurs;

import com.enumerations.TypeMoteur;

public abstract class Moteur {
	
	protected TypeMoteur type;
	protected String cylindre;
	protected double prix;
	
	public Moteur(){ // Constructeur par d�faut
		
	}
	
	public Moteur(String cylindre, double prix) { //Constructeur avec param�tres
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	//Getteur
	public TypeMoteur getType() {
		return type;
	}
	
	public String getCylindre() {
		return cylindre;
	}
	
	public double getPrix() {
		return prix;
	}
	
	//Setteur
	public void SetCylindre(String cylindre) {
		this.cylindre = cylindre;
	}
	
	public void SetPrix(double prix) {
		this.prix = prix;
	}
	
	public String toString() { // Retourne la description du moteur
		return "\tMoteur "+this.getType()+"de "+this.cylindre;
	}

}
