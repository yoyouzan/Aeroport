package vue;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controleur.Candidat;
import modele.ModeleCandidat;

public class VueCandidat extends JPanel implements ActionListener
{
	private JTable uneTable;
	public VueCandidat ()
	{
		this.setBounds(20, 20, 250, 200);
		this.setBackground(Color.cyan);
		this.setLayout(null);
		
		String entete[]={"idCandidat", "Nom", "Prenom", "Adresse"};
		this.uneTable = new JTable(this.remplirDonnees(), entete);
		JScrollPane uneScroll = new JScrollPane(this.uneTable);
		uneScroll.setBounds(20, 20, 200, 150);
		this.add(uneScroll);
		
		this.setVisible(true);
	}
	
	public Object [] [] remplirDonnees ()
	{
		ArrayList<Candidat> lesCandidats = ModeleCandidat.selectAll();
		Object donnees [][] = new Object[lesCandidats.size()][4];
		int i = 0;
		for (Candidat unCandidat : lesCandidats)
		{
			donnees[i] [0] = unCandidat.getIdCandidat();
			donnees[i] [1] = unCandidat.getNom();
			donnees[i] [2] = unCandidat.getPrenom();
			donnees[i] [3] = unCandidat.getAdresse();
			i++;
		}
		return donnees;
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}

}
