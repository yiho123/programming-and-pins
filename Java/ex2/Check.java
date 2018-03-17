
public class Check {

	private String Payee;
	private static int Checknum = 1001;
	private int Amount;
	private MyDate Date;
	
	
	public Check(String name, int amt, MyDate date) {
		
		
		Payee = name;
		Amount = amt;
		Date = date;
		Checknum++;
		
		
		
	}
	
	
	public String getPayee () {
		return Payee;
	}
	
	public int getChecknum () {
		return Checknum;
	} 
	
	public int getAmount () {
		return Amount;
	}
	
	public MyDate getDate () {
		return Date;
	}
	
	
	
}
