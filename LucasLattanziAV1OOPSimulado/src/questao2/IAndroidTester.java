/**
 * Nome: Lucas Esteves Lattani - Matrícula: 0050013941 
 */
package questao2;

import java.util.Scanner;

//import java.util.ArrayList;
//import java.util.List;

public class IAndroidTester {

	public static void main(String[] args) {
		CellPhone cp = new IAndroid();

		IAndroid mark = new IAndroid();
		
		Scanner read = new Scanner(System.in);
		
		String type;
		
		System.out.print("Entre com a marca do celular: ");
	    type = read.nextLine();
	    
	    mark.setMarca(type);
	    
	    mark.mostrar_marca();
		
		cp.ligar();
		cp.desligar();
		
		read.close();

	}

}
