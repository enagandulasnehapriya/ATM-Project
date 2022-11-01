import java.util.*;
public class ATMMachine
{
	public static void main(String[] args)
	{
		int balance=20000,withdraw,deposite,num;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("WELCOME TO ATM MACHINE");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println("Select an option from the above mentioned list");
			num=sc.nextInt();
			switch(num)
			{
				case 1:
					System.out.println("Enter amount to be withdraw");
					withdraw=sc.nextInt();
					if(balance>=withdraw)
					{
						balance=balance-withdraw;
						System.out.println("Withdrawn Amount is : "+withdraw); 
						System.out.println("The Remaining Balance is :   "+balance);
						System.out.println("Please collect money");
					}
					else
					{
						System.out.println("YOU HAVE NO SUFFICIENT BALANCE TO WITHDRAW");
					}
					System.out.println(" ");
					break;
				case 2:
					System.out.println("Enter Amount to deposite");
					deposite=sc.nextInt();
					System.out.println("The deposited amount is : "+deposite);
					balance=balance+deposite;
					System.out.println("Balance Amount is :    "+balance);
					System.out.println("Money has been deposited successfully");
					System.out.println(" ");
					break;
				case 3:
					System.out.println("Your account balance is :  "+balance); 
					System.out.println(" ");
					break;
				case 4:
					System.exit(0);
					System.out.println(" ");
			}
		}
	}
}