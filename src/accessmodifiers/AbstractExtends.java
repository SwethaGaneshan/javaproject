package accessmodifiers;

public class AbstractExtends extends abstraction {

	@Override
	public void ford() {
	System.out.println("ford");
		
	}
	
	public void honda(){
	System.out.println("honda");
	}
	
	public static void main (String[] args) {
		AbstractExtends ab = new AbstractExtends();
		ab.ford();
		ab.ferrari();
		ab.honda();
	}

}
