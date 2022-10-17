package boundaryClass;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 * @title:Dining Options
 * @author group63
 * @version V4.3
 * @description:A boundary class to show the order to customer
 */

public class DiningOptionsGui extends JFrame {
	private int diningOptionsHHH;
	private JPanel contentPane;
	static Boolean optionSelect = false;
	// static String eatin;
	static String way;

	// Order order5=new Order();

	/**
	 * Create the frame.
	 */
	public DiningOptionsGui() {
		setTitle("Toronto Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		txtrManagementSystem.setBackground(SystemColor.text);
		txtrManagementSystem.setText("Dining Options");
		panel.add(txtrManagementSystem);

		ButtonGroup bt = new ButtonGroup();
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(SystemColor.text);
		panel_1.add(panel_1_1);
		panel_1_1.setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblSoup = new JLabel("You can choose: ");
		lblSoup.setBackground(SystemColor.text);
		lblSoup.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		panel_1_1.add(lblSoup);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(SystemColor.text);
		panel_1.add(panel_1_2);
		panel_1_2.setLayout(new GridLayout(2, 1, 0, 0));

		JRadioButton radioButton_3 = new JRadioButton("Eat-in");
		radioButton_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		radioButton_3.setBackground(SystemColor.text);
		radioButton_3.setSelected(true);
		radioButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1_2.add(radioButton_3);
		radioButton_3.addActionListener(new ActionListener() {
			// 单击按钮执行的方法
			public void actionPerformed(ActionEvent e) {
				// order5.setWay("Eat_in");
			}

		});

		JRadioButton radioButton_4 = new JRadioButton("Take-away");
		radioButton_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		radioButton_4.setBackground(SystemColor.text);
		radioButton_4.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1_2.add(radioButton_4);

		radioButton_4.addActionListener(new ActionListener() {
			// 单击按钮执行的方法
			public void actionPerformed(ActionEvent e) {
				// order5.setWay("Take_away");
			}

		});
		bt.add(radioButton_4);
		bt.add(radioButton_3);

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
				JFrame frame1 = new PerDishes4Gui();
				frame1.setVisible(true);
			}

		});

		JButton btnSubmit = new JButton("OK");
		btnSubmit.setBackground(SystemColor.activeCaption);
		btnSubmit.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_3.add(btnSubmit);

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (radioButton_4.isSelected() == true) {
					if (radioButton_3.isSelected() == false) {

						optionSelect = true;
						way = "Take_away";

					}
				}
				if (radioButton_4.isSelected() == false) {
					if (radioButton_3.isSelected() == true) {

						optionSelect = true;
						way = "Eat_in";

					}
				}

			
					optionSelect = false;
					dispose();
					
					JFrame frame1 = new GuiVip();
					
					frame1.setVisible(true);
				
			}

		});

	}

	
}
