package controlClass;
import java.io.*;
import java.util.*;
/**
 * @title:ReadFile.java
 * @author group63
 * @version V4.3
 * @description:Control class:contain methods to read file so that we needn't to repeat the code
 */
public class ReadFile {
	public static ArrayList<ArrayList<String>> readTxtFile1(String filePath) {
		ArrayList<ArrayList<String>> spcification1 = new ArrayList<ArrayList<String>>();
		try {
			String encoding = "GBK";

			File file = new File(filePath);
			if (file.isFile() && file.exists()) { 
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				// int j=0;
				while ((lineTxt = bufferedReader.readLine()) != null) {

					String[] str = lineTxt.split(" ");
					if (str[0].equals("1")) {
						ArrayList<String> sp1 = new ArrayList<String>();
						spcification1.add(sp1);
						for (int i = 0; i < str.length; i++) {
							sp1.add(str[i]);
						}
						sp1.remove(str[0]);

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
		// return null;
		return spcification1;

	}
	public static ArrayList<String> readTxtFile2(String filePath) {
		ArrayList<String> spcification2 = new ArrayList<String>();
		try {
			String encoding = "GBK";

			File file = new File(filePath);
			if (file.isFile() && file.exists()) { 
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				
				while ((lineTxt = bufferedReader.readLine()) != null) {

					String[] str = lineTxt.split(" ");
					if (str[0].equals("2")) {

						for (int i = 0; i < str.length; i++) {
							spcification2.add(str[i]);
						}
						spcification2.remove(str[0]);
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
		// return null;
		return spcification2;

	}
	public static String readTxtFile3(String filePath) {
		String s3 = null;
		try {
			String encoding = "GBK";

			File file = new File(filePath);
			if (file.isFile() && file.exists()) { 
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {

					String[] str = lineTxt.split(" ");
					if (str[0].equals("3")) {
						s3 = str[3];
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
		// return null;
		return s3;

	}
	public static ArrayList<HashMap<String, String>> readTxtFile4(String filePath) {

		ArrayList<HashMap<String, String>> spcification4 = new ArrayList<HashMap<String, String>>();
		try {
			String encoding = "GBK";

			File file = new File(filePath);
			if (file.isFile() && file.exists()) { 
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {

					String[] str = lineTxt.split(" ");
					if (str[0].equals("4")) {
						HashMap<String, String> sp4 = new HashMap<String, String>();
						for (int i = 0; i < str.length; i++) {
							sp4.put(str[1], str[2]);

						}
						spcification4.add(sp4);
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

		return spcification4;

	}
	public static ArrayList<String> readTxtFile5(String filePath) {
		ArrayList<String> spcification2 = new ArrayList<String>();
		try {
			String encoding = "GBK";

			File file = new File(filePath);
			if (file.isFile() && file.exists()) { 
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {

					String[] str = lineTxt.split(" ");
					if (str[0].equals("4")) {

						for (int i = 0; i < str.length; i++) {
							spcification2.add(str[i]);
						}
						spcification2.remove(str[0]);
						spcification2.remove(str[2]);
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
		return spcification2;

	}
	public ArrayList<String> readTxtFile6(String filePath) {
		ArrayList<String> spcification2 = new ArrayList<String>();
		try {
			String encoding = "GBK";

			File file = new File(filePath);
			if (file.isFile() && file.exists()) {
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {

					String str = lineTxt;
					spcification2.add(str);

				}

			
				read.close();

			} else {

				System.out.println("Cannot find the file");
			}
		} catch (Exception e) {
			System.out.println("ReadFile Error");
			e.printStackTrace();
		}
		return spcification2;

	}

}
