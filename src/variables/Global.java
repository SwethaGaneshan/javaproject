package variables;

public class Global {
	float c ;
	public void values1(){
		int c=9;
		System.out.println(c);
	     }
	
	public void values2(){
		System.out.println(c);
	}
	 
	public static void main(String[] args) {
		Global g = new Global();
		g.values1();
		g.values2();
		
		
	}

}
