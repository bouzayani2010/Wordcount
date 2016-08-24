import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.commons.collections.MultiMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
	}

	private static void read() {
		// TODO Auto-generated method stub
		Main obj=new Main();
		ClassLoader classLoader = obj.getClass().getClassLoader();
		File file = new File(classLoader.getResource("textfile/text.txt").getFile());


		try {

			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println("**** Mapper ****");
				MultiMap map= new Mapper().maper(line);
				System.out.println(map.toString());
				System.out.println("**** Reducer ****");
				HashMap map_reduced= new Reducer().reduce(map);
				System.out.println(map_reduced.toString());
			}
			sc.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
