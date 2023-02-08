package stringexamples;

public class ClassString { 
	public static void main(String[] args) {
	String a1="Swetha Ganeshan";
    String a2="Swetha Ganeshan";
    System.out.println("Literal String");
    System.out.println(System.identityHashCode(a1));
    System.out.println(System.identityHashCode(a2));
    System.out.println("******************");
    String a3=new String("Swetha Ganeshan");
    String a4= new String("Swetha Ganeshan");
    System.out.println("Non Literal String");
    System.out.println(System.identityHashCode(a3));
    System.out.println(System.identityHashCode(a4));
    System.out.println("******************");
    String a5=a3.concat(a4);
    System.out.println("Immutable String");
    System.out.println(a5);
    System.out.println(System.identityHashCode(a5));
    System.out.println("******************");
    StringBuffer a6=new StringBuffer("Swetha Ganeshan");
    StringBuffer a7=new StringBuffer("Swetha Ganeshan");
    System.out.println("Mutable String");
    System.out.println(System.identityHashCode(a6));
    System.out.println(System.identityHashCode(a7));
    StringBuffer a8=a7.append(a6); 
    System.out.println(a8);
    System.out.println(System.identityHashCode(a8));
    System.out.println("******************");

    

	}

}
