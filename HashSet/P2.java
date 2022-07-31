package HashSet;

import java.util.HashSet;

public class P2 {
	public static void main(String[] args) {
//		HashSet h = new HashSet(32);
//		It will make the default row size is 32
		HashSet h = new HashSet(32, 0.90f);
		h.add(10);
		h.add(20.5);
		h.add(100);
		h.add(1000);
		System.out.println(h);

	}
}
