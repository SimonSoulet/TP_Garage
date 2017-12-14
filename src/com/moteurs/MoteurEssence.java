package com.moteurs;

import com.enumerations.TypeMoteur;

public class MoteurEssence extends Moteur {
	
	public MoteurEssence() { //Constructeur par défaut
		super();
	}
	
	public MoteurEssence(String cylindre, double prix) { //Constructeur avec paramètres
		super(cylindre, prix);
	}
	
	//Getteur
	public TypeMoteur getType() {
		return TypeMoteur.Essence;
	}

}
