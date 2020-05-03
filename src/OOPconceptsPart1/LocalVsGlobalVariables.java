package OOPconceptsPart1;

public class LocalVsGlobalVariables {
// these are global variables---global variables are written at the class 
	char initial='k';
boolean okay=true;
	public static void main(String[] args) {
		char lastname='k'; //this is local variable for main method
		System.out.println(lastname);
		//Q: how to access global variables in the main function??
		//A: by using the obj as reference with the class name
		
		LocalVsGlobalVariables obj=new LocalVsGlobalVariables();
		System.out.println(obj.initial);
		System.out.println(obj.okay);
		
	}

}
