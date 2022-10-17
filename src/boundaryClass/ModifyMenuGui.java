package boundaryClass;
import java.awt.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.*;
import java.util.Map.Entry;
import javax.swing.border.*;

import controlClass.ReadFile;
import controlClass.SubDishes;
import entityClass.Path;

import javax.swing.*;
import java.awt.event.*;

/**
 * @title:ModifyMenuGui.java
 * @author group63
 * @version V4.3
 * @description:Boundary class:Menu modifying page for manager.
 */
public class ModifyMenuGui extends JFrame {

	private JPanel contentPane;
	ReadFile readfile = new ReadFile();
	//static String filePathsubdishes = "data/subdishes.txt";
	//static String filePathdishes = "data/dishes.txt";
	static ArrayList<HashMap<String, String>> subdish = new ArrayList<HashMap<String, String>>();
	static ArrayList<HashMap<String, Double>> subdish1 = new ArrayList<HashMap<String, Double>>();
	ArrayList<ArrayList<String>> dish = readfile.readTxtFile1(Path.dishes);
	ArrayList<ArrayList<String>> p1table = readfile.readTxtFile1(Path.subdishes);
	ArrayList<String> p2table = readfile.readTxtFile2(Path.subdishes);

	public ModifyMenuGui() {
		setTitle("Toronto Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		subdish = readfile.readTxtFile4(Path.subdishes);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblModifyMenu = new JLabel("Modify Menu");
		lblModifyMenu.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel.add(lblModifyMenu);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setFont(new Font("Cambria Math", Font.PLAIN, 17));
		btnNewButton.setBackground(SystemColor.activeCaption);
		panel_1.add(btnNewButton);

		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.setBackground(SystemColor.activeCaption);
		btnConfirm.setFont(new Font("Cambria Math", Font.PLAIN, 17));
		panel_1.add(btnConfirm);

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4, BorderLayout.NORTH);
		panel_4.setLayout(new GridLayout(dish.size(), 3, 0, 0));

		for (int i = 0; i < dish.size(); i++) {
			JLabel lblRamen = new JLabel(dish.get(i).get(0));
			lblRamen.setFont(new Font("Cambria Math", Font.PLAIN, 17));
			panel_4.add(lblRamen);
			panel_4.setBackground(SystemColor.text);
			JLabel lb = new JLabel("£");
			lb.setFont(new Font("Cambria Math", Font.PLAIN, 17));
			panel_4.add(lb);
			JFormattedTextField dishes = new JFormattedTextField(NumberFormat.getNumberInstance());
			dishes.setFont(new Font("Cambria Math", Font.PLAIN, 17));
			dishes.setValue(Double.parseDouble(dish.get(i).get(2)));
			panel_4.add(dishes);

		}

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.text);
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(subdish.size(), 3, 0, 0));

		for (int i = 0; i < subdish.size(); i++) {
			for (Entry<String, String> entry : subdish.get(i).entrySet()) {

				JLabel lblNewLabel = new JLabel(entry.getKey());
				lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 17));
				panel_3.add(lblNewLabel);
				JLabel lb = new JLabel("£");
				lb.setFont(new Font("Cambria Math", Font.PLAIN, 17));
				panel_3.add(lb);
				JFormattedTextField subdishes = new JFormattedTextField(NumberFormat.getNumberInstance());
				
				subdishes.setValue(Double.parseDouble(entry.getValue()));
				subdishes.setFont(new Font("Cambria Math", Font.PLAIN, 17));
				panel_3.add(subdishes);

			}
		}

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame frame1 = new ManagerHomeGui();
				frame1.setVisible(true);
			}

		});

		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     subdish1.clear();
				String str = null;
				double price = 0;
				int i = 0;

				for (Component c : panel_3.getComponents()) {
                    
					if (c instanceof JFormattedTextField) {
						str = ((JFormattedTextField) c).getText() + "";
						price = Double.parseDouble(str);

						HashMap<String, Double> pair = new HashMap<String, Double>();

						for (Entry<String, String> entry : subdish.get(i).entrySet()) {
							pair.put(entry.getKey(), price);

							subdish1.add(pair);

						}
						i++;

					}

				}
				double price2 = 0;
				for (Component c : panel_4.getComponents()) {

					if (c instanceof JFormattedTextField) {
						String str2;
						str2 = ((JFormattedTextField) c).getText() + "";
						price2 = Double.parseDouble(str2);

					}

				}

				ArrayList<ArrayList<String>> spcification3 = new ArrayList<ArrayList<String>>();
				ArrayList<String> spiciness = new ArrayList<String>();
				spiciness.add("Spiciness");
				spiciness.add("0");
				spiciness.add("5");
				spcification3.add(spiciness);
				SubDishes subdishes = new SubDishes("Ramen", "good", price2, "aa");
				subdishes.writeMenu("Ramen", "good", price2, "aa", p1table, p2table, spcification3, subdish1);
				JFrame frame2 = new GuiHome();
				frame2.setVisible(true);

				dispose();

			}

		});

	}

}
