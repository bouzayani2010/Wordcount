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

}
