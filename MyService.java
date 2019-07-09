package cap.service;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import cap.bean.MyBean;
import cap.dao.MyDao;

public class MyService {
	MyDao daoobj=new MyDao();
	Scanner sc = new Scanner(System.in);
	public void CreateAccount()
	{
		System.out.print("Enter Name: ");
	    String name=sc.next();
	    System.out.print("Enter Mobile No.: ");
		long mobileNo =sc.nextLong();
		Random r=new Random();
		long accNo=r.nextInt(1000000);
		System.out.print("Enter Balance: "); 
		float balance =sc.nextFloat();
		MyBean createobj=new MyBean(accNo, name, mobileNo, balance);
		System.out.println("Account created with Account Number: " +accNo);
	}
	public void showBalance() {
		System.out.print("Enter Account Number: ");
		long accNo = sc.nextLong();
		MyBean showobj = new MyBean(accNo);
	}
	public void deposit() {
		System.out.print("Enter Account Number: ");
		long accNo = sc.nextLong();
		System.out.print("Enter Deposit Amount: ");
		int depositeAmount = sc.nextInt();
		MyBean  depobj= new MyBean(accNo, depositeAmount);

    }
	public void withdraw() {
		System.out.print("Enter Account Number: ");
		long accNo = sc.nextLong();
		System.out.print("Enter Withdraw Amount: ");
		int withdrawAmount=sc.nextInt();
		MyBean  withobj= new MyBean(accNo, withdrawAmount);
	}
	public void fundTransfer() {
		System.out.println("Enter Source Account Number: ");
		long sourceAccNo = sc.nextLong();
		System.out.println("Enter Destination Account Number: ");
		long DestAccNo = sc.nextLong();
		System.out.println("Enter Amount to transfer: ");
		int transAmount =sc.nextInt();
		MyBean fundobj = new MyBean(sourceAccNo, DestAccNo, transAmount);
		String transactions = transferAmount+ " transferred from Account number " +sourceAccNo+ " to " +destAccNo;
	    fundobj = new MyBean(transactions);
	    
	}

	public void printTransactions() {
		 System.out.println(Arrays.toString(MyBean.transactions));
	}
	
}
