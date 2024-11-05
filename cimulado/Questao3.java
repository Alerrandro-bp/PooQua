package cimulado;

public class Questao3 {
	public static void main(String[] args) {
		Atleta a = new Atleta("Nome", 1, 5);
		alteraPosicao(a.getPosicao());
		alteraNome(a);
		System.out.println(a);
	}
	
	public static void alteraPosicao(int posicao) {
		posicao = 5;
		System.out.println(posicao);
	}
	
	public static void alteraNome(Atleta a) {
		a.setNome("Novo Nome");
	}
}
