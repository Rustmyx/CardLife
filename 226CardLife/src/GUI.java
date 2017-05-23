import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;

public class GUI {
	
	Player player1 = new Player("Spieler 1", 30);
	Player player2 = new Player("Spieler 2", 30);

	private JFrame frmCardlife;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmCardlife.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void shutdown() throws RuntimeException, IOException {
	    String shutdownCommand;
	    String operatingSystem = System.getProperty("os.name");

	    if ("Linux".equals(operatingSystem) || "Mac OS X".equals(operatingSystem)) {
	        shutdownCommand = "shutdown -h now";
	    }
	    else if ("Windows".equals(operatingSystem)) {
	        shutdownCommand = "shutdown.exe -s -t 0";
	    }
	    else {
	        throw new RuntimeException("Unsupported operating system.");
	    }

	    Runtime.getRuntime().exec(shutdownCommand);
	    System.exit(0);
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
		
		JButton btnNewButton = new JButton("Ziehen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(464, 248, 137, 39);
		frmCardlife.getContentPane().add(btnNewButton);
		
		JLabel lblSpieler = new JLabel(player1.name);
		lblSpieler.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSpieler.setBounds(257, 455, 68, 23);
		frmCardlife.getContentPane().add(lblSpieler);
		
		JLabel lblSpieler_1 = new JLabel(player2.name);
		lblSpieler_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSpieler_1.setBounds(257, 66, 68, 23);
		frmCardlife.getContentPane().add(lblSpieler_1);
		
		JLabel lblLeben = new JLabel("Leben: " + player1.lifepool);
		lblLeben.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLeben.setBounds(20, 486, 113, 39);
		frmCardlife.getContentPane().add(lblLeben);
		
		JLabel lblLeben_1 = new JLabel("Leben: " + player2.lifepool);
		lblLeben_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLeben_1.setBounds(20, 11, 113, 50);
		frmCardlife.getContentPane().add(lblLeben_1);
		
		JButton btnRagequit = new JButton("Ragequit");
		btnRagequit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					shutdown();
				} catch (RuntimeException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnRagequit.setBounds(525, 511, 89, 23);
		frmCardlife.getContentPane().add(btnRagequit);
		frmCardlife.setBounds(100, 100, 645, 575);
		frmCardlife.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
