package Basico;

import java.util.Scanner;

/*
 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o
	n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
	sal�rio no referido m�s.
 */
public class exerc08 {

	public static void main(String[] args) {
		int hr, nrht;
		double totalmes;
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por  hora: ");
		hr=leia.nextInt();
		
		System.out.println("Qual � o numeros de horas trabalhadas no m�s: ");
		nrht=leia.nextInt();
		
		totalmes=hr*nrht;
		
		System.out.println("O total de horas � "+ totalmes);
		
		
		
		

	}

}
