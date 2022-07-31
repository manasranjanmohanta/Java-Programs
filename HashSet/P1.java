package HashSet;

import java.util.HashSet;

public class P1 {
	public static void main(String[] args) {
		HashSet h = new HashSet();
//		default memory location takes 16 row and load 
//		ratio will be 75% = 0.75f
		h.add(10);
		h.add(20);
		h.add(100);
		h.add(1000);
		System.out.println(h);
	}

}
