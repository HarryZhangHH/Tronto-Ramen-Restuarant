package boundaryClass;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.border.MatteBorder;

import controlClass.LoginValidation;


/**
 * @title:GuiLogin.java
 * @author group63
 * @version V4.3
 * @description:Boundary class:Login page for customer.
 */
public class LoginGui extends JFrame {

	public static JFrame frmLogin;
	private JPanel panLogin;
	private JLabel labLogin1;
	private JLabel labLogin2;
	private JTextField TFLogin;
	private JPasswordField PFLogin;

	private final JSplitPane splitPane = new JSplitPane();
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_1;
	private JPanel panel_6;
	private JPanel panel_7;
	private JLabel lblVipLogin;

	public LoginGui() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Toronto Ramen");
		frmLogin.setBounds(100, 100, 350, 350);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panLogin = new JPanel();
		frmLogin.getContentPane().add(panLogin);
		placeComponents(panLogin);
		panLogin.setLayout(new BorderLayout(0, 0));

		panel = new JPanel();
		panLogin.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.text);
		panel.add(panel_4, BorderLayout.NORTH);

		labLogin1 = new JLabel("VIP ID: ");
		labLogin1.setFont(new Font("Cambria Math", Font.PLAIN, 17));
		panel_4.add(labLogin1);
		labLogin1.setBounds(10, 20, 80, 25);

		TFLogin = new JTextField(20);
		panel_4.add(TFLogin);
		TFLogin.setBounds(100, 20, 165, 25);

		panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.text);
		panel.add(panel_5);

		labLogin2 = new JLabel("Password: ");
		labLogin2.setFont(new Font("Cambria Math", Font.PLAIN, 17));
		panel_5.add(labLogin2);
		labLogin2.setBounds(10, 20, 80, 25);

		PFLogin = new JPasswordField(20);
		panel_5.add(PFLogin);
		PFLogin.setBounds(10, 80, 80, 25);

		panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.text);
		panLogin.add(panel_2, BorderLayout.CENTER);

		panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.text);
		panel_2.add(panel_6);

		btnNewButton_1 = new JButton("REGISTER");
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_6.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				dispose();
				frmLogin.dispose();
				JFrame register = new RegisterGui();
				register.setVisible(true);

			}
		});

		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel_2.add(panel_1);

		btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String msg = new String();
				String id = TFLogin.getText();
				String passWord = PFLogin.getText();
				LoginValidation l1 = new LoginValidation();
				msg = l1.validation(id, passWord);

				JOptionPane.showConfirmDialog(null, msg, "prompt", JOptionPane.WARNING_MESSAGE);

			}

		});

		panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(SystemColor.text);
		panLogin.add(panel_3, BorderLayout.SOUTH);

		btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_3.add(btnNewButton_2);

		panel_7 = new JPanel();
		panel_7.setBackground(SystemColor.text);
		panel_7.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		frmLogin.getContentPane().add(panel_7, BorderLayout.NORTH);

		lblVipLogin = new JLabel("VIP LOGIN");
		lblVipLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		panel_7.add(lblVipLogin);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLogin.dispose();
				JFrame VIP = new GuiVip();
				VIP.setVisible(true);
			}
		});
	}

	private void placeComponents(JPanel panLogin2) {

	}

}
