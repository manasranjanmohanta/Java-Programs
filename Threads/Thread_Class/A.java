package Threads.Thread_Class;

public class A extends Thread{
	// first method  of Thread class is - run()
	public void run() { 
		for (int i = 0; i < 1000; i++) {
			System.out.println("From Thread");
		}
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("From Main");
		}
	}
}