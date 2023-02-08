package file.operation;

import java.io.File;

public class file {
	public static void main(String[] args){
		File f=new File("C:\\Users\\sabari\\workspace\\DemoClass\\Target");
		
		boolean mkdir= f.mkdir();
		System.out.println(mkdir);
	} 

}
