package construtores;

public class Matricula {
	private Aluno aluno = new Aluno();
	private Diciplina disciplina = new Diciplina("Matematica", 3, null);
	double n1;
	double n2;
	double n3;
	
	public Matricula() {
	}
	
	public Matricula(Aluno aluno, Diciplina disciplina) {
		this.aluno = aluno;
		this.disciplina = disciplina;
	}
	
	public double getMedia() {
		return (n1 + n2 + n3 ) / 3;
	}
	
	
	public Matricula(Aluno aluno, Diciplina disciplina, double n1, double n2, double n3) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Diciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Diciplina disciplina) {
		this.disciplina = disciplina;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
}
