package mona;
class Employee{
	int id;
	String name;
	float salary;
	void display() {
		System.out.println(id + " " + name + " " + salary);
		}
	Employee(){
		System.out.println("No value initialized for this object");
	}
	Employee(int i, String n,float s){
		id=i;
		name=n;
		salary=s;
	}
}

public class Main {

	public static void main(String[] args) {
	    Employee e1= new Employee(101,"Monisha",10.0f);
	    Employee e2= new Employee();
	    
	    e1.display();
	    e2.display();
	}

}
