package boundaryClass;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

import entityClass.Path;

/**
 * @title:OrderViewerGui.java
 * @author group63
 * @version V4.3
 * @description:Order showing page for manager.
 */
public class OrderViewerGui extends JFrame {
	//String subdishpath = "data/subdishes.txt";
	private JPanel contentPane;
	private JTable table;
	String[] colName = setColumnName(Path.subdishes);
	static String[][] tableValues;

	public OrderViewerGui() {
		setTitle("Toronto Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 989, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel txtrOrderManagement = new JLabel();
		txtrOrderManagement.setBackground(SystemColor.menu);
		txtrOrderManagement.setText("Order Management");
		txtrOrderManagement.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel.add(txtrOrderManagement);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		table = new JTable(tableValues, colName);
		table.setRowHeight(20);
		table.getTableHeader().setReorderingAllowed(false);
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

	/**
	 * @title: readTxtFile
	 * @description: Reads the tableValues of the table from the file
	 * @param filePath the filePath
	 */
	public static void readTxtFile(String filePath) {
		try {
			String encoding = "GBK";

			ArrayList<String[]> arrayList1 = new ArrayList();
			//System.out.println("testfile");
			File file = new File(filePath);
			if (file.isFile() && file.exists()) {
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				int colnum = 0;
				int j = 0;
				while ((lineTxt = bufferedReader.readLine()) != null) {

					String[] str = lineTxt.split(" ");
					arrayList1.add(str);
					colnum = str.length;
					j++;
				}

				int size = arrayList1.size();

				tableValues = (String[][]) arrayList1.toArray(new String[size][colnum]);

				read.close();
			} else {

				System.out.println("Cannot find the file");
			}
		} catch (Exception e) {
			System.out.println("ReadFile Error");
			e.printStackTrace();
		}

	}

	/**
	 * @title: setColumnName
	 * @description: Reads the header of the table from the file
	 * @param filePath the filePath
	 * @return sparr the value of sparr
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
				sp.add("Date");
				sp.add("OrderId");
				sp.add("Dishes");
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
