package vue;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gestion extends JFrame
{
	private VueProfil uneVueProfil = new VueProfil();
	public Gestion ()
	{
		this.setTitle("Connexion");
		this.setBounds(330, 200, 665, 430);
		this.setLayout(null);
		this.setResizable(false);
		this.add(this.uneVueProfil);
		ImageIcon image = new ImageIcon("src/images/auto-ecole.jpg");
		JLabel titre = new JLabel(image);
		titre.setBounds(200, 10, 500, 300);
		this.add(titre);
		
		ImageIcon logo = new ImageIcon("src/images/logo.png");
		this.setIconImage(logo.getImage());
		
		this.getContentPane().setBackground(new Color(128,208,208));
		this.setVisible(true);
		
	}
	

}
