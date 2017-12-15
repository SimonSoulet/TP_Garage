package com.moteurs;

import java.io.Serializable;

import com.enumerations.TypeMoteur;

public abstract class Moteur implements Serializable {
	
	protected TypeMoteur type;
	protected String cylindre;
	protected double prix;
	
	public Moteur(){ // Constructeur par défaut
		
	}
	
	public Moteur(String cylindre, double prix) { //Constructeur avec paramètres
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
		return " Moteur "+getType()+" de "+this.cylindre;
	}

}
