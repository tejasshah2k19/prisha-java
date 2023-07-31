package core.expapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ExpenseController {

	public static void main(String[] args) throws Exception {
		File f = new File("d:\\temp\\exp.txt.txt");

		FileReader fr = new FileReader(f);// single character
		BufferedReader br = new BufferedReader(fr);

		String line;

		ArrayList<User> list = new ArrayList<User>();
		while (true) {
			line = br.readLine();// exp 1st line
			if (line == null) {
				break;
			}
			System.out.println(line);

			String data[] = line.split("\\s+");// \s => space +=>1 or more space
			// 0->name
			// 1->email
			// 2->vendor
			// 3->expCategory {grocery,medical,dairy}
			// 4->price

			User user = new User();
			user.name = data[0];
			user.email = data[1];

			if (data[3].equals("grocery")) {
				user.grocery = Integer.parseInt(data[4]);
			}
			if (data[3].equals("medical")) {
				user.medical = Integer.parseInt(data[4]);
			}
			if (data[3].equals("dairy")) {
				user.dairy = Integer.parseInt(data[4]);
			}

			boolean match = false;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).name.equals(user.name)) {
					match = true;
					list.get(i).grocery = list.get(i).grocery + user.grocery;
					list.get(i).medical = list.get(i).medical + user.medical;
					list.get(i).dairy = list.get(i).dairy + user.dairy;
				}
			}

			if (match == false) {
				list.add(user); // 6 record -> 6 object
			}
		}
		br.close();

		System.out.println("Name  Grocery  Medical  Dairy");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(
					list.get(i).name + " " + list.get(i).grocery + " " + list.get(i).medical + " " + list.get(i).dairy);

		}

	}
}
