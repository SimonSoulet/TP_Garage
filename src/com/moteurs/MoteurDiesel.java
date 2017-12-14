package com.moteurs;

import com.enumerations.TypeMoteur;

public class MoteurDiesel extends Moteur {
	
	public MoteurDiesel() { //Constructeur par défaut
		super();
	}
	
	public MoteurDiesel(String cylindre, double prix) { //Constructeur avec paramètres
		super(cylindre, prix);
	}
	
	//Getteur
	public TypeMoteur getType() {
		return TypeMoteur.Diesel;
	}

}
