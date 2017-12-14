package com.moteurs;

import com.enumerations.TypeMoteur;

public class MoteurDiesel extends Moteur {
	
	public MoteurDiesel() { //Constructeur par d�faut
		super();
	}
	
	public MoteurDiesel(String cylindre, double prix) { //Constructeur avec param�tres
		super(cylindre, prix);
	}
	
	//Getteur
	public TypeMoteur getType() {
		return TypeMoteur.Diesel;
	}

}
