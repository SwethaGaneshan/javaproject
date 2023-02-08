package polymorphism;

public class overloading {
	
	public void person(String name, String email){
		System.out.println("The Name is:"+name);
		System.out.println("Mail ID:"+email);
		}
    
	public void person( int age){
		System.out.println("Age:"+age);
	    }
	
	public void person(long phone, int salary) {
		System.out.println("Phone No:"+phone);
		System.out.println("Salary:"+salary);

	    }
	  
	public static void main(String[] args){
		overloading o = new overloading();
		o.person("Tamilarasan","tamil123@gmail.com");
		o.person(29);
		o.person(63268090710l,20000);
	}
}
		
		
		
		
	
