package fr.iris.slam2.aeroport.beens;

public abstract class Vehicule {
	
	protected String marque;
	protected int anneeAchat;
	protected float prixAchat;
	
	//constructeur par defaut
	public Vehicule() {
		super();
	}
	
	//constructeur
	public Vehicule(String marque, int anneeAchat, float prixAchat) {
		super();
		this.marque = marque;
		this.anneeAchat = anneeAchat;
		this.prixAchat = prixAchat;
	}
	
	//methode
	public void afficher(){
		System.out.printf("Veh: m=%s, a=%d, achat=%.2f\n", marque, anneeAchat, prixAchat);
	}
	
	protected double decote(int annee){
		if (annee >= 2017) return 1;
		return Math.pow(0.99, annee - anneeAchat);
	}
	
	public double eval(int annee){
		return prixAchat * decote(annee);
	}
	
	//getters et setters
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getAnneeAchat() {
		return anneeAchat;
	}
	public void setAnneeAchat(int anneeAchat) {
		this.anneeAchat = anneeAchat;
	}
	public float getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}
	
	

	
	

	
	

}
