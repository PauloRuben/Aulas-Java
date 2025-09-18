package aula18;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaTriangulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panResposta;
	private JLabel lblA;
	private JLabel lblB;
	private JLabel lblC;
	private JLabel lblStatus;
	private JLabel lblTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaTriangulo frame = new JanelaTriangulo();
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
	public JanelaTriangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Segmento A");
		
		JLabel lblNewLabel_1 = new JLabel("Segmento B");
		
		JLabel lblNewLabel_2 = new JLabel("Segmento C");
		
		panResposta = new JPanel();
		
		lblA = new JLabel("0");
		lblA.setForeground(new Color(0, 0, 128));
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		lblB = new JLabel("0");
		lblB.setForeground(new Color(0, 0, 128));
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		lblC = new JLabel("0");
		lblC.setForeground(new Color(0, 0, 128));
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		lblStatus = new JLabel("Forma ou não?");
		lblStatus.setForeground(new Color(0, 64, 128));
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		lblTipo = new JLabel("Tipo de Triangulo");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipo.setForeground(new Color(255, 0, 0));
		
		JSlider sliA = new JSlider();
		sliA.setMaximum(20);
		sliA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(Integer.toString(sliA.getValue()));
			}
		});
		sliA.setValue(0);
		
		JSlider sliB = new JSlider();
		sliB.setMaximum(20);
		sliB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(Integer.toString(sliB.getValue()));
			}
		});
		sliB.setValue(0);
		
		JSlider sliC = new JSlider();
		sliC.setMaximum(20);
		sliC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(Integer.toString(sliC.getValue()));
			}
		});
		sliC.setValue(0);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(JanelaTriangulo.class.getResource("/imagens/triangulo.png")));
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = sliA.getValue();
				int b = sliB.getValue();
				int c = sliC.getValue();
				
				if(a<b+c && b<a+c && c<a+b ) {
					lblStatus.setText("Forma um Triangulo");
					if(a==b && b==c) {
						lblTipo.setText("Equilátero");
					}
					else if(a!=b && b!=c && a!=c) {
						lblTipo.setText("Escalano");
					} else
						lblTipo.setText("Isóceles");
				}else {
					lblStatus.setText("Não formam um Triangulo");
					lblTipo.setText("--------------");
				}
				
				panResposta.setVisible(true);
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panResposta, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(lblNewLabel_1))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(sliA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(sliB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(14)
											.addComponent(btnVerificar))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(sliC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblC, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
								.addComponent(lblB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblA, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
							.addComponent(lblNewLabel_3)
							.addGap(20))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(sliA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblA))
							.addGap(14)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(8))
								.addComponent(sliB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblB, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_2)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(sliC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblC, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
							.addComponent(btnVerificar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_3)))
					.addGap(13)
					.addComponent(panResposta, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		

		GroupLayout gl_panResposta = new GroupLayout(panResposta);
		gl_panResposta.setHorizontalGroup(
			gl_panResposta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panResposta.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panResposta.createParallelGroup(Alignment.LEADING)
						.addComponent(lblStatus)
						.addComponent(lblTipo))
					.addContainerGap(255, Short.MAX_VALUE))
		);
		gl_panResposta.setVerticalGroup(
			gl_panResposta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panResposta.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblStatus)
					.addGap(28)
					.addComponent(lblTipo)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		panResposta.setLayout(gl_panResposta);
		contentPane.setLayout(gl_contentPane);
		panResposta.setVisible(false);

	}
}
