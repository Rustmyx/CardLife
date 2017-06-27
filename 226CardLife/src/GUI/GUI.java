package GUI;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;

import Logik.game;

public class GUI {

	private game game = new game();
	
	JFrame frmCardlife;

	
	public static void main(String[] args) {

		GUI window = new GUI();
		window.frmCardlife.setVisible(true);
	}

	public GUI() {
		initialize();
		
	}
	//initialiseren des GUI's
	private void initialize() {
		frmCardlife = new JFrame();
		frmCardlife.setTitle("CardLife");
		frmCardlife.getContentPane().setBackground(Color.GREEN);
		frmCardlife.getContentPane().setLayout(null);
		//Panel für den Gewinner
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(169, 169, 169));
		panel_1.setBounds(86, 135, 409, 208);
		frmCardlife.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		JLabel label = new JLabel("Gewinner");
		label.setBounds(122, 79, 194, 63);
		panel_1.add(label);
		//Label für Spieler
		JLabel lblSpieler = new JLabel("Spieler 1");
		lblSpieler.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSpieler.setBounds(257, 455, 68, 23);
		frmCardlife.getContentPane().add(lblSpieler);
		
		JLabel lblSpieler_1 = new JLabel("Spieler 2");
		lblSpieler_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSpieler_1.setBounds(257, 66, 68, 23);
		frmCardlife.getContentPane().add(lblSpieler_1);
		//Label für Leben
		JLabel lblLeben = new JLabel("Leben: " + game.getSpieler1().getLifepool());
		lblLeben.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLeben.setBounds(20, 486, 113, 39);
		frmCardlife.getContentPane().add(lblLeben);
		
		JLabel lblLeben_1 = new JLabel("Leben: " + game.getSpieler2().getLifepool());
		lblLeben_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLeben_1.setBounds(20, 11, 113, 50);
		frmCardlife.getContentPane().add(lblLeben_1);
		//ein kleiner Spassknpof der Ragequit - er beendet das Programm
		JButton btnRagequit = new JButton("Ragequit");
		btnRagequit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnRagequit.setBounds(525, 511, 89, 23);
		frmCardlife.getContentPane().add(btnRagequit);
		//Platzhalter
		JLabel lbldeckimage = new JLabel("");
		lbldeckimage.setBounds(35, 248, 89, 26);
		frmCardlife.getContentPane().add(lbldeckimage);
		//Gibt den Wert der aktuellen Karte an
		JLabel lblcardimageplayer = new JLabel("Wert: " + game.getSpieler1().getAktuelleKarte());
		lblcardimageplayer.setBounds(244, 412, 97, 33);
		frmCardlife.getContentPane().add(lblcardimageplayer);
		
		JLabel lblcardimageplayer_1 = new JLabel("Wert: " + game.getSpieler2().getAktuelleKarte());
		lblcardimageplayer_1.setBounds(244, 113, 113, 23);
		frmCardlife.getContentPane().add(lblcardimageplayer_1);
		//Panel für die Auswahl des Decks
		JPanel panel = new JPanel();
		panel.setBounds(172, 193, 265, 109);
		frmCardlife.getContentPane().add(panel);
		panel.setLayout(null);
		//Label für die Frage mit welchem Deck gespielt wird
		JLabel lblMitJokerSpielen = new JLabel("Mit Joker spielen?");
		lblMitJokerSpielen.setBounds(87, 11, 113, 23);
		panel.add(lblMitJokerSpielen);
		//Der Button added das Jokerdeck
		JButton btnJa = new JButton("Ja");
		btnJa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(false);
				game.getJokerDeck().addCard();
				game.setJoker(true);
			}
		});
		btnJa.setBounds(10, 75, 89, 23);
		panel.add(btnJa);
		//Ziehen zieht eine Karte und setzt die Labels entsprechend der veränderten Werte neu
		JButton btnNewButton = new JButton("Ziehen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.init();
				
				lblLeben.setText("Leben: " + game.getSpieler1().getLifepool());
				lblLeben_1.setText("Leben: " + game.getSpieler2().getLifepool());
				lblcardimageplayer.setText("Wert: " + game.getSpieler1().getAktuelleKarte());
				lblcardimageplayer_1.setText("Wert: " + game.getSpieler2().getAktuelleKarte());
				
				if(game.isEnd()==true){
					label.setText(game.getWinner() + " hat gewonnen!");
					panel_1.setVisible(true);
				}
			
			}
			
			
			
		});
		btnNewButton.setBounds(464, 248, 137, 39);
		frmCardlife.getContentPane().add(btnNewButton);
		//Der Button added das StandardDeck ohne Joker
		JButton btnNein = new JButton("Nein");
		btnNein.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				game.getStandardDeck().addCard();
				game.setJoker(false);
			}
		});
		btnNein.setBounds(166, 75, 89, 23);
		panel.add(btnNein);
		frmCardlife.setBounds(100, 100, 645, 575);
		frmCardlife.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
