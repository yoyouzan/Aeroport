package vue;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import controleur.Profil;

public class AfficheProfil extends JPanel
{
	private JTextArea txtInfos = new JTextArea();
	
	public AfficheProfil(Profil unProfil)
	{
		this.setBounds(20, 20, 250, 200);
		this.setBackground(Color.cyan);
		this.setLayout(null);
		
		this.txtInfos.setBounds(20, 20, 200, 200);
		this.add(this.txtInfos);
		this.txtInfos.setText(
				"---- Infos du profil connecté ----\n"+
				"	Nom		: "+unProfil.getNom()+"\n"+
				"	Prénom	: "+unProfil.getPrenom()+"\n"+
				"	Adresse	: "+unProfil.getAdresse()+"\n"+
				"------------------------------------\n"
			);
		this.txtInfos.setEditable(false);
		this.setVisible(false);
		
	}
}
