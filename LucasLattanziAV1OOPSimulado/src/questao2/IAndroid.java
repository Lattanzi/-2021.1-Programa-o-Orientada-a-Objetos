/**
 * Nome: Lucas Esteves Lattani - Matrícula: 0050013941 
 */
package questao2;

//import java.util.ArrayList;

public class IAndroid extends CellPhone {

	private String marca;
	
	public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

	@Override
	public void mostrar_marca() {
		
		System.out.println("Marca: "+this.marca);

	}
}
