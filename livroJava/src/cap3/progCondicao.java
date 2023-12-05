package cap3;

import javax.swing.JOptionPane;

public class progCondicao {

	public static void main(String[] args) {

		String aux = JOptionPane.showInputDialog("Forneça o n do mês");
		
		if (aux != null) {
			try {
				int mes = Integer.parseInt(aux);
				if (mes >= 1 && mes <= 12) {
					JOptionPane.showMessageDialog(null, "Número do mê válido \n " + mes);
				} else {
					JOptionPane.showMessageDialog(null, "Número do mê inválido \n " + mes);

				}
				
			} catch (NumberFormatException erro){
				JOptionPane.showMessageDialog(null,"Digite apenas valores inteiros " + erro);
				
			}
		} else {
			JOptionPane.showMessageDialog(null, "Operação Cancelada");
		}
		System.exit(0);
	}

}
