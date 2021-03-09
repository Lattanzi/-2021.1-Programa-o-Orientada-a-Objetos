/**
 * Nome: Lucas Esteves Lattani - Matrícula: 0050013941
 */
import java.util.Scanner;

public class LucasLattanziTabuada {
    
	public static void main(String[] args) {
	    
	    Scanner read = new Scanner(System.in);
	    
	    int cont1, cont2, tab;
	    cont1 = 0; cont2 = 1;
	    
    	System.out.print("Entre com o numero: ");
    	cont1 = read.nextInt();
        
        while (cont2 <= 10){
            tab = cont1 + cont2;
            System.out.println(cont1 + " + " + cont2 + " = " + tab);
            cont2 = cont2 + 1;
        }
	}
}