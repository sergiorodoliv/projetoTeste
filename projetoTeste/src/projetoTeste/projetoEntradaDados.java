package projetoTeste;

import javax.swing.JOptionPane;

public class projetoEntradaDados {
	
	public static void main(String[] args) {
		
		//String carros = JOptionPane.showInputDialog("DIgite um numero: ");
		
		//System.out.println("Carro é " + carros);
		
		//int resposta = JOptionPane.showInternalConfirmDialog(null, "Deseja ver o Carro Digitado?");
		
	//	System.out.println(resposta);
		//if (resposta == 0) {
			
		//	JOptionPane.showMessageDialog(null, "Carro é " + carros);
			
		//}
		
		Object[] op = {"Masculino","Feminino"};
		////Cria lista de valores
		String resp = (String) JOptionPane.showInputDialog(null,"Selecione o sexo:\n","Pesquisa", 
				JOptionPane.PLAIN_MESSAGE,null,op,"Feminino");
		
		if (resp == null) {
			JOptionPane.showMessageDialog(null, "Você pressionou cancel");
		}
		if (resp.equals("Masculino")) {
			JOptionPane.showMessageDialog(null,"Você é homem");
			
		}
		if (resp.equals("Feminino")) {
			JOptionPane.showMessageDialog(null,"Você é Mulher");
			
		}
		
		
		
	}

}
