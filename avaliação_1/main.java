package avaliação_1;

public class main {
	public static void main(String[] args) {
		Instrumento i1 = new Instrumento();
		Instrumento i2 = new Instrumento();
		i2.setNome("Guitarra");
		Instrumento i3 = new Instrumento();
		i3.cadastrar("Bateria", "Percursão");
		
		System.out.println(i1.exibir());
		System.out.println(i2.exibir());
		System.out.println(i3.exibir());
		
		Banda b1 = new Banda();
		b1.cadastrar("A", "Rock", 6);
		Banda b2 = new Banda();
		b2.cadastrar("B", "POP", 4);
		b1.adicionarIntrumento(i2);
		b2.adicionarIntrumento(i3);
		
		System.out.println(b1.exibir());
		System.out.println(b2.exibir());
		
		Instrumento ix = new Instrumento();
		ix.cadastrar("Gaita", "Percursão");
		b2.getInstrumentos().add(ix);
		Instrumento iy = new Instrumento();
		iy.setNome("Violino");
		b1.getInstrumentos().add(iy);
		
		System.out.println(b1.exibir());
		System.out.println(b2.exibir());
		System.out.println(b1.soma());
		System.out.println(b2.soma());
		
			}
}
