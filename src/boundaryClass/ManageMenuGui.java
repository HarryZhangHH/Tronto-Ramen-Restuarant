package boundaryClass;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.MatteBorder;

import controlClass.ReadFile;
import controlClass.SubDishes;
import entityClass.Path;

import java.awt.Color;

/**
 * @title:ManageMenuGui.java
 * @author group63
 * @version V4.3
 * @description:Menu options page for manager.
 */
public class ManageMenuGui extends JFrame {

	private JPanel contentPane;
	ReadFile readfile = new ReadFile();
	ArrayList<ArrayList<String>> p1table = readfile.readTxtFile1(Path.subdishes);
	ArrayList<String> p2table = readfile.readTxtFile2(Path.subdishes);
	ArrayList<String> p4table = readfile.readTxtFile5(Path.subdishes);

	public ManageMenuGui() {
		setTitle("Toronto Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 444);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 1, 0, 0));

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.text);
		panel_1.add(panel_6);
		panel_6.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(SystemColor.text);
		panel_6.add(panel_8);

		JLabel lblResetToInitial = new JLabel("Reset to initial menu.");
		lblResetToInitial.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		panel_8.add(lblResetToInitial);

		JButton btnResetMenu = new JButton("Reset Menu");
		panel_6.add(btnResetMenu);
		btnResetMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnResetMenu.setBackground(SystemColor.activeCaption);

		btnResetMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SubDishes s = new SubDishes(" ", " ", 1, " ");
				s.addspecification();
				JFrame frame2 = new GuiHome();
				frame2.setVisible(true);

			}

		});

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.text);
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(SystemColor.text);
		panel_4.add(panel_9);

		JLabel lblModifyPriceOf = new JLabel("Modify price of dishes and igredients.");
		lblModifyPriceOf.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		panel_9.add(lblModifyPriceOf);

		JButton btnNewButton = new JButton("Modify Menu");
		panel_4.add(btnNewButton);
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnNewButton.setBackground(SystemColor.activeCaption);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame frame1 = new ModifyMenuGui();
				frame1.setVisible(true);
			}

		});

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.text);
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(SystemColor.text);
		panel_5.add(panel_10);

		JLabel lblIfSomeIngredients = new JLabel("If some ingredients are sold out, click here to modify menu.");
		lblIfSomeIngredients.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		panel_10.add(lblIfSomeIngredients);

		JButton btnNewButton_1 = new JButton("Ban Options");
		panel_5.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnNewButton_1.setBackground(SystemColor.activeCaption);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(SystemColor.text);
		panel_1.add(panel_7);

		JLabel label = new JLabel("  ");
		panel_7.add(label);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame frame1 = new ProhibitGui();
				frame1.setVisible(true);
			}

		});

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(SystemColor.text);
		panel.add(panel_2, BorderLayout.SOUTH);

		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_2.add(btnNewButton_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.text);
		panel.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_11.setBackground(SystemColor.text);
		panel_3.add(panel_11);

		JLabel lblNewLabel = new JLabel("Menu Management");
		panel_11.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel.setBackground(SystemColor.text);

		JPanel panel_12 = new JPanel();
		panel_12.setBackground(SystemColor.text);
		panel_3.add(panel_12);

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame frame1 = new ManagerHomeGui();
				frame1.setVisible(true);
			}

		});

	}

}
