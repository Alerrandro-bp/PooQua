package exersicioHeransa2;

public class Caixa {
	private int numero;
	private String agensia;
	private double saldo;
	
	public boolean transferencia(double vl, Caixa c) {
		if(this.agensia == c.getAgensia() ) {
			saldo += vl;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean deposito(double vl) {
		saldo += vl;
		return true;
	}
	
	public boolean saque(Caixa c,double vl) {
		saldo -= vl;
		return true;
	}
	
	public Caixa(String agensia, int numero, double saldo) {
		this.agensia = agensia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public String getAgensia() {
		return agensia;
	}
	public void setAgensia(String agensia) {
		this.agensia = agensia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
