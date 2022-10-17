package boundaryClass;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.SystemColor;
import java.awt.Font;

/**
 * @title:GuiSuccess.java
 * @author group63
 * @version V4.3
 * @description:Success page for customer
 */
public class GuiSuccess extends JFrame {

	private JPanel contentPane;

	public GuiSuccess() {
		setTitle("Ranmen Restuarant");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 349);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel.add(panel_1, BorderLayout.CENTER);
		
				JLabel txtpnSuccessfully = new JLabel();
				txtpnSuccessfully.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
				panel_1.add(txtpnSuccessfully);
				txtpnSuccessfully.setBackground(SystemColor.menu);
				txtpnSuccessfully.setText("You have successfully paid for your order !");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.text);
		panel.add(panel_3, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Conguratulations!");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_3.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.text);
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setBackground(SystemColor.text);
		ImageIcon img = new ImageIcon("data/ramen5.gif");
		JLabel imageLabel = new JLabel(img);
		imageLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(imageLabel);
	}

}
