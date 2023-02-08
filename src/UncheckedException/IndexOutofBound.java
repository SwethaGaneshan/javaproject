package UncheckedException;

import java.util.ArrayList;
import java.util.List;

public class IndexOutofBound {
	public static void main(String[] args) {
	List<Integer> r = new ArrayList<Integer>();
	r.add(60);
	r.add(30);
	System.out.println(r.get(4));

	}

}
