package UncheckedException;

public class TryCatchFinally {
	public static void main(String[] args){
		try {
			System.out.println(10/0);
		}
         catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
			}
		finally {
			System.out.println("Code Executed");
			
		}
		
	}

}
