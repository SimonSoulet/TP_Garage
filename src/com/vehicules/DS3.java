package com.vehicules;

import com.enumerations.MarqueVehicule;

public class DS3 extends Vehicule {
	
	public DS3() {
		super();
	}
	
	public MarqueVehicule getMarque() {
		return MarqueVehicule.Citroën;
	}
	
	public double getPrix() {
		return 25147.0;
	}
	
	public String getNom() {
		return "DS3";
	}

}
