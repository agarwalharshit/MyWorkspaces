package multithreading;

public class Thread1 implements Runnable{
	Table t = new Table();
	public void run(){
		t.print(Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
