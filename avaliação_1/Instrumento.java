package avaliação_1;

public class Instrumento {
private String nome;
	private String tipo = "Cordas";
	public static char afinado = 'N';
	
	public void cadastrar(String nome, String tipo) {
		setNome(nome); 
		setTipo(tipo);
	}
	
	public String exibir() {
		return getNome() + "(" + getTipo() + ")";
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
