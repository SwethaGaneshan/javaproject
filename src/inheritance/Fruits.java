package inheritance;

public class Fruits   {
	
	public void orange() {
		System.out.println("orange");
	}
	
	public void apple() {
		System.out.println("apple");
	}
    
	public static void main(String[] args){
		Fruits fr = new Fruits();
		fr.apple();
		fr.orange();
		}
	}
