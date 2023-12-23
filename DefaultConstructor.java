class A
{
	int a; String b; boolean c;
	A()
	{
	  a=100; b="alok"; c=true;
	}
	void Disp()
	{
	   System.out.print(a+" "+b+" "+c);
	}
}
class DefaultConstructor
{
	public static void main(String[] args) {
		A ref=new A();
		ref.Disp();
	}
}