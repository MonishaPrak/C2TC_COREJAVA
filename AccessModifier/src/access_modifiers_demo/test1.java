package access_modifiers_demo;

public class test1 {
	
	public int i;
	public void display() {
		System.out.println("In display method");
	}

	public static void main(String[] args) {
		test1 t1= new test1();
		t1.i=10;
		t1.display();

	}

}

