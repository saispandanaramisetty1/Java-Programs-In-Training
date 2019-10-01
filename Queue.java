
import java.util.Scanner;
class Queue
{
	static int i,front,rear,element,max=5,ch;
	static int array[]=new int[5];
	//calling the constructor for initialization
	Queue()
	{
		front=-1;
		rear=-1;
	}
    	//main method
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		while(true)
		{
			try
			{
				System.out.println("Select Option 1.insert 2.delete 3.display 4.exit ");
				ch = scn.nextInt();
                
            		}
            		catch(Exception e)
            		{  
				System.out.println("the choice should be integer");
	    		}
	    		if(ch==4)
	    		{
				System.out.println("we are quitting");
				break;
	    		}
            		else
	    		{
            			switch(ch)
             			{
                			case 1:insert(scn);
                    				break;
                			case 2:delete();
                       				break;
                			case 3: display();
                         			break;
					default:System.out.println("invalid choice");
              			}
	    		}
          	}
    	}
	//calling the insert method
	static void insert(Scanner scn)
        {
		if(rear>=max)
		{
			System.out.println("Queue is Full");

		}
          	else
          	{
			try
              		{
                
                		System.out.println("Enter the Element ");
				element = scn.nextInt();
                
              		}
            		catch(Exception e)
            		{
				System.out.println(" the element should be an integer ");
	    		}
            		rear=rear+1;
            		array[rear]=element;
        	}
      	}
	//calling the delete method
	static void delete()
	{
        	if(front==-1)
        	{
            		System.out.println("Queue is Empty");
        	}
        	else
        	{
            		front=front+1;
            		element=array[front];
            		System.out.println("Deleted element is : "+element);
        	}
    	}
	//calling the display method to print the queue
	static void display()
    	{
        	System.out.println("Elements in the Queue are:");
        	for(int i=front+1; i<=rear; i++)
        	{
            		System.out.println(array[i]);
        	}
   	}
}