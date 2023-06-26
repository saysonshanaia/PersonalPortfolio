package PersonalPortfolio;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

public class FrameDashboard extends JFrame {

	private JPanel contentPane;

	private Image img_IconProfile = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PortfolioSayson\\src\\res\\profile.png").getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH);
	private Image img_home = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PortfolioSayson\\src\\res\\IconAboutMe.png").getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image img_works = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\IconWorks.png").getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image img_education = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\IconEducation.png").getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image img_hobbies = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\IconHobbies.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	private Image img_contact = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\IconContacts.png").getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
	private Image img_sign_out = new ImageIcon("C:\\Users\\Shanaia Sayson\\OneDrive - National University\\Documents\\PersonalPortfolio - OOP\\src\\res\\IconSignOut.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
	
	private PanelHome panelHome;
	private PanelWorks panelWorks;
	private PanelEducation panelEducation;
	private PanelHobbies panelHobbies;
	private PanelContact panelContact;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDashboard frame = new FrameDashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public FrameDashboard() {
		setBackground(new Color(47, 79, 79));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1028, 653);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelHome = new PanelHome();
		panelWorks = new PanelWorks();
		panelEducation = new PanelEducation();
		panelHobbies = new PanelHobbies();
		panelContact = new PanelContact();
		
		JPanel paneMenu = new JPanel();
		paneMenu.setBackground(new Color(250, 240, 230));
		paneMenu.setBounds(0, 0, 286, 653);
		contentPane.add(paneMenu);
		paneMenu.setLayout(null);
		
		JLabel lblIconProfile = new JLabel("");
		lblIconProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconProfile.setBounds(30, 21, 225, 173);
		lblIconProfile.setIcon(new ImageIcon(img_IconProfile));
		paneMenu.add(lblIconProfile);
		
		JPanel paneHome = new JPanel();
		paneHome.addMouseListener(new PanelButtonMouseAdapter(paneHome){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHome);
			}
		});
		paneHome.setLayout(null);
		paneHome.setBackground(new Color(47, 79, 79));
		paneHome.setBounds(0, 246, 288, 46);
		paneMenu.add(paneHome);
		
		JLabel lblHome = new JLabel("HOME");
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Dialog", Font.BOLD, 14));
		lblHome.setBounds(105, 10, 173, 26);
		paneHome.add(lblHome);
		
		JLabel lblIconHome = new JLabel("");
		lblIconHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconHome.setBounds(21, 0, 46, 46);
		lblIconHome.setIcon(new ImageIcon(img_home));
		paneHome.add(lblIconHome);
		
		JPanel paneWorks = new JPanel();
		paneWorks.addMouseListener(new PanelButtonMouseAdapter(paneWorks) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelWorks);
			}
		});
		paneWorks.setLayout(null);
		paneWorks.setBackground(new Color(47, 79, 79));
		paneWorks.setBounds(0, 310, 288, 46);
		paneMenu.add(paneWorks);
		
		JLabel lblWorks = new JLabel("WORKS");
		lblWorks.setForeground(Color.WHITE);
		lblWorks.setFont(new Font("Dialog", Font.BOLD, 14));
		lblWorks.setBounds(105, 10, 173, 26);
		paneWorks.add(lblWorks);
		
		JLabel lblIconWorks = new JLabel("");
		lblIconWorks.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconWorks.setBounds(21, 0, 46, 46);
		lblIconWorks.setIcon(new ImageIcon(img_works));
		paneWorks.add(lblIconWorks);
		
		JPanel paneEducation = new JPanel();
		paneEducation.addMouseListener(new PanelButtonMouseAdapter(paneEducation) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelEducation);
			}
		});
		paneEducation.setLayout(null);
		paneEducation.setBackground(new Color(47, 79, 79));
		paneEducation.setBounds(0, 375, 288, 46);
		paneMenu.add(paneEducation);
		
		JLabel lblEducation = new JLabel("EDUCATION");
		lblEducation.setForeground(Color.WHITE);
		lblEducation.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEducation.setBounds(105, 10, 173, 26);
		paneEducation.add(lblEducation);
		
		JLabel lblIconEducation = new JLabel("");
		lblIconEducation.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconEducation.setBounds(21, 0, 46, 46);
		lblIconEducation.setIcon(new ImageIcon(img_education));
		paneEducation.add(lblIconEducation);
		
		JPanel paneHobbies = new JPanel();
		paneHobbies.addMouseListener(new PanelButtonMouseAdapter(paneHobbies) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHobbies);
			}
		});
		paneHobbies.setLayout(null);
		paneHobbies.setBackground(new Color(47, 79, 79));
		paneHobbies.setBounds(0, 441, 288, 46);
		paneMenu.add(paneHobbies);
		
		JLabel lblHobbies = new JLabel("HOBBIES");
		lblHobbies.setForeground(Color.WHITE);
		lblHobbies.setFont(new Font("Dialog", Font.BOLD, 14));
		lblHobbies.setBounds(105, 10, 173, 26);
		paneHobbies.add(lblHobbies);
		
		JLabel lblIconHobbies = new JLabel("");
		lblIconHobbies.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconHobbies.setBounds(21, 0, 46, 46);
		lblIconHobbies.setIcon(new ImageIcon(img_hobbies));
		paneHobbies.add(lblIconHobbies);
		
		JPanel paneContact = new JPanel();
		paneContact.addMouseListener(new PanelButtonMouseAdapter(paneContact) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelContact);
			}
		});
		paneContact.setLayout(null);
		paneContact.setBackground(new Color(47, 79, 79));
		paneContact.setBounds(0, 507, 288, 46);
		paneMenu.add(paneContact);
		
		JLabel lblContact = new JLabel("CONTACT");
		lblContact.setForeground(Color.WHITE);
		lblContact.setFont(new Font("Dialog", Font.BOLD, 14));
		lblContact.setBounds(105, 10, 173, 26);
		paneContact.add(lblContact);
		
		JLabel lblIconContact = new JLabel("");
		lblIconContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconContact.setBounds(21, 0, 46, 46);
		lblIconContact.setIcon(new ImageIcon(img_contact));
		paneContact.add(lblIconContact);
		
		JPanel paneSignOut = new JPanel();
		paneSignOut.addMouseListener(new PanelButtonMouseAdapter(paneSignOut) {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?") == 0) {
					FrameLogin frameLogin = new FrameLogin();
					frameLogin.setVisible(true);
					FrameDashboard.this.dispose();
				}
			}
		});
		paneSignOut.setLayout(null);
		paneSignOut.setBackground(new Color(47, 79, 79));
		paneSignOut.setBounds(0, 573, 288, 46);
		paneMenu.add(paneSignOut);
		
		JLabel lblSignOut = new JLabel("SIGN OUT");
		lblSignOut.setForeground(Color.WHITE);
		lblSignOut.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSignOut.setBounds(105, 10, 173, 26);
		paneSignOut.add(lblSignOut);
		
		JLabel lblIconSignOut = new JLabel("");
		lblIconSignOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconSignOut.setBounds(21, 0, 46, 46);
		lblIconSignOut.setIcon(new ImageIcon(img_sign_out));
		paneSignOut.add(lblIconSignOut);
		
		JLabel lblShanaiaSayson = new JLabel("Shanaia Sayson");
		lblShanaiaSayson.setForeground(new Color(47, 79, 79));
		lblShanaiaSayson.setFont(new Font("Arial", Font.BOLD, 17));
		lblShanaiaSayson.setHorizontalAlignment(SwingConstants.CENTER);
		lblShanaiaSayson.setBounds(53, 192, 179, 32);
		paneMenu.add(lblShanaiaSayson);
		
		JLabel lblExit = new JLabel("X");
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setForeground(Color.WHITE);
		lblExit.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblExit.setBounds(995, 0, 33, 40);
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this tab?", "Confirmation", JOptionPane.YES_NO_OPTION)== 0) {
					FrameDashboard.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblExit.setForeground(Color.WHITE);
			}
		});

		contentPane.add(lblExit);
		
		JPanel paneMainContent = new JPanel();
		paneMainContent.setBounds(296, 37, 722, 606);
		contentPane.add(paneMainContent);
		paneMainContent.setLayout(null);
		
		paneMainContent.add(panelHome);
		paneMainContent.add(panelWorks);
		paneMainContent.add(panelEducation);
		paneMainContent.add(panelHobbies);
		paneMainContent.add(panelContact);
		
		menuClicked(panelHome);
	}
	
	public void menuClicked(JPanel panel) {
		panelHome.setVisible(false);
		panelWorks.setVisible(false);
		panelEducation.setVisible(false);
		panelHobbies.setVisible(false);
		panelContact.setVisible(false);

		panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter {
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(47, 79, 79));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(60, 179, 113));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));
		}
	}

}
