package inheritancetypes;

import inheritance.Vegetables;

public class Flowers extends Vegetables {
	
	public void daisy() {
		System.out.println("daisy");
	}
	 
	public void jasmine() {
		System.out.println("jasmine");
	}
	 
	public static void main(String[] args) {
		Flowers fl = new Flowers();
		fl.daisy();
		fl.jasmine();
		fl.potato();
		fl.tomato();
	
		
	}

}
