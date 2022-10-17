package boundaryClass;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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

/**
 * @title:SelectDishesGui.java
 * @author group63
 * @version V4.3
 * @description:Staple food selecting page for customer
 */
public class SelectDishesGui extends JFrame {
	public int selectDishesHHH = 0;

	public int getSelectDishesHHH() {
		return selectDishesHHH;
	}

	public void setSelectDishesHHH(int selectDishesHHH) {
		this.selectDishesHHH = selectDishesHHH;
	}

	private JPanel contentPane;
	static int ramenSelect = 0;

	public SelectDishesGui() {
		setTitle("Totoro Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 434);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.NORTH);
		JLabel txtrManagementSystem = new JLabel();
		txtrManagementSystem.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtrManagementSystem.setBackground(SystemColor.menu);
		txtrManagementSystem.setText("Select Your Adorable Dishes");
		panel.add(txtrManagementSystem);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.CENTER);
		ButtonGroup bt = new ButtonGroup();
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.text);
		panel_1.add(panel_5, BorderLayout.NORTH);
		JRadioButton rdbtnRamen = new JRadioButton("Ramen");
		panel_5.add(rdbtnRamen);
		rdbtnRamen.setSelected(true);
		rdbtnRamen.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		rdbtnRamen.setBackground(SystemColor.text);
		rdbtnRamen.setHorizontalAlignment(SwingConstants.CENTER);
		bt.add(rdbtnRamen);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.text);
		panel_1.add(panel_4);
		ImageIcon img = new ImageIcon("data/ramen2.gif");
		JLabel imageLabel = new JLabel(img);
		panel_4.add(imageLabel);
		rdbtnRamen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramenSelect = 1;
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
		btnBack.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		btnBack.setBackground(SystemColor.activeCaption);
		panel_3.add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramenSelect = 0;
				selectDishesHHH = 0;
				dispose();
				JFrame frame1 = new GuiHome();
				frame1.setVisible(true);
			}

		});

		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		btnSubmit.setBackground(SystemColor.activeCaption);
		panel_3.add(btnSubmit);

		ActionListener listen1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (rdbtnRamen.isSelected()) {
					selectDishesHHH = 1;
					dispose();
					JFrame frame1 = new PerDishesGui();
					frame1.setVisible(true);
				}

			}

		};
		btnSubmit.addActionListener(listen1);

	}

}
