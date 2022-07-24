package problem_Tree;

public class RunnableImpl{
	
	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println("By Runnable ");
		Thread t1 = new Thread(r1);
		t1.start();
	}

//	@Override
//	public void run() {
//		System.out.println("By Runnable ");	
//	}

}
