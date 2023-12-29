
interface Man{
	void show();
}
class student implements Man{
	public void show() {
		System.out.println("student record");	
		}
}

public class InterfaceEx {

	public static void main(String[] args) {
		Man p=new student();
		p.show();

	}

}
