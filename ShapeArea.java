import java.util.Scanner;
abstract class Shape {
    abstract public double area();
    abstract public double volume();

}
interface Spatial {

}

class Cube extends Shape implements Spatial
{
    double side;
    Cube(double side){
        this.side=side;
    }
    public double area()
    {
        double area=side*side;
        return area;
    }
    public double volume()
    {
        double volume=side*side*side;
        return volume;
    }
}

class Sphere extends Shape implements Spatial{
    double radius;
    Sphere(double radius){
        this.radius=radius;
    }
    public double area()
    {
        double area=(Math.PI)*radius*radius;
        return area;
    }
    public double volume()
    {
        double volume=(4/3)*(Math.PI)*radius*radius*radius;
        return volume;
    }
}

class Rectangle extends Shape{
    double length, breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double area()
    {
        double area=length*breadth;
        return area;
    }
    public double volume()
    {
        return -1.0;
    }
}
class Triangle extends Shape
{
    double base, height;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    public double area()
    {
        double area=(0.5)*base*height;
        return area;
    }
    public double volume()
    {
        return -1.0;
    }
}

public class ShapeArea {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shape[] arrObjects=new Shape[5];
        String[] shapes={"cube","sphere","rectangle","triangle"};
        Shape s;
        for(int i=0;i<4;i++)
        {


            if(shapes[i].equals("cube"))
            {
                System.out.println("Enter the side of the cube");
                double side=sc.nextDouble();
                s=new Cube(side);
                arrObjects[i]=s;

            }
            else if(shapes[i].equals("sphere"))
            {
                System.out.println("Enter the radius of the sphere");
                double radius=sc.nextDouble();
                s=new Sphere(radius);
                arrObjects[i]=s;

            }
            else if(shapes[i].equals("rectangle"))
            {
                System.out.println("Enter the length of the rectangle");
                double length=sc.nextDouble();
                System.out.println("Enter the breadarrObjects[i]th of the rectangle");
                double breadth=sc.nextDouble();
                s=new Rectangle(length,breadth);
                arrObjects[i]=s;

            }
            else if(shapes[i].equals("triangle"))
            {
                System.out.println("Enter the base of the triangle");
                double base=sc.nextDouble();
                System.out.println("Enter the height of the triangle");
                double height=sc.nextDouble();
                s=new Triangle(base,height);
                arrObjects[i]=s;

            }
        }
        for(int i=0;i<4;i++)
        {
            double area=0;
            double volume=0;
            if(arrObjects[i] instanceof Spatial)
            {
                area=arrObjects[i].area();
                volume=arrObjects[i].volume();
            }
            else if(arrObjects[i] instanceof Spatial)
            {
                area=arrObjects[i].area();
                volume=arrObjects[i].volume();
            }
            else if(arrObjects[i] instanceof Rectangle)
            {
                area=arrObjects[i].area();
                volume=arrObjects[i].volume();
            }
            else if(arrObjects[i] instanceof Triangle)
            {
                area=arrObjects[i].area();
                volume=arrObjects[i].volume();
            }
            System.out.println("The area of the "+ shapes[i] +" Shape is:"+area);
            if(volume!=-1.0)
            {
                System.out.println("The volume of the "+ shapes[i]+"Shape is:"+volume);
            }
            else
            {
                System.out.println("The volume of the "+ shapes[i]+"Shape is:"+volume);
            }
        }

    sc.close();
    }
}