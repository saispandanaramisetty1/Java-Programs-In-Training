class Fruit
{
	String name = "lemon";
	String taste = " sour";
	String size = "small";
	
	void eat()
	{
		System.out.println("the fruit name is "+name);
		System.out.println("the taste of the fruit is "+taste);
		System.out.println("the size of the fruit is "+size);
	}
}
class Apple extends Fruit
{
	String name = "apple";
	String taste = " sweet";
	String size = "small";
	void eat()
	{
		System.out.println("the fruit name is "+name);
		System.out.println("the taste of the fruit is "+taste);
		System.out.println("the size of the fruit is "+size);
	}
	 
}
class Orange extends Fruit
{
	String name = "orange";
	String taste = " sweet";
	String size = "small";
	void eat()
	{
		System.out.println("the fruit name is "+name);
		System.out.println("the taste of the fruit is "+taste);
		System.out.println("the size of the fruit is "+size);
	}
}
class FruitsStore
{
	public static void main(String[] args)
	{
		Apple a = new Apple();
		a.eat(); 
		Orange o = new Orange();
		o.eat(); 
	}
}
