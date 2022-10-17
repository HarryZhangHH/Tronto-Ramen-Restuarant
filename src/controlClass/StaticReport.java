package controlClass;
import java.io.*;
/**
 * @title:StaticReport.java
 * @author group63
 * @version V4.3
 * @description:Contral class:generate the static report for customer and manager
 */
public class StaticReport {
	int num=0;
	/**
	 * @title: calculateOrder
	 * @description: the method to calculate
	 * @param flag used to count
	 * @param title content of file
	 * @param colname column name
	 * @param tabvalue value of table
	 */
	public  void staticReport(int flag,String title,String[] colname, String[][] tabvalue) {
		try {
			String encoding = "GBK";
			String orderPath = "data/order.txt";

			File file = new File("data/staticReport.txt");
			
			if(flag==1&&num==0) {
				file.delete();
				num=1;
			}
			
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(title);
			bw.write("------------------");
			bw.newLine();
			for(int i=0;i<colname.length;i++) {
			
			bw.write(colname[i]+"  : ");
		    bw.write(tabvalue[0][i]);
			bw.newLine();
			}
			
			
			Calculate f=new Calculate();
			if(flag==3) {
			bw.write("The most popluar spiciness is "+f.popularSpc(colname, tabvalue, orderPath));
			bw.newLine();}
			bw.close();
			
			
		} catch (Exception e) {
			System.out.println("ReadFile Error");
			e.printStackTrace();
		}
	}
}
