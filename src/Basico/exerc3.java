package Basico;

import java.util.Scanner;

public class exerc3 {
/*
 * Fa�a um Programa que pe�a dois n�meros e imprima a soma
 */
	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		int v1, v2, soma;
		
		System.out.println("Digite o valor 1: ");
		v1=leia.nextInt();
		
		System.out.println("Digite o valor 2: ");
		v2=leia.nextInt();
		soma=v1+v2;
		System.out.println("O valor da soma do "+ v1 + " + "+v2+" = "+ soma);
		

	}

}
