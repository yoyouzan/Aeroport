package controleur;

public class Candidat 
{
	int idCandidat;
	private String nom, prenom, adresse;
	public Candidat()
	{
		this.idCandidat=0;
		this.nom = this.prenom = this.adresse="";
	}
	public Candidat (int idCandidat, String nom, String prenom, String adresse)
	{
		this.idCandidat = idCandidat;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	public int getIdCandidat() {
		return idCandidat;
	}
	public void setIdCandidat(int idCandidat) {
		this.idCandidat = idCandidat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	

}
