package exemplo01;

import javax.swing.JOptionPane;

public class Aluno {

	
	/*
	 Encapsulamento -> Visibilidade de atributos e m�todos 
	 DEFAULT   -> Vis�vel apenas nas classes do mesmo pacote
	 PUBLIC    -> Vis�vel por qualquer classe (em qualquer projeto)
	 PRIVATE   -> Vis�vel apenas na classe onde s�o criados
	 PROTECTED -> Vis�vel na classe onde s�o criados ou herdados
	 */
	
	//Atributos da classe
	private String nome;
	private double nota1, nota2;
	
	//M�todo para obter os dados
	public void obterDados(){
		nome = JOptionPane.showInputDialog("Qual � o seu nome?");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("nota 1"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("nota 2"));
		exibirFrase();
}
	
	//M�todo para retornar a m�dia
	private double calculoMedia(){
		return(nota1+nota2) / 2;
	}
	
	//M�todo para exibir uma frase
	private void exibirFrase(){
		JOptionPane.showMessageDialog(null, nome+ " obteve m�dia  "+calculoMedia());
	}
}