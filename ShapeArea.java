class Shape
{
	//declaring the area method
	public void area()
	{
		System.out.println("shape area is caluculated");
	}
}
class Circle extends Shape
{
	double radius =0;
	double area =0; 
	
	Circle(double radius)
	{
		this.radius= radius;
	} 
	
	public void area()
	{
		
		 area = (3.14)*(radius)*(radius);
		System.out.println("Circle area is caluculated "+area);
	}
}
class Rectangle extends Shape
{
	double length =0; 
	double breadth =0;
	double area =0; 
	Rectangle(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	} 
	public void area()
	{
		
		area = (length)*(breadth);
		System.out.println("Rectangle area is caluculated "+area);
	}
	
}
class Square extends Shape
{
	double side =0; 
	double area =0;
	
	Square(double side)
	{
		this.side = side;
	} 
	public void area()
	{
		
		 area = (side)*(side);
		System.out.println("Square area is caluculated "+area);
	}
}

class ShapeArea
{
	public static void main(String[] args)
	{
		String shapeName = args[0];
		Shape shape = null;
		if(shapeName.equals("circle"))
		{
			shape = new Circle(2.13);
		}
		else if(shapeName.equals("rectangle"))
		{
			shape = new Rectangle(2.13,2.0);
		}
		else if(shapeName.equals("square"))
		{

			shape = new Square(2.4);
		}
		else
		{
			System.out.println("invalid input");
		}
		if(shape!=null)
		{
			shape.area();
		}
	}
}

