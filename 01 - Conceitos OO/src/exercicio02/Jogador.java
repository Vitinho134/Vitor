package exercicio02;

import javax.swing.JOptionPane;

public class Jogador {

    String nome;
    double altura;
    double peso;
    int idade;
    double jogadormaisalto = 0;
    int jogadormaisvelho = 0;
    double jogadormaispesado = 0;
    String nomemaisalto ="";
    String nomemaisvelho ="";
    String nomemaispesado ="";
    int jogador = 0;
    double mediaAltura = 0;
    double somaDasAlturas;
    
    public void ObterDados(){
    	nome = JOptionPane.showInputDialog("Qual o seu nome?");
    	altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura?"));
    	peso = Double.parseDouble(JOptionPane.showInputDialog("Qual seu peso?"));
    	idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
    	
    	
    }
public void laco(){
		
		int continuar = 0;
		
		do{
			
			ObterDados();
			contabilizarJogadores();
			contabilizarMaisAlto();
			ContabilizarMaisVelho();
			ContabilizarMaisPesado();
			ContabilizarMediaAltura();
			
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
		}while(continuar == 0);
		ExibirDados();
	}
	
    public void contabilizarJogadores(){
    	jogador++;
    }
	
	public void contabilizarMaisAlto(){
	if(altura > jogadormaisalto){
		jogadormaisalto = altura;
		nomemaisalto = nome;
	}
	}
	public void ContabilizarMaisVelho(){
		if(idade > jogadormaisvelho){
			jogadormaisvelho = idade;
			nomemaisvelho = nome;
		}
	}
	public void ContabilizarMaisPesado(){
		if(peso > jogadormaispesado){
			jogadormaispesado = peso;
			nomemaispesado = nome;
		}
	}
	public double ContabilizarMediaAltura(){
		somaDasAlturas += altura;
		return mediaAltura = somaDasAlturas / jogador;
		
		
		
	}
	public void ExibirDados(){
		
		String msg = "A. Quantidade de jogadores cadastrados é "+jogador;
			   msg += "\nB. Nome do maior jogador é "+nomemaisalto;
			   msg += "\nB. altura do maior jogador é "+jogadormaisalto;
			   msg += "\nC. nome do jogador mais velho é "+nomemaisvelho;
			   msg += "\nC. idade do jogador mais velho é "+jogadormaisvelho;
			   msg += "\nD. nome do jogador mais pesado é "+nomemaispesado;
			   msg += "\nD. peso do jogador mais pesado é "+jogadormaispesado;
			   msg += "\nE. Media das alturas é "+mediaAltura;
			   
			   JOptionPane.showMessageDialog(null, msg);
	}	
}
