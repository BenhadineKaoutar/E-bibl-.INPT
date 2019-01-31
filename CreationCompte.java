package com.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.DAO.*;
import com.classes.*;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreationCompte extends JFrame {

	private JPanel contentPane;
	private JTextField ln;
	private JTextField fn;
	private JTextField nn;
	private JTextField login;
	private JTextField email;
	private JPasswordField passwd;
	private JPasswordField Cpasswd;
	private JTextField ville;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreationCompte frame = new CreationCompte();
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
	public CreationCompte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 140, 1002, 531);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setInheritsPopupMenu(false);
		label.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\cese.PNG"));
		label.setBounds(-12, 11, 159, 102);
		contentPane.add(label);
		
		JLabel lblJjjjjljk = new JLabel("WELCOME ");
		lblJjjjjljk.setVerticalAlignment(SwingConstants.TOP);
		lblJjjjjljk.setHorizontalAlignment(SwingConstants.CENTER);
		lblJjjjjljk.setForeground(new Color(204, 51, 0));
		lblJjjjjljk.setFont(new Font("Arial", Font.BOLD, 22));
		lblJjjjjljk.setBackground(UIManager.getColor("CheckBox.background"));
		lblJjjjjljk.setBounds(-2, 124, 186, 34);
		contentPane.add(lblJjjjjljk);
		
		JLabel lblNom = new JLabel("Last Name");
		lblNom.setForeground(Color.WHITE);
		lblNom.setFont(new Font("Arial", Font.BOLD, 16));
		lblNom.setBounds(324, 151, 97, 14);
		contentPane.add(lblNom);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Arial", Font.BOLD, 16));
		lblFirstName.setBounds(324, 176, 122, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Arial", Font.BOLD, 16));
		lblLogin.setBounds(324, 221, 68, 20);
		contentPane.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial", Font.BOLD, 16));
		lblPassword.setBounds(324, 246, 122, 14);
		contentPane.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm password");
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setFont(new Font("Arial", Font.BOLD, 16));
		lblConfirmPassword.setBounds(324, 271, 147, 14);
		contentPane.add(lblConfirmPassword);
		
		JLabel lblEmail = new JLabel("e-mail");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Arial", Font.BOLD, 17));
		lblEmail.setBounds(324, 296, 97, 14);
		contentPane.add(lblEmail);
		
		ln = new JTextField();
		ln.setFont(new Font("Calibri", Font.PLAIN, 15));
		ln.setBounds(559, 151, 165, 20);
		contentPane.add(ln);
		ln.setColumns(10);
		
		fn = new JTextField();
		fn.setFont(new Font("Calibri", Font.PLAIN, 15));
		fn.setColumns(10);
		fn.setBounds(559, 175, 165, 20);
		contentPane.add(fn);
		
		nn = new JTextField();
		nn.setFont(new Font("Calibri", Font.PLAIN, 15));
		nn.setColumns(10);
		nn.setBounds(559, 199, 165, 20);
		contentPane.add(nn);
		
		login = new JTextField();
		login.setFont(new Font("Calibri", Font.PLAIN, 15));
		login.setColumns(10);
		login.setBounds(559, 223, 165, 20);
		contentPane.add(login);
		
		email = new JTextField();
		email.setFont(new Font("Calibri", Font.PLAIN, 15));
		email.setColumns(10);
		email.setBounds(559, 295, 165, 20);
		contentPane.add(email);
		
		JLabel lblNickName = new JLabel("Nick name");
		lblNickName.setForeground(Color.WHITE);
		lblNickName.setFont(new Font("Arial", Font.BOLD, 16));
		lblNickName.setBounds(324, 201, 122, 14);
		contentPane.add(lblNickName);
		
		JButton btnNewButton = new JButton("Create Now");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a=ln.getText().toString(),b=fn.getText().toString(),c=nn.getText().toString(),d=login.getText().toString(),e=passwd.getText().toString(),e1=Cpasswd.getText().toString(),f=email.getText().toString(),g=ville.getText().toString();
				if(a.equals("")||b.equals("")||c.equals("")||d.equals("")||e.equals("")||f.equals("")) {
					JOptionPane.showMessageDialog(null,"Check your datas then Try again");
					}
				else{if(e.equals(e1)) {
					ClientDAO clientD=new ClientDAO();
					CompteDAO compteD=new CompteDAO();
					Client client=new Client(a,b,c,f,g);
					Compte compte=new Compte(client,d,e);
					clientD.create(client);
					compteD.create(compte);	
					setVisible(false);
					Menu fraM=new Menu();
					fraM.setVisible(true);
				}else{JOptionPane.showMessageDialog(null,"Check your Password Please");}}
				}});
		btnNewButton.setForeground(new Color(204, 51, 0));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(10, 390, 165, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setForeground(Color.WHITE);
		lblVille.setFont(new Font("Arial", Font.BOLD, 17));
		lblVille.setBounds(324, 321, 97, 14);
		contentPane.add(lblVille);
		
		ville = new JTextField();
		ville.setFont(new Font("Calibri", Font.PLAIN, 15));
		ville.setColumns(10);
		ville.setBounds(559, 320, 165, 20);
		contentPane.add(ville);
		
		passwd = new JPasswordField();
		passwd.setFont(new Font("Calibri", Font.PLAIN, 15));
		passwd.setBounds(559, 247, 165, 20);
		contentPane.add(passwd);
		
		Cpasswd = new JPasswordField();
		Cpasswd.setFont(new Font("Calibri", Font.PLAIN, 15));
		Cpasswd.setBounds(559, 271, 165, 20);
		contentPane.add(Cpasswd);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(792, 182, 46, 14);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\4afe2ef405e835046f23cffa738aba0c.jpg"));
		lblNewLabel.setBounds(186, 0, 800, 493);
		contentPane.add(lblNewLabel);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setVerticalAlignment(SwingConstants.TOP);
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setForeground(new Color(204, 51, 0));
		lblTo.setFont(new Font("Arial", Font.BOLD, 22));
		lblTo.setBackground(SystemColor.menu);
		lblTo.setBounds(0, 192, 184, 34);
		contentPane.add(lblTo);
		
		JLabel lblEbilb = new JLabel("E-BILB.");
		lblEbilb.setVerticalAlignment(SwingConstants.TOP);
		lblEbilb.setHorizontalAlignment(SwingConstants.CENTER);
		lblEbilb.setForeground(new Color(204, 51, 0));
		lblEbilb.setFont(new Font("Arial", Font.BOLD, 22));
		lblEbilb.setBackground(SystemColor.menu);
		lblEbilb.setBounds(0, 263, 184, 34);
		contentPane.add(lblEbilb);
	}
}
