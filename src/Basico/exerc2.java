package Basico;

import java.util.Scanner;

/*
 * 2- Fa�a um Programa que pe�a um n�mero e ent�o mostre a
		mensagem O n�mero informado foi [n�mero]
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
