package projetoTeste;

import javax.swing.JOptionPane;

public class projetoEntradaDados {
	
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("DIgite um numero: ");
		
		//System.out.println("Carro � " + carros);
		
		JOptionPane.showMessageDialog(null, "Carro � " + carros);
	}

}
