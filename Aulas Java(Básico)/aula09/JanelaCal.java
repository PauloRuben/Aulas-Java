package aula09;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;

public class JanelaCal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblResto;
	private JLabel lblCubo;
	private JLabel lblRaizQ;
	private JLabel lblRaizC;
	private JLabel lblRaizAbs;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCal frame = new JanelaCal();
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
	public JanelaCal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panCalc = new JPanel();
		
		JSpinner txtNum = new JSpinner(new SpinnerNumberModel(1, -50, 50, 1));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(JanelaCal.class.getResource("/imagens/3.png")));
		
		JLabel lblAbs = new JLabel("0");
		lblAbs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblRaizC = new JLabel("0");
		lblRaizC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblRaizQ = new JLabel("0");
		lblRaizQ.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblCubo = new JLabel("0");
		lblCubo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblResto = new JLabel("0");
		lblResto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_2 = new JLabel("Resto Da Divisão 2");
		
		JLabel lblNewLabel_3 = new JLabel("Elevado ao Cubo");
		
		JLabel lblNewLabel_4 = new JLabel("Raiz Quadrada");
		
		JLabel lblNewLabel_5 = new JLabel("Raiz Cúbica");
		
		JLabel lblNewLabel_6 = new JLabel("Valor Absoluto");
		GroupLayout gl_panCalc = new GroupLayout(panCalc);
		gl_panCalc.setHorizontalGroup(
			gl_panCalc.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panCalc.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panCalc.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panCalc.createSequentialGroup()
							.addGroup(gl_panCalc.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_6))
							.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
							.addGroup(gl_panCalc.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblAbs, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblRaizC, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)))
						.addGroup(gl_panCalc.createSequentialGroup()
							.addComponent(lblNewLabel_4)
							.addPreferredGap(ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
							.addComponent(lblRaizQ, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panCalc.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
							.addComponent(lblCubo, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panCalc.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
							.addComponent(lblResto, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panCalc.setVerticalGroup(
			gl_panCalc.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panCalc.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResto)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCubo)
						.addComponent(lblNewLabel_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRaizQ)
						.addComponent(lblNewLabel_4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRaizC)
						.addComponent(lblNewLabel_5))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAbs)
						.addComponent(lblNewLabel_6))
					.addContainerGap())
		);
		panCalc.setLayout(gl_panCalc);
		
		JLabel lblNewLabel_7 = new JLabel("Digite o Valor:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtNum.getValue().toString());
				
				//Resto da Divisão de 2
				int r = num % 2;
				lblResto.setText(Integer.toString(r));
				
				//elevadoao cubo
				double c = Math.pow(num, 3);//Pow é numero elevados
				lblCubo.setText(Double.toString(c));
				
				//Raiz quadrada(quadratica)
				double rq = Math.sqrt(num);//Sqrt é Raiz quadrada
				lblRaizQ.setText(String.format("%.2f", rq));
				
				//Raiz Cubica
				double rc = Math.cbrt(num);//cbrt é Raiz Cubica
				lblRaizC.setText(String.format("%.2f",rc));
				
				//Valor Absoluto(Transforma o número em Positivo) 
				int abs = Math.abs(num);//Abs é Valor absoluto
				lblAbs.setText(Integer.toString(abs));
				
				panCalc.setVisible(true);
			}
		});
		btnCalc.setIcon(new ImageIcon(JanelaCal.class.getResource("/imagens/4.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_7)
							.addGap(53)
							.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addComponent(btnCalc))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addComponent(panCalc, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)))
					.addGap(34)
					.addComponent(lblNewLabel_1))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_7)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(4)
									.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(37)
							.addComponent(btnCalc)
							.addGap(18)
							.addComponent(panCalc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_1)))
		);
		contentPane.setLayout(gl_contentPane);
		panCalc.setVisible(false);

	}
}
