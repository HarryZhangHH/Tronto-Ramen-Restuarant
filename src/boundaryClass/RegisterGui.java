package boundaryClass;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import javax.swing.border.*;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import net.miginfocom.swing.MigLayout;

import controlClass.CreatStamp;
import controlClass.RegisterValidation;
import controlClass.SendEmail;
import entityClass.Membership;


/**
 * @title:RegisterGui.java
 * @author group63
 * @version V4.3
 * @description:Register page for customer
 */
public class RegisterGui extends JFrame {

	private JPanel panLogin;
	private JLabel labLogin1;
	private JLabel labLogin2;
	private JLabel labLogin3;
	private JLabel labLogin4;
	private JLabel labLogin5;
	private JLabel labLogin6;
	private JTextField TFLogin1;
	private JTextField TFLogin2;
	private JTextField TFLogin3;
	private JTextField TFLogin4;
	private JPasswordField password;
	private JPasswordField configPassword;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JLabel lblNewLabel;
	static String idtemp;
	static String fileName = "data/viplist.txt";
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JPanel panel_14;
	private JPanel panel_15;
	private JPanel panel_16;
	private JPanel panel_17;
	private JPanel panel_18;
	private JPanel panel_19;
	private JPanel panel_20;
	private JPanel panel_21;
	private JPanel panel_22;
	private JLabel lblForPhoneNo;

	/**
	 * @title: GuiRegister @ description:constructor
	 */
	public RegisterGui() {
		initialize();
	}

