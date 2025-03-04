package java_enterprice_edition.basics;


class Demo1 {
	int num1 = 100;
	static int num2 = 300;
	
	public static void show()
	{
		System.out.println(num2);
//		System.out.println(num1);   can not use non-static variable in static block
	}
	
	public void display()
	{
		System.out.println(num1);
		System.out.println(num2);
		this.show();
		Demo1.show();
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.show();
		d.display();
		Demo1 d1 = null;
		d1.show();
//		d1.display(); it will give u null pointer exception
	}
}
