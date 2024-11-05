package cimulado;

public class Questao2 {

	public static void main(String[] args) {
		Competicao c1 = new Competicao("LG", "16 milhas");
		Competicao c2 = new Competicao("OS", "Corrida dos ventos");
		Atleta a1 = new Atleta("A", 1, 2);
		Atleta a2 = new Atleta("B", 2, 2);
		Atleta a3 = new Atleta("C", 3, 3);
		Atleta a4 = new Atleta("D", 4, 4);
		Atleta a5 = new Atleta("E", 5, 5);
		Atleta a6 = new Atleta("F", 6, 6);
		c1.getCompetidores().add(a1);
		c1.getCompetidores().add(a6);
		c1.getCompetidores().add(a2);
		c2.getCompetidores().add(a5);
		c2.getCompetidores().add(a3);
		c2.getCompetidores().add(a4);
		System.out.println(c1.comparaTo(c2));
		
		System.out.println(a1.compareTo(a6));
		
		System.out.println(a5.compareTo(a2));
		c2.getCompetidores().add(new Atleta());
		
		System.out.println(c1.comparaTo(c2));
		
		System.out.println(c2.getCompetidores().get(0));
		
		System.out.println(c2.getCompetidores().get(1));
		
		System.out.println(c2.getCompetidores().get(2));
		
		System.out.println(c2.getCompetidores().get(3));
	}
}
