package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapInterface {
	public static void main(String[] args) {
		
	  Map<String,Integer> m=new TreeMap<String,Integer>();
		m.put("Ajith",1);
		m.put("Bala",2);
		m.put("Ciby",2);
		m.put("Ajith",4);
		m.put("Enitha", 3);
	System.out.println(m);
	System.out.println("HASH MAP");
      Map<String,Integer> m1=new HashMap<String,Integer>();
	   m1.put("Ajith",null);
	   m1.put(null,2);
	   m1.put("Ciby",null);
	   m1.put("Ajith",4);
	   m1.put("Enitha",3);
    System.out.println(m1);
	System.out.println("LINKEDHASHMAP");
  Map<Integer,String> m4=new  LinkedHashMap<Integer,String>();
	   m4.put(null,"Ajith");
	   m4.put(2,null);
	   m4.put(3,null);
	   m4.put( 4,"Ajith");
	   m4.put( 1,"Enitha");
  System.out.println(m4);
	System.out.println("TREEMAP");
 Map<Integer,String> m5=new TreeMap<Integer,String>();
	m5.put(5,"Ajith");
	m5.put(3,"Bala");
	m5.put(2,null);
	m5.put(1,"Ajith");
	m5.put(4,null);
System.out.println(m5);
System.out.println("HASHTABLE");
      Map<String,Integer> m2=new Hashtable<String,Integer>();
	   m2.put("Ajith",1);
	   m2.put("Bala",2);
	   m2.put("Ciby",5);
	   m2.put("Ajith",4);
	   m2.put("Enitha",3);
   System.out.println(m2);
   System.out.println("CONCURRENTHASHTABLE");
  Map<String,Integer> m3=new ConcurrentHashMap<String,Integer>();
	   m3.put("Ajith",1);
	   m3.put("Bala",2);
	   m3.put("Ciby",5);
	   m3.put("Ajith",4);
	   m3.put("Enitha",3);
  System.out.println(m3);
  
	}
}
