package Package1;

public class TypeConvrse {
	
	
	public static void main(String[] args) {
		
		int i =12;
		float f ;
		f= i;
		System.out.println("Value of f "+f);   // implicit 
		System.out.println("Value of i "+i);
		
		Double a = 13.4;  // we hv to put F as java bydefault treat decimal number as double. 
		float b = 14.5F;  // like this.
		
		//int c = a;  // int cant save double 
		//int d = b ; // int cant save float
		
	//	int e = (int) a;  // not able to explicit type cast from double to int
		int e = (int) Math.round(a);  // you have to use Math.round or Math.floor().
		 //This method rounds the double to the nearest whole number before converting it to an int
		int g= (int) b; // explicit type convrsion
		
		System.out.println("Value of e "+e);   // implicit 
		System.out.println("Value of g "+g);
				 
		
		
		
		
	}

}
