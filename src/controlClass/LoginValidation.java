package controlClass;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

import boundaryClass.CashierGui;
import boundaryClass.GuiVip;
import boundaryClass.LoginGui;

/**
 * @title:LoginValidation.java
 * @author group63
 * @version V4.3
 * @description:Control class: Validate the user input.
 */
public class LoginValidation {
	/**
	 * @param id customer's
	 * @param password customer's
	 * @return String msg
	 */
	public String validation( String id, String password) {
		String msg = new String();
		//String id = TFLogin.getText();
		@SuppressWarnings("deprecation")
		//String passWord = PFLogin.getText();
		Scanner s;
		try {
			s = new Scanner(new BufferedReader(new FileReader("data/viplist.txt")));
			try {
				while (s.hasNext()) {
					String t = s.next();

					if (t.equals(id)) {

						if (password.equals(s.next())) {
							msg = "login successful";
							GuiVip.flag = 2;
							CashierGui account = new CashierGui(id);
							account.setVisible(true);
							LoginGui.frmLogin.setVisible(false);
						} else {
							msg = "Sorry, your password is wrong";
						}
						break;
					}
					if (!s.hasNext()) {
						msg = "Sorry, the account you input is not exist";
					}
					
				}
			} finally {
				if (s != null) {
					s.close();
				}
			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return msg;
	}
}


