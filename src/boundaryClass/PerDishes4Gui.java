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

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @title:GuiPerDishes4.java
 * @author group63
 * @version V4.3
 * @description:Extra dishes options page for customer,customer use the boundary class to personalize their dishes.
 */
public class PerDishes4Gui extends JFrame {
	private int personizeDishes4HHH = 0;
	static int addNori;
	static int addEgg;
	static int addChashu;
	static int addShoots;
	public static ArrayList<Integer> num = new ArrayList<Integer>();
	private JPanel contentPane;
	Order order4 = new Order();
	static ArrayList<String> selected4 = new ArrayList<String>();
	ArrayList<JCheckBox> btlist4 = new ArrayList<JCheckBox>();
	//String file = "data/subdishes.txt";

	public PerDishes4Gui() {
		setTitle("Toronto Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		txtrManagementSystem.setBackground(SystemColor.text);
		txtrManagementSystem.setText("Personize Your Dishes");
		panel.add(txtrManagementSystem);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.CENTER);
		ReadFile readfile = new ReadFile();
		ArrayList<HashMap<String, String>> sp4 = readfile.readTxtFile4(Path.subdishes);
		panel_1.setLayout(new GridLayout((sp4.size() + 1), 1, 0, 0));

		JLabel lblYouCanAdd = new JLabel("You can add the following options: ");
		lblYouCanAdd.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblYouCanAdd.setBackground(SystemColor.text);
		panel_1.add(lblYouCanAdd);
		btlist4.clear();
		for (int i = 0; i < sp4.size(); i++) {

			for (Entry<String, String> entry : sp4.get(i).entrySet()) {
				JCheckBox rdbtnExtraNori = new JCheckBox(entry.getKey() + "    " + "£" + entry.getValue());
				rdbtnExtraNori.setBackground(SystemColor.text);
				rdbtnExtraNori.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
				panel_1.add(rdbtnExtraNori);
				rdbtnExtraNori.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}

				});
				btlist4.add(rdbtnExtraNori);
			}

		}

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(SystemColor.text);
		contentPane.add(panel_2, BorderLayout.SOUTH);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.text);
		panel_2.add(panel_3);

		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnBack.setBackground(SystemColor.activeCaption);
		panel_3.add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame frame1 = new PerDishes3Gui();
				frame1.setVisible(true);
			}

		});

		JButton btnSubmit = new JButton("NEXT");
		btnSubmit.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnSubmit.setBackground(SystemColor.activeCaption);
		panel_3.add(btnSubmit);

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected4.clear();
				num.clear();
				for (int i = 0; i < btlist4.size(); i++) {
					if (btlist4.get(i).isSelected() == true) {
						selected4.add(btlist4.get(i).getText());
						num.add(1);

					}
					if (btlist4.get(i).isSelected() == false) {
						selected4.add("null");
						num.add(0);
					}

				}
				//System.out.println(selected4);
				dispose();

				JFrame frame1 = new DiningOptionsGui();

				frame1.setVisible(true);
			}

		});

	}

}