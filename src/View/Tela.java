package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import Controller.ThreadSapo;
public class Tela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSapo1 = new JLabel("Sapo1");
		lblSapo1.setForeground(Color.GREEN);
		lblSapo1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSapo1.setBounds(27, 11, 76, 27);
		contentPane.add(lblSapo1);
		
		JLabel lblSapo2 = new JLabel("Sapo2");
		lblSapo2.setForeground(Color.GREEN);
		lblSapo2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSapo2.setBounds(27, 49, 76, 27);
		contentPane.add(lblSapo2);
		
		JButton btnCorrer = new JButton("Correr");
		btnCorrer.setBounds(28, 232, 89, 23);
		contentPane.add(btnCorrer);
		
		JLabel lblColocacao = new JLabel("COLOCA\u00C7\u00D5ES: ");
		lblColocacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblColocacao.setBounds(154, 225, 103, 32);
		contentPane.add(lblColocacao);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl1.setBounds(255, 230, 76, 25);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl2.setBounds(255, 256, 76, 25);
		contentPane.add(lbl2);
		
		JLabel lblSapo3 = new JLabel("Sapo3");
		lblSapo3.setForeground(Color.GREEN);
		lblSapo3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSapo3.setBounds(27, 88, 76, 27);
		contentPane.add(lblSapo3);
		
		JLabel lblSapo4 = new JLabel("Sapo4");
		lblSapo4.setForeground(Color.GREEN);
		lblSapo4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSapo4.setBounds(27, 126, 76, 27);
		contentPane.add(lblSapo4);
		
		JLabel lblSapo5 = new JLabel("Sapo5");
		lblSapo5.setForeground(Color.GREEN);
		lblSapo5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSapo5.setBounds(27, 164, 76, 27);
		contentPane.add(lblSapo5);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl3.setBounds(255, 280, 76, 25);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("");
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl4.setBounds(255, 301, 76, 25);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("");
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl5.setBounds(255, 323, 76, 25);
		contentPane.add(lbl5);
		
		ActionListener correr = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Thread c = new ThreadSapo(lblSapo1, btnCorrer, lbl1, lbl2, lbl3, lbl4, lbl5);
				c.start();
				Thread c2 = new ThreadSapo(lblSapo2, btnCorrer, lbl1, lbl2, lbl3, lbl4, lbl5);
				c2.start();
				Thread c3 = new ThreadSapo(lblSapo3, btnCorrer, lbl1, lbl2, lbl3, lbl4, lbl5);
				c3.start();
				Thread c4 = new ThreadSapo(lblSapo4, btnCorrer, lbl1, lbl2, lbl3, lbl4, lbl5);
				c4.start();
				Thread c5 = new ThreadSapo(lblSapo5, btnCorrer, lbl1, lbl2, lbl3, lbl4, lbl5);
				c5.start();
			}
		};
		btnCorrer.addActionListener(correr);
	}
}
