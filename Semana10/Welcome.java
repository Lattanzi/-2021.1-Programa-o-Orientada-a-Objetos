package Semana10;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Welcome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Welcome thisTela = new Welcome();
				thisTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisTela.setVisible(true);
			}
		});
	}
	
	public Welcome() {
	    
	    initialize();
	}

	private void initialize() {
		this.setSize(600, 600);
		this.setContentPane(getJContentPane());
		this.setTitle("Welcome");
	}

	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
		}
		return jContentPane;
	}

}