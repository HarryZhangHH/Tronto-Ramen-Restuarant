package controlClass;
import java.awt.*;
import java.io.*;
import java.util.*;
/**
 * @title:SubDishes.java
 * @author group63
 * @version V4.3
 * @description:Contral class:add specification for a dish
 */

public class SubDishes extends Dishes implements WriteMenu{


	public SubDishes(String name, String description, double price, String image) {

		super(name,description,price,image);
	}

	
	/**
	 * @title: addspecification
	 * @description: the method to add specification and options for a dishes so that customer can personalize their dish
	 */
	 public void addspecification(){
			ArrayList<ArrayList<String>> spcification1 = new ArrayList<ArrayList<String>>();
			ArrayList<String> soup = new ArrayList<String>();
			soup.add("Soup");
			soup.add("Tonkotsu");
			soup.add("Shoyu");
			soup.add("Shio");
	
			spcification1.add(soup);
			ArrayList<String> noodles = new ArrayList<String>();
			noodles.add("Noodles");
			noodles.add("Soft");
			noodles.add("Medium");
			noodles.add("Firm");
			spcification1.add(noodles);
			ArrayList<String> onion = new ArrayList<String>();
			onion.add("Spring_onion");
			onion.add("A_lot");
			onion.add("Just_a_little");
			onion.add("No,please");
			spcification1.add(onion);

			ArrayList<String> spcification2 = new ArrayList<String>();
			spcification2.add("Nori");
			ArrayList<String> chashu = new ArrayList<String>();
			spcification2.add("Chashu");
			ArrayList<String> egg = new ArrayList<String>();
			spcification2.add("Egg");

			ArrayList<ArrayList<String>> spcification3 = new ArrayList<ArrayList<String>>();
			ArrayList<String> spiciness = new ArrayList<String>();
			spiciness.add("Spiciness");
			spiciness.add("0");
			spiciness.add("5");
			spcification3.add(spiciness);

			HashMap<String, Double> pair = new HashMap<String, Double>();
			ArrayList<HashMap<String, Double>> addon = new ArrayList<HashMap<String, Double>>();

			pair.put("add_on_nori", 1.0);
			pair.put("add_on_chashu", 2.0);
			pair.put("add_on_egg", 1.0);
			pair.put("add_on_shoots", 1.0);
			
			addon.add(pair);
			
			
			String fileName = "subdishes.txt";
			File subdishes = new File("data/" + fileName);
			System.out.println("File");
			try {
				FileWriter fw = new FileWriter(subdishes);
				BufferedWriter bw = new BufferedWriter(fw);
				for (int i = 0; i < spcification1.size(); i++) {
					bw.write("1 ");
					for (int j = 0; j < ((ArrayList) spcification1.get(i)).size(); j++) {
						bw.write(spcification1.get(i).get(j) + " ");
						
					}
					bw.write("\n");
				}

				for (int i = 0; i < spcification2.size(); i++) {
					bw.write("2 " + spcification2.get(i));
					bw.write("\n");
				}

				for (int i = 0; i < spcification3.size(); i++) {
					bw.write("3 ");
					for (int j = 0; j < ((ArrayList) spcification3.get(i)).size(); j++) {
						bw.write(spcification3.get(i).get(j) + " ");
					}
					bw.write("\n");
				}

				for (int i = 0; i < addon.size(); i++) {

					for (HashMap.Entry<String, Double> entry : addon.get(i).entrySet()) {
						bw.write("4 ");
						bw.write(entry.getKey() + " " + entry.getValue());
						bw.write("\n");
					}
				}

				bw.close();
				fw.close();

			} catch (IOException e) {
				System.out.println("Ticket not found");
			}
		    }


	 public static void main (String args[]){
	 SubDishes s=new SubDishes("Ramen", "good", 9.99, "aa");
	 s.addspecification();
	 }

	@Override
	public void writeMenu(String name, String description, double price, String image, ArrayList<ArrayList<String>> sp1,
			ArrayList<String> sp2, ArrayList<ArrayList<String>> sp3, ArrayList<HashMap<String, Double>> sp4) {
		// TODO Auto-generated method stub
		String fileName = "subdishes.txt";
		File subdishes = new File("data/" + fileName);
		try {
			FileWriter fw = new FileWriter(subdishes);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < sp1.size(); i++) {
				bw.write("1 ");
				for (int j = 0; j < ((ArrayList) sp1.get(i)).size(); j++) {
					bw.write(sp1.get(i).get(j) + " ");
				}
				bw.write("\n");
			}

			for (int i = 0; i < sp2.size(); i++) {
				bw.write("2 " + sp2.get(i));
				bw.write("\n");
			}

			for (int i = 0; i < sp3.size(); i++) {
				bw.write("3 ");
				for (int j = 0; j < ((ArrayList) sp3.get(i)).size(); j++) {
					bw.write(sp3.get(i).get(j) + " ");
				}
				bw.write("\n");
			}

			for (int i = 0; i < sp4.size(); i++) {

				for (HashMap.Entry<String, Double> entry : sp4.get(i).entrySet()) {
					bw.write("4 ");
					bw.write(entry.getKey() + " " + entry.getValue());
					bw.write("\n");
				}
			}

			bw.close();
			fw.close();

		} catch (IOException e) {
			System.out.println("Ticket not found");
		}
		
	}


	
}