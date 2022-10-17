package boundaryClass;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

import controlClass.ReadFile;
import entityClass.Order;
import entityClass.Path;
/**
 * @title:PerDishesGui.java
 * @author group63
 * @version V4.3
 * @description:Basic food selecting page for customer, customer use the boundary class to personalize their dishes.
 */
public class PerDishesGui extends JFrame {

	private JPanel contentPane;
	static boolean soupSelect = false;
	static boolean noodlesSelect = false;
	static boolean onionSelect = false;

	static String sss = null;
	static ArrayList<String> selected = new ArrayList<String>();
	static ArrayList<ArrayList<JRadioButton>> btlist = new ArrayList<ArrayList<JRadioButton>>();
	ButtonGroup btgroup;
	static String choice;
	static ArrayList<ButtonGroup> rdlist = new ArrayList<ButtonGroup>();

	public PerDishesGui() {
		setTitle("Totoro Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setBackground(SystemColor.text);

		Order order1 = new Order();
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel txtrManagementSystem = new JLabel();
		txtrManagementSystem.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtrManagementSystem.setBackground(SystemColor.menu);
		txtrManagementSystem.setText("Personize Your Dishes");
		panel.add(txtrManagementSystem);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.WEST);
		ReadFile readfile = new ReadFile();
		ArrayList<ArrayList<String>> s1 = readfile.readTxtFile1(Path.subdishes);

		panel_1.setLayout(new GridLayout(s1.size(), 1, 0, 0));
		rdlist.clear();
		btlist.clear();
		for (int i = 0; i < s1.size(); i++) {
			JPanel panel_1_i = new JPanel();
			panel_1.add(panel_1_i);
			panel_1.setBackground(SystemColor.text);
			panel_1_i.setLayout(new GridLayout(((ArrayList) s1.get(i)).size(), 1, 0, 0));
			panel_1_i.setBackground(SystemColor.text);
			JLabel lblSoup = new JLabel(s1.get(i).get(0));
			lblSoup.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			panel_1_i.add(lblSoup);
			ArrayList<JRadioButton> rtlist = new ArrayList<JRadioButton>();
			btgroup = new ButtonGroup();
			for (int j = 1; j < ((ArrayList) s1.get(i)).size(); j++) {
				JRadioButton rdbtnRamen = new JRadioButton(s1.get(i).get(j));
				rdbtnRamen.setBackground(SystemColor.text);
				rdbtnRamen.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
				rtlist.add(rdbtnRamen);
				btgroup.add(rdbtnRamen);
				rdbtnRamen.setHorizontalAlignment(SwingConstants.LEFT);
				panel_1_i.add(rdbtnRamen);
				if (j == 1) {
					rdbtnRamen.setSelected(true);
				}

				rdbtnRamen.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

					}
				});

			}
			btlist.add(rtlist);

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
				SelectDishesGui a7 = new SelectDishesGui();
				a7.setSelectDishesHHH(0);
				dispose();
				JFrame frame1 = new SelectDishesGui();
				frame1.setVisible(true);
			}

		});
		JButton btnSubmit = new JButton("NEXT");
		btnSubmit.setBackground(SystemColor.activeCaption);
		btnSubmit.setForeground(SystemColor.desktop);
		btnSubmit.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_3.add(btnSubmit);

		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.EAST);
		panel_4.setBackground(SystemColor.text);
		ImageIcon img = new ImageIcon("data/timg.gif");
		JLabel imageLabel = new JLabel(img);
		imageLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(imageLabel);

		btnSubmit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				selected.clear();
				for (int i = 0; i < btlist.size(); i++) {

					for (int j = 0; j < ((ArrayList) btlist.get(i)).size(); j++) {
						if (btlist.get(i).get(j).isSelected() == true) {
							selected.add(btlist.get(i).get(j).getText());
						}
					}
				}
				dispose();
				JFrame frame1 = new PerDishes2Gui();
				frame1.setVisible(true);
			}
		});
	}
}
