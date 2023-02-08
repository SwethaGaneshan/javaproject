package accessmodifiers;

public class MultipleInheritance implements FullyAbstract,FullyAbstraction {

	@Override
	public void hyundai() {
    System.out.println("hyundai");		
	}

	@Override
	public void ford() {
    System.out.println("ford");
	}

	@Override
	public void honda() {
    System.out.println("honda");		
	} 
    
	public static void main (String[] args) {
		MultipleInheritance mi = new MultipleInheritance();
		mi.ford();
		mi.hyundai();
		mi.honda();
		
	}
}

		
	

	



	
