package aula16;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaVoto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAno;
	private JLabel lblR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaVoto frame = new JanelaVoto();
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
	public JanelaVoto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Ano Nasc");
		
		JButton btnVoto =  new JButton("Posso Vota?");
		btnVoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AULA DE ESTRUTURA ENCADEADA
				int a = Integer.parseInt(txtAno.getText());
				int i = 2025 - a;
				if (i < 16) {
					lblR.setText("Não Vota!");
				}else {
					if((i>=16 && i<18) || (i>70)) {
						lblR.setText("Voto Opcional");
					}else {
						lblR.setText("Voto Obrigatorio");
						}
				}
			}
		});
		txtAno = new JTextField();
		txtAno.setColumns(10);
		
		lblR = new JLabel("Resultado");
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(129)
							.addComponent(lblNewLabel)
							.addGap(57)
							.addComponent(txtAno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(168)
							.addComponent(btnVoto))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(181)
							.addComponent(lblR)))
					.addContainerGap(107, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel))
						.addComponent(txtAno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addComponent(btnVoto)
					.addGap(61)
					.addComponent(lblR)
					.addGap(93))
		);
		contentPane.setLayout(gl_contentPane);

	}

}
