class Demo
{
	void m()
	{
		System.out.println(this);//prints same reference ID
	}
	public static void main(String args[])
	{
		Demo obj=new Demo();
		System.out.println(obj);//prints the reference ID
		obj.m();
	}
}
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

