package projetoTeste;

public class programaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int numeroDez = 15; int numeroVinte = 20; int numeroTrinta = 30; int
		 * numeroQuarenta = 40;
		 */	
		
		
		  double numeroDez = 15; 
		  double numeroVinte = 20; 
		  double numeroTrinta = 30;
		  double numeroQuarenta = 40;
		  
		  /*Char representa uma letra*/
		  char pessoaFisica = 'F';
		  char pessoaJuridica = 'J';
		  
		  //Strring qualquer texto, qualquer tamanho
		  
		  String nome;
		  String cpf;
		  String telefone;
		  
		  nome = "Sergio";
		  cpf = "001.003.5669-01";
		  
		 		
		  double mediaFinal = (numeroDez + numeroVinte + numeroTrinta + numeroQuarenta)/4;
		  System.out.println("Numero dez: " + mediaFinal);
		
		  if (pessoaFisica =='F') {
			  System.out.println("Pessoa Física");
		  } else {
			  System.out.println("Pessoa Jurídica");
		  }
		  if (pessoaJuridica =='J') {
			  System.out.println("Pessoa Jurídica");
		  } else {
			  System.out.println("Pessoa Física");
		  }
		  
		  System.out.println("Meu nome é " + nome +
				  " meu CPF é " + cpf);

	}

}
