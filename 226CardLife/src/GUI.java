import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;

public class GUI {

	private game game = new game();
	/*Player Spieler1 = new Player("Spieler 1", 30);
	Player Spieler2 = new Player("Spieler 2", 30);*/
	
	JFrame frmCardlife;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	/*	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmCardlife.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
		GUI window = new GUI();
		window.frmCardlife.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCardlife = new JFrame();
		frmCardlife.setTitle("CardLife");
		frmCardlife.getContentPane().setBackground(Color.GREEN);
		frmCardlife.getContentPane().setLayout(null);
		
		JLabel lblSpieler = new JLabel("Spieler 1");
		lblSpieler.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSpieler.setBounds(257, 455, 68, 23);
		frmCardlife.getContentPane().add(lblSpieler);
		
		JLabel lblSpieler_1 = new JLabel("Spieler 2");
		lblSpieler_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSpieler_1.setBounds(257, 66, 68, 23);
		frmCardlife.getContentPane().add(lblSpieler_1);
		
		JLabel lblLeben = new JLabel("Leben: " + game.Spieler1.lifepool);
		lblLeben.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLeben.setBounds(20, 486, 113, 39);
		frmCardlife.getContentPane().add(lblLeben);
		
		JLabel lblLeben_1 = new JLabel("Leben: " + game.Spieler2.lifepool);
		lblLeben_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLeben_1.setBounds(20, 11, 113, 50);
		frmCardlife.getContentPane().add(lblLeben_1);
		
		JButton btnRagequit = new JButton("Ragequit");
		btnRagequit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnRagequit.setBounds(525, 511, 89, 23);
		frmCardlife.getContentPane().add(btnRagequit);
		
		JLabel lbldeckimage = new JLabel("[DeckImage]");
		lbldeckimage.setBounds(35, 248, 89, 26);
		frmCardlife.getContentPane().add(lbldeckimage);
		
		JLabel lblcardimageplayer = new JLabel("Wert: " + game.Spieler1.aktuelleKarte);
		lblcardimageplayer.setBounds(242, 134, 97, 33);
		frmCardlife.getContentPane().add(lblcardimageplayer);
		
		JLabel lblcardimageplayer_1 = new JLabel("Wert: " + game.Spieler2.aktuelleKarte);
		lblcardimageplayer_1.setBounds(242, 411, 113, 23);
		frmCardlife.getContentPane().add(lblcardimageplayer_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(172, 193, 265, 109);
		frmCardlife.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMitJokerSpielen = new JLabel("Mit Joker spielen?");
		lblMitJokerSpielen.setBounds(87, 11, 113, 23);
		panel.add(lblMitJokerSpielen);
		
		JButton btnJa = new JButton("Ja");
		btnJa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(false);
				game.JokerDeck = new JokerDeck();
				game.JokerDeck.addCard();
				game.joker=true;
			}
		});
		btnJa.setBounds(10, 75, 89, 23);
		panel.add(btnJa);
		
		JButton btnNewButton = new JButton("Ziehen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.getCard();
				game.combat();
				
				lblLeben.setText("Leben: " + game.Spieler1.lifepool);
				lblLeben_1.setText("Leben: " + game.Spieler2.lifepool);
				lblcardimageplayer.setText("Wert: " + game.Spieler1.aktuelleKarte);
				lblcardimageplayer_1.setText("Wert: " + game.Spieler2.aktuelleKarte);
			}
		});
		btnNewButton.setBounds(464, 248, 137, 39);
		frmCardlife.getContentPane().add(btnNewButton);
		
		JButton btnNein = new JButton("Nein");
		btnNein.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				game.StandardDeck = new StandardDeck();
				game.StandardDeck.addCard();
				game.joker=false;
			}
		});
		btnNein.setBounds(166, 75, 89, 23);
		panel.add(btnNein);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(172, 48, 265, 109);
		frmCardlife.getContentPane().add(panel_1);
		panel_1.setVisible(false);
		
		JLabel label = new JLabel("Mit Joker spielen?");
		label.setBounds(87, 11, 113, 23);
		panel_1.add(label);
		
		JButton button = new JButton("Ja");
		button.setBounds(10, 75, 89, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Nein");
		button_1.setBounds(166, 75, 89, 23);
		panel_1.add(button_1);
		frmCardlife.setBounds(100, 100, 645, 575);
		frmCardlife.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
