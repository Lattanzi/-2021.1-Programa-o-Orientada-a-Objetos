/**
 * Nome: Lucas Esteves Lattanzi - Matrícula: 0050013941 
 */
package questao1;

import java.util.ArrayList;

public class Splash implements IJanela {
	
	private String abre;
	private String fecha;

	public String getAbre() {
        return abre;
    }
    public void setAbre(String abre) {
        this.abre = abre;
    }
    
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
	@Override
    public void abrir(ArrayList<Splash> state) {
        System.out.println("Abrindo Janela");
        for (Splash meuSplash : state) {
            System.out.println(meuSplash);
        }   
        
    }
	
	@Override
    public void fechar(ArrayList<Splash> state) {
        System.out.println("Fechando Janela");
        for (Splash meuSplash : state) {
            System.out.println(meuSplash);
        }   
        
    }

}
