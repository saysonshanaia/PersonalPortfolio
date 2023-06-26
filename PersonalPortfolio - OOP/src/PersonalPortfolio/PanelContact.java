package PersonalPortfolio;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;

public class PanelContact extends JPanel {

	private Image img_Email = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Email.png").getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image img_Instagram = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Instagram.png").getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image img_Facebook = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Facebook.png").getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image img_Twitter = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Twitter.png").getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image img_Phone = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\Phone.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	
	public PanelContact() {
		setBackground(new Color(250, 240, 230));
		
		setBounds(0, 0, 722, 606);
		setLayout(null);
		
		JLabel lblGetInTouch = new JLabel("GET IN ");
		lblGetInTouch.setForeground(new Color(47, 79, 79));
		lblGetInTouch.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 50));
		lblGetInTouch.setBackground(new Color(250, 240, 230));
		lblGetInTouch.setBounds(56, 38, 227, 72);
		add(lblGetInTouch);
		
		JLabel lblTouch = new JLabel("TOUCH");
		lblTouch.setForeground(new Color(85, 107, 47));
		lblTouch.setFont(new Font("Franklin Gothic Demi Cond", Font.BOLD, 50));
		lblTouch.setBackground(new Color(250, 240, 230));
		lblTouch.setBounds(56, 87, 227, 72);
		add(lblTouch);
		
		JLabel lblNewLabel = new JLabel("Contact Information:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(56, 174, 305, 28);
		add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email: saysonshanaia2@gmail.com");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 15));
		lblEmail.setBounds(121, 232, 350, 28);
		lblEmail.setIcon(new ImageIcon(img_Email));
		add(lblEmail);
		
		JLabel lblInstagram = new JLabel("Instagram: naiaaasysn");
		lblInstagram.setFont(new Font("Arial", Font.BOLD, 15));
		lblInstagram.setBounds(121, 281, 350, 28);
		lblInstagram.setIcon(new ImageIcon(img_Instagram));
		add(lblInstagram);
		
		JLabel lblFacebook = new JLabel("Facebook: Shanaia Sayson");
		lblFacebook.setFont(new Font("Arial", Font.BOLD, 15));
		lblFacebook.setBounds(121, 333, 350, 28);
		lblFacebook.setIcon(new ImageIcon(img_Facebook));
		add(lblFacebook);
		
		JLabel lblPhone = new JLabel("Phone: 09494845537");
		lblPhone.setFont(new Font("Arial", Font.BOLD, 15));
		lblPhone.setBounds(121, 435, 350, 28);
		lblPhone.setIcon(new ImageIcon(img_Phone));
		add(lblPhone);
		
		JLabel lblTwitter = new JLabel("Twitter: shnsysn_");
		lblTwitter.setFont(new Font("Arial", Font.BOLD, 15));
		lblTwitter.setBounds(121, 386, 350, 28);
		lblTwitter.setIcon(new ImageIcon(img_Twitter));
		add(lblTwitter);


	}

}
