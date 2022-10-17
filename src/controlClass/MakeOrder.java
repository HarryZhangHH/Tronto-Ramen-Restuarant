package controlClass;
import boundaryClass.*;

//control class
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import boundaryClass.GuiVip;
import entityClass.Order;
/**
 * @title:MakeOrder.java
 * @author group63
 * @version V4.3
 * @description:Control class: the bussiness logic of ordering and write the order into files
 */

public class MakeOrder implements PrintTicket {
	Order order=new Order();
	public void printOrderTicket() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		// sdf.setLenient(false);
		String fileName = sdf.format(new Date()) + " file.txt";
		File orderticket = new File("data/" + fileName);
		try {
			FileWriter fw = new FileWriter(orderticket);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(order.getTime() + " " + order.getOrderNum() + " " + "ramen" + " ");
			for (int i = 0; i < GuiVip.copy.size(); i++) {
				bw.write(GuiVip.copy.get(i) + " ");
			}
			bw.newLine();
			bw.close();
			fw.close();

		} catch (IOException e) {
			System.out.println("Ticket not found");
		}

	}

	/**
	 * @description: a method to write the order which can be seen by manager
	 *
	 */
	public void printOrder() {

		File orderticket = new File("data/order.txt");
		try {
			FileWriter fw = new FileWriter(orderticket, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(order.getTime() + " " + order.getOrderNum() + " " + "ramen" + " ");
			for (int i = 0; i < GuiVip.copy.size(); i++) {
				bw.write(GuiVip.copy.get(i) + " ");
			}
			bw.newLine();

			bw.close();
			fw.close();

		} catch (IOException e) {
			System.out.println("Ticket not found1");
		}

	}
	
	/**
	 * @title: printOrderTicket
	 * @description: a method to write the order which can be seen by customer
	 * @param id customer's
	
	 *
	 */
	
	public void printOrderTicket(String id) {	
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
		//sdf.setLenient(false);
		String fileName=sdf.format(new Date())+" file.txt";
		File orderticket=new File("data/"+fileName);
		try {
			FileWriter fw=new FileWriter(orderticket);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(order.getTime()+" "+order.getOrderNum()+" "+"ramen"+" "+order.getSoup()+" "+order.getNoodles()+" "+order.getOnion()+" "+order.isChashu()+" "+order.isEgg()+" "+order.isNori()+" "+order.getSpiciness()+" "+order.getAdd_on_nori()+" "+order.getAdd_on_egg()+" "+order.getAdd_on_shoots()+" "+order.getAdd_on_chashu()+" "+order.getWay()+" "+order.Order(id));	
			bw.close();
			fw.close();
			
		}
		catch(IOException e) {
			System.out.println("Ticket not found"); 
		}
		
		}
	
}

