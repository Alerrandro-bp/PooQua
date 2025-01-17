package exercícioHerança;

public class Produto extends Cliente {
	private String nome;
	private int estoque;
	private double valor;
	
	public void vender(int qtd) {
		if(getEstoque() > qtd) {
			estoque -= qtd;
			qtd += getSaldoDevedor();//Dívida do cliente.
		}
	}
	
	public Produto(String nome, int estoque, double valor) {
		this.nome = nome;
		this.estoque = estoque;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
