package exercícioHerança;

public class Medicamentos extends Produto {
	
	public boolean venderMedicamento(int qtd) {
		if(getEstoque() > qtd) {
			return true;
		}
		return false;
	}
	
	public boolean receitaMedica(int qtd) {
		if(getEstoque() < qtd) {
			return true;
		}else {
			return false;
		}
	}
	
	public Medicamentos(String nome, int estoque, double valor) {
		super(nome, estoque, valor);
	}
}
