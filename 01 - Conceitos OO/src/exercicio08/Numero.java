package exercicio08;

import javax.swing.JOptionPane;

public class Numero {
	int numero;
	int antecessor1;
	int antecessor2;
	int antecessor3;
	int antecessor4;
	int antecessor5;
	int antecessor6;
	int antecessor7;
	int antecessor8;
	int antecessor9;
	int antecessor10;
	int sucessor1;
	int sucessor2;
	int sucessor3;
	int sucessor4;
	int sucessor5;
	int sucessor6;
	int sucessor7;
	int sucessor8;
	int sucessor9;
	int sucessor10;
	int continuar = 0;
	
	
	 public void DadosGerais(){
	  numero = Integer.parseInt(JOptionPane.showInputDialog("Informe seu numero"));
}
	 public void laco(){
		 do{
			 DadosGerais();
			 ContabilizarSucAnt();
			 ExibirDados();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar ?");	
			}while(continuar == 0);
		 }
	 
	 public void ContabilizarSucAnt(){
		    antecessor1 = numero-1;
		     antecessor2 = numero-2;
		     antecessor3 = numero-3;
		     antecessor4 = numero-4;
		     antecessor5 = numero-5;
		     antecessor6 = numero-6;
		     antecessor7 = numero-7;
		     antecessor8 = numero-8;
		     antecessor9 = numero-9;
		     antecessor10 = numero-10;
		     sucessor1 = numero+1;
		     sucessor2 = numero+2;
		     sucessor3 = numero+3;
		     sucessor4 = numero+4;
		     sucessor5 = numero+5;
		     sucessor6 = numero+6;
		     sucessor7 = numero+7;
		     sucessor8 = numero+8;
		     sucessor9 = numero+9;
		     sucessor10 = numero+10;
	 }
	 public void ExibirDados(){
		 String msg = "O primeiro sucessor � "+sucessor1+" e o primeiro antecessor � "+antecessor1+".\nO  segundo sucessor � "+sucessor2+" e o segundo antecessor � "+antecessor2+".\nO  terceiro sucessor � "+sucessor3+" e o terceiro antecessor � "+antecessor3+".\nO  quarto sucessor � "+sucessor4+" e o quarto antecessor � "+antecessor4+".\nO  quinto sucessor � "+sucessor5+" e o quinto antecessor  � "+antecessor5+".\nO  sexto sucessor � "+sucessor6+" e o sexto antecessor � "+antecessor6+".\nO setimo sucessor � "+sucessor7+" e o setimo antecessor � "+antecessor7+".\nO  oitavo sucessor � "+sucessor8+" e o oitavo antecessor � "+antecessor8+".\nO  nono sucessor  � "+sucessor9+" e o nono antecessor � "+antecessor9+".\nO  decimo sucessor � "+sucessor10+" e o decimo antecessor � "+antecessor10; 
		 JOptionPane.showMessageDialog(null, msg);
	 }
}
