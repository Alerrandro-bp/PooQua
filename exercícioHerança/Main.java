package exercícioHerança;

public class Main {
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Alerrandro");
		c1.setSaldoDevedor(0);
		
		Produto p1 = new Produto("Dramim", 10, 12.99);
		p1.vender(9);
		
		Medicamentos m1 = new Medicamentos("Cefalexina", 5, 9.99);
		System.out.println(m1.receitaMedica(10));// Quantidade é menor que o estoque
		
		Medicamentos m2 = new Medicamentos("Lugol", 1, 2.99);
		System.out.println(m2.venderMedicamento(2));
		
	}
}
