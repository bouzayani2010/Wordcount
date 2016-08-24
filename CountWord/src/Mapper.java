import java.util.Scanner;

import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.MultiMap;

public class Mapper {

	public MultiMap maper(String line) {
		// TODO Auto-generated method stub
		MultiMap map = new MultiHashMap();
		 Scanner sc = new Scanner(line);

	        while (sc.hasNextLine()) {
	            String word = sc.next();
	            map.put(word, 1);
	           // System.out.print(word+"::");
	        }
	        sc.close();
		return map;
	}

	
}
