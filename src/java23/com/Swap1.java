package java23.com;

public class Swap1 {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("before swap a = " +a);
		System.out.println("before swap b = " +b);
		a = a - b;
		b = a + b;
		a = b - a;
		
		System.out.println("-- After swap--");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
