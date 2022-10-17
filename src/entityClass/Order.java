package entityClass;

/**
 * @title:Order.java
 * @author group63
 * @version V4.3
 * @description:An interface which help calculate the price for an order
 */
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import javax.swing.*;

import boundaryClass.PerDishes4Gui;
import controlClass.CalPrice;
import controlClass.GetTime;
import controlClass.ReadFile;

import java.text.SimpleDateFormat;

public class Order implements CalPrice, GetTime {
	private String date;
	private String soup;
	private String noodles;
	private String onion;
	private boolean nori;
	private boolean chashu;
	private boolean egg;
	private int spiciness;
	private int add_on_nori;
	private int add_on_egg;
	private int add_on_shoots;
	private int add_on_chashu;
	private String way;
	private double price;
	private String orderNum;
	Menu menu = new Menu();
	static String file = "data/subdishes.txt";

	public double Order(String id) throws IOException {
		BufferedReader in;
		try {

			in = new BufferedReader(new FileReader("data/" + id + ".txt"));
			if (in.read() < 10) {

				this.price = menu.getRamen_price() + this.getAdd_on_chashu() * menu.getChashu_price()
						+ this.getAdd_on_egg() * menu.getEgg_price()
						+ this.getAdd_on_nori() * menu.getNori_price()
						+ this.getAdd_on_shoots() * menu.getShoots_price();

			}

			else {
				this.price = 0;
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		return price;

	}

	/**
	 * @description: a method to generate an order number to uniquely identify an order
	 * @return order number
	 */
	public String getOrderNum() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");

		orderNum = sdf.format(new Date());

		return orderNum;
	}

	/**
	 * @description: a method to get the time
	 * @return date
	 */
	public String getTime() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		date = df.format(new Date());
		return date;
	}

	public String getSoup() {
		return soup;

	}

	public void setSoup(String soup) {
		this.soup = soup;

	}

	public String getNoodles() {
		return noodles;
	}

	public void setNoodles(String noodles) {
		this.noodles = noodles;

	}

	public boolean isNori() {
		return nori;
	}

	public void setNori(boolean nori) {
		this.nori = nori;
	}

	public String getOnion() {
		return onion;
	}

	public void setOnion(String onion) {
		this.onion = onion;
	}

	public boolean isChashu() {
		return chashu;
	}

	public void setChashu(boolean chashu) {
		this.chashu = chashu;
	}

	public boolean isEgg() {
		return egg;
	}

	public void setEgg(boolean egg) {
		this.egg = egg;
	}

	public int getSpiciness() {
		return spiciness;
	}

	public void setSpiciness(int spiciness) {
		this.spiciness = spiciness;
	}

	public int getAdd_on_nori() {
		return add_on_nori;
	}

	public void setAdd_on_nori(int add_on_nori) {
		this.add_on_nori = add_on_nori;
	}

	public int getAdd_on_egg() {
		return add_on_egg;
	}

	public void setAdd_on_egg(int add_on_egg) {
		this.add_on_egg = add_on_egg;
	}

	public int getAdd_on_shoots() {
		return add_on_shoots;
	}

	public void setAdd_on_shoots(int add_on_shoots) {
		this.add_on_shoots = add_on_shoots;
	}

	public int getAdd_on_chashu() {
		return add_on_chashu;
	}

	public void setAdd_on_chashu(int add_on_chashu) {
		this.add_on_chashu = add_on_chashu;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	/**
	 * @description: a method to calculate the addon price
	 * @return order number
	 */
	public double getPrice() {
		ReadFile readfile = new ReadFile();
		ArrayList<HashMap<String, String>> sp4 = readfile.readTxtFile4(file);
		price = 9.99;
		for (int i = 0; i < sp4.size(); i++) {

			for (Entry<String, String> entry : sp4.get(i).entrySet()) {
				menu.setChashu_price(Double.parseDouble(entry.getValue()));

				this.price += PerDishes4Gui.num.get(i) * Double.parseDouble(entry.getValue());

			}

		}

		return price;
	}



}
