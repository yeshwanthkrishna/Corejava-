package OOPconceptsPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.test(43);
		
	}
public static void test() {
	char initial='k';
	System.out.println(initial);
}
public static void test(int i) {
	char c='k';
	System.out.println(c);
	System.out.println(i);
	
}
}
//Method overloading is to write same method name with different arguments or i/p parameters