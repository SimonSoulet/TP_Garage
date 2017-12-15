package com.vehicules;

import com.enumerations.MarqueVehicule;

public class Laguna extends Vehicule {
	
	public Laguna() {
		super();
	}
	
	public MarqueVehicule getMarque() {
		return MarqueVehicule.Renault;
	}
	
	public double getPrix() {
		return 23123.0;
	}
	
	public String getNom() {
		return "Laguna";
	}

}
