class A
{
	int x,y;
	
	A(int a, int b)//parameterized
	{
       x=a; y=b;
	}
	void show()
	{
        System.out.print(x+" "+y);
	}
}
class parameterized
{
	public static void main(String[] args) {
	   A ref=new A(100,200);
	   ref.show();	
	}
}
