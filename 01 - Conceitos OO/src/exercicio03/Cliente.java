package exercicio03;

import javax.swing.JOptionPane;

public class Cliente {
	
	String tabela;
	int quantidades;
	String compras;
	double total = 0;
	double valorPago = 0;
	int continuar = 0;
	double valorReceber = 0;
	
	public void  DadosGerais() {
			   tabela = "Código 1 :Hambúrguer + Suco de Laranja com o valor de R$ 5,00 \nCódigo 2 :Sanduíche natural + Suco de Uva com o valor de R$ 4,50\nCódigo 3 :Prato do dia com o valor de R$ 8,00\nCódigo 4 :Pizza com o valor de R$12,00\nCódigo 5 :Lasanha com o valor de R$ 16,50\nCódigo 6 :Pão de queijo com o valor de R$ 1,00\nCódigo 7: Bolo com o valor de R$ 2,50";
			   compras =  JOptionPane.showInputDialog(tabela + "\nInsira seu código por favor");
			   quantidades = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade ?"));
			   
			   
	}
	public void laco() {
	do {
		DadosGerais();
		ContabilizarCompras();
		continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar ?");	
		}while(continuar == 0);
		ContabilizarTroco();
		ExibirDados();
		
	
	}
		
	
	
	public double ContabilizarCompras() {
		if(compras.equals("1")) {
		total += quantidades *5;
		}
		if(compras.equals("2")) {
		total += quantidades*4.5;
		}
		if(compras.equals("3")) {
		total += quantidades * 8;
		}
		if(compras.equals("4")) {
		total += quantidades * 12;
		}
		if(compras.equals("5")) {
		total += quantidades * 16.50;
		}
		if(compras.equals("6")) {
		total += quantidades * 1;
		}
		if(compras.equals("7")) {
		total += quantidades * 2.50;
		}
		return total;
	}
	
	public double ContabilizarTroco() {
         valorPago = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor pago pelo cliente"));
        if(valorPago < total){
            JOptionPane.showMessageDialog(null, "Invalido");
        }else{
        	valorReceber = valorPago - total;
        }
		
        return valorReceber;
	}
	
	public void ExibirDados() {
		String msg = "Você escolheu o código "+compras;
			   msg += "\nVoce escolheu a quantidade de "+quantidades;
			   msg += "\nVocê terá que pagar "+total;
			   msg += "\nVocê irá receber o troco de "+valorReceber;
			   JOptionPane.showMessageDialog(null,msg);
	}
}