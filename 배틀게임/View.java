package 배틀게임;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import player.Player;
import player.메딕;
import view.Myview;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Scrollbar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel title;
	private JPanel player1;
	private JLabel p1img;
	private JProgressBar 체력Bar1;
	private JLabel Name1;
	private JProgressBar 마나Bar1;
	private JLabel 체력view1;
	private JLabel 마나view1;
	private JLabel 사용주문1;
	private JButton p1강한Button;
	private JButton p1HealButton;
	private JButton ResetButton;
	private JButton p2AttackButton;
	private JButton p2강한Button;
	private JButton p2HealButton;
	private JButton p1AttackButton;
	private 마법사 p1,p2;

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
		setBounds(100, 100, 1120, 821);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		player1 = new JPanel();
		player1.setBackground(SystemColor.menu);
		player1.setBounds(57, 57, 366, 717);
		contentPane.add(player1);
		player1.setLayout(null);
		
		p1img = new JLabel("Player2");
		p1img.setIcon(new ImageIcon(View.class.getResource("/image/KakaoTalk_20260522_084428391.jpg")));
		p1img.setBounds(55, 10, 244, 244);
		player1.add(p1img);
		
		체력Bar1 = new JProgressBar();
		체력Bar1.setForeground(new Color(255, 0, 0));
		체력Bar1.setValue(100);
		체력Bar1.setBounds(24, 396, 330, 21);
		player1.add(체력Bar1);
		
		Name1 = new JLabel("이름 :");
		Name1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 18));
		Name1.setBounds(55, 275, 242, 38);
		player1.add(Name1);
		
		마나Bar1 = new JProgressBar();
		마나Bar1.setValue(100);
		마나Bar1.setForeground(new Color(0, 0, 255));
		마나Bar1.setBounds(24, 445, 330, 21);
		player1.add(마나Bar1);
		
		체력view1 = new JLabel("체력 : ");
		체력view1.setFont(new Font("굴림", Font.BOLD, 12));
		체력view1.setLabelFor(체력Bar1);
		체력view1.setBounds(24, 371, 49, 15);
		player1.add(체력view1);
		
		마나view1 = new JLabel("마나 : ");
		마나view1.setLabelFor(마나Bar1);
		마나view1.setFont(new Font("굴림", Font.BOLD, 12));
		마나view1.setBounds(24, 420, 49, 15);
		player1.add(마나view1);
		
		사용주문1 = new JLabel("사용 주문 : ");
		사용주문1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 18));
		사용주문1.setBounds(55, 323, 244, 38);
		player1.add(사용주문1);
		
		p1강한Button = new JButton("강한공격");
		p1강한Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		p1강한Button.setFont(new Font("굴림", Font.BOLD, 18));
		p1강한Button.setBounds(72, 565, 227, 49);
		player1.add(p1강한Button);
		
		p1HealButton = new JButton("HP회복");
		p1HealButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		p1HealButton.setFont(new Font("굴림", Font.BOLD, 18));
		p1HealButton.setBounds(70, 637, 227, 49);
		player1.add(p1HealButton);
		
		p1AttackButton = new JButton("기본공격");
		p1AttackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		p1AttackButton.setFont(new Font("굴림", Font.BOLD, 18));
		p1AttackButton.setBounds(72, 493, 227, 49);
		player1.add(p1AttackButton);
		
		title = new JLabel("해리포터 배틀게임");
		title.setFont(new Font("굴림", Font.BOLD, 24));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(405, 10, 331, 54);
		contentPane.add(title);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(433, 57, 282, 490);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel player2 = new JPanel();
		player2.setBackground(SystemColor.menu);
		player2.setLayout(null);
		player2.setBounds(728, 57, 366, 717);
		contentPane.add(player2);
		
		JLabel p2img = new JLabel("Player2");
		p2img.setIcon(new ImageIcon(View.class.getResource("/image/KakaoTalk_20260522_084439022.jpg")));
		p2img.setBounds(62, 10, 243, 226);
		player2.add(p2img);
		
		JProgressBar 체력Bar2 = new JProgressBar();
		체력Bar2.setValue(100);
		체력Bar2.setForeground(Color.RED);
		체력Bar2.setBounds(24, 396, 330, 21);
		player2.add(체력Bar2);
		
		JLabel Name2 = new JLabel("이름 :");
		Name2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 18));
		Name2.setBounds(62, 275, 243, 38);
		player2.add(Name2);
		
		JProgressBar 마나Bar2 = new JProgressBar();
		마나Bar2.setValue(100);
		마나Bar2.setForeground(Color.BLUE);
		마나Bar2.setBounds(24, 445, 330, 21);
		player2.add(마나Bar2);
		
		JLabel 체력view2 = new JLabel("체력 : ");
		체력view2.setLabelFor(체력Bar2);
		체력view2.setFont(new Font("굴림", Font.BOLD, 12));
		체력view2.setBounds(24, 371, 49, 15);
		player2.add(체력view2);
		
		JLabel 마나view2 = new JLabel("마나 : ");
		마나view2.setLabelFor(마나Bar2);
		마나view2.setFont(new Font("굴림", Font.BOLD, 12));
		마나view2.setBounds(24, 420, 49, 15);
		player2.add(마나view2);
		
		JLabel 사용주문2 = new JLabel("사용 주문 : ");
		사용주문2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 18));
		사용주문2.setBounds(62, 323, 243, 38);
		player2.add(사용주문2);
		
		p2AttackButton = new JButton("기본공격");
		p2AttackButton.setFont(new Font("굴림", Font.BOLD, 18));
		p2AttackButton.setBounds(66, 494, 227, 49);
		player2.add(p2AttackButton);
		
		p2강한Button = new JButton("강한공격");
		p2강한Button.setFont(new Font("굴림", Font.BOLD, 18));
		p2강한Button.setBounds(66, 568, 227, 49);
		player2.add(p2강한Button);
		
		p2HealButton = new JButton("HP회복");
		p2HealButton.setFont(new Font("굴림", Font.BOLD, 18));
		p2HealButton.setBounds(66, 637, 227, 49);
		player2.add(p2HealButton);
		
		ResetButton = new JButton("초기화하기");
		ResetButton.setFont(new Font("굴림", Font.BOLD, 18));
		ResetButton.setBounds(454, 631, 236, 54);
		contentPane.add(ResetButton);

	}
	
	
	public GameView(마법사 p1, 마법사 p2) {
		this();
		this.p1 = p1;
		this.p2 = p2;

		// 이미지와 bar, attack 동작

		p1img.setIcon(new ImageIcon(View.class.getResource("/images/" + p1.getFilename())));
		p2img.setIcon(new ImageIcon(View.class.getResource("/images/" + p2.getFilename())));

		체력Bar1.setMaximum(p1.getHp());
		마나Bar1.setMaximum(p1.get마나());
		
		체력Bar2.setMaximum(p2.getHp());
		마나Bar2.setMaximum(p2.get마나());

		체력Bar1.setValue(p1.getHP());
		마나Bar1.setValue(p1.get마나());
		
		체력Bar2.setValue(p2.getHP());
		마나Bar2.setValue(p2.get마나());
		

	}
}
