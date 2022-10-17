package controlClass;
import java.io.*;
import java.util.ArrayList;

import javax.swing.JTable;
/**
 * @title:StaticOrder.java
 * @author group63
 * @version V4.3
 * @description:Contral class:calculate each item sold in the past week
 */

public class StaticOrder {

	/**
	 *@title: calculateOrder 
	 *@description: the method to calculate
	 *@author: group63
	 *@param string the string
	 *@param filePath the filePath
	 *@return count number used to count
	 */ 
	public static int calculateOrder(String string, String filePath) {
		int count = 0;
		try {
			String encoding = "GBK";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // check whether file exists
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				
				while ((lineTxt = bufferedReader.readLine()) != null) {

					String[] str = lineTxt.split(" ");
					for (int i = 0; i < str.length; i++) {
						if (str[i].equals(string)) {
							count++;
						}
					}

				}
				read.close();
			} else {
				System.out.println("Cannot find the file");
			}
		} catch (Exception e) {
			System.out.println("ReadFile Error");
			e.printStackTrace();
		}

		return count;
	}

	/**
	 *@title: calculateOrder 
	 *@description: the method to calculate
	 *@param a use to count
	 *@param filePath the filePath
	 *@return count
	 */ 
	public static int calculateOrder(int a, String filePath) {
		int count = 0;
		try {
			String encoding = "GBK";


			File file = new File(filePath);
			if (file.isFile() && file.exists()) {
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {

					String[] str = lineTxt.split(" ");

					if (str[a].equals("true") || str[a].equals("Yes") || str[a].equals("1")) {
						count++;
					}

				}

				read.close();
			} else {
				System.out.println("Cannot find the file");
			}
		} catch (Exception e) {
			System.out.println("ReadFile Error");
			e.printStackTrace();
		}

		return count;
	}

	/**
	 * @title: calculateOrder
	 * @description: the method to calculate
	 * @param a count
	 * @param string filePath
	 * @param filePath filePath
	 * @return count
	 */
	public static int calculateOrder(int a, String string, String filePath) {
		int count = 0;
		try {
			String encoding = "GBK";


			File file = new File(filePath);
			if (file.isFile() && file.exists()) { 
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {

					String[] str = lineTxt.split(" ");
					if (str[a].equals(string)) {
						count++;
					}

				}

				read.close();
			} else {
				System.out.println("Cannot find the file");
			}
		} catch (Exception e) {
			System.out.println("ReadFile Error");
			e.printStackTrace();
		}

		return count;
	}



}
