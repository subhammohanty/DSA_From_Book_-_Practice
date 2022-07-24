package problem_Tree;

public class ThreaadImpl extends Thread{
	
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreaadImpl thread = new ThreaadImpl();
		thread.start();
	}

}
