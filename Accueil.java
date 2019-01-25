package com.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuItem;
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

public class Accueil extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil frame = new Accueil();
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
	public Accueil() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblFsdf = new JLabel("");
		lblFsdf.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\dcc.PNG"));
		lblFsdf.setBorder(new EmptyBorder(3, 5, 3, 3));
		lblFsdf.setBackground(new Color(204, 51, 0));
		lblFsdf.setBounds(-45, 21, 877, 28);
		getContentPane().add(lblFsdf);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\dcc.PNG"));
		label.setBounds(827, 21, 159, 28);
		getContentPane().add(label);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(new Color(253, 245, 230));
		toolBar.setToolTipText("Rechercher un livre\r\nMy books");
		toolBar.setBounds(-65, 51, 1051, 33);
		getContentPane().add(toolBar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(253, 245, 230));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\jij.PNG"));
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Look for a book !");
		btnNewButton_1.setForeground(new Color(204, 51, 0));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(253, 245, 230));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("          My books");
		btnNewButton_2.setForeground(new Color(204, 51, 0));
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(253, 245, 230));
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("        My history");
		btnNewButton_3.setBackground(new Color(253, 245, 230));
		btnNewButton_3.setForeground(new Color(204, 51, 0));
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 14));
		toolBar.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("         Set Account");
		btnNewButton_4.setBackground(new Color(253, 245, 230));
		btnNewButton_4.setForeground(new Color(204, 51, 0));
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 14));
		toolBar.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("      About Us");
		btnNewButton_5.setBackground(new Color(253, 245, 230));
		btnNewButton_5.setForeground(new Color(204, 51, 0));
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 14));
		toolBar.add(btnNewButton_5);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\dcc.PNG"));
		label_1.setBounds(0, 468, 864, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\dcc.PNG"));
		label_2.setBounds(857, 468, 129, 14);
		getContentPane().add(label_2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 200, 1002, 531);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
