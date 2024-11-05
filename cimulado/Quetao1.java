package cimulado;

public class Quetao1 {

	public static void main(String[] args) {
		Competicao c1 = new Competicao();
		c1.setCidade("TB");
		
		Atleta a1 = new Atleta();
		Atleta a2 = new Atleta("Ana");
		Atleta a3 = new Atleta("Pedro",5,3);
		Atleta a4 = a1;
		a1.setPosicao(4);
		
		System.out.println(c1);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		Competicao c2 = c1.clone();
		c2.setNome("Meia Maratona");
		
		System.out.println(c2);
	}
}
