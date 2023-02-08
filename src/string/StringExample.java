package string;

public class StringExample{

	public static void main(String[] args) {
		String a=("GOOD THINGS TAKE TIME");
		String b=("Good things take   time");
		int c=a.length();
		System.out.println("length="+c);
		boolean d=a.equals(b);
		System.out.println("equals="+d);
		boolean e=a.equalsIgnoreCase(b);
		System.out.println("equalsIgnoreCase="+e);
		String f=b.trim();
	    System.out.println("trim="+f);
	    int g=a.indexOf("D");
	    System.out.println("indexOf="+g);
	    int h=b.lastIndexOf("t");
	    System.out.println("lastIndexOf="+h);
	    String i=b.toUpperCase();
	    System.out.println("UpperCase="+i);
	    String j=a.toLowerCase();
	    System.out.println("LowerCase="+j);
	    boolean k=a.startsWith("Good");
	    System.out.println("StartsWith="+k);
	    boolean l=a.endsWith("ME");
	    System.out.println("EndsWith:"+l);
	    char m=a.charAt(5);
	    System.out.println("charAt="+m);
	    String n=a.substring(2,5);
	    System.out.println("subString="+n);
	    int p=a.compareTo("O");
	    System.out.println("Compare To="+p);
	    String o=a.replace("GOOD","BETTER");
	    System.out.println("Replace="+o);





	    

	    
	}
}
	    
	    
	    
	    
	    
	    
	    
	
	
