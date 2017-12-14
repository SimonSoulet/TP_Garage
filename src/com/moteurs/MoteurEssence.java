package com.moteurs;

import com.enumerations.TypeMoteur;

public class MoteurEssence extends Moteur {
	
	public MoteurEssence() { //Constructeur par d�faut
		super();
	}
	
	public MoteurEssence(String cylindre, double prix) { //Constructeur avec param�tres
		super(cylindre, prix);
	}
	
	//Getteur
	public TypeMoteur getType() {
		return TypeMoteur.Essence;
	}

}
