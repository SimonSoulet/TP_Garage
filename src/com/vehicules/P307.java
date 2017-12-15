package com.vehicules;

import com.enumerations.MarqueVehicule;

public class P307 extends Vehicule {
	
	public P307() {
		super();
	}
	
	public MarqueVehicule getMarque() {
		return MarqueVehicule.Peugeot;
	}
	
	public double getPrix() {
		return 28457.0;
	}
	
	public String getNom() {
		return "307";
	}
	
}
