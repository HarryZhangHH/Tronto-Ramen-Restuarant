package boundaryClass;
import java.awt.*;
import java.util.*;
import javax.swing.border.*;

import controlClass.ReadFile;
import controlClass.SubDishes;
import entityClass.Path;

import javax.swing.*;
import java.awt.event.*;


/**
 * @title:ProhibitGui.java
 * @author group63
 * @version V4.3
 * @description:Boundary class:Prohibit page for manager, manger can disable the options
 */
public class ProhibitGui extends JFrame {

	private JPanel contentPane;
	//String subdishpath = "data/subdishes.txt";
	//String orderPath = "data/order.txt";
	ReadFile readfile = new ReadFile();
	ArrayList<ArrayList<String>> p1table = readfile.readTxtFile1(Path.subdishes);
	ArrayList<String> p2table = readfile.readTxtFile2(Path.subdishes);
	ArrayList<String> p4table = readfile.readTxtFile5(Path.subdishes);

	public ProhibitGui() {
		setTitle("Toronto Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 475);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		JPanel panelp1 = new JPanel();
		panelp1.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		panel.add(panelp1);
		panelp1.setLayout(new GridLayout(p1table.size(), 1, 0, 0));

		ArrayList<JPanel> panellist = new ArrayList<JPanel>();

		for (int i = 0; i < p1table.size(); i++) {
			JPanel panelx = new JPanel();
			panelx.setBackground(SystemColor.text);
			panellist.add(panelx);
			panelp1.add(panellist.get(i));
			JLabel lblSoup = new JLabel(p1table.get(i).get(0) + ": ");
			lblSoup.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
			panelx.add(lblSoup);
			for (int j = 1; j < p1table.get(i).size(); j++) {
				JCheckBox chckbxOption = new JCheckBox(p1table.get(i).get(j));
				chckbxOption.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
				chckbxOption.setBackground(SystemColor.text);
				panelx.add(chckbxOption);
				chckbxOption.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}

				});
			}
		}

		JPanel panelp2 = new JPanel();
		panelp2.setBackground(SystemColor.text);
		panel.add(panelp2);
		JLabel lblSoup = new JLabel("Ingredient: ");
		lblSoup.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		panelp2.add(lblSoup);

		JPanel panelp4 = new JPanel();
		panelp4.setBackground(SystemColor.text);
		panel.add(panelp4);

		JLabel lblAddonStaff = new JLabel("Add-on Staff:");
		lblAddonStaff.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		panelp4.add(lblAddonStaff);
		panelp4.setBackground(SystemColor.text);
		for (int i = 0; i < p4table.size(); i++) {
			JCheckBox chckbxOption = new JCheckBox(p4table.get(i));
			chckbxOption.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
			chckbxOption.setBackground(SystemColor.text);
			panelp4.add(chckbxOption);
			chckbxOption.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}

			});

		}

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.NORTH);

		JLabel lblBanOptions = new JLabel("Ban Options");
		lblBanOptions.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel_1.add(lblBanOptions);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(SystemColor.text);
		contentPane.add(panel_2, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnNewButton.setBackground(SystemColor.activeCaption);
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame frame1 = new ManageMenuGui();
				frame1.setVisible(true);
			}

		});

		for (int i = 0; i < p2table.size(); i++) {
			JCheckBox chckbxOption = new JCheckBox(p2table.get(i));
			panelp2.add(chckbxOption);
			chckbxOption.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
			chckbxOption.setBackground(SystemColor.text);
			chckbxOption.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}

			});
		}

		JButton btnSave = new JButton("SAVE");
		btnSave.setBackground(SystemColor.activeCaption);
		btnSave.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_2.add(btnSave);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				for (int i = 0; i < p1table.size(); i++) {
					String str = null;
					for (Component c : panellist.get(i).getComponents()) {
						if (c instanceof JCheckBox) {
							if (((JCheckBox) c).isSelected()) {
								str = ((JCheckBox) c).getText();
							}
						}
					}

					for (int j = 0; j < p1table.get(i).size(); j++) {
						p1table.get(i).remove(str);
					}

				}

				for (Component c : panelp2.getComponents()) {
					String str = null;
					if (c instanceof JCheckBox) {
						if (((JCheckBox) c).isSelected()) {
							str = ((JCheckBox) c).getText();
							p2table.remove(str);
						}
					}

				}

				for (Component c : panelp4.getComponents()) {
					String str = null;
					if (c instanceof JCheckBox) {
						if (((JCheckBox) c).isSelected()) {

							str = ((JCheckBox) c).getText();
							p4table.remove(str);
						}
					}

				}

				ArrayList<ArrayList<String>> spcification3 = new ArrayList<ArrayList<String>>();
				ArrayList<String> spiciness = new ArrayList<String>();
				spiciness.add("Spiciness");
				spiciness.add("0");
				spiciness.add("5");
				spcification3.add(spiciness);

				HashMap<String, Double> pair = new HashMap<String, Double>();
				ArrayList<HashMap<String, Double>> addon = new ArrayList<HashMap<String, Double>>();

				for (int i = 0; i < p4table.size(); i++) {
					pair.put(p4table.get(i), 1.0);
				}
				addon.add(pair);
				SubDishes subdishes = new SubDishes("Ramen", "good", 9.99, "aa");
				subdishes.writeMenu("Ramen", "good", 9.99, "aa", p1table, p2table, spcification3, addon);

				JFrame frame1 = new ManageMenuGui();

				frame1.setVisible(true);
			}

		});

	}

}
