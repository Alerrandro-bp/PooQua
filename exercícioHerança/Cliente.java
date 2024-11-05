package exercícioHerança;

public class Cliente {
	private String nome;
	private double saldoDevedor;
	
	public void pagarConta(double qtdPaga) {
		if(getSaldoDevedor() >= 100) {
			saldoDevedor -= qtdPaga;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldoDevedor() {
		return saldoDevedor;
	}
	public void setSaldoDevedor(double saldoDevedor) {
		this.saldoDevedor = saldoDevedor;
	}
}
