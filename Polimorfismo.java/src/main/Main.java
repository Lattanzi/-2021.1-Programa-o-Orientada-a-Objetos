package main;

import java.util.ArrayList;
import java.util.List;
import entidades.*;
import util.UtilFormas;

public class Main {
	
	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		Quadrado quadrado = new Quadrado();
		
		circulo = UtilFormas.ler(circulo);
		quadrado = UtilFormas.ler(quadrado);
		
		List<Forma> formas = new ArrayList<>();
		
		formas.add(circulo);
		formas.add(quadrado);
		
		UtilFormas.imprimir(formas);
		UtilFormas.imprimir(circulo);
		UtilFormas.imprimir(quadrado);
		
	}

}
