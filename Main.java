
//This is the client class.

public class Main {
	
	
	public static void main(String args[]) 
	{
		  
		CreditCard targetInterface=new BankCustomer();
		
	    targetInterface.giveBankDetails();
		
		System.out.print(targetInterface.getCreditCard());
		
		
	}

}
