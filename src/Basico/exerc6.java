package Basico;

import java.util.Scanner;

/*
 * Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre
sua �rea.
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
		System.out.println("O Area do circulo � "+ area);
		
		

	}

}
