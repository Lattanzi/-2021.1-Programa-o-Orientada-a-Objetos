package Semana10;


import java.awt.BorderLayout;
//import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JPasswordField;

public class Login extends JFrame {

private static final long serialVersionUID = 1L;
private JPanel jContentPane = null;
private JPanel pnlBotoes = null;
private JButton btnEntrar = null;
private JPanel pnlEntrada = null;
private JLabel lblLogin = null;
private JTextField txtLogin = null;
private JLabel lblSenha = null;
private JPasswordField Senha = null;   
protected JPasswordField passwd;
 

	/**
 * This method initializes pnlBotoes
 * 
 * @return javax.swing.JPanel
 */
private JPanel getPnlBotoes() {
    if (pnlBotoes == null) {
        pnlBotoes = new JPanel();
        pnlBotoes.setLayout(new BoxLayout(pnlBotoes, BoxLayout.Y_AXIS));
        pnlBotoes.add(getBtnEntrar(), null);
        
    }
    return pnlBotoes;
}


/**
 * This method initializes btnEntrar
 * 
 * @return javax.swing.JButton
 */
private JButton getBtnEntrar() {
    if (btnEntrar == null) {
        btnEntrar = new JButton();
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                try {
                    
                	passwd = getSenha();
                	Welcome tela = new Welcome();
                	tela.setVisible(true);              
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Login.this, ex.getMessage(),
                        "Erro no login - login inválido", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    return btnEntrar;
}    
  	     	

/**
 * This method initializes pnlEntrada
 * 
 * @return javax.swing.JPanel
 */
private JPanel getPnlEntrada() {
    if (pnlEntrada == null) {
        lblSenha = new JLabel();
        lblSenha.setText("Senha: ");
        lblLogin = new JLabel();
        lblLogin.setText("Login: ");
        GridLayout gridLayout = new GridLayout();
        gridLayout.setRows(2);
        gridLayout.setColumns(2);
        pnlEntrada = new JPanel();
        pnlEntrada.setLayout(gridLayout);
        pnlEntrada.add(lblLogin, null);
        pnlEntrada.add(getTxtLogin(), null);
        pnlEntrada.add(lblSenha, null);
        pnlEntrada.add(getSenha(), null);
    }
    return pnlEntrada;
}


/**
 * This method initializes txtLogin
 * 
 * @return javax.swing.JTextField
 */
private JTextField getTxtLogin() {
    if (txtLogin == null) {
        txtLogin = new JTextField();
    }
    return txtLogin;
}

/**
 * This method initializes Senha
 * 
 * @return javax.swing.JPasswordField
 */
private JPasswordField getSenha() {
    if (Senha == null) {
    	Senha = new JPasswordField();
    }
    return Senha;
}

/**
 * @param args
 */
public static void main(String[] args) {

    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
        	Login thisClass = new Login();
            thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            thisClass.setVisible(true);
        }
    });
}

/**
 * This is the default constructor
 */
public Login() {
    super();
    initialize();
}

/**
 * This method initializes this
 * 
 * @return void
 */
private void initialize() {
    this.setSize(300, 150);
    this.setContentPane(getJContentPane());
    this.setTitle("Login");
}

/**
 * This method initializes jContentPane
 * 
 * @return javax.swing.JPanel
 */
private JPanel getJContentPane() {
    if (jContentPane == null) {
        jContentPane = new JPanel();
        jContentPane.setLayout(new BorderLayout());
        jContentPane.add(getPnlEntrada(), BorderLayout.NORTH);
        jContentPane.add(getPnlBotoes(), BorderLayout.SOUTH);
    }
    return jContentPane;
}


}
