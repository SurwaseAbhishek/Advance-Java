package java_enterprice_edition.basics;

class Demo{
	int var_1=100;
	static int var_2 = 300;
}
public class StaticVariables {
	public static void main(String[] args) {
		Demo obj = new Demo();
		System.out.println(obj.var_1);
		System.out.println(obj.var_2); // we can use reference variable to access instance variable by  class name is always suggested
		System.out.println(Demo.var_2);
		
		Demo obj_1 = null;
//		System.out.println(obj_1.var_1); // > It will give null pointer exception
		System.out.println(obj_1.var_2);
	}
}
