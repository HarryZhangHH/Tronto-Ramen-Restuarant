package boundaryClass;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import controlClass.SendEmail;
import entityClass.Order;
import entityClass.Path;

import java.awt.event.*;
import java.io.*;
import java.util.*;

/**
 * @title:CashierGui 
 * @author group63
 * @version V4.3
 * @description:A boundary class to show the order to customer
 */
public class CashierGui extends JFrame {
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
	static String useremail;

	Order order = new Order();
	private JPanel contentPane;

	/**
	 * Create the frame.
	 * @param id customer's
	 */
	public CashierGui(String id) {
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
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(6, 0, 0, 0));
		Scanner s;
		Scanner ss;

		try {
			s = new Scanner(new BufferedReader(new FileReader(Path.vipList)));
			while (s.hasNext()) {
				String t = s.next();
				if (t.equals(id)) {
					String password = s.next();
					String firstname = s.next();
					String surname = s.next();
					String phoneNo = s.next();
					String email = s.next(); 
					useremail=email;

					JLabel txtpnId = new JLabel();
					txtpnId.setFont(new Font("Cambria Math", Font.PLAIN, 15));
					txtpnId.setText("ID:" + id);
					panel_1.add(txtpnId);

					JLabel txtpnFirstName = new JLabel();
					txtpnFirstName.setText("First Name:" + firstname);
					txtpnFirstName.setFont(new Font("Cambria Math", Font.PLAIN, 15));
					panel_1.add(txtpnFirstName);

					JLabel txtpnSurname = new JLabel();
					txtpnSurname.setFont(new Font("Cambria Math", Font.PLAIN, 15));
					txtpnSurname.setText("Surname:" + surname);
					panel_1.add(txtpnSurname);

					JLabel txtpnEmail = new JLabel();
					txtpnEmail.setText("E-mail:" + email);
					txtpnEmail.setFont(new Font("Cambria Math", Font.PLAIN, 15));
					panel_1.add(txtpnEmail);

					JLabel txtpnPhoneNo = new JLabel();
					txtpnPhoneNo.setText("Phone No:" + phoneNo);
					txtpnPhoneNo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
					panel_1.add(txtpnPhoneNo);
				}
			}
			s.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ss = new Scanner(new BufferedReader(new FileReader("data/" + id + ".txt")));
			while (ss.hasNext()) {
				String t = ss.next();

				JLabel txtpnStamps = new JLabel();
				txtpnStamps.setFont(new Font("Cambria Math", Font.PLAIN, 15));
				txtpnStamps.setText("Stamps:" + t);
				panel_1.add(txtpnStamps);

			}
			ss.close();

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.text);
		panel.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_4.setBackground(SystemColor.text);
		panel_2.add(panel_4, BorderLayout.SOUTH);

		JButton btnNewButton_1 = new JButton("PAY NOW");
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View stats every week");
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		panel_4.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("fuehfuew");
				SendEmail email=new SendEmail();
				email.sendEmail(useremail);
			}
		});
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.text);
		panel_2.add(panel_5);

		JLabel txtpnWhenYouGet = new JLabel();
		txtpnWhenYouGet.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		txtpnWhenYouGet.setBackground(SystemColor.menu);
		txtpnWhenYouGet.setText("When you get 10 stamps, your order will be free automatically.");
		panel_5.add(txtpnWhenYouGet);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {

				PerDishesGui p1 = new PerDishesGui();
				PerDishes2Gui p2 = new PerDishes2Gui();
				PerDishes3Gui p3 = new PerDishes3Gui();
				PerDishes4Gui p4 = new PerDishes4Gui();
				DiningOptionsGui p5 = new DiningOptionsGui();

				try {
					price =String.valueOf(order.Order(id));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			   dispose();
			
			   JFrame frame1;
			   frame1 = new ShowOrder2Gui(id);
			   frame1.setVisible(true);	
			}
			
			
		});

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(SystemColor.text);
		panel.add(panel_3, BorderLayout.NORTH);

		JLabel txtpnVipInformation = new JLabel();
		txtpnVipInformation.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtpnVipInformation.setBackground(SystemColor.menu);
		txtpnVipInformation.setText("Vip Information");
		panel_3.add(txtpnVipInformation);
	}

}
