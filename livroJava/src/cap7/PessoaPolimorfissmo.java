package cap7;

import javax.swing.JOptionPane;

public class PessoaPolimorfissmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa = null;
		
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Qual a Classe?"));
		
		switch (tipo) {
		case 1:
			pessoa = new Pessoa();
			break;
		case 2:
			pessoa = new PessoaFisica();
			break;
		default:
			System.out.println("Escolha Errada");
			System.exit(0);
		}
		
		pessoa.mostrarClasse();
	}

}
