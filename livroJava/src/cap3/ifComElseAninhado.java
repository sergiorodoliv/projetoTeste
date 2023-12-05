package cap3;

import javax.swing.JOptionPane;

public class ifComElseAninhado {
	
	public static void main(String[] args) {
		String aux = JOptionPane.showInputDialog("Forneça o número do mês");
		
		if (aux != null) {
			try {
				int mes = Integer.parseInt(aux);
				
				if (mes == 1) {
					aux = "Janeiro";
				} else if (mes == 2){
					aux = "Fevereiro";
					
				} else if (mes == 3){
					aux = "Março";
					
				} else if (mes == 12) {
					aux = "Dezembro";
				} else {
					aux = "Mês desconhecido";
				}
				JOptionPane.showMessageDialog(null, aux);
			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite apenas valores inteiros \n"+erro);
			}
		}
		System.exit(0);
	}
}
