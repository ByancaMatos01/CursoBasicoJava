package Basico;

import java.util.Scanner;

/*
 * Faça um Programa que peça o raio de um círculo, calcule e mostre
sua área.
 */
public class exerc6 {

	public static void main(String[] args) {
		int raio;
		double area;
		double pi=3.14;
		
		Scanner leia=new Scanner (System.in);
		
		System.out.println("Digite o raio: ");
		raio=leia.nextInt();
		
		area=(pi*(raio*raio));
		System.out.println("O Area do circulo é "+ area);
		
		

	}

}
