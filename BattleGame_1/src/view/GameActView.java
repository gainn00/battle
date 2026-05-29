package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Players.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

public class GameActView extends JFrame {

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
	private 마법사 p1, p2;
	private JProgressBar 체력Bar2;
	private JProgressBar 마나Bar2;
	private JLabel name2;
	private JLabel 체력view2;
	private JLabel 마나view2;
	private JLabel 사용주문2;
	private JLabel p2img;
	private JPanel player2;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private 주문 주문이름1;
	private 주문 데미지1,마나소모1;
	private 주문 주문이름2;
	private 주문 데미지2,마나소모2;
	private JLabel 체력Label1;
	private JLabel 마나Label1;
	private JLabel 체력Label2;
	private JLabel 마나Label2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameActView frame = new GameActView();
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
	public GameActView() {
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

		p1img = new JLabel("Player1");
		p1img.setIcon(new ImageIcon(getClass().getResource("/image/" + p1.getFilename())));
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
		체력view1.setLabelFor(체력Bar1);
		체력view1.setFont(new Font("굴림", Font.BOLD, 12));
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
				p1.강한공격(p2);
				updateView(p1, p2);
			}
		});
		p1강한Button.setFont(new Font("굴림", Font.BOLD, 18));
		p1강한Button.setBounds(72, 565, 227, 49);
		player1.add(p1강한Button);

		p1HealButton = new JButton("HP회복");
		p1HealButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.회복(p1);
				updateView(p1, p1);
			}
		});
		p1HealButton.setFont(new Font("굴림", Font.BOLD, 18));
		p1HealButton.setBounds(70, 637, 227, 49);
		player1.add(p1HealButton);

		p1AttackButton = new JButton("기본공격");
		p1AttackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.기본공격(p2);
				updateView(p1, p2);
			}
		});
		p1AttackButton.setFont(new Font("굴림", Font.BOLD, 18));
		p1AttackButton.setBounds(72, 493, 227, 49);
		player1.add(p1AttackButton);
		
		체력Label1 = new JLabel("New label");
		체력Label1.setFont(new Font("굴림", Font.BOLD, 12));
		체력Label1.setBounds(65, 371, 124, 15);
		player1.add(체력Label1);
		
		마나Label1 = new JLabel("New label");
		마나Label1.setFont(new Font("굴림", Font.BOLD, 12));
		마나Label1.setBounds(65, 420, 124, 15);
		player1.add(마나Label1);

		title = new JLabel("해리포터 배틀게임");
		title.setFont(new Font("굴림", Font.BOLD, 24));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(405, 10, 331, 54);
		contentPane.add(title);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(433, 57, 282, 490);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		player2 = new JPanel();
		player2.setBackground(SystemColor.menu);
		player2.setLayout(null);
		player2.setBounds(728, 57, 366, 717);
		contentPane.add(player2);

		p2img = new JLabel("Player2");
		p2img.setIcon(new ImageIcon(GameActView.class.getResource("/image/"+p2.getFilename())));
		p2img.setBounds(62, 10, 243, 226);
		player2.add(p2img);

		체력Bar2 = new JProgressBar();
		체력Bar2.setValue(100);
		체력Bar2.setForeground(Color.RED);
		체력Bar2.setBounds(24, 396, 330, 21);
		player2.add(체력Bar2);

		name2 = new JLabel("이름 :");
		name2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 18));
		name2.setBounds(62, 275, 243, 38);
		player2.add(name2);

		마나Bar2 = new JProgressBar();
		마나Bar2.setValue(100);
		마나Bar2.setForeground(Color.BLUE);
		마나Bar2.setBounds(24, 445, 330, 21);
		player2.add(마나Bar2);

		체력view2 = new JLabel("체력 : ");
		체력view2.setLabelFor(체력Bar2);
		체력view2.setFont(new Font("굴림", Font.BOLD, 12));
		체력view2.setBounds(24, 371, 49, 15);
		player2.add(체력view2);

		마나view2 = new JLabel("마나 : ");
		마나view2.setLabelFor(마나Bar2);
		마나view2.setFont(new Font("굴림", Font.BOLD, 12));
		마나view2.setBounds(24, 420, 49, 15);
		player2.add(마나view2);

		사용주문2 = new JLabel("사용 주문 : ");
		사용주문2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 18));
		사용주문2.setBounds(62, 323, 243, 38);
		player2.add(사용주문2);

		p2AttackButton = new JButton("기본공격");
		p2AttackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2.기본공격(p1);
				updateView(p2, p1);
			}
		});
		p2AttackButton.setFont(new Font("굴림", Font.BOLD, 18));
		p2AttackButton.setBounds(66, 494, 227, 49);
		player2.add(p2AttackButton);

		p2강한Button = new JButton("강한공격");
		p2강한Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2.강한공격(p1);
				updateView(p2, p1);
			}
		});
		p2강한Button.setFont(new Font("굴림", Font.BOLD, 18));
		p2강한Button.setBounds(66, 568, 227, 49);
		player2.add(p2강한Button);

		p2HealButton = new JButton("HP회복");
		p2HealButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2.회복(p2);
				updateView(p2, p2);
			}
		});
		p2HealButton.setFont(new Font("굴림", Font.BOLD, 18));
		p2HealButton.setBounds(66, 637, 227, 49);
		player2.add(p2HealButton);
		
		체력Label2 = new JLabel("New label");
		체력Label2.setFont(new Font("굴림", Font.BOLD, 12));
		체력Label2.setBounds(62, 371, 124, 15);
		player2.add(체력Label2);
		
		마나Label2 = new JLabel("New label");
		마나Label2.setFont(new Font("굴림", Font.BOLD, 12));
		마나Label2.setBounds(62, 420, 124, 15);
		player2.add(마나Label2);

		ResetButton = new JButton("초기화하기");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		ResetButton.setFont(new Font("굴림", Font.BOLD, 18));
		ResetButton.setBounds(454, 631, 236, 54);
		contentPane.add(ResetButton);

	}
	public GameActView(마법사 p1, 마법사 p2) {
		
		
		this.p1 = p1;
		this.p2 = p2;

		// 이미지와 bar, attack 동작

		p1img.setIcon(new ImageIcon(getClass().getResource("/image/" + p1.getFilename())));
		p2img.setIcon(new ImageIcon(GameActView.class.getResource("/image/" + p2.getFilename())));

		체력Bar1.setMaximum(p1.get체력());
		마나Bar1.setMaximum(p1.get마나());

		체력Bar2.setMaximum(p2.get체력());
		마나Bar2.setMaximum(p2.get마나());

		체력Bar1.setValue(p1.get체력());
		마나Bar1.setValue(p1.get마나());

		체력Bar2.setValue(p2.get체력());
		마나Bar2.setValue(p2.get마나());
		
		//hp보이기
		체력Label1.setText( Integer.toString(p1.get체력()));
		마나Label1.setText( Integer.toString(p1.get마나()));
		
		체력Label2.setText( Integer.toString(p2.get체력()));
		마나Label2.setText( Integer.toString(p2.get마나()));
	}
	public void updateView(마법사 attacker,마법사 target) {
		
		체력Bar1.setValue(p1.get체력()); // 이름, 체력, 마나, 주문(주문이름, 데미지, 마나소모)
		마나Bar1.setValue(p1.get마나());
		
		체력Bar2.setValue(p2.get체력()); // 이름, 체력, 마나, 주문(주문이름, 데미지, 마나소모)
		마나Bar2.setValue(p2.get마나());

		// textArea에 메세지 추가!
		textArea.append(attacker.get이름() + "이" + target.get이름() + "을 공격했습니다.\n");
		textArea.append(p1.get이름() + "체력 : " + p1.get체력() + " / 마나 : " + p1.get마나() + "\n" );
		textArea.append(p2.get이름() + "체력 : " + p2.get체력() + " / 마나 : " + p2.get마나() + "\n\n" );

		// 사망처리
		// 이미지교체. p1이 이겼음을 알리고, 게임 종료!
		if (target.get체력() <= 0) {
			textArea.append(target.get이름() + "패배!!\n");
			textArea.append(attacker.get이름() + "승리!!\n");
			
			JOptionPane.showMessageDialog(null, // 부모 컴포넌트 : null이면 화면 중앙에 표시
					attacker.get이름() + "승리!!!", // 메시지
					"게임 결과", // 제목
					JOptionPane.INFORMATION_MESSAGE// 메시지 타입(원하는 아이콘으로 변경 가능)
			);
			dispose();
		}
	}
	
	public void 초기화면설정() {
		Name1.setText("이름 : " + p1.get이름());
		name2.setText("이름 : " + p2.get이름());
		
		사용주문1.setText("사용 주문 : " + p1.get주문().get주문이름());
		사용주문2.setText("사용 주문 : " + p2.get주문().get주문이름());
		
		체력Bar1.setMaximum(p1.get체력());
		체력Bar1.setValue(p1.get체력());
		
		마나Bar1.setMaximum(p1.get마나());
		마나Bar1.setValue(p1.get마나());
		
		체력Bar2.setMaximum(p2.get체력());
		체력Bar2.setValue(p2.get체력());
		
		마나Bar2.setMaximum(p2.get마나());
		마나Bar2.setValue(p2.get마나());
		
		textArea.setText("게임 시작!\n");
	}
}
