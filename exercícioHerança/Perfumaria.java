package exercícioHerança;

public class Perfumaria extends Produto {
	
	public boolean venderPerfumaria(int qtd) {
		if(getSaldoDevedor() < 100 && getEstoque() > qtd  ) {
			return true;
		}
		return false;
	}
	
	public Perfumaria(String nome, int estoque, double valor) {
		super(nome, estoque, valor);
	}
}
