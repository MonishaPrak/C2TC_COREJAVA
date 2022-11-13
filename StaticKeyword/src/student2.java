class Student2{
	int rollno;
	String name;
	static String college;
	static {
		college ="ITS";
	}
	Student2(int r,String n){
	    rollno = r;
	    name = n;
	}
	static void change() {
		college = "BBDIT";
	}
	void diplay() {
		System.out.println(rollno+" "+name+" "+college);
	}

public static void main(String args[]) {
	Student s1 = new Student(111,"Karan");
	Student s2 = new Student(222,"Mona");
	change();
	s1.display();
	s2.display();
			
	
}	

}
