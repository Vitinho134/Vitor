//Classe = Molde
package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	//Atributos (caracteristicas)
	
	String nome;
	int idade;
	double peso, altura;
	
	//Metodos de apresentação
	public void apresentacao(){
		JOptionPane.showMessageDialog(null, "Boa tarde! Meu nome é "+nome);
		
	}
	
	//Método para calcular o IMC
	public double calculoIMC(){
		
		double imc = peso / Math.pow(altura,2);
		
		return imc;
		
	}

	//Método para retornar a condição do IMC
	public String condicaoIMC(){
		
		//Obter o valor do imc
		double imc = calculoIMC();
		
		//Variavel contendo a condição
		String condicao;
		if(imc < 17){
			condicao = "muito abaixo do peso";
		}else if(imc < 18.5){
			condicao = "Abaixo do peso";
		}else if(imc < 25){
			condicao = "peso normal";
		}else if(imc < 30){
			condicao = "acima do peso";
		}else if(imc < 35){
			condicao = "obesidade I";
		}else if(imc < 40){
			condicao = "Obesidade II";
		}else{
			condicao = "obesidade III";
		}
	
		//Retorno
		return condicao;
	}
	
	//Método para exibir o IMC
	public void exibirIMC(){
		String msg = "****IMC****\n";
			   msg += "Seu imc é de : "+String.format("%.2f",calculoIMC())+".\n";
			   msg += "Sua condição é "+condicaoIMC();
			   JOptionPane.showMessageDialog(null,msg);
	}
	
}
