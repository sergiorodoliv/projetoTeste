package cap3;

import javax.swing.JOptionPane;

public class ifComElseAninhado {
	
	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Forne�a o n�mero do m�s");
		
		if (aux != null) {
			try {
				int mes = Integer.parseInt(aux);
				
				if (mes == 1) {
					aux = "Janeiro";
				} else if (mes == 2){
					aux = "Fevereiro";
					
				} else if (mes == 3){
					aux = "Mar�o";
					
				} else if (mes == 12) {
					aux = "Dezembro";
				} else {
					aux = "M�s desconhecido";
				}
				JOptionPane.showMessageDialog(null, aux);
			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite apenas valores inteiros \n"+erro);
			}
		}
		System.exit(0);
	}
}
