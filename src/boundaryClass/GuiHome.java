package boundaryClass;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import controlClass.Refresh;

import java.awt.Window.Type;



public class GuiHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * @param args main function
	 */
	public static void main(String[] args) {
		
	      
		  String filePath2 = "./data/viplist.txt";
			// String filePath1=""
		 
		  OrderViewerGui test1 = new OrderViewerGui();
			String filePath = "./data/order.txt";
			// String filePath1=""
			//Refresh.refreshMethod();
			new Refresh();

		test1.readTxtFile(filePath);
		  ViewVipGui test2 = new ViewVipGui();
		  test2.readTxtFile(filePath2);
	    
	     


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiHome frame = new GuiHome();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	    
	}

	/**
	 * Create the frame.
	 */
	public GuiHome() {
		setTitle("Totoro Ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 333);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel.setBackground(SystemColor.text);
		panel.setForeground(Color.BLACK);
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel txtrManagementSystem = new JLabel();
		txtrManagementSystem.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		txtrManagementSystem.setBackground(SystemColor.menu);
		txtrManagementSystem.setText("Home");
		panel.add(txtrManagementSystem);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.text);
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(SystemColor.text);
		panel_2.add(panel_8, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("       ");
		panel_8.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.text);
		panel_2.add(panel_3, BorderLayout.SOUTH);
		
				JButton btnVipManagement = new JButton("Self-service Kiosk");
				btnVipManagement.setBackground(SystemColor.activeCaption);
			//	btnVipManagement.setBorder(BorderFactory.createRaisedBevelBorder());
				btnVipManagement.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
				panel_3.add(btnVipManagement);
				
				JPanel panel_6 = new JPanel();
				panel_6.setBackground(SystemColor.text);
				panel_2.add(panel_6, BorderLayout.CENTER);
				
				JLabel lblIfYouAre = new JLabel("If you are going to order your dishes, please click here.");
				panel_6.add(lblIfYouAre);
				lblIfYouAre.setHorizontalAlignment(SwingConstants.CENTER);
				lblIfYouAre.setFont(new Font("Cambria Math", Font.PLAIN, 15));
				
						btnVipManagement.addActionListener(new ActionListener() {
							
							public void actionPerformed(ActionEvent e) {
								dispose();
								
								JFrame frame1 = new SelectDishesGui();
								
								frame1.setVisible(true);
							}
				
						});
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.text);
		panel_1.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.text);
		panel_5.add(panel_4, BorderLayout.SOUTH);
		
				JButton btnOrderManagement = new JButton("Management System");
				btnOrderManagement.setBackground(SystemColor.activeCaption);
				btnOrderManagement.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
				panel_4.add(btnOrderManagement);
				
				JPanel panel_7 = new JPanel();
				panel_7.setBackground(SystemColor.text);
				panel_5.add(panel_7, BorderLayout.CENTER);
				
				JLabel lblNewLabel = new JLabel("If you are restuarant manager, please click here.");
				panel_7.add(lblNewLabel);
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 15));
				
				JPanel panel_9 = new JPanel();
				panel_9.setBackground(SystemColor.text);
				panel_5.add(panel_9, BorderLayout.NORTH);
				
				JLabel lblNewLabel_2 = new JLabel("    ");
				panel_9.add(lblNewLabel_2);
				
				JPanel panel_10 = new JPanel();
				panel_10.setBackground(SystemColor.text);
				contentPane.add(panel_10, BorderLayout.SOUTH);
				
				JLabel label = new JLabel("   ");
				panel_10.add(label);

		btnOrderManagement.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				JFrame frame1 = new ManagerHomeGui();
				
				frame1.setVisible(true);
			}

		});
		
	}

}
