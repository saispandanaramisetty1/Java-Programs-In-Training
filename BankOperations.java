import java.util.Scanner;
class Account
{
    int accno;
	String name;
	double balance;
	String email;
	String mobile;
	Account(int accno,String name,double balance,String email,String mobile)
	{
 		this.accno=accno;
		this.name=name;
		this.balance=balance;
		this.email=email;
		this.mobile=mobile;
	}
	void setAccount(int accno, String name, double balance,String email, String mobile)
	{
		this.accno=accno;
		this.name=name;
		this.balance=balance;
		this.email=email;
		this.mobile=mobile;
	}
	int getAccno()
	{
		return accno;
	}
	String getName()
	{
		return name;
	}
	double getBalance()
	{
		return balance;
	}
	String getEmail()
	{
		return email;
	}
	String getMobile()
	{
		return mobile;
	}
	void withdraw(double amount)
	{
		balance=balance+amount;
		System.out.println(balance);
	}
	void deposit(double amount)
	{
		balance=balance-amount;
		System.out.println(balance);
	}
	void display()
	{
		System.out.println("Acoount number is: " +accno);
		System.out.println("Acoount holder name is: " +name);
		System.out.println("Acoount balance is: " +balance);
		System.out.println("Acoount holder email id is: " +email);
		System.out.println("Acoount holder mobile number is: " +mobile);
	}
}
class Bank extends
{
	public static boolean Insert(Account account[])
	{
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number to be searched");
		int searchno=sc.nextInt();
		try
		{
			for(int i=0;i<account.length;i++)
		    {
			    if(account[i].accno==searchno)
			    {
				    System.out.println("The account number already exists. Please enter a new number");
				    searchno=sc.nextInt();
			    }
		    }
		} 
		catch(Exception e)
		{
		}
		try 
		{
			for(int i=0;i<account.length;i++)
			{
			  if(account[i]==null)
			  {
				   
				     System.out.println("Enter the account holder name");
				     String name=sc.next();
				     System.out.println("Enter the balance amount");
				     double balance=sc.nextDouble();
				     System.out.println("Enter the email id");
				     String email=sc.next();
				     System.out.println("Enter the mobile number");
				     String mobile=sc.next();
				  
				     //account object creation
				     Account myaccount=new Account(searchno,name,balance,email,mobile);

				     //storing account object ref. into array
				     account[i] = myaccount;
				     account[i].display();
				     break;
			   } 
		    }
	    }
		catch(Exception e) {}
	   
	    return flag;
	}
	public static Account[] SearchByAccno(Account account[],int accno)
	{
		
		boolean c=false;
		for(int i=0;i<account.length;i++)
		{
			if(account[i].accno==accno)
			{
				System.out.println("Account number is : " +account[i].getAccno());
				System.out.println("Account holder name is : " +account[i].getName());
				System.out.println("Account balance is : " +account[i].getBalance());
				System.out.println("Account holder mail id is :" +account[i].getEmail());
				System.out.println("Account holder mobile number is : "+account[i].getMobile());
				c=true;
				break;
			}
			else
			{
				c=false;
				
			}
		}
		if(c==false)
		{
			System.out.println("Account number doesnot exist");
		}
		return account;
	}
    public static Account[] SearchByName(Account account[], String name)
    {
    	Scanner sc=new Scanner(System.in);
    	
		boolean c=false;
		for(int i=0;i<account.length;i++)
		{
			if(account[i].name.equals(name))
			{
				System.out.println("Account number is : " +account[i].getAccno());
				System.out.println("Account holder name is : " +account[i].getName());
				System.out.println("Account balance is : " +account[i].getBalance());
				System.out.println("Account holder mail id is :" +account[i].getEmail());
				System.out.println("Account holder mobile number is : "+account[i].getMobile());
				c=true;
				break;
			}
			else
			{
				c=false;
			}
		}
		if(c==false)
		{
			System.out.println("Account holder name doesnot exist");
		}	
	return account;
    }
    public static boolean Delete(Account[] account,int accountno)
    {
    	boolean flag=false;
         int k=0;
         int j=0;
         int count=0;
   //checking for index of account number
        for(int i=0;i<15;i++) {
   //checking account having details or not
         if(account[i]==null) {
        break;
         }
         if(account[i].accno==accountno) {
         j=i;
         k=i;
         count=1;
         break;
         } 
         count=0;
         }
   //index found the deleting
         if(count==1) {
         for(int i=j;i<account.length;i++) {
         if(account[i]==null) {
         break;
         }
         account[k]=account[i+1];
         k++;
        flag=true;
         }
         }

      return flag;
    }
    public static Account[] Update(Account account[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the account number to get updated");
    	int accno=sc.nextInt();
    	try
	{
    	for(int i=0;i<account.length;i++)
    	{	
    		
    		if(account[i].accno==accno)
    		{
    			System.out.println("Enter your choice for updation");
    			System.out.println("1.name   2.email id    3. mobile number");
    			int choice=sc.nextInt();
    			double balance=account[i].balance;
    		    String email=account[i].email;
    		    String mobile=account[i].mobile;
    		    String name=account[i].name;
    			switch(choice)
    			{
    			case 1:
    				System.out.println("The account holder name is" +account[i].name);
    				System.out.println("Enter the modified name");
    			    String name1=sc.next();
    				System.out.println("The modified name is :"+name1);
    				account[i]=new Account(accno,name1,balance,email,mobile);
    				break;
    				
    			case 2:
    				System.out.println("The account holder mail id is" +account[i].email);
    				System.out.println("Enter the modified mail id");
    				String email1=sc.next();
    				System.out.println("The modified mail id is :" + email1);
    				account[i]=new Account(accno,name,balance,email1,mobile);
    				break;
    			
    			case 3:
    				System.out.println("The account holder mobile number is" +account[i].mobile);
    				System.out.println("Enter the modified mobile number");
    				String mobile1=sc.next();
    				System.out.println("The modified name is :" + mobile1);
    				account[i]=new Account(accno,name,balance,email,mobile1);
    				break;
    			
    			default:
    				System.out.println("Enter the valid number");
    		
    			}
    			

    		     //storing account object ref. into array
    		     
    			account[i].display();
        		
    		     break;
    			
    		}
		else
		{
		System.out.println("acount not found ");
		break;
		}
    	}
	
		
	
	}
    	catch(Exception e) {}
    	return account;
    	}
	
 
  }
class BankOperations
{
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		Account[] account=new Account[50];
		
