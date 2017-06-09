package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controleur.Profil;

public class VueGenerale extends JFrame implements ActionListener 
{
	private JMenuBar uneBarre = new JMenuBar();
	private JMenu mnFichier = new JMenu("Fichier");
	private JMenu mnOperations = new JMenu("Operations");
	private JMenu mnAide = new JMenu("Aide");
	private JMenuItem itemQuitter = new JMenu("Quitter");
	private JMenuItem itemApropos = new JMenu("A propos");
	private JMenuItem itemLister = new JMenuItem("Lister Candidats");
	private VueCandidat uneVueCandidat = new VueCandidat();
	
	private AfficheProfil uneAfficheProfil;
	
	public  VueGenerale(Profil unProfil)
	{
		this.setBounds(300, 300, 500,300);
		this.setLayout(null);
		this.setTitle("Menu général");
		this.uneBarre.add(this.mnFichier);
		this.uneBarre.add(this.mnOperations);
		this.uneBarre.add(this.mnAide);
		this.mnFichier.add(this.itemQuitter);
		this.mnAide.add(this.itemApropos);
		this.mnOperations.add(this.itemLister);
		this.uneVueCandidat.setVisible(false);
		this.add(this.uneVueCandidat);
		
		this.uneAfficheProfil = new AfficheProfil(unProfil);
		this.uneAfficheProfil.setVisible(true);
		this.add(this.uneAfficheProfil);
		
		this.itemLister.addActionListener(this);
		this.setJMenuBar(this.uneBarre);
		this.setVisible(true);
		
	}


	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==this.itemLister)
		{
			this.uneVueCandidat.setVisible(true);
		}
		
	}
}
