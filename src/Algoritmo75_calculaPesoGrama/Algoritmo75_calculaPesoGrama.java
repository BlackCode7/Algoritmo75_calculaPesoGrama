package Algoritmo75_calculaPesoGrama;

import java.util.Scanner;

public class Algoritmo75_calculaPesoGrama {

	public static void main(String[] args) {
		
		algoritmo75_calculaPesogramas();

	}

	private static void algoritmo75_calculaPesogramas() {
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Digite o seu peso: ");
		int peso = scanner.nextInt();
		int pesograma;
		double novopeso;		
		pesograma = peso * 1000;
		novopeso = (pesograma * 1.12);		
		System.out.println("Peso em gramas: " + pesograma);
		System.out.println("Peso novo peso: " + novopeso);
	}

}
