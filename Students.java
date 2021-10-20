public class Students
{

	String name;
	String collegeName;
	String email;
	String branch;
	String address;
	int rollNo;
	char gender;

	public String studentName()
	{
		 String str = "Name of Student: ";
		 return str;
	}
	public static void main(String[] str)
	{

		Students stu = new Students();

		stu.name = "Monu Choudhary";
        stu.collegeName = "BCE";
        stu.email = "monuc20082000@gmail.com";
        stu.branch = "CSE";
        stu.address = "Asansol, 713336";
        stu.rollNo = 192600123;
        stu.gender = 'M';
	
		System.out.println(stu.studentName() + stu.name); 
	}
}
