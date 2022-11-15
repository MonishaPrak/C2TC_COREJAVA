class Demo1
{
	Demo1()
	{
		System.out.println("hello a");
	}
	Demo1(int x)
	{
		this();
		System.out.println(x);
	}
}
class TestThis5
{
	public static void main(String args[])
	{
		Demo1 a=new Demo1(10);
	}

}

 


