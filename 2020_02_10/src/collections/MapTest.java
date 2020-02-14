package collections;

import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Date> map = new Hashtable<String, Date>();
		map.put("birthday", new Date(1994, 03, 11));
		map.put("engday", new Date(2020, 02, 11));

		System.out.println(map.get("engday").getMonth());
		Iterator<String> keys = map.keySet().iterator();
		while( keys.hasNext()) {
			
		System.out.println(map.get(   keys.next()	).getYear());
		
	}
	
	}
}
