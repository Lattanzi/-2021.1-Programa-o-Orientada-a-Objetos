/**
 * Nome: Lucas Esteves Lattani - Matrícula: 0050013941 
 */
 
public class Carro{
	
	public String num_acentos;
	public String cor;
	
	public Carro(String cor){
	    this.cor = cor;
	}
	
	public Carro(){
	    
	}
	
	public void list(){
		
		System.out.println("_______________________________");
		
		System.out.println("Numero de acentos = " + this.num_acentos);
		
		System.out.println("Cor = " + this.cor);
		
	}
	
	public void setNum_Acentos(String pnum_acentos){
		
		this.num_acentos = pnum_acentos;
		
	}
	
    public void setCor(String pcor){
		
		this.cor = pcor;
		
	}
	
    public String getNum_Acentos(){
		
		return "Numero de acentos = " + this.num_acentos;
		
	}
	
    public String getCor(){
		
		return "Cor = " + this.cor;
		
	}
	
}