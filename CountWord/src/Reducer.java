import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections.MultiMap;

public class Reducer {

	public HashMap reduce(MultiMap map) {
		// TODO Auto-generated method stub
		HashMap map_reduced=new HashMap();
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			Collection coll = (Collection) entry.getValue();
			Iterator colit = coll.iterator();
			int sum=0;
			while (colit.hasNext()) {
				String item =  ""+ colit.next();
				sum=sum+Integer.parseInt(item);
			}
			map_reduced.put(entry.getKey(), sum);
		}
		return map_reduced;
	}

	public HashMap sum(HashMap map_reduced, HashMap sum_map_reduced) {
		// TODO Auto-generated method stub
		   Iterator it = map_reduced.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        if(!sum_map_reduced.containsKey(pair.getKey())){
		        	sum_map_reduced.put(pair.getKey() ,pair.getValue());
		        }
		        else{
		        	String val1=""+sum_map_reduced.get(pair.getKey());
		        	String val2=""+pair.getValue();
		        	sum_map_reduced.put(pair.getKey() ,Integer.parseInt(val2)+Integer.parseInt(val1));
		        }
		    }
		return sum_map_reduced;
	}

}
