package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Profil;
 

public class Modele 
{
	
	public static ArrayList<Profil> selectAll()
	{
		ArrayList<Profil> lesProfils = new ArrayList<Profil>();
		String requete ="select * from produit;";
		try{
			Bdd uneBdd = new Bdd("localhost:8889", "autoecole", "root", "root");
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			while(unRes.next())
			{
				String pseudo = unRes.getString("pseudo");
				String email = unRes.getString("email");
				String nom = unRes.getString("nom");
				String prenom = unRes.getString("prenom");
				String adresse = unRes.getString("adresse");
				String mdp = unRes.getString("mdp");
				
				Profil unProfil = new Profil(pseudo, email, nom, prenom, mdp, adresse);
				//on ajoute ce profil � l'ArrayList de sortie
				lesProfils.add(unProfil);
			}
			unStat.close();
			unRes.close();
			uneBdd.seDeConnecter();
			}
		catch (SQLException exp)
		{
			System.out.println("Erreur : execution requete "+requete);
		}
		return lesProfils;
	}
	public static Profil verifConnexion (String pseudo, String mdp)
	{
		Profil unProfil = null; 
		String requete = "select * from profil "
				+ " where pseudo ='"+pseudo
				+"' and mdp ='"+mdp+"';";
		try{
			Bdd uneBdd = new Bdd("localhost:8889", "autoecole", "root", "root");
			uneBdd.seConnecter();
			Statement unStat =uneBdd.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			if (unRes.next())
			{
				String email = unRes.getString("email");
				String nom = unRes.getString("nom");
				String prenom = unRes.getString("prenom");
				String adresse = unRes.getString("adresse");
				unProfil = new Profil(pseudo, email, nom, prenom, mdp, adresse); 
			}
			uneBdd.seDeConnecter();
			unStat.close();
			unRes.close();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur de la requete "+requete);
		}
		return unProfil;
	}
}