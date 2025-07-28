package Package1;

public class This_with_methods {
	
	public void mtd() {
		this.mtd2();
		System.out.println("This is default mtd");
		this.mtd4();
		this.mtd1();
		this.mtd3();
	}
		
	public void mtd1() {
		System.out.println("This is one paramntrsied mtd");
		
	}
	public void mtd2() {
		System.out.println("This is two paramntrsied mtd");
		
	}
	public void mtd3() {
		System.out.println("This is three paramntrsied mtd");
		
	}
	public void mtd4() {
		System.out.println("This is four paramntrsied mtd");
		
	}	

	public static void main(String[] args) {
		
		This_with_methods ob = new This_with_methods();
		ob.mtd();

	}

}
