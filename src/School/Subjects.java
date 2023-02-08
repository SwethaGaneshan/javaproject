package School;

public class Subjects {
	
	public void Social() {
		System.out.println("Social");
	}
	
	public void Science() {
		System.out.println("Science");
	}
	
	public void Maths() {
	    System.out.println("Maths");
	}
	
	public static void main(String[] args) {
		Subjects sub = new Subjects();
		sub.Social();
		sub.Science();
		sub.Maths();
		System.out.println(sub);

		
	}
}

