class StudentGrades
{
	public static void main(String[] artgs)
	{
		int eng = 60;
		int math = 50;
		int ns = 75;
		int total = eng+math+ns;
		int avg = total/3;
		if(avg>80)
		{
			System.out.println(" The student grade is A ");
		}
		else if((avg>60)&&(avg<80))
		{
			System.out.println(" The student grade is B ");
		}
		else if((avg>50)&&(avg<60))
		{
			System.out.println(" The student grade is C ");
		}
		else
		{
			System.out.println(" The student grade is Failed ");
		}
	}
}
