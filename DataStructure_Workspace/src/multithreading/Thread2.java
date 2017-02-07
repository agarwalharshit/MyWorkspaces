package multithreading;

public class Thread2 {
	Table t = new Table();
	public void run(){
		
		t.print(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
