package exemplo01;

import javax.swing.JOptionPane;

public class Aluno {

	
	/*
	 Encapsulamento -> Visibilidade de atributos e métodos 
	 DEFAULT   -> Visível apenas nas classes do mesmo pacote
	 PUBLIC    -> Visível por qualquer classe (em qualquer projeto)
	 PRIVATE   -> Visível apenas na classe onde são criados
	 PROTECTED -> Visível na classe onde são criados ou herdados
	 */
	
	//Atributos da classe
	private String nome;
	private double nota1, nota2;
	
	//Método para obter os dados
	public void obterDados(){
		nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("nota 1"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("nota 2"));
		exibirFrase();
}
	
	//Método para retornar a média
	private double calculoMedia(){
		return(nota1+nota2) / 2;
	}
	
	//Método para exibir uma frase
	private void exibirFrase(){
		JOptionPane.showMessageDialog(null, nome+ " obteve média  "+calculoMedia());
	}
}