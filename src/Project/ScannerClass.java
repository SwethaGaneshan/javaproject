package Project;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
	Scanner det  =new Scanner(System.in);
	System.out.println("Enter the College Name");
	String c=det.nextLine();
	System.out.println("College Name:"+c);
	
	Scanner det1 =new Scanner(System.in);
	
	System.out.println("Enter the Name");
    String b=det1.next();
    System.out.println("Name:"+b);
    
    System.out.println("Enter the Roll No");
    int a=det1.nextInt();
    System.out.println("Roll No:"+a);
    
    System.out.println("Enter the CGPA");
    float d=det1.nextFloat();
    System.out.println("CGPA:"+d);
    
    System.out.println("Enter the Phone No");
    long e=det1.nextLong();
    System.out.println("Phone No:"+e);
    
    }
}
