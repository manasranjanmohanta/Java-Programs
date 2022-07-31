package Threads.Inteface_Runnable;

public class A implements Runnable{
	// overriding the incomplete method of interface - Runnable
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("From Interface");
		}
	}
	public static void main(String[] args) {
		A a1 = new A();
		Thread t1 = new Thread(a1);
		t1.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("From Main");
		}
	}

}
