package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {

		ArrayList<Patient> patientList = new ArrayList<Patient>();
		File f = new File("D://Temp//patient.txt");

		FileReader fr = new FileReader(f);// entire line X
		BufferedReader br = new BufferedReader(fr);// entire line read

		while (true) {
			String data = br.readLine();// 1st line , 2nd line , 3rd line , end of line -> null
			
			if (data == null) {
				break;
			}
			// 1005 raj 35 male Y N N
			System.out.println(data);
			
			String a[] = data.split("\\s+");// 0->1005 1->raj 2->35
			Patient p = new Patient();
			p.patientNo = Integer.parseInt(a[0]);
			p.name = a[1];
			p.age = Integer.parseInt(a[2]);
			p.gender = a[3];
			p.smoke = a[4];
			p.diabetic = a[5];
			p.bloodPre = a[6];
			patientList.add(p);
		}

		br.close();
		for(int i=0;i<patientList.size();i++) {
			System.out.println(patientList.get(i).name);
		}
	}
}

class Patient {
	int patientNo;
	String name;
	int age;
	String gender;
	String smoke;
	String diabetic;
	String bloodPre;
	String chance;
}
