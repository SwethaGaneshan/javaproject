package accessmodifiers;

public class InterfaceImplements  implements FullyAbstract{

	@Override
	public void ford() {
		System.out.println("ford");
		
	}

	@Override
	public void honda() {
		System.out.println("honda");
		
	}
	 public static void main(String[] args) {
	InterfaceImplements in = new InterfaceImplements();
	in.ford();
	in.honda();
	 }

}
