package PersonalPortfolio;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;

public class PanelHobbies extends JPanel {
	
	private Image img_Pic8 = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Pic8.jpg").getImage().getScaledInstance(130, 190, Image.SCALE_SMOOTH);
	private Image img_Pic9 = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Pic9.png").getImage().getScaledInstance(190, 120, Image.SCALE_SMOOTH);
	private Image img_Pic10 = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Pic10.jpg").getImage().getScaledInstance(200, 120, Image.SCALE_SMOOTH);
	private Image img_Pic11 = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Pic11.jpg").getImage().getScaledInstance(130, 190, Image.SCALE_SMOOTH);
	private Image img_Pic12 = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Pic12.jpg").getImage().getScaledInstance(190, 150, Image.SCALE_SMOOTH);
	private Image img_Pic13 = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Pic13.jpg").getImage().getScaledInstance(190, 150, Image.SCALE_SMOOTH);
	private Image img_Pic14 = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Pic14.jpg").getImage().getScaledInstance(170, 150, Image.SCALE_SMOOTH);
	
	public PanelHobbies() {
		
		setBackground(new Color(250, 240, 230));
		
		setBounds(0, 0, 722, 606);
		setLayout(null);
		
		JLabel lblHobbies = new JLabel("HOBBIES/INTERESTS");
		lblHobbies.setForeground(new Color(47, 79, 79));
		lblHobbies.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 35));
		lblHobbies.setBackground(new Color(250, 240, 230));
		lblHobbies.setBounds(58, 42, 381, 46);
		add(lblHobbies);
		
		JLabel lblPic8 = new JLabel("\r\n");
		lblPic8.setBounds(26, 143, 127, 190);
		lblPic8.setIcon(new ImageIcon(img_Pic8));
		add(lblPic8);
		
		JLabel lblPic9 = new JLabel("");
		lblPic9.setBounds(163, 109, 190, 120);
		lblPic9.setIcon(new ImageIcon(img_Pic9));
		add(lblPic9);
		
		JLabel lblPic10 = new JLabel("");
		lblPic10.setBounds(363, 109, 200, 120);
		lblPic10.setIcon(new ImageIcon(img_Pic10));
		add(lblPic10);
		
		JLabel lblPic11 = new JLabel("");
		lblPic11.setBounds(26, 343, 130, 190);
		lblPic11.setIcon(new ImageIcon(img_Pic11));
		add(lblPic11);
		
		JLabel lblPic12 = new JLabel("");
		lblPic12.setBounds(343, 239, 190, 153);
		lblPic12.setIcon(new ImageIcon(img_Pic12));
		add(lblPic12);
		
		JLabel lblPic13 = new JLabel("");
		lblPic13.setBounds(163, 402, 190, 150);
		lblPic13.setIcon(new ImageIcon(img_Pic13));
		add(lblPic13);
		
		JLabel lblPic14 = new JLabel("");
		lblPic14.setBounds(163, 239, 170, 153);
		lblPic14.setIcon(new ImageIcon(img_Pic14));
		add(lblPic14);
		
		JLabel lbl1 = new JLabel("One of my favorite pastimes and interests is watching");
		lbl1.setFont(new Font("Arial", Font.BOLD, 12));
		lbl1.setBounds(374, 398, 308, 19);
		add(lbl1);
		
		JLabel lbl2 = new JLabel("anime, K-dramas, and reading Manhwa. Involving");
		lbl2.setFont(new Font("Arial", Font.BOLD, 12));
		lbl2.setBounds(374, 415, 308, 19);
		add(lbl2);
		
		JLabel lbl3 = new JLabel("myself in these engaging storytelling brings me much ");
		lbl3.setFont(new Font("Arial", Font.BOLD, 12));
		lbl3.setBounds(374, 433, 308, 19);
		add(lbl3);
		
		JLabel lbl4 = new JLabel("delight and amusement. Along with watching anime \r\n");
		lbl4.setFont(new Font("Arial", Font.BOLD, 12));
		lbl4.setBounds(374, 451, 308, 19);
		add(lbl4);
		
		JLabel lbl5 = new JLabel("and K-dramas, I have an interest in sketching.");
		lbl5.setFont(new Font("Arial", Font.BOLD, 12));
		lbl5.setBounds(374, 471, 308, 19);
		add(lbl5);
		
		JLabel lbl6 = new JLabel("Drawing allows me to express myself creatively by ");
		lbl6.setFont(new Font("Arial", Font.BOLD, 12));
		lbl6.setBounds(374, 489, 308, 19);
		add(lbl6);
		
		JLabel lbl7 = new JLabel("bringing characters and scenarios to life, inspired by ");
		lbl7.setFont(new Font("Arial", Font.BOLD, 12));
		lbl7.setBounds(374, 510, 308, 19);
		add(lbl7);
		
		JLabel lbl8 = new JLabel("the compelling artwork I see in anime and Manhwa. ");
		lbl8.setFont(new Font("Arial", Font.BOLD, 12));
		lbl8.setBounds(374, 529, 308, 19);
		add(lbl8);
		
		JLabel lbl9 = new JLabel("These interests and hobbies offer me pleasure and ");
		lbl9.setFont(new Font("Arial", Font.BOLD, 12));
		lbl9.setBounds(374, 548, 308, 19);
		add(lbl9);
		
		JLabel lbl10 = new JLabel("relaxation and allow me to interact with people.\n");
		lbl10.setFont(new Font("Arial", Font.BOLD, 12));
		lbl10.setBounds(374, 566, 308, 19);
		add(lbl10);

	}

}
