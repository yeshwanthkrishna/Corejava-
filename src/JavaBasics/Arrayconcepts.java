package JavaBasics;

public class Arrayconcepts {

	public static void main(String[] args) {
		int i[]= new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[1]);
		System.out.println(i[3]);
		//System.out.println(i[4]);ArrayIndexOutOfBoundsException
		System.out.println(i.length);//size or length of array
		//to print all the values of array; use for loop
		for(int j=0;j<i.length;j++)
		{System.out.println(i[j]);}
		
		double d[]=new double[3];
		d[0]=43.43;
		d[1]=1.1;
		d[2]=2;
		System.out.println(d[2]);
		
		char c[]=new char[2];
		c[0]='k';
		c[1]='y';
		System.out.println(c[0]);
		
		String s[]=new String[2];
		s[0]="kittu";
		s[1]="Yeshwanth";
		System.out.println(s[1]);
		
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		System.out.println(b[1]);
		
		//object array
		Object ob[]=new Object[6];
		ob[0]=3;
		ob[1]='k';
		ob[2]="kittu";
		ob[3]=43.43;
		ob[4]=false;
		ob[5]=43;
		System.out.println(ob[3]);
		System.out.println(ob[4]);
		
			
		
	}

}
