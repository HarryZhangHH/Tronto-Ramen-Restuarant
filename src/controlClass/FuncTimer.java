package controlClass;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @title:FuncTimer.java
 * @author group63
 * @version V4.3
 * @description:A control class: update order file on Monday, so that mananger and customer see the result of past wwek
 */
public class FuncTimer extends TimerTask{

	static String filename="data/order";
	@Override
	public void run() {
		// TODO Auto-generated method stub
		File file=new File(filename+".txt");
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
    	//sdf.setLenient(false);
    	String fileName=sdf.format(new Date())+" file.txt";
    	file.renameTo(new File(filename+fileName));
    	
    	
    	File orderticket=new File(filename+".txt"); 
		try {
			FileWriter fw=new FileWriter(orderticket,false);
			BufferedWriter bw=new BufferedWriter(fw);
			
			bw.close();
			fw.close();
			
		}
		catch(IOException e) {
			System.out.println("Ticket not found.");
		}
	}

}

