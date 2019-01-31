package com.interfaces;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import java.awt.Font;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import com.DAO.ClientDAO;
import com.DAO.CompteDAO;
import com.DAO.LivreDAO;
import com.classes.Client;
import com.classes.Compte;

import net.proteanit.sql.DbUtils;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class Menu extends JFrame {
	private JTable table;
	private JTextField ls;
	private JTextField lns;
	private JTextField fns;
	private JTextField nns;
	private JTextField es;
	private JPasswordField ps;
	private JPasswordField cps;
	private JTextField textField_1;
	private JTextField vs;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblFsdf = new JLabel("");
		lblFsdf.setBounds(-46, 11, 877, 20);
		lblFsdf.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\dcc.PNG"));
		lblFsdf.setBorder(new EmptyBorder(3, 5, 3, 3));
		lblFsdf.setBackground(new Color(204, 51, 0));
		getContentPane().add(lblFsdf);
		
		JLabel label = new JLabel("");
		label.setBounds(827, 11, 159, 20);
		label.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\dcc.PNG"));
		getContentPane().add(label);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 67, 986, 400);
		layeredPane.setForeground(Color.WHITE);
		getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		layeredPane.add(panel_2, "name_14372811407618");
		panel_2.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.BOLD, 15));
		textField_1.setBorder(new LineBorder(new Color(204, 51, 0)));
		textField_1.setBounds(9, 0, 267, 34);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBorder(null);
		btnSearch.setForeground(new Color(255, 255, 255));
		btnSearch.setFont(new Font("Arial", Font.BOLD, 13));
		btnSearch.setBackground(new Color(204, 51, 0));
		btnSearch.setBounds(275, 0, 121, 34);
		panel_2.add(btnSearch);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\lumiere-bibliotheque-livre-pexels-ampoule-710x434.jpeg"));
		label_5.setBounds(275, 0, 725, 394);
		panel_2.add(label_5);
		
		JPanel paneladdbook = new JPanel();
		paneladdbook.setBackground(Color.WHITE);
		layeredPane.add(paneladdbook, "name_17195577793818");
		paneladdbook.setLayout(null);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\5086168739_fa12cd3318_z.jpg"));
		label_6.setBounds(0, 0, 476, 431);
		paneladdbook.add(label_6);
		
		JLabel lblBookInfos = new JLabel("Book infos");
		lblBookInfos.setFont(new Font("Arial", Font.PLAIN, 19));
		lblBookInfos.setForeground(new Color(204, 51, 0));
		lblBookInfos.setBounds(525, 52, 123, 14);
		paneladdbook.add(lblBookInfos);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(670, 96, 146, 20);
		paneladdbook.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(670, 127, 146, 20);
		paneladdbook.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(670, 158, 146, 20);
		paneladdbook.add(textField_3);
		
		JLabel lblTitle_1 = new JLabel("TITLE");
		lblTitle_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblTitle_1.setBounds(525, 96, 90, 27);
		paneladdbook.add(lblTitle_1);
		
		JLabel lblAuther = new JLabel("AUTHER");
		lblAuther.setFont(new Font("Arial", Font.BOLD, 13));
		lblAuther.setBounds(525, 123, 90, 27);
		paneladdbook.add(lblAuther);
		
		JLabel lblTitle = new JLabel("FORMAT");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 13));
		lblTitle.setBounds(525, 154, 90, 27);
		paneladdbook.add(lblTitle);
		
		JButton btnCreateNow = new JButton("CREATE NOW");
		btnCreateNow.setFont(new Font("Arial", Font.BOLD, 15));
		btnCreateNow.setBackground(new Color(0, 0, 0));
		btnCreateNow.setForeground(new Color(255, 255, 255));
		btnCreateNow.setBounds(637, 263, 207, 36);
		paneladdbook.add(btnCreateNow);
		
		JPanel paneleditbook = new JPanel();
		paneleditbook.setBackground(new Color(255, 255, 255));
		layeredPane.add(paneleditbook, "name_17238194979424");
		paneleditbook.setLayout(null);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\5086168739_fa12cd3318_z.jpg"));
		label_7.setBounds(0, 0, 476, 431);
		paneleditbook.add(label_7);
		
		JLabel lblSetABook = new JLabel("Set a Book");
		lblSetABook.setForeground(new Color(204, 51, 0));
		lblSetABook.setFont(new Font("Arial", Font.PLAIN, 19));
		lblSetABook.setBounds(525, 52, 123, 14);
		paneleditbook.add(lblSetABook);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(670, 96, 146, 20);
		paneleditbook.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(670, 127, 146, 20);
		paneleditbook.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBounds(670, 158, 146, 20);
		paneleditbook.add(textField_6);
		
		JLabel lblSetTitle = new JLabel("Set Title");
		lblSetTitle.setFont(new Font("Arial", Font.BOLD, 13));
		lblSetTitle.setBounds(543, 96, 90, 27);
		paneleditbook.add(lblSetTitle);
		
		JLabel lblSetAuthor = new JLabel("Set Author\r\n");
		lblSetAuthor.setFont(new Font("Arial", Font.BOLD, 13));
		lblSetAuthor.setBounds(543, 123, 90, 27);
		paneleditbook.add(lblSetAuthor);
		
		JLabel lblSetFormat = new JLabel("Set Format");
		lblSetFormat.setFont(new Font("Arial", Font.BOLD, 13));
		lblSetFormat.setBounds(543, 154, 90, 27);
		paneleditbook.add(lblSetFormat);
		
		JButton btnSaveChanges_1 = new JButton("SAVE CHANGES");
		btnSaveChanges_1.setForeground(new Color(255, 255, 255));
		btnSaveChanges_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnSaveChanges_1.setBackground(new Color(204, 51, 0));
		btnSaveChanges_1.setBounds(637, 263, 207, 36);
		paneleditbook.add(btnSaveChanges_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		layeredPane.add(panel_5, "name_14403377800109");
		panel_5.setLayout(null);
		
		JLabel lblInfosAccount = new JLabel("Infos Account :");
		lblInfosAccount.setFont(new Font("Arial", Font.BOLD, 14));
		lblInfosAccount.setForeground(new Color(204, 51, 0));
		lblInfosAccount.setBounds(77, 33, 141, 27);
		panel_5.add(lblInfosAccount);
		
		JLabel lblSetLogin = new JLabel("Set Login");
		lblSetLogin.setFont(new Font("Arial", Font.BOLD, 13));
		lblSetLogin.setBounds(128, 72, 90, 27);
		panel_5.add(lblSetLogin);
		
		JLabel lblSetPassword = new JLabel("Set Password");
		lblSetPassword.setFont(new Font("Arial", Font.BOLD, 13));
		lblSetPassword.setBounds(128, 102, 90, 27);
		panel_5.add(lblSetPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Arial", Font.BOLD, 13));
		lblConfirmPassword.setBounds(128, 132, 132, 27);
		panel_5.add(lblConfirmPassword);
		
		JLabel lblInfosClient = new JLabel("Infos Client :");
		lblInfosClient.setForeground(new Color(204, 51, 0));
		lblInfosClient.setFont(new Font("Arial", Font.BOLD, 14));
		lblInfosClient.setBounds(77, 163, 141, 27);
		panel_5.add(lblInfosClient);
		
		JLabel lblSetLastName = new JLabel("Set Last Name");
		lblSetLastName.setFont(new Font("Arial", Font.BOLD, 13));
		lblSetLastName.setBounds(128, 204, 103, 27);
		panel_5.add(lblSetLastName);
		
		JLabel lblSetFirstName = new JLabel("Set First Name");
		lblSetFirstName.setFont(new Font("Arial", Font.BOLD, 13));
		lblSetFirstName.setBounds(128, 234, 103, 27);
		panel_5.add(lblSetFirstName);
		
		JLabel lblSetNickName = new JLabel("Set Nick Name");
		lblSetNickName.setFont(new Font("Arial", Font.BOLD, 13));
		lblSetNickName.setBounds(128, 264, 103, 27);
		panel_5.add(lblSetNickName);
		
		JLabel lblSetEmail = new JLabel("Set e-mail");
		lblSetEmail.setFont(new Font("Arial", Font.BOLD, 13));
		lblSetEmail.setBounds(128, 290, 90, 27);
		panel_5.add(lblSetEmail);
		
		ls = new JTextField();
		ls.setFont(new Font("Calibri", Font.PLAIN, 15));
		ls.setBounds(249, 76, 146, 20);
		panel_5.add(ls);
		ls.setColumns(10);
		
		lns = new JTextField();
		lns.setFont(new Font("Calibri", Font.PLAIN, 15));
		lns.setColumns(10);
		lns.setBounds(249, 208, 146, 20);
		panel_5.add(lns);
		
		fns = new JTextField();
		fns.setFont(new Font("Calibri", Font.PLAIN, 15));
		fns.setColumns(10);
		fns.setBounds(249, 238, 146, 20);
		panel_5.add(fns);
		
		nns = new JTextField();
		nns.setFont(new Font("Calibri", Font.PLAIN, 15));
		nns.setColumns(10);
		nns.setBounds(249, 268, 146, 20);
		panel_5.add(nns);
		
		es = new JTextField();
		es.setFont(new Font("Calibri", Font.PLAIN, 15));
		es.setColumns(10);
		es.setBounds(249, 298, 146, 20);
		panel_5.add(es);
		
		ps = new JPasswordField();
		ps.setFont(new Font("Calibri", Font.PLAIN, 15));
		ps.setBounds(249, 106, 146, 20);
		panel_5.add(ps);
		
		cps = new JPasswordField();
		cps.setFont(new Font("Calibri", Font.PLAIN, 15));
		cps.setBounds(249, 136, 146, 20);
		panel_5.add(cps);
		
		JButton btnSaveChanges = new JButton("Save changes");
		btnSaveChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompteDAO d1=new CompteDAO();
				ClientDAO d2=new ClientDAO();
				String l=ls.getText().toString(),p=ps.getText().toString(),cp=cps.getText().toString(),ln=lns.getText().toString(),fn=fns.getText().toString(),nn=nns.getText().toString(),email=es.getText().toString(),v=vs.getText().toString();
				if(l.equals("")==false) {
					Compte c= d1.getCompte(PremiereInterface.id);
					c.setLogin(l);
					d1.update(c);
				}
				if(p.equals("")==false) {if(p.equals(cp)) {
					Compte c= d1.getCompte(PremiereInterface.id);
					c.setPasswd(p);
					d1.update(c);
				}else{JOptionPane.showMessageDialog(null,"Please, Check your password");}}
				if(ln.equals("")==false) {
					Client c= d2.getClient(PremiereInterface.id);
					c.setLN(ln);
					d2.update(c);
				}
				if(fn.equals("")==false) {
					Client c= d2.getClient(PremiereInterface.id);
					c.setFN(fn);
					d2.update(c);
				}
				if(nn.equals("")==false) {
					Client c= d2.getClient(PremiereInterface.id);
					c.setNN(nn);
					d2.update(c);
				}
				if(email.equals("")==false) {
					Client c= d2.getClient(PremiereInterface.id);
					c.setEmail(email);
					d2.update(c);
				}
				if(v.equals("")==false) {
					Client c= d2.getClient(PremiereInterface.id);
					c.setNomVille(v);
					d2.update(c);
				}
				
				
			}
		});
		btnSaveChanges.setFont(new Font("Arial", Font.BOLD, 15));
		btnSaveChanges.setForeground(new Color(255, 255, 255));
		btnSaveChanges.setBackground(new Color(204, 51, 0));
		btnSaveChanges.setBounds(534, 305, 246, 35);
		panel_5.add(btnSaveChanges);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\kkkkpokiok.PNG"));
		label_4.setBounds(524, 11, 256, 287);
		panel_5.add(label_4);
		
		JLabel lblSetVille = new JLabel("Set Ville");
		lblSetVille.setFont(new Font("Arial", Font.BOLD, 13));
		lblSetVille.setBounds(128, 320, 90, 27);
		panel_5.add(lblSetVille);
		
		vs = new JTextField();
		vs.setFont(new Font("Calibri", Font.PLAIN, 15));
		vs.setColumns(10);
		vs.setBounds(249, 328, 146, 20);
		panel_5.add(vs);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		layeredPane.add(panel_3, "name_14387893197635");
		panel_3.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("Add a book");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(paneladdbook);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_6.setBorder(null);
		btnNewButton_6.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton_6.setForeground(new Color(204, 51, 0));
		btnNewButton_6.setBackground(Color.WHITE);
		btnNewButton_6.setBounds(10, 339, 135, 30);
		panel_3.add(btnNewButton_6);
		
		JButton btnEditABook = new JButton("Edit a book");
		btnEditABook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(paneleditbook);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnEditABook.setBorder(null);
		btnEditABook.setForeground(new Color(204, 51, 0));
		btnEditABook.setFont(new Font("Arial", Font.BOLD, 13));
		btnEditABook.setBackground(Color.WHITE);
		btnEditABook.setBounds(179, 339, 135, 30);
		panel_3.add(btnEditABook);
		
		JButton btnDeleteABook = new JButton("Delete a book");
		btnDeleteABook.setBorder(null);
		btnDeleteABook.setForeground(new Color(204, 51, 0));
		btnDeleteABook.setFont(new Font("Arial", Font.BOLD, 13));
		btnDeleteABook.setBackground(Color.WHITE);
		btnDeleteABook.setBounds(347, 339, 135, 30);
		panel_3.add(btnDeleteABook);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 945, 317);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setSelectionBackground(new Color(255, 255, 255));
		table.setFont(new Font("Calibri", Font.PLAIN, 15));
		table.setGridColor(new Color(253, 245, 230));
		table.setForeground(new Color(0, 0, 0));
		scrollPane.setViewportView(table);
		this.UpdateTL();
		
		JPanel panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_14333417818069");
		panel_1.setLayout(null);
		
		JLabel lblAucunRendezVous = new JLabel("Aucun rendez vous ");
		lblAucunRendezVous.setHorizontalAlignment(SwingConstants.CENTER);
		lblAucunRendezVous.setFont(new Font("Arial", Font.BOLD, 14));
		lblAucunRendezVous.setBounds(206, 82, 435, 156);
		panel_1.add(lblAucunRendezVous);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(245, 245, 245));
		layeredPane.add(panel_6, "name_14303168953079");
		panel_6.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sorry, the page is unavailable for the moment .");
		lblNewLabel.setForeground(new Color(204, 51, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel.setBounds(302, 116, 448, 68);
		panel_6.add(lblNewLabel);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\hhyuul.PNG"));
		label_3.setBounds(103, 56, 189, 184);
		panel_6.add(label_3);
		layeredPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel_6, panel_5, panel_3, panel_2, panel_1, paneladdbook, paneleditbook}));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 140, 1002, 531);
		
		
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(-65, 35, 1051, 33);
		toolBar.setBackground(new Color(253, 245, 230));
		toolBar.setToolTipText("");
		getContentPane().add(toolBar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(253, 245, 230));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\jij.PNG"));
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Look for a book !");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setForeground(new Color(204, 51, 0));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(253, 245, 230));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("          My books");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_3);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setForeground(new Color(204, 51, 0));
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(253, 245, 230));
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("         Set Account");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_5);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(new Color(253, 245, 230));
		btnNewButton_4.setForeground(new Color(204, 51, 0));
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 14));
		toolBar.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("         About Us");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_6);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(new Color(253, 245, 230));
		btnNewButton_5.setForeground(new Color(204, 51, 0));
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 14));
		toolBar.add(btnNewButton_5);
		
		JButton btnDisconnect = new JButton("                                                        Disconnect");
		btnDisconnect.setBorder(null);
		btnDisconnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		btnDisconnect.setBackground(new Color(253, 245, 230));
		btnDisconnect.setForeground(new Color(204, 51, 0));
		btnDisconnect.setFont(new Font("Arial", Font.BOLD, 14));
		toolBar.add(btnDisconnect);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(857, 468, 129, 10);
		label_2.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\dcc.PNG"));
		getContentPane().add(label_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(0, 468, 864, 10);
		getContentPane().add(label_1);
		label_1.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\dcc.PNG"));
		
		
	}
	private void UpdateTL() {
		LivreDAO l=new LivreDAO();
		l.getLivre(12);
		table.setModel(DbUtils.resultSetToTableModel(l.rs));
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
