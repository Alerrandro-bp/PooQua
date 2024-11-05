package exersicioHeransa2;

public class ContaEspecial extends ContaCorrente {
	
	private String agensia;
	
	public void transferencia(ContaCorrente c) {
		if(c.getAgensia() == getAgensia()) {
			System.out.println("Dinheiro transferido com sucesso ! ");
		}
	}
	
	@Override
	public boolean saque(Caixa c, double vl) {
		if(c.getSaldo() > vl) {
			return true;
		}else {
			return false;
		}
	}
	
	public ContaEspecial (String agencia, int numero, double saldo) {
		super(agencia, numero, saldo);
	}
	
	
	public String getAgensia() {
		return agensia;
	}
	public void setAgensia(String agensia) {
		this.agensia = agensia;
	}
}
