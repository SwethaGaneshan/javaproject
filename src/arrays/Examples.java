package arrays;

public class Examples {
	public static void main(String[] args) {
		String s="Welcome to java";
		String [] x=s.split(" ");
		
		
		for(int i=0;i<x.length;i++){
			 System.out.println(x[i]);
		}
		
		for (String v:x){
			 System.out.println(v);
	
		}
		}

}
