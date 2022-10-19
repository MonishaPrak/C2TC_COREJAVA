package mona;

public class Employee1 {
	int id;
	String name;
	float salary;
	void display() {
		System.out.println(id + " " + name + " " + salary);
		}
	Employee1(){
		System.out.println("No value initialized for this object");
	}
	Employee1(int i, String n,float s){
		id=i;
		name=n;
		salary=s;
	}
}


	
