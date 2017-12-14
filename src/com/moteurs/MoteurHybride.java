package com.moteurs;

import com.enumerations.TypeMoteur;

public class MoteurHybride extends Moteur {
	
	public MoteurHybride() { //Constructeur par défaut
		super();
	}
	
	public MoteurHybride(String cylindre, double prix) { //Constructeur avec paramètres
		super(cylindre, prix);
	}
	
	//Getteur
	public TypeMoteur getType(){
		return TypeMoteur.Hybride;
	}

}
