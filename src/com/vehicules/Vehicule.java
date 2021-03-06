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
	
	public Vehicule() { //Constructeur par d�faut
		
	}
	
	public Vehicule(double prix, String nom, List<OptionsVehicule> Options, MarqueVehicule nomMarque, Moteur moteur) { //Constructeur avec param�tres
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
	
	public double getPrixTotalOptions() {
		double PrixTotalOptions = 0;
		for(int i = 0; i < this.Options.size(); i++) {
			PrixTotalOptions += this.Options.get(i).getPrix();
		}
		
		return PrixTotalOptions;
	}
	
	//Setteur
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
	
	public void addOption(OptionsVehicule opt) { //Methode pour ajouter des options 
		Options.add(opt);
	}
	
	public String toString() { //Description d�taill�e du v�hicule (Methode appel� qui s'ecriera dans le fichier Garage.txt)
		String str = "- Nouvelle voiture : "+this.getMarque()+" "+this.getNom()+" avec"+moteur.toString()+" ("+this.getPrix()+"�) [";
		
		String str2 = "";
		int i = 0;
		for(OptionsVehicule o : this.getOptions()) {
			i++;
			str2 += o.TypeOption()+" ("+o.getPrix()+"�), ";
		}
		
		double PrixTotal = this.getPrix() + this.getPrixTotalOptions();
		
		return str+str2+"] d'une valeur totale de "+PrixTotal+"� \n\n";
		
	}

}
