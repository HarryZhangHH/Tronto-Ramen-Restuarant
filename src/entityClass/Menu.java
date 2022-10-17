package entityClass;
/**
 * @title:Menu.java
 * @author group63
 * @version V4.3
 * @description:An entity class to store the price of a dish and its add-on
 */
public class Menu {
	private double ramen_price;
	private double nori_price;
	private double egg_price;
	private double shoots_price;
	private double chashu_price;

	public Menu() {
		//constructor
		this.ramen_price = 9.99;
		this.nori_price = 1.00;
		this.egg_price = 1.00;
		this.shoots_price = 1.00;
		this.chashu_price = 2.00;
	}

	public double getRamen_price() {
		return ramen_price;
	}

	public void setRamen_price(double ramen_price) {
		this.ramen_price = ramen_price;
	}

	public double getEgg_price() {
		return egg_price;
	}

	public void setEgg_price(double egg_price) {
		this.egg_price = egg_price;
	}

	public double getNori_price() {
		return nori_price;
	}

	public void setNori_price(double nori_price) {
		this.nori_price = nori_price;
	}

	public double getShoots_price() {
		return shoots_price;
	}

	public void setShoots_price(double shoots_price) {
		this.shoots_price = shoots_price;
	}

	public double getChashu_price() {
		return chashu_price;
	}

	public void setChashu_price(double chashu_price) {
		this.chashu_price = chashu_price;
	}

}
