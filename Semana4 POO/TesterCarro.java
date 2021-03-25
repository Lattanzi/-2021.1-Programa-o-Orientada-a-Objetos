import java.util.Scanner;
 
public class TesterCarro{
    
    	public static void main (String[] args) {
    	    
    	    Carro carro = new Carro();
    	    
    	    BMW bmw = new BMW();
    	    
    	    Scanner read = new Scanner(System.in);
		
		    String color, velocity, numacentos;
		     
		    
		    System.out.print("Entre com o numero de acentos do carro: ");
    	    numacentos = read.nextLine();
    	    System.out.print("Entre com a cor do carro: ");
    	    color = read.nextLine();
    	    System.out.print("Entre com a velocidade: ");
    	    velocity = read.nextLine();
		    
		    carro.setNum_Acentos(numacentos);
      	    carro.setCor(color);
      	    
      	    bmw.setVelocidade(velocity);
    	    
    	    carro.list();
    	    bmw.imprimir();
		    
    	}
}
	

	    
	    