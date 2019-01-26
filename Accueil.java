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
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

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
		lblFsdf.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\dcc.PNG"));
		lblFsdf.setBorder(new EmptyBorder(3, 5, 3, 3));
		lblFsdf.setBackground(new Color(204, 51, 0));
		lblFsdf.setBounds(-46, 11, 877, 20);
		getContentPane().add(lblFsdf);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\dcc.PNG"));
		label.setBounds(827, 11, 159, 20);
		getContentPane().add(label);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setForeground(Color.WHITE);
		layeredPane.setBounds(23, 95, 942, 362);
		getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		layeredPane.add(panel_5, "name_14403377800109");
		
		JPanel panel_4 = new JPanel();
		layeredPane.add(panel_4, "name_14395721206315");
		
		JPanel panel_3 = new JPanel();
		layeredPane.add(panel_3, "name_14387893197635");
		
		JPanel panel_2 = new JPanel();
		layeredPane.add(panel_2, "name_14372811407618");
		panel_2.setLayout(null);
		
		JLabel lblReachercherUnLivre = new JLabel("Reachercher un livre");
		lblReachercherUnLivre.setHorizontalAlignment(SwingConstants.CENTER);
		lblReachercherUnLivre.setFont(new Font("Arial", Font.BOLD, 14));
		lblReachercherUnLivre.setBounds(68, 73, 631, 157);
		panel_2.add(lblReachercherUnLivre);
		
		JPanel panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_14333417818069");
		panel_1.setLayout(null);
		
		JLabel lblAucunRendezVous = new JLabel("Aucun rendez vous ");
		lblAucunRendezVous.setHorizontalAlignment(SwingConstants.CENTER);
		lblAucunRendezVous.setFont(new Font("Arial", Font.BOLD, 14));
		lblAucunRendezVous.setBounds(206, 82, 435, 156);
		panel_1.add(lblAucunRendezVous);
		
		JPanel panel_6 = new JPanel();
		layeredPane.add(panel_6, "name_14303168953079");
		layeredPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel_6, panel_5, panel_4, panel_3, panel_2, panel_1}));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 140, 1002, 531);
		
		
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(new Color(253, 245, 230));
		toolBar.setToolTipText("");
		toolBar.setBounds(-65, 35, 1051, 33);
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
		
		JButton btnNewButton_3 = new JButton("         My history");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(new Color(253, 245, 230));
		btnNewButton_3.setForeground(new Color(204, 51, 0));
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 14));
		toolBar.add(btnNewButton_3);
		
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
		
		JButton btnNewButton_5 = new JButton("      About Us");
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
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\dcc.PNG"));
		label_1.setBounds(0, 468, 864, 10);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\photo projet\\dcc.PNG"));
		label_2.setBounds(857, 468, 129, 10);
		getContentPane().add(label_2);
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
