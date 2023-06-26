package PersonalPortfolio;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class PanelHome extends JPanel {

	private Image img_Pic1 = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Pic1.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
	private Image img_Pic2 = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Pic2.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
	
	
	public PanelHome() {
		setBackground(new Color(250, 240, 230));
		
		setBounds(0, 0, 722, 606);
		setLayout(null);
		setVisible(true);
		
		JLabel lblHELLO = new JLabel("HELLO!");
		lblHELLO.setBackground(new Color(250, 240, 230));
		lblHELLO.setForeground(new Color(47, 79, 79));
		lblHELLO.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 50));
		lblHELLO.setHorizontalAlignment(SwingConstants.TRAILING);
		lblHELLO.setBounds(437, 44, 227, 72);
		add(lblHELLO);
		
		JLabel lblPic1 = new JLabel("");
		lblPic1.setBounds(40, 44, 200, 212);
		lblPic1.setIcon(new ImageIcon(img_Pic1));
		add(lblPic1);
		
		JLabel lblPic2 = new JLabel("");
		lblPic2.setBounds(477, 347, 200, 212);
		lblPic2.setIcon(new ImageIcon(img_Pic2));
		add(lblPic2);
		
		JLabel lblNewLabel = new JLabel("I am Shanaia Relampagos Sayson");
		lblNewLabel.setForeground(new Color(85, 107, 47));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel.setBounds(392, 108, 285, 20);
		add(lblNewLabel);
		
		JLabel lblBsitmwaStudent = new JLabel("BSIT-MWA Student");
		lblBsitmwaStudent.setHorizontalAlignment(SwingConstants.TRAILING);
		lblBsitmwaStudent.setForeground(new Color(47, 79, 79));
		lblBsitmwaStudent.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblBsitmwaStudent.setBounds(401, 136, 263, 20);
		add(lblBsitmwaStudent);
		
		JLabel lblIntroduction = new JLabel("INTRODUCTION");
		lblIntroduction.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntroduction.setForeground(new Color(47, 79, 79));
		lblIntroduction.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 50));
		lblIntroduction.setBackground(new Color(250, 240, 230));
		lblIntroduction.setBounds(50, 266, 345, 72);
		add(lblIntroduction);
		
		JLabel lblNewLabel_1 = new JLabel("Hello, and welcome to my portfolio! I am Shanaia Sayson, 20 years old,");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(279, 179, 409, 13);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("studying at the National University-Manila for a Bachelor of Science in");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(279, 196, 409, 13);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Information Technology. I am excited to share the start of my ");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBounds(279, 215, 409, 13);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("educational path with you, highlighting my early successes, progress,");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_4.setBounds(279, 233, 409, 13);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("and passion for advancing technology.\n");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_5.setBounds(279, 251, 409, 13);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("As a first-year BSIT student, I've just begun my academic journey ");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_6.setBounds(40, 347, 409, 13);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("toward becoming a qualified IT individual. This portfolio is the core ");
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_7.setBounds(40, 364, 409, 13);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("my technical expertise and demonstrates my drive to learn and");
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_8.setBounds(40, 382, 409, 13);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("implement new ideas.\n");
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_9.setBounds(40, 401, 409, 13);
		add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("This portfolio also displays my enthusiasm for interactive learning and ");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_10.setBounds(40, 434, 409, 13);
		add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("eagerness to contribute to the learning environment. I actively ");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_11.setBounds(40, 452, 409, 13);
		add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("connected with other students participated in group discussions,");
		lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_12.setBounds(40, 470, 409, 13);
		add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("and received advice from mentors and instructors. These connections");
		lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_13.setBounds(40, 489, 409, 13);
		add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("have not only aided my development but have also developed a ");
		lblNewLabel_14.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_14.setBounds(40, 508, 409, 13);
		add(lblNewLabel_14);
		
		JLabel lblNewLabel_14_1 = new JLabel("supporting system that encourages my motivation to study.");
		lblNewLabel_14_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_14_1.setBounds(40, 526, 409, 13);
		add(lblNewLabel_14_1);

	}
}
