package controlClass;

import java.io.*;
import java.text.*;
import java.util.*;

/**
 * @title:Refresh.java
 * @author group63
 * @version V4.3
 * @description:Control class:set the time to update
 */

public class Refresh {

	
    private static final long PERIOD_DAY =  7* 24 * 60 * 60 * 1000;  
    public Refresh()  {  
    	Calendar calendar = Calendar.getInstance();  
        calendar.set(Calendar.DAY_OF_WEEK, 2);
        calendar.set(Calendar.HOUR_OF_DAY, 0); //24:00 
        calendar.set(Calendar.MINUTE, 0);  
        calendar.set(Calendar.SECOND, 0);  
        calendar.get(Calendar.DAY_OF_WEEK);
        Date date=calendar.getTime(); //first time run program 
        
        
        if (date.before(new Date())) {  
           date = new Date(date.getTime() + PERIOD_DAY);  
        }  
        
        
        Timer timer = new Timer();  
        FuncTimer task = new FuncTimer();  
        UpdateStaticOrder task2=new UpdateStaticOrder();
        timer.schedule(task,date,PERIOD_DAY); 
        timer.schedule(task2,date,PERIOD_DAY); 
    }  
   
    public Date addDay(Date date, int num) {  
        Calendar startDT = Calendar.getInstance();  
        startDT.setTime(date);  
        startDT.add(Calendar.DAY_OF_MONTH, num);  
        return startDT.getTime();  
    }  
	
	}
	


