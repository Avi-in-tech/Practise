package package1;

public class Constructors {
	
	public Constructors() {
		this(1,2,3);
		System.out.println("default constructor");
	}
	
	public Constructors(int a ) {
		this();
		System.out.println("one parameterised constructor");
	}
	
	public Constructors(int a,int b ) {
		this(1,2,3,4);
		System.out.println("Two parameterised constructor");
	}
	
	public Constructors(int a, int b , int c  ) {
		System.out.println("Three parameterised constructor");
	}
	
	public Constructors(int a, int b , int c , int d  ) {
		this(1);
		System.out.println("Four parameterised constructor");
	}
	

	public static void main(String[] args) {
		
		//Constructors ob1 = new Constructors(int e,int f ); // wrong
		Constructors ob1 = new Constructors(1,2); // correct
				

	}

}
