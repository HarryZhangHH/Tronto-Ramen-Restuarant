package entityClass;
import java.io.*;
import java.util.*;
/**
 * @title:Payway.java
 * @author group63
 * @version V4.3
 * @description:Control class manager can add or remove the way to pay
 */
public class PayWay{

	public PayWay() {

		ArrayList<String> payway = new ArrayList<String>();
		payway.add("Cash");
		payway.add("Card");
		writePayway(payway);
	}

/**
 * @title: writePayway
 * @description: generate a file storing the way to pay
 * @param sp2 choice
 */
	public void writePayway(ArrayList<String> sp2) {
		String fileName = "way.txt";
		File subdishes = new File("data/" + fileName);
		System.out.println("File");
		try {
			FileWriter fw = new FileWriter(subdishes);
			BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < sp2.size(); i++) {
				bw.write(sp2.get(i));
				bw.write("\n");
			}

			bw.close();
			fw.close();

		} catch (IOException e) {
			System.out.println("File not found");
		}

	}

}
