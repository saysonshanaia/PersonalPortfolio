package PersonalPortfolio;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelEducation extends JPanel {

	private Image img_Pic6 = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Pic6.jpg").getImage().getScaledInstance(160, 220, Image.SCALE_SMOOTH);
	private Image img_Pic7 = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Pic7.jpg").getImage().getScaledInstance(160, 220, Image.SCALE_SMOOTH);
	
	public PanelEducation() {
		setBackground(new Color(250, 240, 230));
		
		setBounds(0, 0, 722, 606);
		setLayout(null);
		
		JLabel lblEducation = new JLabel("EDUCATION HISTORY\r\n");
		lblEducation.setHorizontalAlignment(SwingConstants.CENTER);
		lblEducation.setForeground(new Color(47, 79, 79));
		lblEducation.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 35));
		lblEducation.setBackground(new Color(250, 240, 230));
		lblEducation.setBounds(32, 24, 413, 46);
		add(lblEducation);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		panel.setBounds(476, 24, 208, 267);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblPic6 = new JLabel("");
		lblPic6.setBounds(24, 23, 160, 220);
		panel.add(lblPic6);
		lblPic6.setIcon(new ImageIcon(img_Pic6));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setBounds(476, 312, 208, 267);
		add(panel_1);
		
		JLabel lblPic7 = new JLabel("");
		lblPic7.setBounds(26, 25, 160, 220);
		panel_1.add(lblPic7);
		lblPic7.setIcon(new ImageIcon(img_Pic7));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 235, 205));
		panel_2.setBounds(0, 107, 477, 46);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblElementary = new JLabel("ELEMENTARY\r\n");
		lblElementary.setForeground(new Color(0, 0, 0));
		lblElementary.setFont(new Font("Arial", Font.BOLD, 18));
		lblElementary.setHorizontalAlignment(SwingConstants.CENTER);
		lblElementary.setBounds(10, 10, 457, 26);
		panel_2.add(lblElementary);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(255, 235, 205));
		panel_3.setBounds(0, 221, 477, 46);
		add(panel_3);
		
		JLabel lblJuniorHighSchool = new JLabel("JUNIOR HIGH SCHOOL");
		lblJuniorHighSchool.setHorizontalAlignment(SwingConstants.CENTER);
		lblJuniorHighSchool.setForeground(new Color(0, 0, 0));
		lblJuniorHighSchool.setFont(new Font("Arial", Font.BOLD, 18));
		lblJuniorHighSchool.setBounds(10, 10, 457, 26);
		panel_3.add(lblJuniorHighSchool);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(255, 235, 205));
		panel_5.setBounds(0, 451, 477, 46);
		add(panel_5);
		
		JLabel lblCollege = new JLabel("COLLEGE\r\n");
		lblCollege.setHorizontalAlignment(SwingConstants.CENTER);
		lblCollege.setForeground(new Color(0, 0, 0));
		lblCollege.setFont(new Font("Arial", Font.BOLD, 18));
		lblCollege.setBounds(10, 10, 457, 26);
		panel_5.add(lblCollege);
		
		JLabel lblPlaridel = new JLabel("Plaridel Elementary School (2010 - 2016)");
		lblPlaridel.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlaridel.setForeground(new Color(47, 79, 79));
		lblPlaridel.setFont(new Font("Arial", Font.BOLD, 15));
		lblPlaridel.setBounds(22, 174, 430, 28);
		add(lblPlaridel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(255, 235, 205));
		panel_4.setBounds(0, 337, 477, 46);
		add(panel_4);
		
		JLabel lblSeniorHighSchool = new JLabel("SENIOR HIGH SCHOOL");
		lblSeniorHighSchool.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeniorHighSchool.setForeground(new Color(0, 0, 0));
		lblSeniorHighSchool.setFont(new Font("Arial", Font.BOLD, 18));
		lblSeniorHighSchool.setBounds(10, 10, 457, 26);
		panel_4.add(lblSeniorHighSchool);
		
		JLabel lblRamon = new JLabel("Ramon Magsaysay High School (2016 - 2020)");
		lblRamon.setHorizontalAlignment(SwingConstants.CENTER);
		lblRamon.setForeground(new Color(47, 79, 79));
		lblRamon.setFont(new Font("Arial", Font.BOLD, 15));
		lblRamon.setBounds(22, 288, 430, 28);
		add(lblRamon);
		
		JLabel lblNazareth = new JLabel("Nazareth School of National University (2020 - 2022)");
		lblNazareth.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazareth.setForeground(new Color(47, 79, 79));
		lblNazareth.setFont(new Font("Arial", Font.BOLD, 15));
		lblNazareth.setBounds(22, 402, 430, 28);
		add(lblNazareth);
		
		JLabel lblNationalUniversity = new JLabel("National University - Manila (2022)");
		lblNationalUniversity.setHorizontalAlignment(SwingConstants.CENTER);
		lblNationalUniversity.setForeground(new Color(47, 79, 79));
		lblNationalUniversity.setFont(new Font("Arial", Font.BOLD, 15));
		lblNationalUniversity.setBounds(22, 520, 430, 28);
		add(lblNationalUniversity);

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
