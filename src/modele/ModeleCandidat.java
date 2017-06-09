package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Candidat;

public class ModeleCandidat 
{
	public static ArrayList<Candidat> selectAll()
	{
		ArrayList<Candidat> lesCandidats = new ArrayList<Candidat>();
		String requete ="select * from candidat;";
		try{
			Bdd uneBdd = new Bdd("localhost:8889", "ppe", "root", "root");
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			while(unRes.next())
			{
				int idCandidat = unRes.getInt("idcandidat");
				String nom = unRes.getString("nom");
				String prenom = unRes.getString("prenom");
				String adresse = unRes.getString("adresse");
				
				
				Candidat unCandidat = new Candidat(idCandidat, nom, prenom, adresse);
				//on ajoute ce candidat � l'ArrayList de sortie
				lesCandidats.add(unCandidat);
			}
			unStat.close();
			unRes.close();
			uneBdd.seDeConnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur : execution requete "+requete);
		}
		return lesCandidats;
	}

}
