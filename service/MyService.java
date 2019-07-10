package cap.service;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

import cap.bean.MyBean;
import cap.dao.MyDao;

public class MyService {
	MyDao daoobj=new MyDao();
	Scanner sc = new Scanner(System.in);
	public void CreateAccount()
	{
     	System.out.print("Enter Name: ");
	    String name=namecheck(sc.next());
	    System.out.print("Enter Mobile No.: ");
		long mobileNo =numbercheck(sc.nextLong());
		Random r=new Random();
		long accNo=r.nextInt(1000000);
		System.out.print("Enter Balance: "); 
		float balance =amountcheck(sc.nextFloat());
		MyBean createobj=new MyBean(accNo, name, mobileNo, balance);
		System.out.println("Welcome "+name+", Your Account created with Account Number: " +accNo);
		daoobj.addAccount(createobj);
	}
	public void showBalance() {
		System.out.print("Enter Account Number: ");
		long accNo = sc.nextLong();
		MyBean showobj = new MyBean(accNo);
		if(daoobj.hm().isEmpty())
		{
			System.out.println("You don't have account, Create a account first");
		}
		else
		{
			long a1=showobj.getAccNo();
			if(daoobj.hm().containsKey(a1))
			{
				System.out.println("Hello "+daoobj.hm().get(a1).getName()+" Your account balance is: "+daoobj.hm().get(a1).getBalance());
				
			}
			else {
				System.out.println("Account does not Exist.");
			}
			
		}
	}
	public void deposit() {
		System.out.print("Enter Account Number: ");
		long accNo = sc.nextLong();
		System.out.print("Enter Deposit Amount: ");
		float Amount =amountcheck(sc.nextFloat());
		MyBean  depobj= new MyBean(accNo, Amount);
		if(daoobj.hm().isEmpty())
		{
			System.out.println("You don't have account, Create a account first");
		}
		else
		{
			long a1=depobj.getAccNo();
			if(daoobj.hm().containsKey(a1))
			{
				float amt1=daoobj.hm().get(a1).getBalance();
				float amt2=depobj.getAmount();
				float amt=amt1+amt2;
				daoobj.hm().get(a1).setBalance(amt);
				System.out.println("Deposited successfully.");
				System.out.println("Your account balance is: " +daoobj.hm().get(a1).getBalance());					// PRINTING THE BANK BALANCE
			}
			else
			{
				System.out.println("No such account");
			}
		}
    }
	public void withdraw() {
		System.out.print("Enter Account Number: ");
		long accNo = sc.nextLong();
		System.out.print("Enter Withdraw Amount: ");
		float Amount=amountcheck(sc.nextFloat());
		MyBean  withobj= new MyBean(Amount,accNo);
		if(daoobj.hm().isEmpty())
		{
			System.out.println("You don't have account, Create a account first");
		}
		else
		{
			long a1=withobj.getAccNo();
			if(daoobj.hm().containsKey(a1))
			{
				float amt1=daoobj.hm().get(a1).getBalance();
				float amt2=withobj.getAmount();
				if(amt2>amt1)
				{
					System.out.println("Can't withdraw money, Insufficient balance");
				}
				else {
				float amount=amt1-amt2;
				daoobj.hm().get(a1).setBalance(amount);
				System.out.println("Withdraw successful.");
				System.out.println("Your account balance is: " +daoobj.hm().get(a1).getBalance());	
				}
				
			}
			else {
				System.out.println("No such Account Exist.");
			}
		}
	}
	public void fundTransfer() {
		System.out.println("Enter Source Account Number: ");
		long accNo1 = sc.nextLong();
		System.out.println("Enter Destination Account Number: ");
		long accNo2 = sc.nextLong();
		System.out.println("Enter Amount to transfer: ");
		float Amount1 =amountcheck(sc.nextFloat());
		MyBean fundobj = new MyBean(accNo1,accNo2,Amount1);
		//String transactions = (transAmount+ " transferred from Account number " +Sourceaccno+ " to " +Destaccno);
	    
		if(daoobj.hm().isEmpty())
		{
			System.out.println("Please create an account first.");
		}
		else
		{
			long a1=fundobj.getAccNo1();
		    long a2=fundobj.getAccNo2();
		    if(daoobj.hm().containsKey(a1))
		    {
		    	if(daoobj.hm().containsKey(a2))
		    	{
		    		float amt1=fundobj.getAmount();
		    		float amt2=daoobj.hm().get(a1).getBalance();
		    		if(amt1>amt2)
		    		{
		    			System.out.println("Can't transfer money, Insufficient balance");
		    		}
		    		else {
		    			float amount=amt2-amt1;
		    			daoobj.hm().get(a1).setBalance(amount);
		    			float amt3=amt1+amt2;
		    			daoobj.hm().get(a2).setBalance(amt3);
		    			System.out.println("Amount transfered sucessfully");
		    			System.out.println("Rupees "+amt1+" was transferred from your account, Remaining balance is: "+daoobj.hm().get(a1).getBalance());
		    		}
		    	}
		    	else
		    	{
		    		System.out.println("No such destination account Exist");
		    	}
		    }
		    else
		    {
		    	System.out.println("No such source account Exist");
		    }
		}
	
	    
	}

	public void printTransactions() 
	{
       	 System.out.println();
	}
	
	//checking amount
	public float amountcheck(float amount)
	{
		while(true)
		{
		if(amount<100)
		{
			System.out.println("Amount should not be less than 100");
			System.out.println("Enter amount again");
			amount=sc.nextFloat();
		}
		else
		{
			return amount;
		}
		
	}
	}
	//checking phno
		public long numbercheck (long number)
		{while(true)
		{
			if(String.valueOf(number).length()>10 || String.valueOf(number).length()<10 ) 
			{
				System.out.println("Enter valid mobile number");
				number=sc.nextLong();
			}
			else
			{
				return number;
			}
		
		}}
    //Checking name
		public String namecheck (String name)
		{
			while(true)
			{
				if(Pattern.matches(("([A-Z])*([a-z])*"),name))
						{
					    return name;
						}
				else
				{
					System.out.println("Name should have only alphabets");
					System.out.println("Enter your name again");
					name=sc.next();
				}
			}
		}
		
		
		
}

