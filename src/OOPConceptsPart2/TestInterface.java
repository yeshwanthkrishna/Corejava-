package OOPConceptsPart2;

public class TestInterface {

	public static void main(String[] args) {
		NBCBank RBC=new NBCBank();
		RBC.Mortgagepayments();
		RBC.credit();
		RBC.debit();
		RBC.homeloan();
		RBC.montetaryfund();
		
		//dynamic polymorphism
		//child class object can be referred by parent interface reference
		CanadaBank xy=new NBCBank();
		//we cannot call this statement xy.homeloan(); because it is in child class
		xy.debit();
		xy.debit();
		xy.transfermoney();
		
		

	}

}
