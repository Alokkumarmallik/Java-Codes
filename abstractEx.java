abstract class Boy{
	abstract void show();
}
class sir extends Boy{
	void show() {
		System.out.println("sir");
	}
}

public class abstractEx {

	public static void main(String[] args) {
		
		Boy b=new sir();
		b.show();

	}

}