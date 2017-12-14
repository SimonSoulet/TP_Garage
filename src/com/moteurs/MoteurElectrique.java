package com.moteurs;

import com.enumerations.TypeMoteur;

public class MoteurElectrique extends Moteur {
	
	public MoteurElectrique() { //Constructeur par défaut
		super();
	}
	
	public MoteurElectrique(String cylindre, double prix) { //Constructeur avec paramètres
		super(cylindre, prix);
	}
	
	//Getteur
	public TypeMoteur getType() {
		return TypeMoteur.Electrique;
	}

}
