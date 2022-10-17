package boundaryClass;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.MatteBorder;

import controlClass.AddStamps;
import controlClass.MakeOrder;
import controlClass.ReadFile;
import controlClass.SendEmail;
import entityClass.Order;
import entityClass.Path;

import java.awt.Color;

/**
 * @title:PaymentGui.java
 * @author group63
 * @version V4.3
 * @description:All order showing page for customer
 */
public class PaymentGui extends JFrame {

	private JPanel contentPane;
	static boolean pay = false;
	Order order = new Order();
	MakeOrder makeorder = new MakeOrder();
	//String file = "data/way.txt";
	ReadFile readfile = new ReadFile();

	public PaymentGui() {
		setTitle("Toronto Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel txtpnTotalPrice = new JLabel();
		txtpnTotalPrice.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		txtpnTotalPrice.setBackground(SystemColor.menu);
		panel.add(txtpnTotalPrice, BorderLayout.WEST);
		txtpnTotalPrice.setText("Total Price:" + GuiVip.price);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		JLabel txtpnPayment = new JLabel();
		txtpnPayment.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtpnPayment.setBackground(SystemColor.text);
		panel_1.add(txtpnPayment, BorderLayout.NORTH);
		txtpnPayment.setText("PAYMENT");

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.text);
		panel.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel txtpnPaymentMethod = new JLabel();
		txtpnPaymentMethod.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		txtpnPaymentMethod.setBackground(SystemColor.menu);
		panel_2.add(txtpnPaymentMethod);
		txtpnPaymentMethod.setText("Payment method:");

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.text);
		panel_2.add(panel_3);

		ArrayList<String> way = readfile.readTxtFile6(Path.way);
		panel_3.setLayout(new GridLayout(way.size(), 1, 0, 0));
		ButtonGroup bt = new ButtonGroup();

		for (int i = 0; i < way.size(); i++) {
			JRadioButton rdbtnNewRadioButton = new JRadioButton(way.get(i));
			panel_3.add(rdbtnNewRadioButton);
			panel_3.setBackground(SystemColor.text);
			rdbtnNewRadioButton.setBackground(SystemColor.text);
			rdbtnNewRadioButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
			bt.add(rdbtnNewRadioButton);
			if (i == 0) {
				rdbtnNewRadioButton.setSelected(true);
			}
			rdbtnNewRadioButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}

			});

		}

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.text);
		panel_4.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		contentPane.add(panel_4, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_4.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
				JFrame frame1 = new ShowOrder2Gui();
				frame1.setVisible(true);
			}

		});

		JButton btnNewButton_1 = new JButton("PAY");
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PerDishesGui p1 = new PerDishesGui();
				PerDishes2Gui p2 = new PerDishes2Gui();
				PerDishes3Gui p3 = new PerDishes3Gui();
				PerDishes4Gui p4 = new PerDishes4Gui();
				DiningOptionsGui p5 = new DiningOptionsGui();


				order.setNori(p2.noriSelect1);
				order.setEgg(p2.boiledeggSelect1);
				order.setChashu(p2.chashuSelect1);
				order.setAdd_on_chashu(p4.addChashu);
				order.setAdd_on_egg(p4.addEgg);
				order.setAdd_on_nori(p4.addNori);
				order.setAdd_on_shoots(p4.addShoots);
				order.setWay(p5.way);
				makeorder.printOrderTicket();
				makeorder.printOrder();

			}
		});

		panel_4.add(btnNewButton_1);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
				JFrame frame1 = new GuiSuccess();
				frame1.setVisible(true);
			}

		});
	}

	public PaymentGui(String id) {
		setTitle("Toronto Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel txtpnTotalPrice = new JLabel();
		txtpnTotalPrice.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		txtpnTotalPrice.setBackground(SystemColor.menu);
		panel.add(txtpnTotalPrice, BorderLayout.WEST);
		txtpnTotalPrice.setText("Total Price:" + GuiVip.price);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		JLabel txtpnPayment = new JLabel();
		txtpnPayment.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtpnPayment.setBackground(SystemColor.text);
		panel_1.add(txtpnPayment, BorderLayout.NORTH);
		txtpnPayment.setText("PAYMENT");

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.text);
		panel.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel txtpnPaymentMethod = new JLabel();
		txtpnPaymentMethod.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		txtpnPaymentMethod.setBackground(SystemColor.menu);
		panel_2.add(txtpnPaymentMethod);
		txtpnPaymentMethod.setText("Payment method:");

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.text);
		panel_2.add(panel_3);

		ArrayList<String> way = readfile.readTxtFile6(Path.way);
		panel_3.setLayout(new GridLayout(way.size(), 1, 0, 0));
		ButtonGroup bt = new ButtonGroup();

		for (int i = 0; i < way.size(); i++) {
			JRadioButton rdbtnNewRadioButton = new JRadioButton(way.get(i));
			panel_3.add(rdbtnNewRadioButton);
			panel_3.setBackground(SystemColor.text);
			rdbtnNewRadioButton.setBackground(SystemColor.text);
			rdbtnNewRadioButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
			bt.add(rdbtnNewRadioButton);
			if (i == 0) {
				rdbtnNewRadioButton.setSelected(true);
			}
			rdbtnNewRadioButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}

			});

		}

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.text);
		panel_4.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		contentPane.add(panel_4, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_4.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
				JFrame frame1 = new ShowOrder2Gui();
				frame1.setVisible(true);
			}

		});

		JButton btnNewButton_1 = new JButton("PAY");
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PerDishesGui p1 = new PerDishesGui();
				PerDishes2Gui p2 = new PerDishes2Gui();
				PerDishes3Gui p3 = new PerDishes3Gui();
				PerDishes4Gui p4 = new PerDishes4Gui();
				DiningOptionsGui p5 = new DiningOptionsGui();


				order.setNori(p2.noriSelect1);
				order.setEgg(p2.boiledeggSelect1);
				order.setChashu(p2.chashuSelect1);
				order.setAdd_on_chashu(p4.addChashu);
				order.setAdd_on_egg(p4.addEgg);
				order.setAdd_on_nori(p4.addNori);
				order.setAdd_on_shoots(p4.addShoots);
				order.setWay(p5.way);
				try {
					InputStreamReader read = new InputStreamReader(new FileInputStream("data/" + id + ".txt"));
					BufferedReader bufferedReader = new BufferedReader(read);
					String str = bufferedReader.readLine();
					if (Integer.parseInt(str) < 10) {

						dispose();
						AddStamps ad = new AddStamps();
						ad.Add(id);
						 SendEmail s=new SendEmail();
				         s.sendEmail2(CashierGui.useremail);
					}
				} catch (IOException e1) {
					System.out.println("File not found");
				}
				makeorder.printOrderTicket();
				makeorder.printOrder();

			}
		});

		panel_4.add(btnNewButton_1);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
				JFrame frame1 = new GuiSuccess();
				frame1.setVisible(true);
			}

		});
	}

}
