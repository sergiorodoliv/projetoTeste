package projetoTeste;

import classes.Aluno;

public class programaExecutavel {
	
	public static void main (String[] args) {
        /*aluno1 � uma referencia do obbjeto Aluno, new Aluno() � uma instancia*/
		Aluno  aluno1 = new Aluno();
		
		aluno1.setDataMatricula("05/12/2023");
		aluno1.setDataNascimento("08/04/1965");
		aluno1.setIdade(58);
		aluno1.setNome("S�rgio Rodrigues");
		aluno1.setNomeEscola("Curso Java");
		aluno1.setNomeMae("Vicentina");
		aluno1.setNomePai("Domingos");
		aluno1.setNumeroCpf("001.002.0033-90");
		aluno1.setRegistroGeral("14.456.789");
		aluno1.setSerieMatriculado("Primeiro");
		
		aluno1.setNota1(70);
		aluno1.setNota2(70);
		aluno1.setNota3(75);
		aluno1.setNota4(70);
		
		aluno1.setDisciplina1("disciplina 1");
		aluno1.setDisciplina2("disciplina 2");
		aluno1.setDisciplina3("disciplina 3");
		aluno1.setDisciplina4("disciplina 4");
		
		System.out.println("Media do Aluno "+ aluno1.getNome() + " � " + aluno1.getMediaNota());
		System.out.println("Aluno est� " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println(aluno1);
		
		aluno1.setNome("S�rgio Rodrigues de Oliveira");
		Aluno aluno2 = new Aluno();
		aluno2.setNome("S�rgio Rodrigues de Oliveira");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("S�o iguais");
			
		}else {
		System.out.println("S�o diferentes");	
		}
		
	}
	
}
