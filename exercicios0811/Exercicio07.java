package traducao2710;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double A, B, C, D, E, F, X, Y;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		D = leia.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		E = leia.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		F = leia.nextDouble();
		
		X = ((C * E) - (B * F) / (A * E) - (B * D));
		Y = ((A * F) + (C * D) / (A * E) - (B * D));
		
		System.out.println("O valor de X �: " + X + "e o valor de Y �: " + Y);
		
		leia.close();
		
		

	}

}
