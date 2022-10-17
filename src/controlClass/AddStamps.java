package controlClass;

import java.io.*;


/**
 * @title:AddStamp.java
 * @author group63
 * @version V4.3
 * @description:A control class: add a stamp when a membership pay successful without using stamps
 */
public class AddStamps{
	
	/**
	 * @title: Add
	 * @description: A method to get member's stamp number and then add 1 stamp.
	 * @author: group63
	 * @param id customer's
	 * @return boolean the value
	 * @throws IOException exception
	 */ 
	public boolean Add(String id) throws IOException {
		boolean flag = false;

		try {

			InputStreamReader read = new InputStreamReader(new FileInputStream("data/" + id + ".txt"));
			BufferedReader bufferedReader = new BufferedReader(read);
			String str = bufferedReader.readLine();

			try {
				PrintWriter pw = new PrintWriter("data/" + id + ".txt");

				int a = Integer.parseInt(str);

				pw.write(a + 1 + ""); // if stamps is less than 10, stamps +1
				pw.flush();
				pw.close();

			} catch (IOException e1) {
				System.out.println("Cannot find the "+ id+" stamp.txt");
			}

		} catch (IOException e1) {
			// TODO Auto-generated catch block
            System.out.println("Cannot find the "+ id+" stamp.txt");
		}
        
		return flag;

	}

	
	
}
