package OOPconceptsPart1;

public class Callbyvalueandcallbyreference {
String m;
String n;
	public static void main(String[] args) {
		Callbyvalueandcallbyreference obj=new Callbyvalueandcallbyreference();
		int x=3;
		int y=4;
		obj.sum(x, y);//call by value or pass by value
		
		obj.m="Kittu";
		obj.n="Krishna";
		obj.swap(obj);
		System.out.println(obj.m);
		System.out.println(obj.n);
		
		

	}
public int sum(int a, int b) {
	a=5;
	b=6;
	int c=a+b;
	return c;
	}

public void swap(Callbyvalueandcallbyreference y) {
	String hello;
	hello=y.m;
	y.m=y.n;
	y.n=hello;
	
}
}
