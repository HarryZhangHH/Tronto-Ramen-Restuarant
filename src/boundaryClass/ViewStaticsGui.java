package boundaryClass;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.*;

import controlClass.Calculate;
import controlClass.ReadFile;
import controlClass.StaticOrder;
import controlClass.StaticReport;
import entityClass.Path;


/**
 * @title:ViewStaticsGui.java
 * @author group63
 * @version V4.3
 * @description: Statics viewing page for manager
 */
public class ViewStaticsGui extends JFrame {

	private JPanel contentPane;
	final String[] columnNames = { "Date", "OrderID" };
	String[][] tableValues = { { "2020-03-18", "20200" }, { "2020-03-18", "2020" } };
	//String subdishpath = "data/subdishes.txt";
	//String orderPath = "data/order.txt";
	ReadFile readfile = new ReadFile();
	ArrayList<ArrayList<String>> p1table = readfile.readTxtFile1(Path.subdishes);
	ArrayList<String> p2table = readfile.readTxtFile2(Path.subdishes);
	int p3table = Integer.parseInt(readfile.readTxtFile3(Path.subdishes));
	ArrayList<String> p4table = readfile.readTxtFile5(Path.subdishes);
	ArrayList<String> temp = new ArrayList<String>();
	StaticReport report=new StaticReport();
	String[][] p1tableValues = { { "1", "2", "3" } };
	String[] p1colNames = null;
	String[][] p2tableValues = { { "1", "2", "3" } };
	String[] p2colNames = null;
	String[][] p4tableValues = { { "1", "2", "3", "4" } };
	String[] p4colNames = null;
	String title1=null;
	public ViewStaticsGui() {
		setBackground(SystemColor.text);

		setTitle("Toronto Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1462, 780);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(SystemColor.text);
		panel.add(panel_2, BorderLayout.CENTER);

		JLabel lblViewStatics = new JLabel("View Statics");
		lblViewStatics.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel_2.add(lblViewStatics);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(4, 1, 0, 0));

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.text);
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(1, p1table.size(), 0, 0));

		
		
		for (int a = 0; a < p1table.size(); a++) {
			JPanel panel_8 = new JPanel();
			panel_8.setBackground(SystemColor.text);
			panel_4.add(panel_8);
			panel_8.setLayout(new BorderLayout());

			JPanel panel_11 = new JPanel();
			panel_8.add(panel_11, BorderLayout.NORTH);

			JLabel lblSoup = new JLabel(p1table.get(a).get(0));
			title1=p1table.get(a).get(0);
			panel_11.add(lblSoup);
			lblSoup.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
			panel_11.setBackground(SystemColor.text);

			JPanel panel_12 = new JPanel();
			panel_8.add(panel_12, BorderLayout.CENTER);

			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBackground(SystemColor.text);
			panel_12.add(scrollPane, BorderLayout.CENTER);
			panel.setBackground(SystemColor.text);
			
			int size1 = ((ArrayList) p1table.get(a)).size();
			panel_12.setBackground(SystemColor.text);
			temp = p1table.get(a);
			temp.remove(0);

			p1colNames = (String[]) temp.toArray(new String[temp.size()]);

			JTable table = new JTable(p1tableValues, p1colNames);
			table.setFont(new Font("Cambria Math", Font.PLAIN, 15));
			table.getTableHeader().setReorderingAllowed(false);
			scrollPane.setViewportView(table);
			table.setBackground(SystemColor.text);
			for (int c = 0; c < temp.size(); c++) {
				p1tableValues[0][c] = StaticOrder.calculateOrder(temp.get(c), Path.orderPath) + "";
			}
			//System.out.print(p1table.get(a).get(0));
			
		}

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.text);
		panel_1.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		JPanel panel_18 = new JPanel();
		panel_18.setBackground(SystemColor.text);
		panel_5.add(panel_18, BorderLayout.NORTH);
		panel_18.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblIngredient = new JLabel("Ingredient");
		panel_18.add(lblIngredient);
		lblIngredient.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		panel_18.setBackground(SystemColor.text);

		JPanel panel_19 = new JPanel();
		panel_19.setBackground(SystemColor.text);
		panel_5.add(panel_19);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBackground(SystemColor.text);
		panel_19.add(scrollPane_4);
		panel_19.setBackground(SystemColor.text);
		

		p2colNames = (String[]) p2table.toArray(new String[p2table.size()]);
		for (int c = 0; c < p2table.size(); c++) {
			p2tableValues[0][c] =StaticOrder.calculateOrder(3 + p1table.size() + c, Path.orderPath) + "";
		}
		JTable ingredient = new JTable(p2tableValues, p2colNames);
		ingredient.setBackground(SystemColor.text);
		ingredient.getTableHeader().setReorderingAllowed(false);
		scrollPane_4.setViewportView(ingredient);
		ingredient.setFont(new Font("Cambria Math", Font.PLAIN, 15));

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.text);
		panel_1.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));

		JPanel panel_14 = new JPanel();
		panel_14.setBackground(SystemColor.text);
		panel_6.add(panel_14, BorderLayout.NORTH);
		panel_6.setBackground(SystemColor.text);

		JLabel lblNewLabel_5 = new JLabel("Spiciness");
		panel_14.add(lblNewLabel_5);
		lblNewLabel_5.setBackground(SystemColor.text);
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));

		JPanel panel_15 = new JPanel();
		panel_15.setBackground(SystemColor.text);
		panel_6.add(panel_15);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setToolTipText("");
		panel_15.add(scrollPane_2, BorderLayout.CENTER);

		String[][] p3tableValues = { { "1", "2", "3", "4", "6", "5" } };
		String[] p3colNames = { "0", "1", "2", "3", "4", "5" };

		for (int d = 0; d < p3table + 1; d++) {
			
			p3colNames[d] = d + "";
			p3tableValues[0][d] = StaticOrder.calculateOrder(3 + p1table.size() + p2table.size(), p3colNames[d],
					Path.orderPath) + "";
			
		}

		Calculate f=new Calculate();

		JTable spicinesstable = new JTable(p3tableValues, p3colNames);
		spicinesstable.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		spicinesstable.getTableHeader().setReorderingAllowed(false);
		scrollPane_2.setViewportView(spicinesstable);
		scrollPane_2.setBackground(SystemColor.text);
		spicinesstable.setBackground(SystemColor.text);
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(SystemColor.text);
		panel_1.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		JPanel panel_16 = new JPanel();
		panel_16.setBackground(SystemColor.text);
		panel_7.add(panel_16, BorderLayout.NORTH);

		JLabel lblAddon = new JLabel("Add-on");
		panel_16.add(lblAddon);
		lblAddon.setBackground(SystemColor.text);
		lblAddon.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));

		JPanel panel_17 = new JPanel();
		panel_17.setBackground(SystemColor.text);
		panel_7.add(panel_17);

		JScrollPane scrollPane_3 = new JScrollPane();
		panel_17.add(scrollPane_3);
		scrollPane_3.setBackground(SystemColor.text);
		

		p4colNames = (String[]) p4table.toArray(new String[p4table.size()]);
		for (int c = 0; c < p4table.size(); c++) {
			p4tableValues[0][c] = StaticOrder.calculateOrder(3 + p1table.size() + p2table.size() + 1 + c,
					Path.orderPath) + "";
		}
		
		
		
		
		
		JTable addontable = new JTable(p4tableValues, p4colNames);
		addontable.getTableHeader().setReorderingAllowed(false);
		addontable.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		scrollPane_3.setViewportView(addontable);
		addontable.setBackground(SystemColor.text);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(SystemColor.text);
		contentPane.add(panel_3, BorderLayout.SOUTH);
		
		JButton repButton = new JButton("Generate Report");
		repButton.setBackground(SystemColor.activeCaption);
		repButton.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_3.add(repButton);
		repButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuiVip.flag = 1;
				dispose();
				JFrame frame1 = new ManagerHomeGui();
				frame1.setVisible(true);
				JOptionPane.showMessageDialog(null, "The report has been generated, please check  staticReport.txt in data folder", "prompt", JOptionPane.WARNING_MESSAGE);
				report.staticReport(1,title1,p1colNames, p1tableValues);
				report.staticReport(2,"ingredient",p2colNames, p2tableValues);
				report.staticReport(3,"spiciness",p3colNames, p3tableValues);
				report.staticReport(4,"Add-on",p4colNames, p4tableValues);
			}

		});


		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		panel_3.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuiVip.flag = 1;
				dispose();
				JFrame frame1 = new ManagerHomeGui();
				frame1.setVisible(true);
			}

		});

	}

}
