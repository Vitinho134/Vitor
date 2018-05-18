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
int parabéns = 0;
int otimo = 0;
int bom = 0;
int satisfatorio = 0;
int recuperação = 0;
int reprovado = 0;
double pParabéns;
double pBom;
double pOtimo;
double pSatisfatorio;
double pRecuperação;
double pReprovado;
double pMasculino;
double pFeminino;

	public void DadosGerais(){
    nome = JOptionPane.showInputDialog(null, "Informe seu nome");
    total++;
    sexo = JOptionPane.showInputDialog("Qual seu sexo?\n1) Masculino\n2)Feminino");
    nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua primeira nota?"));
    nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua segunda nota?"));
    nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua terceira nota?"));
    nota4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua quarta nota?"));
    
}
	public void laço(){
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
	parabéns++;
	}else if(media >= 9){
	otimo++;
	}else if(media >= 8){
	bom++;
	}else if(media >= 7){
	satisfatorio++;
	}else if(media >= 5){
	recuperação++;
	}else if(media < 5){
	reprovado++;
	}else if((media < 0) && (media > 10)){
	JOptionPane.showMessageDialog(null, "Inválido");
}
	}
	
	public void ContabilizarPercentualNotas(){
	pParabéns = 100/total*parabéns;
	pBom = 100/total*bom;
	pOtimo = 100/total*otimo;
	pSatisfatorio = 100/total*satisfatorio;
	pRecuperação =  100/total*recuperação;
	pReprovado = 100/total*reprovado;
	}
	
	public void ContabilizarPercentualSexo(){
	pMasculino = 100/total*masculino;
	pFeminino = 100/total*feminino;
	}
	public void ExibirDados(){
	String msg = "numero de pessoas é "+total;
		   msg += "\ntemos "+masculino+ "homens";
		   msg += "\ntemos "+feminino+ "mulheres";
		   msg += "\nNumero de alunos que tiraram 10 é "+parabéns;
		   msg += "\nNumero de alunos que tiraram 9.0 e 9.9 é "+otimo;
		   msg += "\nNumero de alunos que tiraram 8.0 e 8.9 é "+bom;
		   msg += "\nNumero de alunos que tiraram 7.0 e 7.9 é "+satisfatorio;
		   msg += "\nNumero de alunos que tiraram 5.0 e 6.9 é "+recuperação;
		   msg += "\nNumero de alunos que tiraram abaixo de 5 é "+reprovado;
		   msg += "\nPercentual de homens é "+pMasculino;
		   msg += "\nPercentual de mulheres é "+pFeminino;
		   msg += "\nPercentual de alunos que tiraram 10 é "+pParabéns;
		   msg += "\nPercentual de alunos que tiraram 9.0 e 9.9 é "+pOtimo+ "%";
		   msg += "\nPercentual de alunos que tiraram 8.0 e 8.9 é "+pBom+ "%";
		   msg += "\nPercentaul de alunos que tiraram 7.0 e 7.9 é "+pSatisfatorio+ "%";
		   msg += "\nPercentual de  alunos que tiraram 5.0 e 6.9 é "+pRecuperação+ "%";
		   msg += "\nPercentual de alunos que tiraram abaixo de 5 é  "+pReprovado+ "%";
		   
		   JOptionPane.showMessageDialog(null, msg);
		   
		   
	}
}