class Person
{
	String name = "sai";
	int age = 51;
}
class Student extends Person
{
	String name ="spandu";
	
	int age = 21;
}
class Teacher extends Person 
{
 	double salary = 23000.0;
	String subject = "Electronics";
	
}
class CollegeStudent extends Student 
{
 	int year = 3;
	String stream = "Communiocation";
}
class Details
{
	public static void main(String[] args)
	{
		Teacher t = new Teacher();
		System.out.println("the teacher name is "+t.name+" the teacher age is "+t.age+" the teacher salary is "+t.salary+"the teacher 			subject is "+t.subject);
		CollegeStudent cs = new CollegeStudent();
		System.out.println("the CollegeStudent name is "+cs.name+" the CollegeStudent age is "+cs.age+" the CollegeStudent year is "+" 			the CollegeStudent stream is "+cs.stream);
	}
}
