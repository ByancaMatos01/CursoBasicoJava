package Basico;

import java.util.Scanner;

/*
 * Faça um Programa que converta metros para centímetros.
 */
public class exerc5 {

	public static void main(String[] args) {
		int metros;
		double cent;
		Scanner leia=new Scanner (System.in);
		System.out.println("Digite a quantidade de metros ");
		metros=leia.nextInt();
		cent=(metros*100);
		System.out.println("a transaformação de metros "+ metros + " para centimetros foi de ====> "+cent);
		

	}

}
