package cap.ui;
import java.util.Scanner;
import cap.service.MyService;

public class MyUI {
	public static void main(String[] args) {
		
	   MyService serobj=new MyService();
		
		Scanner sc=new Scanner(System.in);
		int ch;
		char choice;
		System.out.println("*********************");
		System.out.println("1. Create Account \n 2. Show Balance \n 3. Deposit \n 4. Withdraw \n 5. Fund Transfer \n 6. Print Transactions \n 7. Exit");
		System.out.println("*********************");
		do {
			System.out.println("enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				serobj.CreateAccount();
				break;
			case 2:
				serobj.showBalance();
				break;
			case 3:
				serobj.deposit();
				break;
			case 4:
				serobj.withdraw();
				break;
			case 5:
				serobj.fundTransfer();
				break;
			 case 6:
				 serobj.printTransactions();
				break;
			case 7:
				
				System.out.print("Do you want to Exit (yes or no)...? : ");
				choice = sc.next().charAt(0);
				if(choice == 'y' || choice=='Y')
				{
					System.out.println("Thank You...!");
				System.exit(0);
				}
					
				else {
					continue;
				     }
			}
			System.out.print("Do you want to continue (yes or no)...? : ");
			choice = sc.next().charAt(0);
			if(choice == 'y' || choice=='Y')
				continue;
			else {
				System.out.println("Thank You...!");
				System.exit(0);
			}
			sc.close();
		}while(ch !=7);
		
	}

}
