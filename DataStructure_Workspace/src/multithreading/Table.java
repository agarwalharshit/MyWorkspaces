package multithreading;

public class Table {
	
	 void print(String name){
		for(int i=0; i<5;i++){
			System.out.println(name+" " + i);
	
		}
		
		//synchronized (name) {
//			for(int j=0; j<5;j++){
//				System.out.println(name+"In Synchronised Block " + j);
//			}
	//	}
		
		
	}
	
	
	

	 public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
