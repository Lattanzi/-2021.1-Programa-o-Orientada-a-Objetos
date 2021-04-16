package util;

import java.util.List;
import java.util.Scanner;

import entidades.*;

public final class UtilFormas {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void imprimir(List<Forma> formas) {
		
		System.out.println("Areas de Formas Geometricas");
		
		for (Forma forma : formas) {
			
			if(forma instanceof Circulo)
				System.out.println("Area do Circulo = " + forma.getArea());
			else if(forma instanceof Quadrado)
				System.out.println("Area do Quadrado = " + forma.getArea());

		}
		
	}
	
	public static Circulo ler(Circulo circulo) {

		System.out.println("Entre com o valor do raio:");
		 Circulo raio = new Circulo(in.nextDouble());
		
		return raio;
	}
	

	public static Quadrado ler(Quadrado quadrado) {

		System.out.println("Entre com o valor do lado:");
		Quadrado lado = new Quadrado(in.nextDouble());
		
		return lado;
	}

	public static void imprimir(Circulo circulo) {
		
		System.out.println("Circulo");
		System.out.println("Area = " + circulo.getArea());
		
	}
	
	public static void imprimir(Quadrado quadrado) {
			
		System.out.println("Quadrado");
		System.out.println("Area = " + quadrado.getArea());
			
	}
	
}
