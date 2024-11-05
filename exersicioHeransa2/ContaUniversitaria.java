package exersicioHeransa2;

public class ContaUniversitaria extends ContaCorrente {
	
	private String agencia;
	
	@Override
	public void transferencia(Caixa c) {
		if(c.getAgensia() == getAgencia()) {
			System.out.println("Dinheiro transferido com sucesso ! ");
		}
	}
	@Override
	public boolean saque(Caixa c, double vl) {
		if(c.getSaldo() <= 2000.0) {
			return true;
		}else {
			return false;
		}
	}
	public ContaUniversitaria (String agencia, int numero, double saldo) {
		super(agencia, numero, saldo);
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
}
