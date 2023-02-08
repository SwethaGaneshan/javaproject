package encapsulation;

public class StudentsDetails1 {
	
public static void main(String[] args) {
	StudentDetails sd1 = new StudentDetails();
	sd1.setName("Swetha");
	sd1.setID(20045);
	sd1.setPhone(6784027087l);
	System.out.println(sd1.getName()+"  "+sd1.getID()+"  "+sd1.getPhone());
	

}
}
