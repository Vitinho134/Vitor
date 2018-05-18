package exercicio01;

import javax.swing.JOptionPane;

public class Pessoa {
    String nome;
    String sexo;
    String cargo;
    int idade;
    int masculino = 0;
    int feminino = 0;
    int maioridade = 0;
    int menoridade = 0;
    int gerente = 0;
    int atendente = 0;
    int acougueiro = 0;
    int secretaria = 0;
    int almoxarife = 0;
    int padeiro = 0;
    int estagiario = 0;
       
    public void ObterDados(){
    nome = JOptionPane.showInputDialog("Qual seu nome?");
    sexo = JOptionPane.showInputDialog("Qual seu sexo?\n(primeira letra é obrigatoriamente Maiuscula)");
    cargo = JOptionPane.showInputDialog("Qual seu cargo?\n(primeira letra é obrigatoriamente Maiuscula)");
    idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
    	
    }
    public void laco(){
		
		//Variavel continuar
		int continuar = 0;
		
		do{
			ObterDados();
			contabilizarSexo();
			contabilizarCargo();
			contabilizarIdade();
			exibirDados();
			
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
		}while(continuar == 0);
		
	}
    

    
    public void contabilizarSexo(){
    if(sexo.equals("Masculino")){
    	masculino++;
    }
    if(sexo.equals("Feminino")){
    	feminino++;
    }
    }
    
    
    public void contabilizarCargo(){
    if(cargo.equals("Gerente")){
    	gerente++;
    }
    if(cargo.equals("Atendente")){
    atendente++;
    }
    if(cargo.equals("Açougueiro")){
    	acougueiro++;
    }
    if(cargo.equals("Secretaria")){
    	secretaria++;
    }
    if(cargo.equals("Almoxarife")){
    almoxarife++;
    }
    if(cargo.equals("Padeiro")){
    padeiro++;
    }
    if(cargo.equals("estagiario")){
    estagiario++;
    }
  
    }
    
    public void contabilizarIdade(){
    	
    if(idade >= 18){
    	maioridade++;
    }
    if(idade < 17){
    	menoridade++;
    }
    }
    
    public void exibirDados(){
    	String msg = "Seu nome é "+nome;
    		   msg += "\nSeu cargo é "+cargo;
    		   msg += "\nSeu sexo é "+sexo;
    		   msg += "\nQuantidade de homens é "+masculino;
    		   msg += "\nQuatidade de mulheres é "+feminino;
    		   msg += "\nQuantidade de Gerente é "+gerente;
    		   msg += "\nQuantidade de Atendente é "+atendente;
    		   msg += "\nQuantidade de Açougueiro é "+acougueiro;
    		   msg += "\nQuantidade de Secretaria é "+secretaria;
    		   msg += "\nQuantidade de Almoxarife é "+almoxarife;
    		   msg += "\nQuantidade de Padeiro é "+padeiro;
    		   msg += "\nQuantidade de Estagiario é "+estagiario;
    		   msg += "\nQuantidade de pessoas maiores de 18 é "+maioridade;
    		   msg += "\nQuantidade de pessoas menores de 18 é " +menoridade;
    		   JOptionPane.showMessageDialog(null, msg);
    }
    
}
