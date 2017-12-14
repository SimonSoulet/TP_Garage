package com.moteurs;

import com.enumerations.TypeMoteur;

public class MoteurHybride extends Moteur {
	
	public MoteurHybride() { //Constructeur par d�faut
		super();
	}
	
	public MoteurHybride(String cylindre, double prix) { //Constructeur avec param�tres
		super(cylindre, prix);
	}
	
	//Getteur
	public TypeMoteur getType(){
		return TypeMoteur.Hybride;
	}

}
