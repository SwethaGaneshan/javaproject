package UncheckedException;

public class NumberFormat {
	public static void main (String[] args) {
		int a=3;
		String s="43r";
		System.out.println(a+s);
		
		int k=Integer.parseInt(s);
		System.out.println(a+k);
	}

}
