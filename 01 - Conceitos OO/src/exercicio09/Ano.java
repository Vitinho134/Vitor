package exercicio09;

import javax.swing.JOptionPane;

public class Ano {

	int ano = 0;
	int continuar = 0;
			
	public void DadosGerais(){
		ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
	}
	
	public void laco(){
		do{
		DadosGerais();
		Contabilizar();
		continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar ?");
		}while(continuar == 0);
		}
	
	public void Contabilizar(){
	if(ano % 4 == 0){
	JOptionPane.showMessageDialog(null,"Ano bissexto");
	}else{
	JOptionPane.showMessageDialog(null,"Não é bissexto");

	        }
	}
			
}
