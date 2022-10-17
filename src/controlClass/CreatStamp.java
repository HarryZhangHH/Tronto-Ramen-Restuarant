package controlClass;
import java.io.*;
/**
 * @title:CreatStamp
 * @author group63
 * @version V4.3
 * @description:A control class to create and initialize stamp for membership
 */
public class CreatStamp {

	public CreatStamp(String id) {
	
		File file = new File("data/" + id + ".txt");
		if (!file.exists()) {
			try {
				file.createNewFile(); 
				FileWriter fw = new FileWriter("data/" + id + ".txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("0");
				bw.flush();
				bw.close();
			} catch (IOException e1) {

				e1.printStackTrace();
			}
		}
	}

}