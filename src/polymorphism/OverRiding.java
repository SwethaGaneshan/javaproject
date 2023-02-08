package polymorphism;

public class OverRiding extends overloading {
	
	@Override
	public void person(String name, String email) {
        System.out.println("Name is:"+name);
        System.out.println("Mail ID:"+email);

		//super.person(name, email);
	}
	 
	@Override
	public void person(long phone,int salary) {
		System.out.println("Phone No:"+phone);
		System.out.println("Salary:"+salary);
		
       // super.person(phone, salary);      
	
	}
	
	public static void main (String[] args) {
		OverRiding over = new OverRiding();
		over.person("Chanakyan","chanvv05@gmail.com");
		over.person(7648908770l,15000);
	}

}
