package overloading;

public class Students {
	
	public void getStudentInfo(int id)
	{
	System.out.println("Student id is:" +id);
	}
public void getStudentInfo(int id, String name)
{
	System.out.println("Student id is:"+id);
	System.out.println("Student name is:" +name);
}

public void getStudentInfo(String email, Long Number)
{
	System.out.println("Student email:" +email);
	System.out.println("Student number:" +Number);
}
	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo(53);
		info.getStudentInfo(53, "jaya");
		info.getStudentInfo("jaya@gmail.com", 89045345332L);
		
	}
}
