package fr.iris.slam2.aeroport.launcher;

import fr.iris.slam2.aeroport.beens.Voiture;

public class AeroportSlam {

	public static void main(String[] args) {
		
		Voiture tesla = new Voiture("Tesla", 2015, 35000, 2, 4, 4, 20000);
		System.out.println(tesla.eval(2025));
		}
		

	}

