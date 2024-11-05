package avaliação_1;

public class Questão_2 {

public static void main(String[] args) {
	
	Instrumento i1 = new Instrumento();
	i1.setNome("Harpa");
	Instrumento i2 = new Instrumento();
	i2.cadastrar("Piano", "Percursão");
	Instrumento i3 = new Instrumento();
	Instrumento i4 = i2;
	i4.setNome("Baixo");
	i4.setTipo("Cordas");
	
	System.out.println(i1.exibir());
	System.out.println(i2.exibir());
	}
}
