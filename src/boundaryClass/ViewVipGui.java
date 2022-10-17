package boundaryClass;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.event.*;
import java.io.*;
import java.util.*;

/**
 * @title:ViewVipGui.java
 * @author group63
 * @version V4.3
 * @description:Vip information viewing page for manager
 */
public class ViewVipGui extends JFrame {

	private JPanel contentPane;
	private JTable table;

	final String[] columnNames = { "VIPNo", "Password", "FirstName", "SurName", "Email", "Phone" };
	static String[][] tableValues;

	public ViewVipGui() {
		setTitle("Ramen Restaurant");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 989, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		JTextArea txtrOrderManagement = new JTextArea();
		txtrOrderManagement.setBackground(SystemColor.menu);
		txtrOrderManagement.setText("Vip Managemet");
		txtrOrderManagement.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel.add(txtrOrderManagement);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		table = new JTable(tableValues, columnNames);
		scrollPane.setViewportView(table);
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JButton btnBack = new JButton("BACK");
		panel_1.add(btnBack);
		btnBack.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnBack.setBackground(SystemColor.activeCaption);

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame frame1 = new ManagerHomeGui();
				frame1.setVisible(true);
			}

		});

	}

	public static void readTxtFile(String filePath) {
		try {
			String encoding = "GBK";

			ArrayList<String[]> arrayList1 = new ArrayList();

			File file = new File(filePath);
			if (file.isFile() && file.exists()) {
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {

					String[] str = lineTxt.split(" ");
					arrayList1.add(str);
				}

				int size = arrayList1.size();

				tableValues = (String[][]) arrayList1.toArray(new String[size][6]);

				read.close();
			} else {

				System.out.println("Cannot find the file");
			}
		} catch (Exception e) {
			System.out.println("ReadFile Error");
			e.printStackTrace();
		}

	}

}
