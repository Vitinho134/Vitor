package exercicio06;

import javax.swing.JOptionPane;

public class Perguntas {

String nome = "";
int masculino = 0;
int feminino = 0;
int nota1;
int nota2;
int nota3;
int nota4;
double media;
int continuar;
int total = 0;
String sexo;
int parab�ns = 0;
int otimo = 0;
int bom = 0;
int satisfatorio = 0;
int recupera��o = 0;
int reprovado = 0;
double pParab�ns;
double pBom;
double pOtimo;
double pSatisfatorio;
double pRecupera��o;
double pReprovado;
double pMasculino;
double pFeminino;

	public void DadosGerais(){
    nome = JOptionPane.showInputDialog(null, "Informe seu nome");
    total++;
    sexo = JOptionPane.showInputDialog("Qual seu sexo?\n1) Masculino\n2)Feminino");
    nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual � a sua primeira nota?"));
    nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual � a sua segunda nota?"));
    nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual � a sua terceira nota?"));
    nota4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual � a sua quarta nota?"));
    
}
	public void la�o(){
		do{
		DadosGerais();
		ContabilizarSexo();
		ContabilizarMedia();
		ContabilizarPercentualNotas();
		ContabilizarPercentualSexo();
		continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar ?");	
		}while(continuar == 0);

		ExibirDados();
	}

	public void ContabilizarSexo(){
	if(sexo.equals("1")){
		masculino++;
	}
	if(sexo.equals("2")){
	feminino++;
	}
	
}
	public void ContabilizarMedia(){
	media = (nota1+nota2+nota3+nota4)/4;

	if(media == 10){
	parab�ns++;
	}else if(media >= 9){
	otimo++;
	}else if(media >= 8){
	bom++;
	}else if(media >= 7){
	satisfatorio++;
	}else if(media >= 5){
	recupera��o++;
	}else if(media < 5){
	reprovado++;
	}else if((media < 0) && (media > 10)){
	JOptionPane.showMessageDialog(null, "Inv�lido");
}
	}
	
	public void ContabilizarPercentualNotas(){
	pParab�ns = 100/total*parab�ns;
	pBom = 100/total*bom;
	pOtimo = 100/total*otimo;
	pSatisfatorio = 100/total*satisfatorio;
	pRecupera��o =  100/total*recupera��o;
	pReprovado = 100/total*reprovado;
	}
	
	public void ContabilizarPercentualSexo(){
	pMasculino = 100/total*masculino;
	pFeminino = 100/total*feminino;
	}
	public void ExibirDados(){
	String msg = "numero de pessoas � "+total;
		   msg += "\ntemos "+masculino+ "homens";
		   msg += "\ntemos "+feminino+ "mulheres";
		   msg += "\nNumero de alunos que tiraram 10 � "+parab�ns;
		   msg += "\nNumero de alunos que tiraram 9.0 e 9.9 � "+otimo;
		   msg += "\nNumero de alunos que tiraram 8.0 e 8.9 � "+bom;
		   msg += "\nNumero de alunos que tiraram 7.0 e 7.9 � "+satisfatorio;
		   msg += "\nNumero de alunos que tiraram 5.0 e 6.9 � "+recupera��o;
		   msg += "\nNumero de alunos que tiraram abaixo de 5 � "+reprovado;
		   msg += "\nPercentual de homens � "+pMasculino;
		   msg += "\nPercentual de mulheres � "+pFeminino;
		   msg += "\nPercentual de alunos que tiraram 10 � "+pParab�ns;
		   msg += "\nPercentual de alunos que tiraram 9.0 e 9.9 � "+pOtimo+ "%";
		   msg += "\nPercentual de alunos que tiraram 8.0 e 8.9 � "+pBom+ "%";
		   msg += "\nPercentaul de alunos que tiraram 7.0 e 7.9 � "+pSatisfatorio+ "%";
		   msg += "\nPercentual de  alunos que tiraram 5.0 e 6.9 � "+pRecupera��o+ "%";
		   msg += "\nPercentual de alunos que tiraram abaixo de 5 �  "+pReprovado+ "%";
		   
		   JOptionPane.showMessageDialog(null, msg);
		   
		   
	}
}