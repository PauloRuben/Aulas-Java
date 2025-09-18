package aula15;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;


public class JanelaEquacao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblA;
	private JLabel lblB;
	private JLabel lblC;
	private JLabel lblDelta;
	private JLabel lblRaiz;
	private JPanel panResultado;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaEquacao frame = new JanelaEquacao();
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
	public JanelaEquacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JSpinner txtA = new JSpinner();
		txtA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(txtA.getValue().toString());
			}
		});
		
		JLabel lblNewLabel = new JLabel("<html>X<sup>2</sup>+</html>");
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		JSpinner txtB = new JSpinner();
		txtB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(txtB.getValue().toString());
			}
		});
		
		JSpinner txtC = new JSpinner();
		txtC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(txtC.getValue().toString());
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("= 0");
		
		JLabel lblNewLabel_3 = new JLabel("<html>&Delta; =</html>");
		
		lblB = new JLabel("<html>B<sup>2</sup></html>");
		lblB.setForeground(new Color(255, 0, 0));
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_5 = new JLabel("-4.");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblA = new JLabel("A");
		lblA.setForeground(new Color(255, 0, 0));
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_7 = new JLabel(".");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblC = new JLabel("C");
		lblC.setForeground(new Color(255, 0, 0));
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		


		
		JLabel lblNewLabel_13 = new JLabel("X +");
		
		JLabel lblNewLabel_9 = new JLabel("<html>Valor de &Delta; =</html>");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_10 = new JLabel("Tipo Raízes:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
	    lblDelta = new JLabel("0");
		lblDelta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDelta.setForeground(new Color(0, 0, 255));
		
		lblRaiz = new JLabel("0");
		lblRaiz.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRaiz.setForeground(new Color(0, 0, 255));
		
		JButton btnCalc = new JButton("<html>Calcular &Delta;</html>");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtA.getValue().toString());
				int b = Integer.parseInt(txtB.getValue().toString());
				int c = Integer.parseInt(txtC.getValue().toString());
				
				double delta =  Math.pow(b, 2) -4 * a * c ;
				lblDelta.setText(String.format("%.1f",delta));
				
				if(delta < 0) {
					lblRaiz.setText("Não existe raízes Reais.");
				}
				else {
					lblRaiz.setText("Existem ráizes Reais.");
				}
				
				panResultado.setVisible(true);
			}
		});
		
		panResultado = new JPanel();
		GroupLayout gl_panResultado = new GroupLayout(panResultado);
		gl_panResultado.setHorizontalGroup(
			gl_panResultado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panResultado.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panResultado.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panResultado.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDelta)
						.addComponent(lblRaiz))
					.addContainerGap(289, Short.MAX_VALUE))
		);
		gl_panResultado.setVerticalGroup(
			gl_panResultado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panResultado.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_panResultado.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_9)
						.addComponent(lblDelta))
					.addGap(18)
					.addGroup(gl_panResultado.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_10)
						.addComponent(lblRaiz))
					.addContainerGap(52, Short.MAX_VALUE))
		);
		panResultado.setLayout(gl_panResultado);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(txtA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel)
					.addGap(36)
					.addComponent(txtB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_13)
					.addGap(43)
					.addComponent(lblNewLabel_1)
					.addGap(10)
					.addComponent(txtC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblNewLabel_2))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblB, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblNewLabel_5)
					.addGap(6)
					.addComponent(lblA)
					.addGap(4)
					.addComponent(lblNewLabel_7)
					.addGap(9)
					.addComponent(lblC)
					.addGap(10)
					.addComponent(btnCalc, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
				.addComponent(panResultado, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(txtB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_13))
						.addComponent(lblNewLabel_1)
						.addComponent(txtC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_2)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(lblNewLabel_3))
						.addComponent(lblB)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_5))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(lblA))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_7))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(lblC))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(btnCalc)))
					.addGap(47)
					.addComponent(panResultado, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
		);
		
		contentPane.setLayout(gl_contentPane);
		panResultado.setVisible(false);
	}
}
