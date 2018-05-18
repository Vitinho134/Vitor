package ex04_JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Principal {
	public static void main(String[] args) {
		
		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500,300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);
		
		//JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe seu nome");
		rotulo.setBounds(10,10,150,20);
		
		//JTextField
		JTextField campo = new JTextField();
		campo.setBounds(120,10,150,20);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("CLIQUE AQUI!");
		botao.setBounds(60,50,150,20);
		
		//Adicionar uma ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Exibir nome
				JOptionPane.showMessageDialog(null,"olá "+campo.getText());
				
				//Limpar o campo contendo no nome
				campo.setText("");
				
				//Selecionar o campo no nome
				campo.requestFocus();
			}
		});
		
		//Adicionar elementos ao JFrame
		formulario.add(rotulo);
		formulario.add(campo);
		formulario.add(botao);
		
		//Exibir o formulario
		formulario.setVisible(true);
	}

	}

