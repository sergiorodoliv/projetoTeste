package projetoTeste;

import classes.Aluno;

public class programaExecutavel {
	
	public static void main (String[] args) {
        /*aluno1 é uma referencia do obbjeto Aluno, new Aluno() é uma instancia*/
		Aluno  aluno1 = new Aluno();
		
		aluno1.setDataMatricula("05/12/2023");
		aluno1.setDataNascimento("08/04/1965");
		aluno1.setIdade(58);
		aluno1.setNome("Sérgio Rodrigues");
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
		
		System.out.println("Media do Aluno "+ aluno1.getNome() + " é " + aluno1.getMediaNota());
		System.out.println("Aluno está " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
	}
	
}
