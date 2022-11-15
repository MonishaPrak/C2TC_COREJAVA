abstract class Bank{
	abstract int rateOfInterset();
}
class SBI extends Bank{
	int rateOfInterset() {
		return 7;
	}
}
class HDFC extends Bank{
	int rateOfInterset() {
		return 8;
	}
}
class Demo1{
	public static void main(String args[]) {
		SBI s =new SBI();
		HDFC h = new HDFC();
		h.rateOfInterset();
		System.out.println("The rate of interset in SBI"+s.rateOfInterset());
		System.out.println("The rate of interset in HDFC"+h.rateOfInterset());
	}
}
