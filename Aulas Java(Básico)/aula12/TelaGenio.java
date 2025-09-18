package aula12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaGenio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGenio frame = new TelaGenio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaGenio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 420);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JLabel lblFrase = new JLabel("Frase");
		lblFrase.setBounds(165, 77, 123, 59);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(152, 29, 150, 150);
		lblNewLabel.setIcon(new ImageIcon(TelaGenio.class.getResource("/imagens/balao.png")));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(248, 115, 150, 212);
		lblNewLabel_1.setIcon(new ImageIcon(TelaGenio.class.getResource("/imagens/genio2.png")));
		
		JSpinner txtVal = new JSpinner();
		txtVal.setBounds(71, 288, 80, 20);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblValor.setBounds(15, 288, 46, 14);
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(txtVal);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblValor);
		contentPane.add(lblFrase);

		JButton btlPaplpite = new JButton("PALPITE");
		btlPaplpite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*aqui criaremos oque o gênio ira pensar
				 Sortearemos o número*/
				double n = 1 + Math.random() * (6-1);
				int valor =(int) n;//dentro de valor temos um valor aleatorio
				
				//aqui pegaremos o valor que o usuario digitou
				int num = Integer.parseInt(txtVal.getValue().toString());
				//configurando as frases
				String f1 = "<html>ACERTOU! O valor é: "+ valor +"</html>";
				String f2 = "<html>ERROU! Eu pensei no valor: "+ valor + "</html>";
				
				String res = (valor == num)?f1:f2;//lembrese do operador ternario
				
				//aqui ao responder a frase ficara em ARIAL BLACK tamanho 16
				lblFrase.setFont(new Font("Arial Black", Font.PLAIN, 16));
				
				//mostrando o RES no balao
				lblFrase.setText(res);
			}
		});
		btlPaplpite.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btlPaplpite.setBounds(10, 319, 165, 23);
		contentPane.add(btlPaplpite);
		lblFrase.setText("<html>Vou pensar em um valor"
				+ "entre 1 e 5.tente adivinhar</html>");

		
		

	}
}
