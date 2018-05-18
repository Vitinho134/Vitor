package exercicio10;

import javax.swing.JOptionPane;

public class Votos {

    int vcandidato1 = 0;
    int vcandidato2 = 0;
    int vcandidato3 = 0;
    int vcandidato4 = 0;
    int continuar = 0;
    int votos = 0;
    int vvencedor = 0;
    String vencedor;
    int votosc1;
    int votosc2;
    int votosc3;
    int votosc4;
    

    Object[] voto = {"candidato1", "candidato2", "candidato3", "candidato4"};

    public void DadosGerais(){
    	
        Object escolha = JOptionPane.showInputDialog(null, "Qual seu voto", "Título", JOptionPane. PLAIN_MESSAGE,null,voto,"");
        votos++;

        if(escolha.equals("candidato1")){

        vcandidato1++;

    }else if(escolha.equals("candidato2")){

        vcandidato2++;

    }else if(escolha.equals("candidato3")){

        vcandidato3++;
        
    }else if(escolha.equals("candidato4")){

        vcandidato4++;

    }
           
    }
    public void laço(){
    	
    	do{
    	DadosGerais();
    	ContabilizarDados();
        continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

        }while (continuar != 1);
    	
    	ExibirDados();
    	
    }
    
    public void ContabilizarDados(){
    	
    	votosc1 = (votos - vcandidato2 - vcandidato3 - vcandidato4);
        votosc2 = (votos - vcandidato1 - vcandidato3 - vcandidato4);
        votosc3 = (votos - vcandidato1 - vcandidato2 - vcandidato4);
        votosc4 = (votos - vcandidato1 - vcandidato2 - vcandidato3);


        if(votosc1 < votosc2){
        	vencedor = "candidato2";

        }else if(votosc1 < votosc3){
        	vencedor = "candidato3";

        }else if(votosc1 < votosc4){
        	vencedor = "candidato4";
        	
        }else if(votosc2 > votosc1){
        	vencedor = "candidato1";

        }else if(votosc2 < votosc3){
        	vencedor = "candidato2";

        }else if(votosc2 < votosc4){
        	vencedor = "candidato3";

        }else if(votosc3 < votosc1){
        	vencedor = "candidato4";
        	
    }else if(votosc3 > votosc2){
        	vencedor = "candidato1";

        }else if(votosc3 < votosc4){
        	vencedor = "candidato2";

        }else if(votosc4 < votosc1){
        	vencedor = "candidato3";

        }else if(votosc4 < votosc2){
        	vencedor = "candidato4";
    }else  if(votosc4 > votosc3){
        	vencedor = "candidato1";

    }
        
}
    public void ExibirDados(){
    	
        JOptionPane.showMessageDialog(null, "O candidato escolhido é "+vencedor+".");
    }

}