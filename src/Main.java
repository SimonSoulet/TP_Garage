import com.moteurs.MoteurDiesel;
import com.moteurs.MoteurElectrique;
import com.moteurs.MoteurEssence;
import com.moteurs.MoteurHybride;
import com.options.BarreDeToit;
import com.options.Climatisation;
import com.options.GPS;
import com.options.SiegeChauffant;
import com.options.VitresElectriques;
import com.vehicules.DS3;
import com.vehicules.Garage;
import com.vehicules.Laguna;
import com.vehicules.P307;
import com.vehicules.Vehicule;

public class Main {

	public static void main(String[] args) {
		
		 Garage garage = new Garage();   
	   	 System.out.println(garage.toString());
	   	 
	   	 Vehicule lag1 = new Laguna();
	   	 lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
	   	 lag1.addOption(new GPS());
	   	 lag1.addOption(new SiegeChauffant());
	   	 lag1.addOption(new VitresElectriques());
	   	 garage.addVoiture(lag1);
	   		 
	   	 Vehicule P307_1 = new P307();
	   	 P307_1.setMoteur(new MoteurElectrique("1500 W", 1234d));
	   	 P307_1.addOption(new Climatisation());
	   	 P307_1.addOption(new BarreDeToit());
	   	 P307_1.addOption(new SiegeChauffant());
	   	 garage.addVoiture(P307_1);
	   	 
	   	 Vehicule DS3_1 = new DS3();
	   	 DS3_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
	   	 DS3_1.addOption(new BarreDeToit());
	   	 DS3_1.addOption(new Climatisation());
	   	 DS3_1.addOption(new GPS());
	   	 garage.addVoiture(DS3_1);  
	   	 
	   	 Vehicule lag2 = new Laguna();
	   	 lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
	   	 garage.addVoiture(lag2);
	   	 
	   	 Vehicule P307_2 = new P307();
	   	 P307_2.setMoteur(new MoteurHybride("Essence/Electrique", 12345.95d));
	   	 P307_2.addOption(new VitresElectriques());
	   	 P307_2.addOption(new BarreDeToit());
	   	 garage.addVoiture(P307_2);
	   	 
	   	 Vehicule DS3_2 = new DS3();
	   	 DS3_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
	   	 DS3_2.addOption(new SiegeChauffant());
	   	 DS3_2.addOption(new BarreDeToit());
	   	 DS3_2.addOption(new Climatisation());
	   	 DS3_2.addOption(new GPS());
	   	 DS3_2.addOption(new VitresElectriques());
	   	 garage.addVoiture(DS3_2);
	   	 
	   	 garage.saveVoitures();
	   	 garage.read();
	    }
	}

