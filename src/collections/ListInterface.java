package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ListInterface{
	public static void main(String[] args) {
		
    List z=new ArrayList<>();
    z.add("java");
    z.add(24);
	System.out.println("z:"+z);
 
	List<Integer> a =new ArrayList<Integer>();
	a.add(60);
	a.add(70);
	a.add(40);
	a.add(60);
	System.out.println("a:"+a);

	List<Integer> a1 =new ArrayList<Integer>();
	a1.add(50);
	a1.add(40);
	a1.add(20);
	System.out.println("a1:"+a1);

	int b=a.size();
	System.out.println("size:"+b);
	int c=a.get(3);
	System.out.println("get:"+c);
    a.remove(2);
    System.out.println(a);
    a.add(1,40);
	System.out.println("add:"+a);
	a.set(2,30);
	System.out.println("set:"+a);
	boolean e=a.contains(40);
	System.out.println(e);
	int f=a.indexOf(60);
	System.out.println("indexOf:"+f);
	int g=a.lastIndexOf(60);
	System.out.println("lastIndexOf:"+g);
	
     a.addAll(a1);
 	System.out.println(a);
	List<Integer> b1 =new LinkedList<Integer>();
	b1.add(10);
	b1.add(20);
	b1.add(30);
	b1.add(40);
	System.out.println("b1:"+b1);
	List<Integer> b2 =new Vector<Integer>();
	b2.add(50);
	b2.add(40);
	b2.add(60);
	System.out.println("b2:"+b2);
 	b1.retainAll(b2);
	System.out.println("retainAll:"+b1);

	b2.removeAll(b1);
	System.out.println("remove all:"+b2);
    
	System.out.println("HASHSET");

	Set<Integer> c1 =new HashSet<Integer>();
	c1.add(60);
	c1.add(70);
	c1.add(40);
	c1.add(50);
	System.out.println("c1:"+c1);
	
	System.out.println("LINKEDHASHSET");
	Set<Integer> c2 =new LinkedHashSet<Integer>();
	c2.add(60);
	c2.add(70);
	c2.add(40);
	c2.add(50);
	System.out.println("c2:"+c2);
	
	System.out.println("TREESET");
	Set<Integer> c3 =new TreeSet<Integer>();
	c3.add(50);
	c3.add(40);
	c3.add(20);
	System.out.println("c3:"+c3);
	
	for(Integer x:c3){
		System.out.println(x);
		}
	}	

}
