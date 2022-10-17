package controlClass;
/**
 * @title:RegisterValidation.java
 * @author group63
 * @version V4.3
 * @description:Control class: Validate the user input.
 */
import javax.swing.JOptionPane;

public class RegisterValidation {
    public Boolean validation(String firstname, String surname, String email, String phoneNo, String password,String conPassword) {
    	String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		boolean matchEmail = email.matches(regEx1);
		String regEx2 = "^[1][0-9]{10}$";
		boolean matchPhone = phoneNo.matches(regEx2);
		String regEx3 = ".*[a-zA-Z]+.*";
		boolean matchPw = password.matches(regEx3);
		String regEx4 = "[A-Za-z]+";
	    boolean matchfirsrtname=firstname.matches(regEx4);
	    boolean matchsurname=surname.matches(regEx4);
		Boolean result=false;
		Boolean passwordvalid=true;
		
		 for(int i=0;i<password.length();i++) {
				if(password.indexOf(" ")!=-1) {
					passwordvalid=false;
					JOptionPane.showConfirmDialog(null, "The password can not contain blank", "prompt",
							JOptionPane.WARNING_MESSAGE);
					break;
				}
				
			}
	
		
		if (firstname.length() < 1 || surname.length() < 1) {
			JOptionPane.showConfirmDialog(null, "Your need to input your name", "prompt",
					JOptionPane.WARNING_MESSAGE);
			
		}else if (email.length() < 1 && phoneNo.length() < 1) {
			JOptionPane.showConfirmDialog(null, "You must fill in your Email or your phone number", "prompt",
					JOptionPane.WARNING_MESSAGE);
			
		} else if (password.length()<1) {
			JOptionPane.showConfirmDialog(null, "Your need to input your password", "prompt",
					JOptionPane.WARNING_MESSAGE);			
		}else if (conPassword.length()<1) {
			JOptionPane.showConfirmDialog(null, "Your need to confirm your password", "prompt",
					JOptionPane.WARNING_MESSAGE);
			
		}else if((!matchfirsrtname)||(!matchsurname)) {
			JOptionPane.showConfirmDialog(null, "The name can only be consist of letters", "prompt",
					JOptionPane.WARNING_MESSAGE);
			
			
		}else if (email.length() >= 1&&(!matchEmail)) {
				JOptionPane.showConfirmDialog(null, "E-mail format are wrong", "prompt",
						JOptionPane.WARNING_MESSAGE);
		} else if (phoneNo.length() >= 1&& (!matchPhone)) {
			 {
				JOptionPane.showConfirmDialog(null, "Phone number are wrong, it should be 11 digit number", "prompt",
						JOptionPane.WARNING_MESSAGE);
			}
			
		} 
		else if(passwordvalid==true) {
			
			if (!matchPw) {
				JOptionPane.showConfirmDialog(null, "Password must have an English letter", "prompt",
						JOptionPane.WARNING_MESSAGE);
				
			} else {
				if (!(password.equals(conPassword))) {
					JOptionPane.showConfirmDialog(null, "Two passwords are different", "prompt",
							JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Success!", "Information",
							JOptionPane.INFORMATION_MESSAGE);
					result= true;
				}
			}

		}

		
		return result;

    }
}
