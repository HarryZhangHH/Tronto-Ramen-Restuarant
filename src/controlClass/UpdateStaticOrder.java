package controlClass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class UpdateStaticOrder extends TimerTask{

	static String filename="data/staticReport";
	@Override
	public void run() {
		File file=new File(filename+".txt");
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
    	String fileName=sdf.format(new Date())+" file.txt";
    	file.renameTo(new File(filename+fileName));
    	StaticReport s=new StaticReport();
    	
    	
  	File report=new File(filename+".txt"); 
		try {
			FileWriter fw=new FileWriter(report,false);
			BufferedWriter bw=new BufferedWriter(fw);
			
			bw.close();
			fw.close();
			
		}
		catch(IOException e) {
			System.out.println("Ticket not found.");
		}
	}

}

