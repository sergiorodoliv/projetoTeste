package projetoTeste;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Disciplina;

public class programaExecutavel {
	
	public static void main (String[] args) {
        /*aluno1 é uma referencia do obbjeto Aluno, new Aluno() é uma instancia*/
		Aluno  aluno1 = new Aluno();
		
		String dataMatricula;
		
		dataMatricula = JOptionPane.showInputDialog("Qual a Data da Matricula?");
		//aluno1.setDataMatricula("05/12/2023");
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setDataNascimento("08/04/1965");
		aluno1.setIdade(58);
		aluno1.setNome("Sérgio Rodrigues");
		aluno1.setNomeEscola("Curso Java");
		aluno1.setNomeMae("Vicentina");
		aluno1.setNomePai("Domingos");
		aluno1.setNumeroCpf("001.002.0033-90");
		aluno1.setRegistroGeral("14.456.789");
		aluno1.setSerieMatriculado("Primeiro");

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNota(65);
		disciplina1.setDisciplina("Matematica");
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNota(65);
		disciplina2.setDisciplina("Portugues");
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNota(75);
		disciplina3.setDisciplina("Ingles");
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setNota(85);
		disciplina4.setDisciplina("Ciências");
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);
		


	    System.out.println("Media do Aluno "+ aluno1.getNome() + " é " + aluno1.getMediaNota());
		System.out.println("Aluno está " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println(aluno1);
		
		aluno1.setNome("Sérgio Rodrigues de Oliveira");
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Sérgio Rodrigues de Oliveira");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("São iguais");
			
		}else {
		System.out.println("São diferentes");	
		}
		
	}
	
}
