package aula25;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class JanelaContador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblInicio;
	private JLabel lblFim;
	private JLabel lblPasso;
	private JList lstCont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaContador frame = new JanelaContador();
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
	public JanelaContador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Início");
		
		JLabel lblNewLabel_1 = new JLabel("Fim");
		
		JLabel lblNewLabel_2 = new JLabel("Passo");
		
		lblInicio = new JLabel("0");
		
		lblFim = new JLabel("6");
		
		lblPasso = new JLabel("1");
		
		JSlider sliInicio = new JSlider();
		sliInicio.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int i =sliInicio.getValue();
				lblInicio.setText(Integer.toString(i));
			}
		});
		sliInicio.setValue(0);
		sliInicio.setMaximum(5);
		
		JSlider sliFim = new JSlider();
		sliFim.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int f = sliFim.getValue();
				lblFim.setText(Integer.toString(f));
			}
		});
		sliFim.setValue(6);
		sliFim.setMinimum(6);
		sliFim.setMaximum(20);
		
		JSlider sliPasso = new JSlider();
		sliPasso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int p = sliPasso.getValue();
				lblPasso.setText(Integer.toString(p));
			}
		});
		sliPasso.setMaximum(20);
		sliPasso.setMinimum(1);
		sliPasso.setValue(1);
		
		JButton btnCont = new JButton("Contar");
		btnCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = sliInicio.getValue();
				int f = sliFim.getValue();
				int p = sliPasso.getValue();
				
				DefaultListModel lista = new DefaultListModel();
				//classe padrao de LISTA, adicionando o objeto lista
				
				for(int c=i; c<=f; c+=p) {//c de contador, += é somar
					lista.addElement(c);//adcionando elemento c na lista
				}
				lstCont.setModel(lista);
			}
		});
		
		lstCont = new JList();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(111)
							.addComponent(btnCont))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lstCont, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel, Alignment.LEADING)
										.addComponent(lblNewLabel_2, Alignment.LEADING)
										.addComponent(lblNewLabel_1, Alignment.LEADING))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(sliInicio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(sliFim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(sliPasso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblInicio)
										.addComponent(lblFim)
										.addComponent(lblPasso))))))
					.addContainerGap(172, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(lblInicio)))
						.addComponent(sliInicio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFim, Alignment.TRAILING)
						.addComponent(lblNewLabel_1, Alignment.TRAILING)
						.addComponent(sliFim, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(sliPasso, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPasso, Alignment.TRAILING)
						.addComponent(lblNewLabel_2, Alignment.TRAILING))
					.addGap(18)
					.addComponent(btnCont)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lstCont, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);

	}
}
