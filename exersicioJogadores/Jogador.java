package exersicioJogadores;

public class Jogador {
	 private String nome;
	 private int camisa;
	 private int gols;
	
	 public void cadastrar(String nome, int camisa, int gols) {
		 setNome(nome);
		 setCamisa(camisa);
		 setGols(gols);
	 }
	
	 public void dados() {
		 System.out.println("Nome do Jogador: " + getNome() +
				 " (Camisa:" + getCamisa() + " )" + 
				 " Quantidade de gols marcados: " + getGols());
	 }
	 
	 public String getNome() {
		 return nome;
	 }
	 public int getCamisa() {
		 return camisa;
	 }
	 public int getGols() {
		 return gols;
	 }

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}
}