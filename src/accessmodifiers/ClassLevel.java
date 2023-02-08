package accessmodifiers;

public class ClassLevel {

public static void subClass() {
	System.out.println("subclass");
	
}
  public static void main(String[] args) {
	  ClassLevel lev = new ClassLevel();
	  lev.subClass();
	  
	 MethodLevel.ponniyinSelvan();
	  
  }
}
