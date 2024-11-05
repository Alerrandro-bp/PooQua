package exersicioHeransa2;

public class ContaCorrente extends Caixa {
	private String agensia;
	
	public ContaCorrente (String agencia, int numero, double saldo) {
		super(agencia, numero, saldo);
	}
	
	public void transferencia(Caixa c) {
		if(c.getAgensia() == getAgensia()) {
			System.out.println("Dinheiro transferido com sucesso ! ");
		}
	}
	
	@Override
	public boolean saque(Caixa c, double vl) {
		if(c.getSaldo() > 0 ) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getAgensia() {
		return agensia;
	}
	public void setAgensia(String agensia) {
		this.agensia = agensia;
	}
}
