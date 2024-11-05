package cimulado;

public class Atleta {
	private String nome;
	private int numero, posicao=1;
	
	public Atleta() {
		this ("Teste");
	}
	public Atleta (String nome) {
		this.nome = nome;
	}
	public Atleta(String nome, int numero, int posicao) {
		this.nome = nome;
		this.numero = numero;
		this.posicao = posicao;
	}
	public int compareTo(Atleta outro) {
		if(getPosicao()>outro.getPosicao())
			return 1;
		else
			if(getPosicao()==outro.getPosicao())
				return -0;
			else
				return -1;
	}
	public String verificaPremiacao() {
		if(getPosicao() <= 3)
			return "Troféu";
		else
			return "Medalha";
	}
	public String toString() {
		return getNome()+" "+getNumero()+": "+verificaPremiacao();
	}
	
	
	
	
	
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
}
