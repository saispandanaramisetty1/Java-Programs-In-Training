import java.util.Scanner;
class Account
{

	int accno;
	String name;
	double balance;
	String emailId;
	String mobileNumber;

   	Account(int acno,String acname,double acbal,String email,String mobile)
	 {

    		accno = acno;
    		name = acname;
    		balance=acbal;
		emailId = email;
		mobileNumber = mobile;
 	 }
	void getNumber()
	{
		System.out.println("name of the account is :"+accno);
	}

	void getName()
	{
		System.out.println("name of the account is :"+name);
	}
	void getBalance()
	{
		System.out.println("balance of the account is :"+balance);
	}
	void display()
	{
		System.out.println("name of the account is :"+accno);
		System.out.println("name of the account is :"+name);
		System.out.println("balance of the account is :"+balance);
		
	}

}

class BankAccount
{

  public static void main(String[] args) 
{

  Scanner sc=new Scanner(System.in);
  

  //Account array object creation

   Account[] myaccounts = new Account[15];

   
	
    
	//storing account object ref. into array
     	myaccounts[0] = new Account(101,"sai",1000.0,"sairamisetty@gmail.com","9133422398");
	myaccounts[1] = new Account(102,"spandu",2000.0,"ramisetty@gmail.com","7382795115");
	myaccounts[2] = new Account(103,"vamsi",3000.0,"saispandana@gmail.com","1234567890");
	myaccounts[3] = new Account(104,"lakshmi",4000.0,"tejaswi@gmail.com","7675862570");
	myaccounts[4] = new Account(105,"srinivas",5000.0,"jyothi@gmail.com","3456268177");
	myaccounts[5] = new Account(106,"alekhya",6000.0,"chandana@gmail.com","2356578776");
	myaccounts[6] = new Account(107,"siddu",7000.0,"jahnavi@gmail.com","2345677890");
	myaccounts[7] = new Account(108,"madhavi",8000.0,"vamsi@gmail.com","9985927215");
	myaccounts[8] = new Account(109,"radha",9000.0,"spandanaramisetty@gmail.com","7893300632");
	myaccounts[9] = new Account(110,"ajay",10000.0,"bujji@gmail.com","9490634757");
	System.out.println("enter your choice as 1 for search by account number or choice as 2 for search by account name");
	int choice = sc.nextInt();
	switch(choice)
	{
		case 1:	System.out.println("enter account number to be searched ");
     			int accountno=sc.nextInt();
			 searchByAccountNumber(accountno,myaccounts);
			break;
		case 2:	System.out.println("enter account name to be searched ");
     			String accountname=sc.next();
			searchByAccountName(accountname,myaccounts);
			break;
		case 3:	System.out.println("enter account number to be deleted ");
     			int accountnumber=sc.nextInt();
			boolean flag = deleteAccount(accountnumber,myaccounts);
			if(flag==true)
			{
				System.out.println("account is deleted ");
			}
			else
			{
				System.out.println("account is not deleted ");
			}
			break;
		case 4:	System.out.println("enter account details you want to insert ");
     			
			boolean chance = insertAccount(myaccounts);
			if(chance==false)
			{
				
				System.out.println("account is inserted ");
			}
			else
			{
				System.out.println("account is not inserted ");
			}
			break;
		case 5:	System.out.println("enter account number you want to update ");
     			int accountNumber=sc.nextInt();
			updateAccount(accountNumber,myaccounts);
			break;
	}
	
		
		
  
	
   
     
    }
	static Account searchByAccountNumber(int accno,Account[] myaccount)
	{

     		boolean flag=true;
	 	for(int i=0;i<myaccount.length;i++) 
		{
			try
			{
		
				if(accno==myaccount[i].accno)
		 		{
					System.out.println("account name :"+accno);
					myaccount[i].getName();
					myaccount[i].getBalance();
					flag=false;
				}
			}
			catch(NullPointerException e)
			{
				break;
			}
   		 }
		if(flag) 
		{
			System.out.println("account you searched is not exist ");
		}
		return myaccount[0];
	}
	static Account[] searchByAccountName(String accname,Account[] myaccount)
	{
		
		
     		boolean flag=true;
	 	for(int i=0;i<myaccount.length;i++) 
		{
			try
			{
	
				if(accname.equals(myaccount[i].name))
		 		{
					System.out.println("account name :"+accname);
					myaccount[i].getNumber();
					myaccount[i].getBalance();
					flag=false;
				}
			}
			catch(NullPointerException e)
			{
				break;
			}
   		 }
		if(flag) 
		{
			System.out.println("account you searched is not exist ");
		}
		return myaccount;
	}
	static boolean deleteAccount(int accno,Account[] myaccount)
	{
		int j = 0;
		int k = 0;
		int count = 0;
		
     		boolean flag=true;			 
	 	for(int i=0;i<myaccount.length;i++) 
		{
			
			if(myaccount[i]==null)
	 		{
				break;
			}
			
			if(accno==myaccount[i].accno)
	 		{
				
				j=i;
				k=i;
				count =1;
				break;
			}
			count =0;
		}
		
		if(count==1)
		{
			for(int i=j;i<myaccount.length;i++)
			{
				try
				{
				myaccount[k] = myaccount[i+1];
				
				
				if(myaccount[i]==null)
	 			{
					break;
				}
				myaccount[k].display();
				k++;
				}
				catch(NullPointerException e)
				{
					break;
				}
				
			
			}	
		
		}
		else if(flag) 
		{
			System.out.println("account you searched is not exist ");
		}
		return flag;

	}
	
	static boolean insertAccount( Account[] myaccount)
	{
		
		
     		boolean flag=true;
	 	for(int i=0;i<myaccount.length;i++) 
		{
			if(myaccount[i]==null)
	 		{
				myaccount[i] = new Account(201,"rsai",10000.0,"manne@gmail.com","7352817811");
				myaccount[i].display();
				flag=false;
				break;
			}
			
   		 }
		if(flag) 
		{
			System.out.println("account you searched is not exist ");
		}
		return flag;
	}
	static Account[] updateAccount(int accno, Account[] myaccount)
	{
		
		
     		boolean flag=true;
	 	for(int i=0;i<myaccount.length;i++) 
		{
			try
			{	
			if(accno==myaccount[i].accno)
	 		{
				
				myaccount[i] = new Account(201,"rsai",10000.0,"spandanaramisetty2@gmail.com","4574965698");
				
				myaccount[i].display();
				
				flag=false;
				
			}
			}
			catch(NullPointerException e)
			{
				break;
			}
			
			
   		 }
		if(flag) 
		{
			System.out.println("account you searched is not exist ");
		}
		return myaccount;
	}
	
	 
}
	
	
