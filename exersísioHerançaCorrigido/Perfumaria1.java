package exersísioHerançaCorrigido;

public class Perfumaria1 extends Produto {
	public Perfumaria1(String nome, int estoque, double vl) {
		super(nome, estoque, vl);
	}
	
	@Override
	public boolean vender(Cliente c, int qtd) {
		if(getEstoque() >= qtd && c.getSaldo() < 100) {
			return super.vender(c, qtd);
		}
		return false;
	}
}
