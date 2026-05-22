import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;
	private JPanel panel8;
	private JLabel player1Selected;
	private JLabel player2Selected;
	Player Player1, Player2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 647);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Selectthewizard = new JLabel("Select the wizard");
		Selectthewizard.setBounds(298, 29, 352, 40);
		Selectthewizard.setForeground(Color.CYAN);
		Selectthewizard.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		contentPane.add(Selectthewizard);
		
		JButton gameStartButton = new JButton("Game Start!!");
		gameStartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Player1 == null || Player2 == null) {
					JOptionPane.showMessageDialog(null, "Player1과 Player2를 모두 선택하세요.");
					return;
				}

				new View(Player1, Player2).setVisible(true);
				dispose();
				

			}
		});
		gameStartButton.setFont(new Font("Eras Bold ITC", Font.BOLD, 13));
		gameStartButton.setBounds(399, 263, 131, 58);
		contentPane.add(gameStartButton);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(33, 100, 131, 179);
		contentPane.add(panel1);
		
		JLabel dracoPicture1 = new JLabel("");
		dracoPicture1.setIcon(new ImageIcon(View.class.getResource("/images/Draco_111x92_fill.png")));
		dracoPicture1.setBounds(10, 10, 118, 111);
		panel1.add(dracoPicture1);
		
		JButton dracoButton1 = new JButton("Draco");
		dracoButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player1 = "Draco";
				player1Selected.setText("Player1 : Draco");
				
				panel1.setBackground(Color.ORANGE);
				panel2.setBackground(Color.LIGHT_GRAY);
				panel3.setBackground(Color.LIGHT_GRAY);
				panel4.setBackground(Color.LIGHT_GRAY);
				
				
			}
		});
		dracoButton1.setBounds(10, 131, 111, 38);
		panel1.add(dracoButton1);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(33, 312, 131, 179);
		contentPane.add(panel2);
		
		JLabel hermionePicture1 = new JLabel("");
		hermionePicture1.setIcon(new ImageIcon(View.class.getResource("/images/Hermione_111x92_fill_topcrop.png")));
		hermionePicture1.setBounds(10, 10, 118, 111);
		panel2.add(hermionePicture1);
		
		JButton hermioneButton1 = new JButton("Hermione");
		hermioneButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player1 = "Hermione";
				player1Selected.setText("Player1 : Hermione");
				
				panel2.setBackground(Color.ORANGE);
				panel1.setBackground(Color.LIGHT_GRAY);
				panel3.setBackground(Color.LIGHT_GRAY);
				panel4.setBackground(Color.LIGHT_GRAY);
			}
		});
		hermioneButton1.setBounds(10, 131, 111, 38);
		panel2.add(hermioneButton1);
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(223, 312, 131, 179);
		contentPane.add(panel3);
		
		JLabel ronPicture1 = new JLabel("New label");
		ronPicture1.setIcon(new ImageIcon(View.class.getResource("/images/Ron_111x92_fill.png")));
		ronPicture1.setBounds(10, 10, 118, 111);
		panel3.add(ronPicture1);
		
		JButton ronButton1 = new JButton("Ron");
		ronButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player1 = "Ron";
				player1Selected.setText("Player1 : Ron");
				
				panel3.setBackground(Color.ORANGE);
				panel2.setBackground(Color.LIGHT_GRAY);
				panel1.setBackground(Color.LIGHT_GRAY);
				panel4.setBackground(Color.LIGHT_GRAY);
			}
		});
		ronButton1.setBounds(10, 131, 111, 38);
		panel3.add(ronButton1);
		
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(223, 100, 131, 179);
		contentPane.add(panel4);
		
		JLabel harryPicture1 = new JLabel("");
		harryPicture1.setIcon(new ImageIcon(View.class.getResource("/images/Harry_111x92_fill_topcrop.png")));
		harryPicture1.setBounds(10, 10, 118, 111);
		panel4.add(harryPicture1);
		
		JButton harryButton1 = new JButton("Harry");
		harryButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player1 = "Harry";
				player1Selected.setText("Player1 : Harry");
				
				panel4.setBackground(Color.ORANGE);
				panel2.setBackground(Color.LIGHT_GRAY);
				panel3.setBackground(Color.LIGHT_GRAY);
				panel1.setBackground(Color.LIGHT_GRAY);
			}
		});
		harryButton1.setBounds(10, 131, 111, 38);
		panel4.add(harryButton1);
		
		panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBounds(565, 100, 131, 179);
		contentPane.add(panel5);
		
		JLabel dracoPicture2 = new JLabel("");
		dracoPicture2.setIcon(new ImageIcon(View.class.getResource("/images/Draco_111x92_fill.png")));
		dracoPicture2.setBounds(10, 10, 118, 111);
		panel5.add(dracoPicture2);
		
		JButton dracoButton2 = new JButton("Draco");
		dracoButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player2 = "Draco";
				player2Selected.setText("Player2 : Draco");
				
				panel5.setBackground(Color.ORANGE);
				panel6.setBackground(Color.LIGHT_GRAY);
				panel7.setBackground(Color.LIGHT_GRAY);
				panel8.setBackground(Color.LIGHT_GRAY);
			}
		});
		dracoButton2.setBounds(10, 131, 111, 38);
		panel5.add(dracoButton2);
		
		panel6 = new JPanel();
		panel6.setLayout(null);
		panel6.setBounds(748, 100, 131, 179);
		contentPane.add(panel6);
		
		JLabel harryPicture2 = new JLabel("");
		harryPicture2.setIcon(new ImageIcon(View.class.getResource("/images/Harry_111x92_fill_topcrop.png")));
		harryPicture2.setBounds(10, 10, 118, 111);
		panel6.add(harryPicture2);
		
		JButton harryButton2 = new JButton("Harry");
		harryButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player2 = "Harry";
				player2Selected.setText("Player2 : Harry");
				
				panel6.setBackground(Color.ORANGE);
				panel5.setBackground(Color.LIGHT_GRAY);
				panel7.setBackground(Color.LIGHT_GRAY);
				panel8.setBackground(Color.LIGHT_GRAY);
			}
		});
		harryButton2.setBounds(10, 131, 111, 38);
		panel6.add(harryButton2);
		
		panel7 = new JPanel();
		panel7.setLayout(null);
		panel7.setBounds(565, 312, 131, 179);
		contentPane.add(panel7);
		
		JLabel hermionePicture2 = new JLabel("New label");
		hermionePicture2.setIcon(new ImageIcon(View.class.getResource("/images/Hermione_111x92_fill_topcrop.png")));
		hermionePicture2.setBounds(10, 10, 118, 111);
		panel7.add(hermionePicture2);
		
		JButton hermioneButton2 = new JButton("Hermione");
		hermioneButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player2 = "Hermione";
				player2Selected.setText("Player2 : Hermione");
				
				panel7.setBackground(Color.ORANGE);
				panel5.setBackground(Color.LIGHT_GRAY);
				panel6.setBackground(Color.LIGHT_GRAY);
				panel8.setBackground(Color.LIGHT_GRAY);
			}
		});
		hermioneButton2.setBounds(10, 131, 111, 38);
		panel7.add(hermioneButton2);
		
		panel8 = new JPanel();
		panel8.setLayout(null);
		panel8.setBounds(748, 312, 131, 179);
		contentPane.add(panel8);
		
		JLabel ronPicture2 = new JLabel("");
		ronPicture2.setIcon(new ImageIcon(View.class.getResource("/images/Ron_111x92_fill.png")));
		ronPicture2.setBounds(10, 10, 118, 111);
		panel8.add(ronPicture2);
		
		JButton ronButton2 = new JButton("Ron");
		ronButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player2 = "Ron";
				player2Selected.setText("Player2 : Ron");
				
				panel8.setBackground(Color.ORANGE);
				panel7.setBackground(Color.LIGHT_GRAY);
				panel6.setBackground(Color.LIGHT_GRAY);
				panel5.setBackground(Color.LIGHT_GRAY);
			}
		});
		ronButton2.setBounds(10, 131, 111, 38);
		panel8.add(ronButton2);
		
		player1Selected = new JLabel("Player Selected");
		player1Selected.setFont(new Font("Dubai Medium", Font.BOLD, 25));
		player1Selected.setForeground(Color.WHITE);
		player1Selected.setBounds(101, 515, 231, 40);
		contentPane.add(player1Selected);
		
		player2Selected = new JLabel("Player Selected");
		player2Selected.setForeground(Color.WHITE);
		player2Selected.setFont(new Font("Dubai Medium", Font.BOLD, 25));
		player2Selected.setBounds(639, 515, 231, 40);
		contentPane.add(player2Selected);

	}
}
