package Controller;

import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ThreadSapo extends Thread {
	private JLabel lblSapo;
	//private JLabel lblCarro2;
	private JButton btnCorrer;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;

	public ThreadSapo(JLabel lblSapo, JButton btnCorrer, JLabel lbl1, JLabel lbl2, JLabel lbl3, JLabel lbl4, JLabel lbl5) {
		this.lblSapo = lblSapo;
		//this.lblCarro2 = lblCarro2;
		this.btnCorrer = btnCorrer;
		this.lbl1=lbl1;
		this.lbl2=lbl2;
		this.lbl3=lbl3;
		this.lbl4=lbl4;
		this.lbl5=lbl5;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		correr();
	}

	private void correr() {
		Random r = new Random();
		int num = r.nextInt(5)+10;
		lbl1.setText("");
		lbl2.setText("");
		lbl3.setText("");
		lbl4.setText("");
		lbl5.setText("");
		btnCorrer.setEnabled(false);
		Rectangle posicao;
		//Rectangle posicao2;
		
		posicao = lblSapo.getBounds();
		posicao.x=25;
		lblSapo.setBounds(posicao);
		
		//posicao2 = lblCarro2.getBounds();
		//posicao2.x=25;
		//lblCarro2.setBounds(posicao2);
		//int i=0;
		while (posicao.x<=500) {
			posicao.x = posicao.x + num;
			//posicao2.x = posicao2.x+num2;
			lblSapo.setBounds(posicao);
			//lblCarro2.setBounds(posicao2);
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println("O sapo "+lblSapo.getText()+" deu um pulo de "+num+" centímetros e já percorreu: "+(posicao.x-25));
		}
		if(lbl1.getText().equals("")) {
			lbl1.setText(lblSapo.getText());
		}else if(lbl2.getText().equals("") && !lbl1.getText().equals("")) {
			lbl2.setText(lblSapo.getText());
		}else if(lbl3.getText().equals("") && !lbl2.getText().equals("")) {
			lbl3.setText(lblSapo.getText());
		}else if(lbl4.getText().equals("") && !lbl3.getText().equals("")) {
			lbl4.setText(lblSapo.getText());
		}else if(lbl5.getText().equals("") && !lbl4.getText().equals("")){
			lbl5.setText(lblSapo.getText());
		}
		System.out.println(lblSapo.getText());
		btnCorrer.setEnabled(true);
	}
}
