package boundaryClass;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import controlClass.ReadFile;
import entityClass.Order;
import entityClass.Path;

import java.awt.Color;

/**
 * @title:PerDishes2Gui.java
 * @author group63
 * @version V4.3
 * @description:Side dishes selecting page for customer, customer use the boundary class to personalize their dishes.
 */
public class PerDishes2Gui extends JFrame {
	private int personizeDishes2HHH = 0;
	static boolean noriSelect = false;
	static boolean chashuSelect = false;
	static boolean boiledeggSelect = false;
	static boolean noriSelect1 = false;
	static boolean chashuSelect1 = false;
	static boolean boiledeggSelect1 = false;

	static ArrayList<String> selected2 = new ArrayList<String>();
	
	/*String file = "data/subdishes.txt";*/
	private JPanel contentPane;
	Order order2 = new Order();
	ArrayList<ArrayList<JRadioButton>> btlist2 = new ArrayList<ArrayList<JRadioButton>>();

	public PerDishes2Gui() {
		setTitle("Totoro Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 354);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel txtrManagementSystem = new JLabel();
		txtrManagementSystem.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtrManagementSystem.setBackground(SystemColor.menu);
		txtrManagementSystem.setText("Personize Your Own Dishes");
		panel.add(txtrManagementSystem);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.WEST);
		ReadFile readfile = new ReadFile();
		ArrayList<String> sp2 = readfile.readTxtFile2(Path.subdishes);
		panel_1.setLayout(new GridLayout(sp2.size(), 1, 0, 0));
		panel_1.setBackground(SystemColor.text);
		for (int i = 0; i < sp2.size(); i++) {
			JPanel panel_1_i = new JPanel();
			panel_1_i.setBackground(SystemColor.text);
			panel_1.add(panel_1_i);
			panel_1_i.setLayout(new GridLayout(3, 1, 0, 0));
			JLabel lblSoup = new JLabel(sp2.get(i));
			lblSoup.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			panel_1_i.add(lblSoup);
			ArrayList<JRadioButton> rtlist2 = new ArrayList<JRadioButton>();
			ButtonGroup bt = new ButtonGroup();

			JRadioButton rdbtnRamen = new JRadioButton("Yes");
			rdbtnRamen.setBackground(SystemColor.text);
			rdbtnRamen.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
			rdbtnRamen.setHorizontalAlignment(SwingConstants.LEFT);
			panel_1_i.add(rdbtnRamen);
			rdbtnRamen.setSelected(true);
			bt.add(rdbtnRamen);
			rdbtnRamen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}

			});

			JRadioButton rdbtnNewRadioButton = new JRadioButton("No");
			rdbtnNewRadioButton.setBackground(SystemColor.text);
			rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
			rdbtnNewRadioButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
			panel_1_i.add(rdbtnNewRadioButton);
			bt.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}

			});
			rtlist2.add(rdbtnNewRadioButton);
			rtlist2.add(rdbtnRamen);
			btlist2.add(rtlist2);
		}

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(SystemColor.text);
		contentPane.add(panel_2, BorderLayout.SOUTH);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.text);
		panel_2.add(panel_3);

		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(SystemColor.activeCaption);
		btnBack.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_3.add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame frame1 = new PerDishesGui();
				frame1.setVisible(true);
			}

		});

		JButton btnSubmit = new JButton("NEXT");
		btnSubmit.setBackground(SystemColor.activeCaption);
		btnSubmit.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_3.add(btnSubmit);

		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.EAST);
		panel_4.setBackground(SystemColor.text);
		ImageIcon img = new ImageIcon("data/ramen2.jpg");
		JLabel imageLabel = new JLabel(img);
		imageLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(imageLabel);

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected2.clear();
				for (int i = 0; i < btlist2.size(); i++) {

					for (int j = 0; j < ((ArrayList) btlist2.get(i)).size(); j++) {
						if (btlist2.get(i).get(j).isSelected() == true) {
							selected2.add(btlist2.get(i).get(j).getText());
						}
					}
				}
				dispose();
				JFrame frame1 = new PerDishes3Gui();
				frame1.setVisible(true);
			}
		});
	}
}
