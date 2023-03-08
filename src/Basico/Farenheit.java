package Basico;

import java.util.Scanner;

/*
 * Faça um Programa que peça a temperatura em graus Farenheit, 
	transforme e mostre a temperatura em graus Celsius.
	o C = (5 * (F-32) / 9).
 */
public class Farenheit {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double c,f;
		System.out.println("digite a temperatura em Fareheint");
		f=leia.nextInt();
		
		c=((5*(f-32)/9));
		
		System.out.println("a temperatura em fareheint para ceulsius  "+ c + "c");
		
		
		
		
		

	}

}
