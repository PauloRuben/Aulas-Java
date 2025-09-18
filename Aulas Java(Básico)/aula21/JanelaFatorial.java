package aula21;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class JanelaFatorial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblFat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaFatorial frame = new JanelaFatorial();
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
	public JanelaFatorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("!=");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		lblFat = new JLabel("1");
		lblFat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFat.setForeground(new Color(255, 0, 0));
		
		JSpinner txtN = new JSpinner();
		txtN.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//AULA FATORIAL 5 =! 5 x 4 x 3 x 2 x 1
				int n = Integer.parseInt(txtN.getValue().toString());
				//cada controle tem um tipo de conversão diferente
				//spinner retorna objeto e slider retorna inteiro
				
				int f = 1;//f de fatorial
				int c = n;//c de contador
				
				while(c > 1) {
					f *= c;
					c--;//tira um a cada interação
				}
				lblFat.setText(Integer.toString(f));
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(JanelaFatorial.class.getResource("/imagens/boneco.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(152)
					.addComponent(lblNewLabel_2))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtN, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel)
					.addGap(10)
					.addComponent(lblFat))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addComponent(lblNewLabel_2)
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel)
							.addComponent(txtN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(lblFat))))
		);
		contentPane.setLayout(gl_contentPane);

	}
}
