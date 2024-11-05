package herança;

public class Pessoa {
	private String nome = "";
	private double salario; ///10000
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa() {
		if(nome.startsWith("A")) {
			salario = 1000;
		}else {
			if(nome.startsWith("B")) {
				salario = 2000;
			}else{
				salario = 10000;
			}
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
