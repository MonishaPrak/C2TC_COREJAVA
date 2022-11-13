class Student1{
	int rollno;
	String name;
	static String college ="ITS";
	Student1(int r, String n){
		rollno = r;
		name = n;
	}
	static void change() {
		college ="BBDIT";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class student1 {

	public static void main(String[] args) {
		Student s1 = new Student(111,"Karan");
		Student s2 = new Student(222,"Mona");
		change();
		s1.display();
		s2.display();
				

	}

	private static void change() {
		// TODO Auto-generated method stub
		
	}
		
	}


