package ex02_JLabel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {

	public static void main(String[] args) {
		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500,300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);
		
		//Instaciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("HI,WORLD");
		rotulo.setBounds(0,0,300,20);
		
		//Adicionar
		formulario.add(rotulo);
	}

}
