public class Students
{
	String name;
	String collegeName;
	String email;
	String branch;
	String address;
	int rollNo;
	long  phoneNo;
	char gender;

	Students()
	{
		name = "Monu Choudhary";
		collegeName = "BCE";
		email = "monuc20082000@gmail.com";
		branch = "CSE";
		address = "Asansol, 713336";
		rollNo = 192600123;
		gender = 'M';
	}

	public String studentName()
	{
		 String str = "Name of Student: ";
		 return str;
	}
	public static void main(String[] str)
	{
		Students student = new Students();
		System.out.println(student.studentName() + student.name); 
	}
}
