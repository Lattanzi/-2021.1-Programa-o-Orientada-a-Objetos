package CalculadoraSOMA;

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

public class SomaDif extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JPanel pnlBotoes = null;
    private JButton btnCalcular = null;
    private JPanel pnlEntrada = null;
    private JLabel lblPrimeiroNumero = null;
    private JTextField txtPrimeiroNumero = null;
    private JLabel lblSegundoNumero = null;
    private JTextField txtSegundoNumero = null;   
    private JLabel lblResultado = null;
     
    
	/**
     * This method initializes pnlBotoes
     * 
     * @return javax.swing.JPanel
     */
    private JPanel getPnlBotoes() {
        if (pnlBotoes == null) {
            lblResultado = new JLabel();
            lblResultado.setText("Resultado da soma = ");
            pnlBotoes = new JPanel();
            pnlBotoes.setLayout(new BoxLayout(pnlBotoes, BoxLayout.Y_AXIS));
            pnlBotoes.add(getBtnCalcular(), null);
            pnlBotoes.add(lblResultado, null);
        }
        return pnlBotoes;
    }

    /**
     * This method initializes btnCalcular
     * 
     * @return javax.swing.JButton
     */
    private JButton getBtnCalcular() {
        if (btnCalcular == null) {
            btnCalcular = new JButton();
            btnCalcular.setText("Somar");
            btnCalcular.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    try {
                        int n1 = Integer.parseInt(getTxtPrimeiroNumero().getText());
                        int n2 = Integer.parseInt(getTxtSegundoNumero().getText());
                        int resultado = 0;
                        
                        resultado = n1 + n2;
                       
                        lblResultado.setText("Resultado da soma = " + resultado);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(SomaDif.this, ex.getMessage(),
                            "Erro na convers�o para int - formato inv�lido", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        }
        return btnCalcular;
    }    
      	     	
    
    /**
     * This method initializes pnlEntrada
     * 
     * @return javax.swing.JPanel
     */
    private JPanel getPnlEntrada() {
        if (pnlEntrada == null) {
            lblSegundoNumero = new JLabel();
            lblSegundoNumero.setText("N�mero 2 ");
            lblPrimeiroNumero = new JLabel();
            lblPrimeiroNumero.setText("N�mero 1 ");
            GridLayout gridLayout = new GridLayout();
            gridLayout.setRows(2);
            gridLayout.setColumns(2);
            pnlEntrada = new JPanel();
            pnlEntrada.setLayout(gridLayout);
            pnlEntrada.add(lblPrimeiroNumero, null);
            pnlEntrada.add(getTxtPrimeiroNumero(), null);
            pnlEntrada.add(lblSegundoNumero, null);
            pnlEntrada.add(getTxtSegundoNumero(), null);
        }
        return pnlEntrada;
    }

    /**
     * This method initializes txtPrimeiroNumero
     * 
     * @return javax.swing.JTextField
     */
    private JTextField getTxtPrimeiroNumero() {
        if (txtPrimeiroNumero == null) {
            txtPrimeiroNumero = new JTextField();
        }
        return txtPrimeiroNumero;
    }

    /**
     * This method initializes txtSegundoNumero
     * 
     * @return javax.swing.JTextField
     */
    private JTextField getTxtSegundoNumero() {
        if (txtSegundoNumero == null) {
            txtSegundoNumero = new JTextField();
        }
        return txtSegundoNumero;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	SomaDif thisClass = new SomaDif();
                thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thisClass.setVisible(true);
            }
        });
    }

    /**
     * This is the default constructor
     */
    public SomaDif() {
        super();
        initialize();
    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(300, 200);
        this.setContentPane(getJContentPane());
        this.setTitle("Calculadora");
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

