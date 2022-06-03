import javax.swing.*;
import java.awr.event.*;

public class Usuario extends JFrame implements ActionListener{
	private JTextField textfield1;
	private JLabel label1;
	private JButton boton1;

public Usuario(){
	setLayout(null);
	label1 = new JLabel("Usuario");
	label1.setBounds(10,10,100,30);
	add(label1);

	textfield1 = new JTextField();
	textfield1.setBounds(120,17,150,20);
	add(textfield1);

	boton1 = new JButton("Aceptar");
	boton1.setBounds(10,80,100,30);
	add(boton1);
	boton1.addActionListener(this);
}

public void actionPerformed(ActionEvent e){
	if(e.getSource() == boton1){
		String texto = textfield1.getText();
		 setTitle(texto);
	}
   }


public static void main(String args[]){
	Usuario usuario1 = new Usuario();
	usuario1.setVisible(true);
	usuario1.setResizable(false);
	usuario1.setLocationRelativeTo(null);
   }
  }
