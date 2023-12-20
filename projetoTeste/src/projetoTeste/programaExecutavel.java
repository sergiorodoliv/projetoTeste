package projetoTeste;

import javax.swing.JOptionPane;

import classes.Aluno;

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
		
		aluno1.getDisciplina().setNota1(70);
		aluno1.getDisciplina().setNota2(70);
		aluno1.getDisciplina().setNota3(75);
		aluno1.getDisciplina().setNota4(70);
		
		aluno1.getDisciplina().setDisciplina1("disciplina 1");
		aluno1.getDisciplina().setDisciplina2("disciplina 2");
		aluno1.getDisciplina().setDisciplina3("disciplina 3");
		aluno1.getDisciplina().setDisciplina4("disciplina 4");
		
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
