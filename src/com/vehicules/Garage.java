package com.vehicules;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	List<Vehicule> Voitures = new ArrayList<Vehicule>(); //On créé une liste de véhicules
	
	public String toString() {
		return "Aucune voiture sauvegardée !";
	}

	public void addVoiture(Vehicule voit) {
		
		Voitures.add(voit); //On ajoute un véhicule à cette liste
		
		//On ecrit la description des véhicules dans un fichier Garage.txt
		ObjectInputStream ois;   
		ObjectOutputStream oos; //On déclare les objets en dehors du bloc try/catch
		
		//String file = "Garage.txt";
		
		try {
			oos = new ObjectOutputStream(
					 new BufferedOutputStream(
							new FileOutputStream(
									new File("Garage.txt"))));
			
		//On écrit la descirpiton des véhicules dans le fichier
			for (Vehicule V : Voitures) {
				oos.writeObject(V.toString());
			}
			
		//On ferme le flux
			oos.close();
			
		//On récupère les données
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(
									new File("Garage.txt"))));
			
			System.out.println("********************");
			System.out.println("      Garage");
			System.out.println("********************");
			
			//while (file != "") {
				
					try {
					
					System.out.println((ois.readObject()).toString());
					System.out.println((ois.readObject()).toString());
					System.out.println((ois.readObject()).toString());
					System.out.println((ois.readObject()).toString());
					System.out.println((ois.readObject()).toString());
					System.out.println((ois.readObject()).toString());
				
					}catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
			
				ois.close(); //On ferme le flux
			//}
			
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			
			}catch (IOException e) {
				e.printStackTrace();
			}
				
		}
				
	}

