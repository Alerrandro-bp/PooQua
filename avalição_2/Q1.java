package avalição_2;

public class Q1 {
	public static void main(String[] args) {
		Apresentador a1 = new Apresentador("A");
		Apresentador a2 = new Apresentador("B", 'M');
		Apresentador a3 = new Apresentador("XB");
		a3.setSexo(a2.getSexo());
		Apresentador a4 = a3;
		a4.setNome(a1.getNome());
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	}
}
