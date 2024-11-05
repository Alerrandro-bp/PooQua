package avaliação_1;

import java.util.ArrayList;

public class Banda {
	private String nome;
	private String genero;
	private int nrIntegrantes;
	private ArrayList<Instrumento> instrumentos = new ArrayList();
	
	public void cadastrar(String nome, String genero, int nrIntegrantes) {
		setNome(nome);
		setGenero(genero);
		setNrIntegrantes(nrIntegrantes);
	}
	
	public void adicionarIntrumento(Instrumento i ) {
		instrumentos.add(i);
	}
	
	public String exibir() {
		return getGenero() + ":" 
				+ getNome() + "-"
				+ getNrIntegrantes()
				+ "-" + getInstrumentos().size();
	}
	
	public int soma(){
		return getNrIntegrantes() + getInstrumentos().size();
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNrIntegrantes() {
		return nrIntegrantes;
	}

	public void setNrIntegrantes(int nrIntegrantes) {
		this.nrIntegrantes = nrIntegrantes;
	}

	public ArrayList<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(ArrayList<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}
}
