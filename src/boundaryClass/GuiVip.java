package boundaryClass;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;

import entityClass.Order;

import java.awt.Color;

/**
 * @title:GuiVip.java
 * @author group63
 * @version V4.3
 * @description:Boundary class: show the page to membership about their order
 */
public class GuiVip extends JFrame {

	static String soup;
	static String noodles;
	static String onion;
	static String nori;
	static String chashu;
	static String egg;
	static String spiciness;
	static String addegg;
	static String addnori;
	static String addshoots;
	static String addchashu;
	static String way;
	static String price;
	static Iterator<String> para;//pass the reference from PerDish
	static Iterator<String> para2;//pass the reference from PerDish
	static Iterator<Integer> para4;//pass the reference from PerDish
	public static List<String> copy = new ArrayList<String>();

	public static int flag = 1;

	private JPanel contentPane;
	Order order = new Order();

	public GuiVip() {
		setTitle("Toronto Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 291);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(SystemColor.text);
		panel.add(panel_3, BorderLayout.NORTH);

		JLabel lblVip = new JLabel("Cashier Desk");
		lblVip.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblVip.setBackground(SystemColor.text);
		panel_3.add(lblVip);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel.add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.text);
		panel_1.add(panel_5, BorderLayout.NORTH);
		panel_5.setLayout(new BorderLayout(0, 0));

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.text);
		panel_5.add(panel_4, BorderLayout.NORTH);

		JLabel lblIfYouAre = new JLabel("VIP? or want to be? Please click here!");
		lblIfYouAre.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblIfYouAre.setBackground(SystemColor.text);
		panel_4.add(lblIfYouAre);

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(SystemColor.text);
		panel_5.add(panel_10, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Cambria Math", Font.PLAIN, 17));
		btnNewButton.setBackground(SystemColor.activeCaption);
		panel_10.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
				LoginGui window = new LoginGui();
				window.frmLogin.setVisible(true);
			}

		});

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(SystemColor.text);
		panel_1.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(SystemColor.text);
		panel_7.add(panel_11, BorderLayout.NORTH);

		JLabel lblIfYouWant = new JLabel("Directly pay?  Please click here.");
		lblIfYouWant.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblIfYouWant.setBackground(SystemColor.text);
		panel_11.add(lblIfYouWant);

		JPanel panel_12 = new JPanel();
		panel_12.setBackground(SystemColor.text);
		panel_7.add(panel_12);
		panel_12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton button = new JButton("PAY IT NOW");
		button.setFont(new Font("Cambria Math", Font.PLAIN, 17));
		button.setBackground(SystemColor.activeCaption);
		panel_12.add(button);

		PerDishes4Gui p4 = new PerDishes4Gui();
		DiningOptionsGui p5 = new DiningOptionsGui();

		para = PerDishesGui.selected.iterator();
		para2 = PerDishes2Gui.selected2.iterator();
		para4 = PerDishes4Gui.num.iterator();

		copy.clear();
		while (para.hasNext()) {
			copy.add(para.next());
		}

		while (para2.hasNext()) {
			copy.add(para2.next());

		}

		copy.add(PerDishes3Gui.selected3);

		while (para4.hasNext()) {
			copy.add(para4.next() + "");

		}

		copy.add(DiningOptionsGui.way);
		copy.add(String.valueOf(order.getPrice()));

		price = String.valueOf(order.getPrice());

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
				JFrame frame1 = new ShowOrder2Gui();
				frame1.setVisible(true);
			}

		});

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel.add(panel_2, BorderLayout.SOUTH);
		panel_2.setBackground(SystemColor.text);

		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		panel_2.add(btnNewButton_2);

		JPanel panel_6 = new JPanel();
		panel.add(panel_6, BorderLayout.WEST);
		panel_6.setBackground(SystemColor.text);
		ImageIcon img = new ImageIcon("data/ramen4.jpg");
		JLabel imageLabel = new JLabel(img);
		panel_6.add(imageLabel);

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
				JFrame frame1 = new DiningOptionsGui();
				frame1.setVisible(true);
			}

		});
	}

}
