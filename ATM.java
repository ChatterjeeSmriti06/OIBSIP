import java.util.*;  
class ATM
{  
    public static void main(String args[] )  
    { 
        int balance = 40000; 
        System.out.println(" WELCOME TO XYZ BANK"); 
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the Account User Id: ");
        String UserId = sc.nextLine();
        String TranferAccount;
        int userpin= 5678;
        System.out.println("Enter your pin number: ");
        int pin=sc.nextInt();
        
        if(pin==userpin)
        { 
            while(true)  
            {  
                System.out.println(""); 
                System.out.println("Account Holder Name: "+UserId); 
                System.out.println("Press\n1. To Withdraw \n2. To Deposit \n3. To Transfer \n4. To Quit");  
                System.out.print("Choose the operation you want to perform: "); 
                int ch = sc.nextInt();  
                System.out.println("");
                switch(ch)  
                {  
                    case 1:  
                        System.out.print("Enter money to be withdrawn: ");  
                        int withdrawamt = sc.nextInt();  
                        if(balance >= withdrawamt)  
                        {  
                            balance = balance - withdrawamt;  
                            System.out.println("Please collect your money");
                            System.out.println("Your Balance is " +balance);  
                        }   
                        else  
                        {  
                            System.out.println("Insufficient Balance");  
                        }  
                        System.out.println("");  
                        break;  
   
                    case 2:  
                        System.out.print("Enter money to be deposited: ");  
                        int depositamt = sc.nextInt();  
                        System.out.println("Your Money has been successfully deposited");
                        balance = balance + depositamt;    
                        System.out.println("Your Balance is " +balance);
                        System.out.println("");  
                         break;  
   
                        case 3:
                        System.out.print("Enter the amount to transfer: ");
                        int TranferAmt = sc.nextInt();
                        balance=balance-TranferAmt;
                        System.out.println("Transfer is done Successfully ");
                        System.out.println("Available balance: "+balance);
                        break;
   
                        case 4: 
                        System.exit(0);  
                 }  
            }
        } else
          {
            System.out.println("Wrong pin Number!! ");
            System.exit(0);
        }
         
                    
    }  
}