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
 * @title:PerDishes3Gui.java
 * @author group63
 * @version V4.3
 * @description:Spiciness selecting page for customer, customer use the boundary class to personalize their dishes.
 */
public class PerDishes3Gui extends JFrame {
	private int personizeDishes3HHH = 0;
	static int num = 0;
	static String selected3;
	static int range;
	//String file = "data/subdishes.txt";

	private JPanel contentPane;

	Order order3 = new Order();

	public PerDishes3Gui() {
		setTitle("Totoro Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel txtrManagementSystem = new JLabel();
		txtrManagementSystem.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtrManagementSystem.setBackground(SystemColor.text);
		txtrManagementSystem.setText("Determine Your Own Favour");
		panel.add(txtrManagementSystem);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.CENTER);

		ReadFile readfile = new ReadFile();
		range = Integer.parseInt((readfile.readTxtFile3(Path.subdishes)));

		SpinnerModel spmodel = new SpinnerNumberModel(0, 0, range, 1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.text);
		panel_1.add(panel_6, BorderLayout.CENTER);

		JLabel txtpnYouCanChoose = new JLabel();
		panel_6.add(txtpnYouCanChoose);
		txtpnYouCanChoose.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		txtpnYouCanChoose.setBackground(SystemColor.text);
		txtpnYouCanChoose.setText("You can choose 0-5 level for spiciness.");

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(SystemColor.text);
		panel_1.add(panel_7, BorderLayout.NORTH);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.text);
		panel_7.add(panel_4);

		JLabel lblSpiciness = new JLabel("Spiciness: ");
		lblSpiciness.setBackground(SystemColor.text);
		panel_4.add(lblSpiciness);
		lblSpiciness.setFont(new Font("Comic Sans MS", Font.BOLD, 15));

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.text);
		panel_7.add(panel_5);
		JSpinner spinner = new JSpinner(spmodel);
		spinner.setForeground(SystemColor.activeCaption);
		spinner.setBackground(SystemColor.text);
		panel_5.add(spinner);
		spinner.setFont(new Font("Cambria Math", Font.PLAIN, 14));

		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				num = (int) (((JSpinner) e.getSource()).getValue());
			}
		});

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
				JFrame frame1 = new PerDishes2Gui();
				frame1.setVisible(true);
			}

		});

		JButton btnSubmit = new JButton("NEXT");
		btnSubmit.setBackground(SystemColor.activeCaption);
		btnSubmit.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_3.add(btnSubmit);

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected3 = num + "";
				dispose();
				JFrame frame1 = new PerDishes4Gui();
				frame1.setVisible(true);
			}
		});
	}
}
