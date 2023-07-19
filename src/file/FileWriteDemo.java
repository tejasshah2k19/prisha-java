package file;
import java.io.File;
import java.io.FileWriter; 

public class FileWriteDemo {

	public static void main(String[] args) throws Exception {

		
		String name = "royal"; 
		
		File f = new File("d:\\Temp\\wed.txt");
		f.createNewFile(); 
		FileWriter writer = new FileWriter(f);
		writer.write(name);
		writer.close(); 
		
		
		//3 name 
		//file 
		
		
	}
}
