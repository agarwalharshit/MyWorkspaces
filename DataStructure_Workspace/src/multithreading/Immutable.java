package multithreading;

public final class Immutable {
	 String s="";
	Immutable(){
		System.out.println();
	}
	Immutable(String s){
		this.s=s;
	}
	
	public void getStr(){
		System.out.println("getStr");
	}
	static{
		System.out.println("Hiii");
		new Immutable().getStr();
	}
	
	public static void main(String[] args) {

		System.out.println("Byyy");
		//Immutable i = Immutable.newInstance();
	}

}
