package Basico;

import java.util.Scanner;

/*
 * Faça um Programa que pergunte quanto você ganha por hora e o
	número de horas trabalhadas no mês. Calcule e mostre o total do seu
	salário no referido mês.
 */
public class exerc08 {

	public static void main(String[] args) {
		int hr, nrht;
		double totalmes;
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Quanto você ganha por  hora: ");
		hr=leia.nextInt();
		
		System.out.println("Qual é o numeros de horas trabalhadas no mês: ");
		nrht=leia.nextInt();
		
		totalmes=hr*nrht;
		
		System.out.println("O total de horas é "+ totalmes);
		
		
		
		

	}

}
