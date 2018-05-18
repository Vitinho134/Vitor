package exercicio04;

import javax.swing.JOptionPane;

public class Filme {

	  int nota;
	    int criancas = 0;
	    int adolescentes = 0;
	    int adultos = 0;
	    int idade = 0;
	    int excelente = 0;
	    int otimo = 0;
	    int bom = 0;
	    int regular = 0;
	    int ruim = 0;
	    int continuar = 0;
	    int votos = 0;
	    int totalidades = 0;
	    int pessoas = 0;
	    double totalexcelente = 0;
	    double totalotimo = 0;
	    double totalbom = 0;
	    double totalregular = 0;
	    double totalruim = 0;
	    
	    public void DadosGerais(){
	    do{
	    	nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua nota para o filme Alice no país das maravilhas?\n1 Excelente\n2 Ótimo \n3 Bom \n4Regular \n5 Ruim"));
	    	
	    }while((nota > 5) || (nota < 0));
	    
	    votos++;
	    idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
	    }
	    public void laco() {
	    	do {
	    		DadosGerais();
	    		ContabilizarVotos();
	    		ContabilizarIdade();
	    		continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar ?");	
	    		}while(continuar == 0);
	    		ExibirDados();
	    		
	    	
	    	}
	    
	    public void ContabilizarVotos(){
	        if(nota == 1){
	        excelente++;
	        
	        }else if(nota == 2){
	        otimo++;
	        
	        }else if(nota == 3){
	        bom++;
	        
	        }else if(nota == 4){
	        regular++;
	        
	        }else if(nota == 5){
	        ruim++;
	        	

	         
	        }
	    }
	    
	    public void ContabilizarIdade(){
	        if((idade <= 10) && (idade == 0)){

	            criancas++;

	    }else if((idade < 18) && (idade <= 17)){
	    
	        adolescentes++;

	    }else if(idade >= 18){

	        adultos++;
	    }else if((idade <0) && (idade > 100)){
	        JOptionPane.showMessageDialog(null, "Invalido");
	    }
	    }
	    
	    public void ExibirDados(){
	    String msg = "Total de votos "+votos+"\nExelente teve "+(100/votos*excelente)+" %.\nÓtimo teve "+(100/votos*otimo)+" %.\nBom teve "+(100/votos*bom)+" %.\nRegular teve "+(100/votos*regular)+ " %.\nRuim teve "+(100/votos*ruim)+" %";
	    String msg1 = "Teve "+criancas+" crianças votando.\nTeve "+adolescentes+" adolecentes votando.\nTeve "+adultos+" adultos votando";
	    JOptionPane.showMessageDialog(null, msg+ "\n" +msg1 );
	    }
	}





