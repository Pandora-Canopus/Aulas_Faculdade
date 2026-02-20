package proj_aula02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TelaMarca implements ActionListener {
	
	JFrame tela = new JFrame("Cadastro de Marca");
	JPanel painel = new JPanel();
	JLabel lbnome = new JLabel("Nome: ");
	JLabel lbcodigo = new JLabel("Código: ");
	JTextField txtcod = new JTextField();
	JTextField txtnome = new JTextField();
	JButton btsalvar = new JButton("Salvar");
	JButton btcancelar = new JButton("Cancelar");
	
	
	void criarTela() {
		tela.setSize(350,250);
		tela.setLocation(300,300);
		lbcodigo.setBounds(10,10,100,30);
		txtcod.setBounds(110, 10, 100, 30);
		lbnome.setBounds(10, 50, 100, 30);
		txtnome.setBounds(110, 50, 100, 30);
		btsalvar.setBounds(20,100,120,30); 
		btcancelar.setBounds(150,100,120,30);
		
		painel.setLayout(null);
		painel.add(lbcodigo);
		painel.add(txtcod);
		painel.add(lbnome);
		painel.add(txtnome);
		painel.add(btsalvar);
		btsalvar.addActionListener(this);
		
		painel.add(btcancelar);
		
		tela.getContentPane().add(painel);
		tela.setVisible(true); // tornar visível.

	}
	
	public static void main(String[] args) {
		TelaMarca t=new TelaMarca();
		t.criarTela();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub 
		if(e.getSource() == btsalvar)
			JOptionPane.showMessageDialog(null, "O Código: "+ txtcod.getText()
		+"\nO nome: "+txtnome.getText());
		
	}
	

}
