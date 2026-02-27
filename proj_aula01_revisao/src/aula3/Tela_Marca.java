package aula3;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tela_Marca implements ActionListener{

	Marca marca = new Marca();
	MarcaDao md = new MarcaDao();
	
	JFrame tela = new JFrame("Cadastro de Marca");
	JPanel painel = new JPanel();
	JLabel lbnome = new JLabel("Nome");
	JLabel lbcod = new JLabel("Código");
	
	//caixas de texto
	JTextField txtnome = new JTextField(); 
	JTextField txtcod = new JTextField(); 
	//Campo de informacoes
	
	//os botoes
	JButton btsalvar = new JButton("Cadastrar");
	JButton btconsulta = new JButton("Consultar");
	JButton btalterar = new JButton("Alterar");
	JButton btexcluir = new JButton("Excluir");
	JButton btfechar = new JButton("Fechar");
	
	public void criarTela(){
		tela.setSize(300,  240);//tamanho da tela
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocation(250, 250);//localizacao no monitor
		painel.setLayout(null);
		
		lbcod.setBounds(10, 10, 100, 30);
		txtcod.setBounds(10, 40, 100, 30);
		txtcod.setEditable(true);//desabilita  o campo
		
		lbnome.setBounds(10, 70, 100, 30);
		txtnome.setBounds(10, 100, 100, 30);
	
		btsalvar.setBounds(190, 10, 100, 30);
		btsalvar.addActionListener(this); //acao do botao
		
		btconsulta.setBounds(190, 50, 100, 30);
		btconsulta.addActionListener(this); //acao do botao
		btconsulta.setEnabled(true);

		btalterar.setBounds(190, 90, 100, 30);
		btalterar.addActionListener(this); //acao do botao
		btalterar.setEnabled(false);
		
		btexcluir.setBounds(190, 130, 100, 30);
		btexcluir.addActionListener(this); //acao do botao
		btexcluir.setEnabled(false);
		
		btfechar.setBounds(190, 170, 100, 30);
		btfechar.addActionListener(this); //acao do botao
		
		painel.add(lbnome);
		painel.add(txtnome);
		painel.add(lbcod);
		painel.add(txtcod);
		
		painel.add(btsalvar);
		painel.add(btconsulta);
		painel.add(btalterar);
		painel.add(btexcluir);
		painel.add(btfechar);
		
		tela.getContentPane().add(painel);
		tela.setVisible(true);// torna visivel		
	}

	
	public static void main(String[] args) {
		Tela_Marca tm = new Tela_Marca();
		tm.criarTela();
	}

	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btsalvar){
			marca.setMarnome(txtnome.getText());
			md.salvar(marca);
			txtnome.setText("");
			btconsulta.setEnabled(true);
			btalterar.setEnabled(true);
			btexcluir.setEnabled(true);
			txtcod.setEditable(true);
		}
		if(e.getSource() == btconsulta){
			int c = Integer.parseInt(txtcod.getText());
			marca = md.consultar(c);
			if(marca == null){
			      JOptionPane.showMessageDialog(null, "Código Invalido");
			}else{
				txtcod.setText(String.valueOf(marca.getMarcod()));
				txtnome.setText(marca.getMarnome());
				btalterar.setEnabled(true);
				btexcluir.setEnabled(true);
			}
		}
		
		if(e.getSource() == btalterar){
			int c = Integer.parseInt(txtcod.getText());
			marca = md.consultar(c);
			if(marca == null){
			      JOptionPane.showMessageDialog(null, "Código Invalido");
			}else{
				//marca.setMarcod(Integer.parseInt(txtcod.getText()));
				marca.setMarnome(txtnome.getText());
				md.alterar(marca);
				txtnome.setText("");
				txtcod.setText("");
				
			}
		}
		
		if(e.getSource() == btexcluir){
			int c = Integer.parseInt(txtcod.getText());
			marca = md.consultar(c);
			if(marca == null){
			      JOptionPane.showMessageDialog(null, "Código Invalido");
			}else{
				
				md.excluir(marca);
				txtnome.setText("");
				txtcod.setText("");
			}
		}
	}
	*/
	
}

	
	





	
	