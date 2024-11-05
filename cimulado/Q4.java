package cimulado;

public class Q4 {
	
	static int x = 10;
	int y = 5;
	
	public static void main(String[] args) {
		Q4 a = new Q4();
		Q4 b = new Q4();
		a.x = a.x + a.y; //15
		b.x = b.x + b.y; //20 
		a.y = a.x + 1; //21
		b.y = a.y + b.y; //26
		Q4.x = 0;
		
		System.out.println(a.x); // 0
		System.out.println(a.y); // 21
		System.out.println(b.x); // 0
		System.out.println(b.y); // 26
		
		System.out.println();
	}
}
