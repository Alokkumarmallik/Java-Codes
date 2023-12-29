
class first{
	static void show() {
		System.out.println("show");
	
	}
	static void show(int x) {
		System.out.println(x);
	}
}

public class Polymorphism {

	
	public static void main(String[] args) {
		first.show();
		first.show(12);
	}

}
