package controlClass;

import java.io.*;
import java.util.*;



/**
 * @title:Calculate.java
 * @author group63
 * @version V4.3
 * @description:A control class: count the number sold of each item in the order.txt
 */


public class Calculate {
	/**
	 * @param i use to count
	 * @throws IOException throw exception
	 *  @description:The method to count the number
	 */
	public void calOrder(int i) throws IOException {

		int num[][] = new int[10][10];// store the number
		try {
			FileReader fr = new FileReader("data/order.txt");
			BufferedReader br = new BufferedReader(fr);

			String line = "";
			String[] arrs = null;
			this.readLines(i);// get the head of the table
			String[] options = this.readItems(this.readLines(i)); // get the item from order.txt
		
			while ((line = br.readLine()) != null) {// calculate the number
				arrs = line.split(" ");
				for (int a = 0; a < 6; a++) {
					if (arrs[i + 3].equals(options[a + 1]))
						num[i][a]++;
				}

			}
			System.out.print("           ");
			for (int a = 0; a < 6; a++) {
				System.out.print(num[i][a] + "    ");
			} 
			System.out.println();
			br.close();
			fr.close();

		} catch (IOException e) {
			System.out.println("Ticket not found1");
		}

	}

	/**
	 * @param k used to count
	 * @return the lines in menu.txt
	 * @description:The method to read lines from the file
	 * @throws IOException throw exception
	 */
	public String readLines(int k) throws IOException {

		int l1 = 0;
		// String result=null;
		String[] ln = new String[20];
		try {
			FileReader fr = new FileReader("data/menu.txt");
			BufferedReader br = new BufferedReader(fr);

			String line = "";

			while ((line = br.readLine()) != null) {
				ln[l1] = line;
				l1++;

			}
			br.close();
			fr.close();

		} catch (IOException e) {
			System.out.println("Menu not found");
		}
		return ln[k];

	}
	
	/**
	 * @param ln use to split
	 * @return array use to store number
	 * @description:The method to split the lines by blanks
	 * 
	 */
	public String[] readItems(String ln) {
		String[] item = new String[7];
		item = ln.split(" ");
		return item;
	}
	
	
	
	/**
	 * @param colname value
	 * @param tabvalue value
	 * @param orderPath value
	 * @return int value
	 * @description:The method to count number of  spiciness ordered by customer
	 
	 */

	public int popularSpc(String[] colname,String[][]tabvalue,String orderPath) {
	
		ReadFile readfile = new ReadFile();
		ArrayList<ArrayList<String>> p1table = readfile.readTxtFile1("data/subdishes.txt");
		ArrayList<String> p2table = readfile.readTxtFile2("data/subdishes.txt");
		int p3table = Integer.parseInt(readfile.readTxtFile3("data/subdishes.txt"));
		ArrayList<String> p4table = readfile.readTxtFile5("data/subdishes.txt");
		int popularspc=0;
		int popularspcnum=0;
		int num[]={ 1, 2, 3, 4, 6, 5 };;
		for (int d = 0; d < p3table + 1; d++) {
			
			colname[d] = d + "";
			tabvalue[0][d] = StaticOrder.calculateOrder(3 + p1table.size() + p2table.size(), colname[d],
					orderPath) + "";
			popularspc=StaticOrder.calculateOrder(3 + p1table.size() + p2table.size(), colname[d],
					orderPath);
			num[d]=popularspc;
			
		}
		for (int d = 0; d < p3table + 1; d++) {
			if(num[d]>popularspc) {
				popularspc=num[d];
			}
		}
		for (int d = 0; d < p3table + 1; d++) {
			if(popularspc==StaticOrder.calculateOrder(3 + p1table.size() + p2table.size(), colname[d],
					orderPath)) {
				popularspcnum=d;
			}
		}
		return popularspcnum;
	}

}
