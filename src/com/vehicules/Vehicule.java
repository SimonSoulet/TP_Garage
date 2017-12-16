package com.vehicules;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.enumerations.MarqueVehicule;
import com.moteurs.Moteur;
import com.options.OptionsVehicule;

public class Vehicule implements Serializable {
	
	protected double prix;
	protected String nom;
	protected List<OptionsVehicule> Options = new ArrayList<OptionsVehicule>();
	protected MarqueVehicule nomMarque;
	protected Moteur moteur;
	
	public Vehicule() { //Constructeur par défaut
		
	}
	
	public Vehicule(double prix, String nom, List<OptionsVehicule> Options, MarqueVehicule nomMarque, Moteur moteur) { //Constructeur avec paramètres
		this.prix = prix;
		this.nom = nom;
		this.Options = Options;
		this.nomMarque = nomMarque;
		this.moteur = moteur;
	
	}
	
	//Getteur
	public double getPrix() {
		return prix;
	}
	
	public String getNom() {
		return nom;
	}
	
	public List<OptionsVehicule> getOptions(){
		return Options;
	}
	
	public MarqueVehicule getMarque() {
		return nomMarque;
	}
	
	//Setteur
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
	
	public void addOption(OptionsVehicule opt) { //Methode pour ajouter des options 
		Options.add(opt);
	}
	
	public String toString() { //Description détaillée du véhicule (Methode appelé qui s'ecriera dans le fichier Garage.txt)
		String str = "\n\tNouvelle voiture "+getMarque()+" : "+getNom()+" avec "+moteur.toString()+" ("+getPrix()+"€)";
		return str;
		
	}

}
