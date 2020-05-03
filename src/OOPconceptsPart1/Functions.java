
package OOPconceptsPart1;

public class Functions {

	public static void main(String[] args) {
		//how to call static method 
		sum(); //1. By direct calling with function name
		//2. Calling by class name
		Functions.sum();
		
		// Q.how to call non static methods
		// A. by using class name with obj as reference
		Functions obj=new Functions();
	int z=obj.pqr();
	System.out.println(z);
	char K=obj.test();
	System.out.println(K);
	}
// non static methods
//void- if u write void it does not return any value
// in non static methods the main function will not be there
	public int pqr() //non static method
	{
		System.out.println("PQR method");
		int a=1;
		int b=2;
		int c=a+b;
		return c;
		
	}
	public char test()
	{
		System.out.println("testing");
		return 'K';
	}

	public static void sum()  //static method
	{System.out.println("sum method");
	
	}
}
