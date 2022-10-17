package boundaryClass;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.MatteBorder;

import controlClass.ClearStamps;
import controlClass.MakeOrder;
import entityClass.Path;

import java.awt.Color;
import java.awt.SystemColor;

/**
 * @title:ShowOrder2Gui.java
 * @author group63
 * @version V4.3
 * @description:Order showing page for manager
 */
public class ShowOrder2Gui extends JFrame {
	//String subdishpath = "data/subdishes.txt";
	private JPanel contentPane;
	private JTable table;
	String[] colName = setColumnName(Path.subdishes);
	static int tsize = GuiVip.copy.size();
	static String[][] tableValues = new String[1][tsize];

	public ShowOrder2Gui() {
		setTitle("Toronto Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 612);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.text);
		panel_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_1.add(panel_3, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Confirm Your Order");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel_3.add(lblNewLabel);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.text);
		panel_1.add(panel_4, BorderLayout.CENTER);

		JLabel lblNewLabel_2 = new JLabel("Dish: Ramen");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		panel_4.add(lblNewLabel_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.text);
		panel.add(panel_2, BorderLayout.CENTER);

		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);

		table = new JTable(tableValues, colName);
		table.setRowHeight(20);

		table.getTableHeader().setReorderingAllowed(false);
		scrollPane.setViewportView(table);
		panel_2.add(scrollPane, BorderLayout.CENTER);

		for (int i = 0; i < GuiVip.copy.size(); i++) {
			tableValues[0][i] = GuiVip.copy.get(i);

		}

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_5.setBackground(SystemColor.text);
		panel.add(panel_5, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_5.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuiVip.flag = 1;
				dispose();
				JFrame frame1 = new GuiVip();
				frame1.setVisible(true);
			}

		});

		JButton btnNewButton_1 = new JButton("CONFIRM");
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_5.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
				JFrame frame1 = new PaymentGui();
				frame1.setVisible(true);
			}

		});
	}

	public ShowOrder2Gui(String id) {
		setTitle("Toronto Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 612);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.text);
		panel_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_1.add(panel_3, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Confirm Your Order");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel_3.add(lblNewLabel);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.text);
		panel_1.add(panel_4, BorderLayout.CENTER);

		JLabel lblNewLabel_2 = new JLabel("Dish: Ramen");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		panel_4.add(lblNewLabel_2);

		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6, BorderLayout.SOUTH);
		panel_6.setBackground(SystemColor.text);
		ImageIcon img = new ImageIcon("data/ramen4.gif");
		JLabel imageLabel = new JLabel(img);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(imageLabel);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.text);
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new FlowLayout());

		try {
			InputStreamReader read = new InputStreamReader(new FileInputStream("data/" + id + ".txt"));
			BufferedReader bufferedReader = new BufferedReader(read);
			String str = bufferedReader.readLine();
			if (Integer.parseInt(str) < 10) {
				for (int i = 0; i < GuiVip.copy.size(); i++) {
					JLabel lblNewLabel_1 = new JLabel(GuiVip.copy.get(i));

					panel_2.add(lblNewLabel_1);
					lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
					panel_2.setBackground(SystemColor.text);
				}

			} else {
				for (int i = 0; i < GuiVip.copy.size() - 1; i++) {
					JLabel lblNewLabel_1 = new JLabel(GuiVip.copy.get(i));
					lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
					panel_2.add(lblNewLabel_1);
				}
				GuiVip.copy.set(GuiVip.copy.size() - 1, "0");
				JLabel lblprice0 = new JLabel(GuiVip.copy.get(GuiVip.copy.size() - 1));

				panel_2.add(lblprice0);
				lblprice0.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		JPanel panel_5 = new JPanel();
		panel.add(panel_5, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_5.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuiVip.flag = 1;
				dispose();
				JFrame frame1 = new GuiVip();
				frame1.setVisible(true);
			}

		});
		panel_5.setBackground(SystemColor.text);
		JButton btnNewButton_1 = new JButton("CONFIRM");
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_5.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					InputStreamReader read = new InputStreamReader(new FileInputStream("data/" + id + ".txt"));
					BufferedReader bufferedReader = new BufferedReader(read);
					String str = bufferedReader.readLine();
					if (Integer.parseInt(str) < 10) {

						dispose();
						JFrame frame1 = new PaymentGui(id);
						frame1.setVisible(true);
					}

					else {
						dispose();
						MakeOrder order = new MakeOrder();
						JFrame frame1 = new GuiSuccess();

						order.printOrderTicket();
						order.printOrder();
						frame1.setVisible(true);
						ClearStamps cs = new ClearStamps();
						try {
							cs.Clear(id);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}

		});

	}

	/**
	 *@title: setColumnName 
	 *@description: Reads the header of the table from the file
	 *@param filePath the filePath
	 *@return sparr the value of sparr
	 */ 
	public static String[] setColumnName(String filePath) {
		ArrayList<String> sp = new ArrayList<String>();
		String[] sparr = { "" };
		try {
			String encoding = "GBK";

			File file = new File(filePath);

			if (file.isFile() && file.exists()) {
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				int i = 0;
				while ((lineTxt = bufferedReader.readLine()) != null) {

					String[] str = lineTxt.split(" ");
					sp.add(str[1]);

					i++;

				}

				sp.add("Way");
				sp.add("Price");
				read.close();
				int size = sp.size();
				sparr = (String[]) sp.toArray(new String[size]);
			} else {

				System.out.println("Cannot find the file");
			}
		} catch (Exception e) {
			System.out.println("ReadFile Error");
			e.printStackTrace();
		}
		return sparr;

	}

}
