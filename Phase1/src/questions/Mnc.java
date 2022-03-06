package questions;
public abstract class Mnc 
{
	abstract void m1();
	abstract void m2();
	void m3()
	{
		System.out.println("in method m3 in Mnc class");
	}
	public Mnc() 
	{
		
	}
	public static void main(String[] args)
	{
		Mnc x1=new Hello();
		Infosys x2=new Hello();
		x2.m1();
		x2.m2();
		x2.m3();
		x1.m1();
		x1.m2();
		x1.m3();
		
		
	}

}
abstract class Infosys extends Mnc
{
	void m1()
	{
		System.out.println("in method m1 of infosys class");
	}
}
class Hello extends Infosys
{
	void m4()
	{
		System.out.println("in method m4 of Hello class");
	}
	void m1()
	{
		System.out.println("in method m1 of Hello class");
	}
	void m2()
	{
		System.out.println("in method m2 of the Hello class");
	}
}
