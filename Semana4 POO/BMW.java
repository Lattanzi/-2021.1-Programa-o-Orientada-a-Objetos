/**
 * Nome: Lucas Esteves Lattani - Matrícula: 0050013941 
 */
 
public class BMW extends Carro{
	
	public String velocidade;
	
	public BMW(){
	    
	    
	}
	
	public void imprimir(){
	    
		System.out.println("Velocidade = " + this.velocidade);
		System.out.println("_______________________________");
		
	}
	
    public void setVelocidade(String pvelocidade){
		
	    this.velocidade = pvelocidade;
		
	}
	
	public String getVelocidade(){
		
		return "Velocidade = " + this.velocidade;
		
	}
}