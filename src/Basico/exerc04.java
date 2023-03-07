package Basico;

import java.util.Scanner;

/*
 * . Faça um Programa que peça as 4 notas bimestrais e mostre a média
 */
public class exerc04 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double nota;
		double media=0;
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite os valores das notas ");
			nota=leia.nextDouble();	
			media=media+nota;
		}
		System.out.println("A media é "+ media/4);
	
	}

}
