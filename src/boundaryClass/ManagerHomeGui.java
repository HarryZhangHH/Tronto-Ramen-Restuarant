package boundaryClass;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

/**
 * @title:ManagerHomeGui.java
 * @author group63
 * @version V4.3
 * @description:Manager's home page. Manger can choose operations to do
 */
public class ManagerHomeGui extends JFrame {

	private JPanel contentPane;

	public ManagerHomeGui() {
		setTitle("Totoro Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 442);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_8 = new JPanel();
		panel.add(panel_8, BorderLayout.SOUTH);
		panel_8.setBackground(SystemColor.text);

		JLabel label = new JLabel("  ");
		panel_8.add(label);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_9.setBackground(SystemColor.text);
		panel.add(panel_9, BorderLayout.NORTH);

		JTextArea txtrManagementSystem = new JTextArea();
		panel_9.add(txtrManagementSystem);
		txtrManagementSystem.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtrManagementSystem.setBackground(SystemColor.text);
		txtrManagementSystem.setText("Management System");

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.text);
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(SystemColor.text);
		panel_4.add(panel_10);

		JLabel lblForViewingVip = new JLabel("To view vip list, click here.");
		lblForViewingVip.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblForViewingVip.setBackground(SystemColor.text);
		panel_10.add(lblForViewingVip);

		JButton btnVipManagement = new JButton("VIP management");
		btnVipManagement.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnVipManagement.setBackground(SystemColor.activeCaption);
		panel_4.add(btnVipManagement);

		btnVipManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame frame1 = new ViewVipGui();
				frame1.setVisible(true);
			}

		});

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.text);
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(SystemColor.text);
		panel_5.add(panel_11);

		JLabel lblNewLabel = new JLabel("To view orders in last week, click here.");
		lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		panel_11.add(lblNewLabel);

		JButton btnOrderManagement = new JButton("Order Management");
		btnOrderManagement.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnOrderManagement.setBackground(SystemColor.activeCaption);
		panel_5.add(btnOrderManagement);

		btnOrderManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame frame1 = new OrderViewerGui();
				frame1.setVisible(true);
			}

		});

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.text);
		panel_1.add(panel_6);
		panel_6.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panel_12 = new JPanel();
		panel_12.setBackground(SystemColor.text);
		panel_6.add(panel_12);

		JLabel lblToManageMenu = new JLabel("To manage menu, click here.");
		lblToManageMenu.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		panel_12.add(lblToManageMenu);

		JButton btnMenuManagement = new JButton("Menu Management");
		btnMenuManagement.setBackground(SystemColor.activeCaption);
		btnMenuManagement.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		panel_6.add(btnMenuManagement);

		btnMenuManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame frame1 = new ManageMenuGui();
				frame1.setVisible(true);
			}

		});

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(SystemColor.text);
		panel_1.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_13 = new JPanel();
		panel_13.setBackground(SystemColor.text);
		panel_7.add(panel_13);

		JLabel lblToViewThe = new JLabel("To view the dishes statics last week, click here.");
		lblToViewThe.setBackground(SystemColor.text);
		lblToViewThe.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		panel_13.add(lblToViewThe);

		JButton btnViewStatistics = new JButton("View Statistics");
		btnViewStatistics.setBackground(SystemColor.activeCaption);
		btnViewStatistics.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		panel_7.add(btnViewStatistics);

		btnViewStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame frame1 = new ViewStaticsGui();
				frame1.setVisible(true);
			}

		});

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.text);
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panel_14 = new JPanel();
		panel_14.setBackground(SystemColor.text);
		panel_2.add(panel_14);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(SystemColor.text);
		panel_2.add(panel_3);

		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnBack.setBackground(SystemColor.activeCaption);
		panel_3.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame frame1 = new GuiHome();
				frame1.setVisible(true);
			}

		});

	}

}
