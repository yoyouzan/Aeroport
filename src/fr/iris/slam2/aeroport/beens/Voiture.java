package fr.iris.slam2.aeroport.beens;
public class Voiture extends Vehicule{
	
	private float cylindree;
	private int nombrePortes;
	private int puissance;
	private float kilometrage;
	

	public Voiture(String marque, int anneeAchat, float prixAchat, float cylindree, int nombrePortes, int puissance, float kilometrage) {
		super(marque, anneeAchat, prixAchat);
		this.cylindree = cylindree;
		this.nombrePortes = nombrePortes;
		this.puissance = puissance;
		this.kilometrage = kilometrage;
	}
	
	
	
	
	
	
	
	
}
