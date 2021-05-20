package CalculadoraSOMA;

import javax.swing.JOptionPane;

public class Soma {
 
	public static void main(String args[]) {
 
		int soma;
		int num1 = 0;
		int num2 = 0;
 
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero 1:"));
 
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero 2:"));
 
		soma =  num1 + num2; 

		JOptionPane.showMessageDialog(null,"Resultado da soma = " + soma);
 
	}
} 
