package PersonalPortfolio;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;

public class PanelWorks extends JPanel {

	private Image img_Pic3 = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Pic3.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
	private Image img_Pic4 = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Pic4.png").getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH);
	private Image img_Pic5 = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Pic5.png").getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH);
	
	public PanelWorks() {
		setBackground(new Color(250, 240, 230));
		
		setBounds(0, 0, 722, 606);
		setLayout(null);
		
		JLabel lblWorksAndExperience = new JLabel("WORKS AND EXPERIENCE");
		lblWorksAndExperience.setForeground(new Color(47, 79, 79));
		lblWorksAndExperience.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 35));
		lblWorksAndExperience.setBackground(new Color(250, 240, 230));
		lblWorksAndExperience.setBounds(41, 28, 377, 46);
		add(lblWorksAndExperience);
		
		JLabel lblPic3 = new JLabel("");
		lblPic3.setBounds(224, 248, 194, 176);
		lblPic3.setIcon(new ImageIcon(img_Pic3));
		add(lblPic3);
		
		JLabel lblPic4 = new JLabel("");
		lblPic4.setBounds(41, 99, 300, 227);
		lblPic4.setIcon(new ImageIcon(img_Pic4));
		add(lblPic4);
		
		JLabel lblPic5 = new JLabel("");
		lblPic5.setBounds(41, 346, 300, 227);
		lblPic5.setIcon(new ImageIcon(img_Pic5));
		add(lblPic5);
		
		JLabel lbl1 = new JLabel("Aside from learning in Microsoft, I attended culminating");
		lbl1.setFont(new Font("Arial", Font.BOLD, 12));
		lbl1.setBounds(366, 112, 318, 13);
		add(lbl1);
		
		JLabel lbl2 = new JLabel(" activity in our work immersion in Senior High School.\r\n");
		lbl2.setFont(new Font("Arial", Font.BOLD, 12));
		lbl2.setBounds(366, 130, 318, 13);
		add(lbl2);
		
		JLabel lbl3 = new JLabel(" The culminating activity allows us students to ");
		lbl3.setFont(new Font("Arial", Font.BOLD, 12));
		lbl3.setBounds(366, 148, 318, 13);
		add(lbl3);
		
		JLabel lbl4 = new JLabel("showcase our accomplishments and demonstrate the ");
		lbl4.setFont(new Font("Arial", Font.BOLD, 12));
		lbl4.setBounds(366, 166, 318, 13);
		add(lbl4);
		
		JLabel lbl5 = new JLabel("skills we have acquired throughout our work immersion");
		lbl5.setFont(new Font("Arial", Font.BOLD, 12));
		lbl5.setBounds(366, 183, 318, 13);
		add(lbl5);
		
		JLabel lbl6 = new JLabel("journey.");
		lbl6.setFont(new Font("Arial", Font.BOLD, 12));
		lbl6.setBounds(366, 200, 318, 13);
		add(lbl6);
		
		JLabel lblSkills = new JLabel("SKILLS\r\n");
		lblSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkills.setForeground(new Color(47, 79, 79));
		lblSkills.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 35));
		lblSkills.setBackground(new Color(250, 240, 230));
		lblSkills.setBounds(498, 223, 110, 46);
		add(lblSkills);
		
		JLabel lbl7 = new JLabel("- Organization ");
		lbl7.setFont(new Font("Arial", Font.BOLD, 12));
		lbl7.setBounds(447, 285, 234, 13);
		add(lbl7);
		
		JLabel lbl8 = new JLabel("- Word + Office");
		lbl8.setFont(new Font("Arial", Font.BOLD, 12));
		lbl8.setBounds(447, 307, 234, 13);
		add(lbl8);
		
		JLabel lbl9 = new JLabel("- Video/Photo Editing");
		lbl9.setFont(new Font("Arial", Font.BOLD, 12));
		lbl9.setBounds(447, 328, 234, 13);
		add(lbl9);
		
		JLabel lbl10 = new JLabel("- Coding");
		lbl10.setFont(new Font("Arial", Font.BOLD, 12));
		lbl10.setBounds(447, 350, 234, 13);
		add(lbl10);
		
		JLabel lbl11 = new JLabel("- Creativity");
		lbl11.setFont(new Font("Arial", Font.BOLD, 12));
		lbl11.setBounds(447, 373, 234, 13);
		add(lbl11);
		
		JLabel lbl12 = new JLabel("- Flexibility");
		lbl12.setFont(new Font("Arial", Font.BOLD, 12));
		lbl12.setBounds(447, 396, 234, 13);
		add(lbl12);
		
		JLabel lbl13 = new JLabel("As I advance through my BSIT degree, I will keep");
		lbl13.setFont(new Font("Arial", Font.BOLD, 12));
		lbl13.setBounds(366, 440, 318, 13);
		add(lbl13);
		
		JLabel lbl14 = new JLabel("working to improve and enhance these talents, ");
		lbl14.setFont(new Font("Arial", Font.BOLD, 12));
		lbl14.setBounds(366, 458, 318, 13);
		add(lbl14);
		
		JLabel lbl15 = new JLabel("gaining more excellent knowledge and competence in ");
		lbl15.setFont(new Font("Arial", Font.BOLD, 12));
		lbl15.setBounds(366, 476, 318, 13);
		add(lbl15);
		
		JLabel lbl16 = new JLabel(" numerous areas of information technology.");
		lbl16.setFont(new Font("Arial", Font.BOLD, 12));
		lbl16.setBounds(366, 494, 318, 13);
		add(lbl16);
		
		JLabel lbl17 = new JLabel("These abilities are achieved through integrating");
		lbl17.setFont(new Font("Arial", Font.BOLD, 12));
		lbl17.setBounds(366, 513, 318, 13);
		add(lbl17);
		
		JLabel lbl18 = new JLabel("of schoolwork, hands-on assignments, and practical ");
		lbl18.setFont(new Font("Arial", Font.BOLD, 12));
		lbl18.setBounds(366, 531, 318, 13);
		add(lbl18);
		
		JLabel lblSkillsEarnedDuring = new JLabel("skills earned during our classes.\r\n");
		lblSkillsEarnedDuring.setFont(new Font("Arial", Font.BOLD, 12));
		lblSkillsEarnedDuring.setBounds(366, 548, 318, 13);
		add(lblSkillsEarnedDuring);

	}

}
