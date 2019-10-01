class A
{
	public static void eat()
	{
		System.out.println("in a class ");
	}
}
class B extends A
{
	public static void eat()
	{
		System.out.println("in b  class ");
	}
}
class Test
{
public static void main(String[] args)
{
	
	A a = new A();
	a.eat();
	A a1 = new B();
	a1.eat();
	a a
	B b = new B();
	b.eat();

}
}
