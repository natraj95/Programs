package orange;

public class SwapWithout {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("Before swapping");
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
	}

}
