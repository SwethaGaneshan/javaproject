package accessmodifiers;

public class Laptop { 
	 static int  price=85000;
	 
	 public void honor() {
		 int price=40000;
		 System.out.println("honor:"+price);
	 }
	 
	 public void lenovo() {
		 int price=35000;
		 System.out.println("lenovo:"+price);
		
	 }
      public static void main(String[]args){
       System.out.println("total:"+price);
       
       Laptop l= new Laptop();
       l.honor();
       l.lenovo();
       }
}
