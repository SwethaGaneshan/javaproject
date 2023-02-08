package accessmodifiers;

public class EvenOdd {
	
	public static void main (String[] args) {
		
		for( int i=90;i<=100;i++) {
			
			if (i%5==0) {
				System.out.println("Divisible by 5: "+i);
					}
			else {
				System.out.println("Not divisible by 5: "+i);
			}

			}
	}

}
