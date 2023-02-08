package inheritance;

import School.*;

public class FoodTypes  {
	
	public void veg() {
		System.out.println("veg");
	}
	
	public void nonveg() {
		System.out.println("nonveg");
	}
	
	public static void main(String[] args) {
		FoodTypes ft = new FoodTypes();
		ft.veg();
        ft.nonveg();
        
        Medium med = new Medium();
        med.English();
        med.Tamil();
        
        Subjects sj = new Subjects();
        sj.Maths();
        sj.Science();
        sj.Social();
        
	}
}
