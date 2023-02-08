package controlstatements;

public class WhileExample2 {
	
	public static void main(String[] args) {
		
		for( int i=90;i<=100;i++) {
			if (i%3==0) {
				System.out.println("Divisible by 3: "+i);
				}
			else {
				System.out.println("Not divisible by 3: "+i);
			}
		}
	}

}
  