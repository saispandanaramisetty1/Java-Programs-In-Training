class Author
{
	
	String name;
	String email;
	char gender;

	
	 Author(String name,String email,char gender)
	{
		this.name = name;;
		this.email = email;
		this.gender = gender;
		
	}
	 String getName()
	{
		return name;
	}
	 String getEmail()
	{
		return email;
	}
	 char getGender()
	{
		return gender;
	}
}
	
class Book
{
	
	String name;
	Author author;
	double price;
	int qtyInStock;
	 void setPrice(double price)
	{
		this.price = price;
	}
	 void setQtyInStock(int qtyInStock)
	{
		this.qtyInStock = qtyInStock;
	}
	public  String getName()
	{
		return name;
	}
	 Author getAuthor()
	{
		return author;
	}
	 double getPrice()
	{
		return price;
	}
	 int getQtyInStock()
	{
		return qtyInStock;
	}
	 Book(String name,Author author,double price,int qtyInStock)
	{
		this.name = name;;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
}
class BookAuthor
{
	public static void main(String[] args)
	{
		//creating object of author class
		Author author = new Author("sai","saispandanaramisetty@gmail.com",'f');
		
		//creating the object of book class
		Book book = new Book("java complete reference",author,23.0,10);
		
		//displaying the book deatails
		System.out.println("the book name is "+book.getName());
		System.out.println("the book price is "+book.getPrice());
		System.out.println("the book qtyInsStock is "+book.getQtyInStock());

		//displaying the author details
		System.out.println("the author name is "+book.getAuthor.getName());
		System.out.println("the author email id is "+book.getAuthor.getEmail());
		System.out.println("the author gender is "+book.getAuthor.getGender());
	}
}

