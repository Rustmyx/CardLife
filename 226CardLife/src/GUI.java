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

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Ziehen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(464, 248, 137, 39);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblSpieler = new JLabel("Spieler 1");
		lblSpieler.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSpieler.setBounds(257, 455, 68, 23);
		frame.getContentPane().add(lblSpieler);
		
		JLabel lblSpieler_1 = new JLabel("Spieler 2");
		lblSpieler_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSpieler_1.setBounds(257, 66, 68, 23);
		frame.getContentPane().add(lblSpieler_1);
		
		JLabel lblLeben = new JLabel("Leben: ");
		lblLeben.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLeben.setBounds(20, 504, 89, 27);
		frame.getContentPane().add(lblLeben);
		
		JLabel lblLeben_1 = new JLabel("Leben: ");
		lblLeben_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLeben_1.setBounds(20, 11, 89, 39);
		frame.getContentPane().add(lblLeben_1);
		
		JButton btnRagequit = new JButton("Ragequit");
		btnRagequit.setBounds(525, 511, 89, 23);
		frame.getContentPane().add(btnRagequit);
		frame.setBounds(100, 100, 640, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
