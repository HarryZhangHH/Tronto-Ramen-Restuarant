package controlClass;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @title:WriteMenu.java
 * @author group63
 * @version V4.3
 * @description:An interface for writing menus.
 */

public interface WriteMenu {
	public void writeMenu(String name, String description, double price, String image, ArrayList<ArrayList<String>> sp1,
			ArrayList<String> sp2, ArrayList<ArrayList<String>> sp3, ArrayList<HashMap<String, Double>> sp4);
}
