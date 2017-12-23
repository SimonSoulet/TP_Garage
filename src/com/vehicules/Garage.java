package com.vehicules;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
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
		
		Voitures.add(voit); 
		
	}
	
	public void saveVoitures() { //Methode pour enregistrer les vehicules dans un fichier
		 
		ObjectOutputStream oos = null; //On déclare l'objet en dehors du bloc try/catch
		
		try {
			oos = new ObjectOutputStream(
					 new BufferedOutputStream(
							new FileOutputStream(
									new File("Garage.ser"))));
			
			for(Vehicule V : Voitures) {
				
				oos.writeObject(V.toString()); //On écrit la description des véhicules dans le fichier
				
			}
			
				oos.close(); //On ferme le flux
				
			}catch (FileNotFoundException e) {
				e.printStackTrace();
				
			}catch (IOException e) {
				e.printStackTrace();
				
			}finally {
				try {
					if(oos != null) {
						oos.close();
					}
				}catch (IOException e) {
					e.printStackTrace();
				}
			}	
	}
	
	public void read() { //Methode pour lire le fichier Garage.ser
		
		ObjectInputStream ois = null; //On déclare l'objet en dehors du bloc try/catch
		
		try {
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(
									new File("Garage.ser"))));
			
			System.out.println("********************");
			System.out.println("      Garage");
			System.out.println("********************");
				
					try {
						
						for(Vehicule V : Voitures) {
							
							System.out.println(ois.readObject()); //On récupère les données
							
						}
									
					}catch (ClassNotFoundException e) {
						e.printStackTrace();
						
					}catch (EOFException e) {
						e.printStackTrace();
					}
			
				ois.close(); //On ferme le flux
	
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(ois != null) {
					ois.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
