package com.interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;

import com.DAO.CompteDAO;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PremiereInterface {

	private JFrame frame;
	private JTextField login;
	private JPasswordField passwd;
	public static int id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PremiereInterface window = new PremiereInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PremiereInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(204, 51, 0));
		lblNewLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\dsfer.PNG"));
		lblNewLabel.setBounds(22, 0, 446, 107);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("Login        :");
		lblLogin.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLogin.setBounds(44, 159, 96, 17);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(44, 187, 96, 17);
		frame.getContentPane().add(lblPassword);
		
		login = new JTextField();
		login.setBounds(150, 159, 166, 20);
		frame.getContentPane().add(login);
		login.setColumns(10);
		
		passwd = new JPasswordField();
		passwd.setBounds(150, 187, 166, 20);
		frame.getContentPane().add(passwd);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String l=login.getText().toString(),p=passwd.getText().toString();
				if(l.equals("")||p.equals(""))
				{JOptionPane.showMessageDialog(null,"Please, Fills empty fields ");}
				else {
					CompteDAO d=new CompteDAO();
					if(p.equals(d.getComptePasswd(l))){
						frame.setVisible(false);
						Menu m=new Menu();
						m.setVisible(true);
						id=d.getCompteId(l);
						System.out.print(id);
					}else {JOptionPane.showMessageDialog(null,"access denied");}
				}
		}});
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(204, 51, 0));
		btnNewButton.setBounds(150, 215, 166, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblSignin = new JLabel("Sign-In");
		lblSignin.setForeground(new Color(204, 51, 0));
		lblSignin.setFont(new Font("Arial", Font.BOLD, 18));
		lblSignin.setBounds(150, 118, 85, 29);
		frame.getContentPane().add(lblSignin);
		
		JLabel lblCreateAccount = new JLabel("Create a new account");
		lblCreateAccount.setForeground(new Color(204, 51, 0));
		lblCreateAccount.setFont(new Font("Arial", Font.BOLD, 16));
		lblCreateAccount.setBounds(150, 294, 166, 20);
		frame.getContentPane().add(lblCreateAccount);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\fotolia_84158182.jpg"));
		label.setBounds(486, 0, 500, 500);
		frame.getContentPane().add(label);
		
		JButton btnCreateNow = new JButton("Create Now");
		btnCreateNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				CreationCompte frameCC=new CreationCompte();
				frameCC.setVisible(true);
			}
		});
		btnCreateNow.setBorder(null);
		btnCreateNow.setForeground(new Color(255, 255, 255));
		btnCreateNow.setBackground(new Color(0, 0, 0));
		btnCreateNow.setFont(new Font("Arial", Font.BOLD, 11));
		btnCreateNow.setBounds(150, 325, 166, 29);
		frame.getContentPane().add(btnCreateNow);
		
		JLabel lblVersion = new JLabel("version 1.0.0");
		lblVersion.setForeground(new Color(51, 153, 153));
		lblVersion.setBounds(198, 468, 85, 14);
		frame.getContentPane().add(lblVersion);
		
		JButton btnForgotPassword = new JButton("  Forgot password ?");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String l=login.getText().toString();
				try{if(l.equals("")==false) {
					CompteDAO d=new CompteDAO();
					String p=d.getComptePasswd(l);
					int j=p.length();
					StringBuilder sb = new StringBuilder(p.substring(0, 3));//intialiser le StringBuilder
					for(int i=0;i<(j-3);i++){sb.append("*");}
					JOptionPane.showMessageDialog(null,"Your Password is :"+sb);
					}else{JOptionPane.showMessageDialog(null,"Please,Fills login first");}}
				catch(java.lang.StringIndexOutOfBoundsException e) {JOptionPane.showMessageDialog(null,"no account found");}
				}
			}
		);
		btnForgotPassword.setHorizontalAlignment(SwingConstants.LEFT);
		btnForgotPassword.setBorder(null);
		btnForgotPassword.setBackground(new Color(255, 255, 255));
		btnForgotPassword.setForeground(new Color(51, 204, 255));
		btnForgotPassword.setFont(new Font("Arial", Font.BOLD, 11));
		btnForgotPassword.setBounds(326, 215, 120, 29);
		frame.getContentPane().add(btnForgotPassword);
		frame.setBounds(350, 140, 1002, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
