package exercicio05;

import javax.swing.JOptionPane;

public class Papelaria {

    String produto = "", tabela = "";
    double valor = 0;
    int indice = 1;
    String valorUnitario, valorTotal;
    double porcento = 0.05;
    
    public void DadosGerais(){
    	produto = JOptionPane.showInputDialog("Insira um produto");    
        valor = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do produto"));
    }
    
    public void laco(){
    	DadosGerais();
    	ContabilizarPreço();
    	ExibirDados();
    }
   
    public void ContabilizarPreço(){
    	do{
        valorUnitario = String.format("%.2f",valor-(valor * porcento));
        valorTotal = String.format("%.2f", (valor-(valor * porcento))*indice);
        indice++;
        porcento+=0.05;
    	}while((indice <= 10));
    }
   public void ExibirDados(){
	  String tabela = "\n"+indice+" "+ produto+" custa "+valorUnitario+" cada, em quantidade custará "+valorTotal;
	  JOptionPane.showMessageDialog(null, tabela);
   }
}
