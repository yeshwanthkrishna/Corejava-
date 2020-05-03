package OOPConceptsPart2;

//if a class is implementing any interface then it should override all the
//methods of interface
public class NBCBank implements CanadaBank,CentralBank {//multiple inheritance
	//Is-a relationship
	public void credit() {
		System.out.println("NBC credit card");
	}
	public void debit() {
		System.out.println("NBC Debit card");
	}
	public void transfermoney() {
		System.out.println("transfer money from NBC to RBC");
	}
	public void homeloan() {
		System.out.println("Less interest rates at NBC");
	}
	public void Mortgagepayments()
{
		System.out.println("NO Mortgage payments");}
	public void montetaryfund() {
		System.out.println("INT'L monetary fund");
	}
}
