package construtores;

import java.util.ArrayList;

public class SistemaAcademico<disciplinas> {
	private ArrayList<Professor>  professores 	= new ArrayList<Professor>();
	private ArrayList<Diciplina> disciplinas 	= new ArrayList<Diciplina>();
	private ArrayList<Aluno>      alunos 		= new ArrayList<Aluno>();
	private ArrayList<Matricula>  matriculas 	= new ArrayList<Matricula>();
	
	public void cadastraProfessor(String nome, int formacao) {
		professores.add(new Professor(nome, formacao));
	}
	
	public void cadastraDisciplina(String nome, int cargaH, Professor p) {
		disciplinas.add(new Diciplina(nome, cargaH, p));
	}
	
	public void cadastraAluno(String nome) {
		alunos.add(new Aluno(nome));
	}
	
	public void fazMatricula(Aluno a, Diciplina d) {
		matriculas.add(new Matricula());
	}
	
	public void cadastraNotas(Matricula m, double n1, double n2, double n3) {
		m.setN1(n1);
		m.setN2(n2);
		m.setN3(n3);
	}
	
	public String listaDisciplinasAluno(Aluno a) {
		String ret = "";
		for (Matricula m : matriculas) {
			if(m.getAluno().getNome().equalsIgnoreCase(a.getNome())) {
				ret += m.getDisciplina().getNome() + " - " + m.getMedia()+"\n";
			}
		}
		return ret;
	}
	
	public String listaDisciplinaPos() {
		String ret = "";
		for (Diciplina d : disciplinas) {
			if(d.getProfessor().getFormacao() == 3) {
				ret += d.getNome()+"\n";
			}
		}
		return ret;
	}
	public ArrayList<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}
	public ArrayList<Diciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Diciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
}
