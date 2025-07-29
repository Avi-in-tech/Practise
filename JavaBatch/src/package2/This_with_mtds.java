package package2;

public class This_with_mtds {
	
	public void mtd() {
		this.mtd(1,2);
		System.out.println("This is default mtd");
		this.mtd(1,2,3,4);
		this.mtd(1);
		this.mtd(1,2,3);
	}
		
	public void mtd(int a ) {
		System.out.println("This is one paramntrsied mtd");
		
	}
	public void mtd(int a , int b ) {
		System.out.println("This is two paramntrsied mtd");
		
	}
	public void mtd(int a , int b ,int c) {
		System.out.println("This is three paramntrsied mtd");
		
	}
	public void mtd(int a , int b ,int c , int d ) {
		System.out.println("This is four paramntrsied mtd");
		
	}	

	public static void main(String[] args) {
		
		This_with_mtds ob = new This_with_mtds();
		ob.mtd();

	}

}
