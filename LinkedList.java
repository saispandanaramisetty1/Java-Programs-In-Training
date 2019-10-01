 
class LinkedList 
{ 
    Node head; 
  
    /* Node Class */
    class Node 
    { 
        int data; 
        Node next; 
           
        // Constructor to create a new node 
        Node(int d) 
	{
		data = d;
		next = null;
		size =0;
 	} 
    } 

	//method to add the node in the begining 
	public void AddInTheBegining(int new_data) 
	{ 
    		
    		Node new_node = new Node(new_data); 
  
    		
    		new_node.next = head; 
  
    		
    		head = new_node; 
		size = size+1;
	}
	//method to add the node in the ending 
	public void AddInTheEnding(int new_data) 
	{ 
   		 
   		 Node new_node = new Node(new_data); 
  
    		
    		if (head == null) 
    		{ 
        		head = new Node(new_data); 
       		  	return; 
    		} 
  
    		
    		new_node.next = null; 
  
    		
    		Node last = head;  
    		while (last.next != null) 
        	last = last.next; 
  
    		
    		last.next = new_node;
		size = size+1; 
    		return; 
	}
	//inser at the middle 
	public void insertAtMiddle(Node prev_node, int new_data) 
	{ 
    		
    		if (prev_node == null) 
    		{ 
        		System.out.println("The given previous node cannot be null"); 
        		return; 
    		} 
  
    		
    		Node new_node = new Node(new_data); 
  
    		
    		new_node.next = prev_node.next; 
  
    		
    		prev_node.next = new_node;
		size = size+1; 
	} 
	 boolean deleteNode(int position) 
    	{ 
		boolean b = true;
        	 
        	if (head == null)
		{
			System.out.println("there is no element in the list"); 
            		return false; 
		}
  
        	
        	Node temp = head; 
  
        	
        	if (position == 0) 
        	{ 
            	head = temp.next;   
            	return true; 
        	} 
  
        	
        	for (int i=0; temp!=null && i<position-1; i++) 
            	temp = temp.next; 
  
        	
        	if (temp == null || temp.next == null) 
            	return false; 
  
        	
        	Node next = temp.next.next; 
  
        	temp.next = next; 
		size = size-1; 
		return true;
    	}
 	//searching operation
	public boolean search(Node head, int x) 
    	{ 
        	Node current = head;    
        	while (current != null) 
        	{ 
            		if (current.data == x) 
                	return true;    
            		current = current.next; 
        	} 
        	return false;    
    	} 
	void deleteAtFirst() 
	{
    		deleteAtPosition(0);
    	}
    //delete at last pposition
    	void deleteAtLast() 	
	{
    		deleteAtPosition(size-1);
    	}
  
  
	//printing of the list
    	public void printList() 
    	{ 
        	Node tnode = head; 
        	while (tnode != null) 
        	{ 
            	System.out.print(tnode.data+" "); 
            	tnode = tnode.next; 
        	} 
    	} 
	public static void main(String[] args) 
    	{ 
        	/* Start with the empty list */
        	LinkedList llist = new LinkedList(); 
  
        	
        	llist.AddInTheEnding(6); 
  
        	
        	llist.AddInTheBegining(7); 
  
        	
        	llist.AddInTheBegining(1); 
  
        	
        	llist.AddInTheEnding(4); 
  
  		boolean b = llist.deleteNode(3); 
		if(b==false)
		{
			System.out.println("the position is not  found");
		}
		else
		{
			System.out.println("the element is deleted");
		}
		boolean b2 = llist.search(llist.head, 7);
		if(b2==false)
		{
			System.out.println("the element is not found");
		}
		else
		{
			System.out.println("the element is found");
		}
		 llist.insertAtMiddle(llist.head.next, 8);

        	System.out.println("\nCreated Linked list is: "); 
        	llist.printList(); 
    } 

} 