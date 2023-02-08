package variables;

public class Local { 
	
	public void value1() {
	    int a=30;
	    a=10;
		System.out.println(a);
	}
	
	 public void value2(){
		 int b=20;
		 b=40;
		 System.out.println(b);
	 }
		 public static void main(String[] args){
	   Local l = new Local();
	   l.value1();
	   l.value2();
   }
     }
