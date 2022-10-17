package controlClass;
import java.io.*;

/**
 * @title:ClearStamps
 * @author group63
 * @version V4.3
 * @description:A control class to clear the stamp when the customer use 10 stamps to pay meal for free.
 */
public class ClearStamps {
	
	/**
	 * @param id user's
	 * @return boolean value
	 * @throws IOException throw exception
	 */
	public boolean Clear(String id) throws IOException {
		
		boolean flag=false;
		
      
		
    		 try {
     		    PrintWriter pw = new PrintWriter("data/"+id+".txt");
 			    
 			  
 			    int b=0;
 			    pw.write(b+"");            //clear the stamp
 			
 		     	pw.flush();
 			    pw.close();
    		
		
		}
		
    	catch (IOException e) {
			  // TODO Auto-generated catch block
			
			   e.printStackTrace();
			   }	
		
		
		return flag;
		
	}
}	
	
	