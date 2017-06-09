package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controleur.Main;
import controleur.Profil;
import modele.Modele;


public class VueProfil extends JPanel implements ActionListener, KeyListener
{
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btConnecter = new JButton ("Se Connecter");
	private JTextField txtPseudo = new JTextField();
	private JPasswordField txtMdp = new JPasswordField();
	public VueProfil()
	{
		this.setBounds(150, 20, 250, 250);
		this.setLayout(new GridLayout(3, 2));
		this.setBackground(new Color(128, 208, 208));
		this.add(new JLabel("Pseudo : "));
		this.add(this.txtPseudo);
		this.add(new JLabel("MDP : "));
		this.add(this.txtMdp);
		this.add(this.btAnnuler);
		this.add(this.btConnecter);
		
		Font police = new Font("Helvetica", Font.ITALIC, 20);
		this.btAnnuler.setFont(police);
		this.btAnnuler.setText("Annuler");
		this.btAnnuler.addActionListener(this);
		this.btConnecter.addActionListener(this);
		
		this.txtMdp.addKeyListener(this);
		this.txtPseudo.addKeyListener(this);
		
		this.setVisible(true);
	}
	

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==this.btAnnuler)
		{
			this.txtMdp.setText("");
			this.txtPseudo.setText("");
		}
		else if (e.getSource()== this.btConnecter)
		{
			this.traitement ();
			
		}
		
	}

	private void traitement() 
	{
		String pseudo = this.txtPseudo.getText();
		String mdp = new String (this.txtMdp.getPassword());
		Profil unProfil = Modele.verifConnexion(pseudo, mdp);
		if(unProfil==null)
		{
			JOptionPane.showMessageDialog(this, "Erreur de connexion");
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Vous etes " + " Connectes avec \n" +unProfil.getNom()+" "+ unProfil.getPrenom());
			new VueGenerale(unProfil);
			Main.rendreVisible(false);
		}
		
	}



	public void keyTyped(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
		{
			this.traitement();
		}
		
	}


	public void keyPressed(KeyEvent e) {
		
		
	}


	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
