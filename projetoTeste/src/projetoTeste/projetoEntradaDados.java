package projetoTeste;

import javax.swing.JOptionPane;

public class projetoEntradaDados {
	
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("DIgite um numero: ");
		
		//System.out.println("Carro é " + carros);
		
		int resposta = JOptionPane.showInternalConfirmDialog(null, "Deseja ver o Carro Digitado?");
		
	//	System.out.println(resposta);
		if (resposta == 0) {
			
			JOptionPane.showMessageDialog(null, "Carro é " + carros);
			
		}
		
		
	}

}
