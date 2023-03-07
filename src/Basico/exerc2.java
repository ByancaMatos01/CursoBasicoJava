package Basico;

import java.util.Scanner;

/*
 * 2- Faça um Programa que peça um número e então mostre a
		mensagem O número informado foi [número]
 */
public class exerc2 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
		int valor;
		System.out.println("Digite o valor:");
		
		valor=leia.nextInt();
		System.out.println("O valor digitado foi ====> "+ valor);
	}

}