	private void initialize() {

		setBounds(100, 100, 586, 398);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Toronto Ramen");
		panLogin = new JPanel();
		panLogin.setBackground(SystemColor.text);
		getContentPane().add(panLogin);
		// placeComponents(panLogin);
		panLogin.setLayout(new BorderLayout(0, 0));

		panel = new JPanel();
		panLogin.add(panel);
		panel.setLayout(new GridLayout(6, 2, 0, 0));

		panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.text);
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));

		panel_9 = new JPanel();
		panel_9.setBackground(SystemColor.text);
		panel_6.add(panel_9);

		labLogin1 = new JLabel("Firstname: ");
		labLogin1.setBackground(SystemColor.text);
		panel_9.add(labLogin1);
		labLogin1.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		labLogin1.setBounds(10, 20, 80, 25);

		panel_10 = new JPanel();
		panel_10.setBackground(SystemColor.text);
		panel_6.add(panel_10);

		TFLogin1 = new JTextField(20);
		panel_10.add(TFLogin1);
		TFLogin1.setBounds(100, 20, 165, 25);

		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		panel_11 = new JPanel();
		panel_11.setBackground(SystemColor.text);
		panel_1.add(panel_11);

		labLogin2 = new JLabel("Surname: ");
		panel_11.add(labLogin2);
		labLogin2.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		labLogin2.setBounds(10, 20, 80, 25);

		panel_12 = new JPanel();
		panel_12.setBackground(SystemColor.text);
		panel_1.add(panel_12);

		TFLogin2 = new JTextField(20);
		panel_12.add(TFLogin2);
		TFLogin2.setBounds(100, 20, 165, 25);

		panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.text);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));

		panel_13 = new JPanel();
		panel_13.setBackground(SystemColor.text);
		panel_2.add(panel_13);

		labLogin3 = new JLabel("E-mail: ");
		panel_13.add(labLogin3);
		labLogin3.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		labLogin3.setBounds(10, 20, 80, 25);

		panel_14 = new JPanel();
		panel_14.setBackground(SystemColor.text);
		panel_2.add(panel_14);

		TFLogin3 = new JTextField(20);
		panel_14.add(TFLogin3);
		TFLogin3.setBounds(100, 20, 165, 25);

		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.text);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));

		panel_15 = new JPanel();
		panel_15.setBackground(SystemColor.text);
		panel_3.add(panel_15);

		labLogin4 = new JLabel("Phone No.: ");
		panel_15.add(labLogin4);
		labLogin4.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		labLogin4.setBounds(10, 20, 80, 25);

		panel_16 = new JPanel();
		panel_16.setBackground(SystemColor.text);
		panel_3.add(panel_16);

		TFLogin4 = new JTextField(20);
		panel_16.add(TFLogin4);
		TFLogin4.setBounds(100, 20, 165, 25);

		panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.text);
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));

		panel_17 = new JPanel();
		panel_17.setBackground(SystemColor.text);
		panel_4.add(panel_17);

		labLogin5 = new JLabel("Password(contain least at one letter): ");
		labLogin5.setBackground(SystemColor.text);
		panel_17.add(labLogin5);
		labLogin5.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		labLogin5.setBounds(10, 20, 80, 25);

		panel_18 = new JPanel();
		panel_18.setBackground(SystemColor.text);
		panel_4.add(panel_18);

		password = new JPasswordField(20);
		panel_18.add(password);
		password.setBounds(10, 80, 80, 25);

		panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.text);
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));

		panel_19 = new JPanel();
		panel_19.setBackground(SystemColor.text);
		panel_5.add(panel_19);

		labLogin6 = new JLabel("Confirm Password: ");
		panel_19.add(labLogin6);
		labLogin6.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		labLogin6.setBounds(10, 20, 80, 25);

		panel_20 = new JPanel();
		panel_20.setBackground(SystemColor.text);
		panel_5.add(panel_20);

		configPassword = new JPasswordField(20);
		panel_20.add(configPassword);
		configPassword.setBounds(10, 80, 80, 25);

		panel_7 = new JPanel();
		panel_7.setBackground(SystemColor.text);
		panLogin.add(panel_7, BorderLayout.SOUTH);
		panel_7.setLayout(new BorderLayout(0, 0));

		panel_21 = new JPanel();
		panel_21.setBackground(SystemColor.text);
		panel_7.add(panel_21, BorderLayout.NORTH);

		lblForPhoneNo = new JLabel("* At least one between email and mobile number need to be filled in. ");
		lblForPhoneNo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_21.add(lblForPhoneNo);

		panel_22 = new JPanel();
		panel_22.setBackground(SystemColor.text);
		panel_22.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_7.add(panel_22, BorderLayout.CENTER);

		btnNewButton = new JButton("BACK");
		panel_22.add(btnNewButton);
		btnNewButton.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnNewButton.setBackground(SystemColor.activeCaption);

		btnNewButton_1 = new JButton("REGISTER");
		panel_22.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstname = TFLogin1.getText();
				String surname = TFLogin2.getText();
				String email = TFLogin3.getText();
				String phoneNo = TFLogin4.getText();
				String Password = password.getText();
				String conPassword=configPassword.getText();
     			RegisterValidation regv=new RegisterValidation();
				Boolean validresult=regv.validation(firstname, surname, email, phoneNo, Password, conPassword);
				//System.out.println( firstname+Password);

				if (email.length() < 1) {
				email = "null";
			}
			if (phoneNo.length() < 1) {
				phoneNo = "null";
			}
               
				if(validresult==true){
				boolean isFindAccount = testCustomer(phoneNo);
				if (!isFindAccount) {
					Membership[] cus = new Membership[100];
					int cusL = 0;
					try {
						Scanner sc = new Scanner(new BufferedReader(new FileReader(fileName)));
						Date dNow = new Date();
						SimpleDateFormat ft = new SimpleDateFormat("HHmmss");
						String id = ft.format(dNow) + (int) ((Math.random() * 9 + 1) * 10);
						idtemp = id;
						cus[cusL++] = new Membership(id + "", Password, firstname, surname, phoneNo, email);
						JOptionPane.showMessageDialog(null, "You account id is " + id, "Information",
								JOptionPane.INFORMATION_MESSAGE);
						sc.close();
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
				}

					BufferedWriter output;
					try {
						output = new BufferedWriter(new FileWriter(fileName, true));

						for (int i = 0; i < cusL; i++) {
							Membership t = cus[i];
							output.write(t.getId() + " ");
							output.write(password.getText() + " ");
							output.write(t.getFirstname() + " ");
							output.write(t.getSurname() + " ");
							output.write(t.getPhoneNo() + " ");
							output.write(t.getEmail() + "\n");
							CreatStamp cs = new CreatStamp(t.getId());
						}
						SendEmail s=new SendEmail();
						s.sendEmail3(email);
						
						output.flush();
						output.close();
					} catch (IOException e2) {
						e2.printStackTrace();
					}

				}
			    CashierGui lo = new CashierGui(idtemp);
				lo.setVisible(true);
				setVisible(false);
			}
			
			}
			

		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame VIP = new GuiVip();
				VIP.setVisible(true);
			}

		});

		panel_8 = new JPanel();
		panel_8.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_8.setBackground(SystemColor.text);
		panLogin.add(panel_8, BorderLayout.NORTH);

		lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel_8.add(lblNewLabel);

	}

	/**
	 * @title: testCustomer
	 * @description: Verify that the user's phone is registered.
	 * @author: group63
	 * @param phoneNo
	 * @return isFind
	 */
	boolean testCustomer(String phoneNo) {
		boolean isFind = false;
		try {
			Scanner s = new Scanner(new BufferedReader(new FileReader(fileName)));
			int li = 0;
			int i = 0;

			while (s.hasNext()) {
				String t = s.next();
				if (i >= 6) {

					if (li == 4 && t == phoneNo) {
						isFind = true;

					}

				}
				li++;
				li %= 6;
				i++;
			}
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return isFind;
	}

}
