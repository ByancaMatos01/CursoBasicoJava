package Basico;

import java.util.Scanner;

/*
 * Fa�a um Programa que calcule a �rea de um quadrado, em seguida
mostre o dobro desta �rea para o usu�rio.
 */
public class exerc07 {

	public static void main(String[] args) {
		int l,area;
		double dobro;
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado ");
		l=leia.nextInt();
		area=l*l;
		System.out.println("A area � "+ area);
		dobro=area*2;
		System.out.println("O dobro � "+ dobro);
		

	}

}
