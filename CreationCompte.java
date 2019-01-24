package com.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class CreationCompte extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

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
		setBounds(350, 200, 1002, 531);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setInheritsPopupMenu(false);
		label.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\cese.PNG"));
		label.setBounds(28, 0, 159, 132);
		contentPane.add(label);
		
		JLabel lblJjjjjljk = new JLabel("WELCOME TO E-BIBL.");
		lblJjjjjljk.setForeground(new Color(204, 51, 0));
		lblJjjjjljk.setHorizontalAlignment(SwingConstants.CENTER);
		lblJjjjjljk.setFont(new Font("Arial", Font.BOLD, 22));
		lblJjjjjljk.setBackground(UIManager.getColor("CheckBox.background"));
		lblJjjjjljk.setBounds(0, 0, 986, 132);
		contentPane.add(lblJjjjjljk);
		
		JLabel lblNom = new JLabel("Last Name");
		lblNom.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNom.setBounds(104, 156, 97, 14);
		contentPane.add(lblNom);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Arial", Font.PLAIN, 14));
		lblFirstName.setBounds(104, 181, 68, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLogin.setBounds(104, 226, 68, 20);
		contentPane.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPassword.setBounds(104, 251, 68, 14);
		contentPane.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm password");
		lblConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		lblConfirmPassword.setBounds(104, 276, 122, 14);
		contentPane.add(lblConfirmPassword);
		
		JLabel lblBirthDate = new JLabel("Birth date");
		lblBirthDate.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBirthDate.setBounds(104, 326, 97, 14);
		contentPane.add(lblBirthDate);
		
		JLabel lblEmail = new JLabel("e-mail");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEmail.setBounds(104, 301, 97, 14);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(239, 154, 165, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(239, 178, 165, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(239, 202, 165, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(239, 226, 165, 20);
		contentPane.add(textField_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(239, 298, 165, 20);
		contentPane.add(textField_6);
		
		JLabel lblNickName = new JLabel("Nick name");
		lblNickName.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNickName.setBounds(104, 206, 68, 14);
		contentPane.add(lblNickName);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(239, 322, 165, 20);
		contentPane.add(textField_7);
		
		JButton btnNewButton = new JButton("Create Now");
		btnNewButton.setForeground(new Color(204, 51, 0));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(159, 390, 159, 34);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(239, 250, 165, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(239, 274, 165, 20);
		contentPane.add(passwordField_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(792, 182, 46, 14);
		contentPane.add(label_1);
	}
}
