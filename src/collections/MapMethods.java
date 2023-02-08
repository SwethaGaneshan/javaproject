package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMethods {
	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(90,"Tamil");
		map.put(75, "Social");
		map.put(87, "Science");
		map.put(95,"English");
		map.put(65,"Maths");
		System.out.println(map);
		
		String  mark=map.get(95);
		System.out.println("Highest Mark:"+mark);
		Set<Integer> a=map.keySet();
		System.out.println("Marks:"+a);
		Collection<String> b=map.values();
		System.out.println("Subjects:"+b);
		Set<Entry<Integer,String>> c=map.entrySet();
		for(Entry<Integer,String> x:c) {
			//System.out.println(x);
			System.out.println(x.getKey());
			//System.out.println(x.getValue());


		}
		

		
		


		
}

}
