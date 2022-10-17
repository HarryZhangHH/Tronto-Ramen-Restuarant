package controlClass;
/**
 * @title:Dishes.java
 * @author group63
 * @version V4.3
 * @description:An entity class which store the basic information for a dish
 */
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Dishes {
	private String name;
	private String description;
	private double price;
	private String image;

	public Dishes(String name, String description, double price, String image) {
		//constructor
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getImage() {
		return image;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}
	public abstract void  addspecification();//override in the subdishes.java add specification for a dish
	

}
