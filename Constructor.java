class A
{
	int a; String name;
	A()
	{
        a=0; name=null;
	}
	void show()
	{
         System.out.print(a+" "+name);
	}
}
class Constructor
{
	public static void main(String[] args) {
		A c=new A();
		c.show();
	}
}