package OOPconceptsPart1;

public class Wrapperclassconcept {

	public static void main(String[] args) {
		String x="100";
		System.out.println(x+10);
		
		//data conversion string to integer
		int i=Integer.parseInt(x);
		System.out.println(i+10);

		//data conversion string to boolean
		String A="Krishna";
		boolean b=Boolean.parseBoolean(A);
		System.out.println(b);
		//data conversion char to double
		String c="43.43";
		double d=Double.parseDouble(c);
		System.out.println(d);
		//int to string
		int C=10;
		String V=String.valueOf(C);
		System.out.println(V+43);
		
		
		
		
	}

}