		account[0] = new Account(101,"sai",1000.0,"sairamisetty@gmail.com","9133422398");
		account[1] = new Account(102,"spandu",2000.0,"ramisetty@gmail.com","7382795115");
		account[2] = new Account(103,"vamsi",3000.0,"saispandana@gmail.com","1234567890");
		account[3] = new Account(104,"lakshmi",4000.0,"tejaswi@gmail.com","7675862570");
		account[4] = new Account(105,"srinivas",5000.0,"jyothi@gmail.com","3456268177");
		account[5] = new Account(106,"alekhya",6000.0,"chandana@gmail.com","2356578776");
		account[6] = new Account(107,"siddu",7000.0,"jahnavi@gmail.com","2345677890");
		account[7] = new Account(108,"madhavi",8000.0,"vamsi@gmail.com","9985927215");
		account[8] = new Account(109,"radha",9000.0,"spandanaramisetty@gmail.com","7893300632");
		account[9] = new Account(110,"ajay",10000.0,"bujji@gmail.com","9490634757");
		
		System.out.println("Enter your choice");
		System.out.println("1. InsertAccount   2.SearchBynuber    3.SearchByName   4.DeleteAccount    5.UpdateAccount");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				boolean flag=b.Insert(account);
				if(flag==true)
				{
					System.out.println("Account has been inserted");
					
				}
				else
				{
					System.out.println("Account is not inserted");
				}
				break;
			case 2:
				System.out.println("Enter the account number to be searched");
				int accno=sc.nextInt();
				Account[] account1=b.SearchByAccno(account,accno);
				
				
				break;
			case 3:
				System.out.println("Enter the account holder name to be searched");
				String name=sc.next();
				Account[] account2=b.SearchByName(account,name);
				break;
			case 4:
				System.out.println("enter account number to be deleted:");
			     int accountno1=sc.nextInt();
			boolean flag1=b.Delete(account,accountno1);
			if(flag1) {
			        System.out.println(" account is deleted :");
			//searching if account array is having null values
			        for(int i=0;i<account.length;i++) {
			if(account[i]==null) {
			break;
			        }
			//displaying account details after insertion
			account[i].display();
			}
			        }
			else {
			        System.out.println("no account found to delete :");
			        }
				break;
			case 5:
				b.Update(account);
				break;
			default:
				System.out.println("Please enter a valid number");
		}

		
	}

	
	

	
}


