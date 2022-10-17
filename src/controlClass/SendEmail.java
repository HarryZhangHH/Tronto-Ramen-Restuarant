package controlClass;
/**
 * @title:SendEmail.java
 * @author group63
 * @version V4.3
 * @description:Control class: send the email to customer
 */
import javax.swing.JOptionPane;
public class SendEmail implements Email {
        public void sendEmail(String emailAddress) {
        	if(emailAddress==null) {
        		JOptionPane.showMessageDialog(null, "Oops, you didn't have a email address", "prompt", JOptionPane.WARNING_MESSAGE);
        	}
        	else {
            JOptionPane.showMessageDialog(null, "We'll send the weekly report to " +emailAddress, "prompt", JOptionPane.WARNING_MESSAGE);
        	System.out.println("A email called staticReport.txt is sent to "+emailAddress+ " on every Monday.");
        	}
        }
        public void sendEmail2(String emailAddress) {
        	if(emailAddress==null) {
        		JOptionPane.showMessageDialog(null, "Oops, you didn't have a email address ", "prompt", JOptionPane.WARNING_MESSAGE);
        	}
        	else {
            JOptionPane.showMessageDialog(null, "Your ticket number will be sent to" +emailAddress, "prompt", JOptionPane.WARNING_MESSAGE);
        	}
        }
        public void sendEmail3(String emailAddress) {
        	if(emailAddress==null) {
        		JOptionPane.showMessageDialog(null, "Oops, you didn't have a email address", "prompt", JOptionPane.WARNING_MESSAGE);
        	}
        	else {
            JOptionPane.showMessageDialog(null, "Your membership number will be sent to " +emailAddress, "prompt", JOptionPane.WARNING_MESSAGE);
        	System.out.println("Your membership number will be sent to" +emailAddress);
        	}
        }
}
