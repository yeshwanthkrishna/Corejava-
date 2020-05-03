package OOPConceptsPart2;

public class TestInheritance {

	public static void main(String[] args) {
		//static polymorphism
		Benz b=new Benz();
		b.start();
		b.stop();
		b.theftsafety();
		b.refuel();
		

		Car c=new Car();
		c.stop();
		c.refuel();
		//here we can't inherit theft safety from benz because benz is a child class 
		//and car is a parent class
		
		
		//top casting 
//child class object can be referred by parent class
		Car c1=new Benz();//dynamic polymorphism (OR) Run time polymorphism
		c1.start();
		c1.stop();
		
		//down casting
		Benz Z1=(Benz)new Car();
	
	}

}
