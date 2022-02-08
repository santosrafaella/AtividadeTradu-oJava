package traducao2710;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		double p1, p2;
		double d;
		
		System.out.println("Digite o valor de X do primeiro ponto: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o valor de Y do primeiro ponto: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite o valor de X do segundo ponto: ");
		x2 = leia.nextDouble();
		
		System.out.println("Digite o valor de Y do segundo ponto: ");
		y2 = leia.nextDouble();
		
		p1 = (x2 - x1) * (x2 - x1);
		p2 = (y2 - y1) * (y2 - y1);
		d = Math.sqrt(p1 + p2);
		
		System.out.println("A distância entre os dois pontos é: " + d);
		
		leia.close();
		
	}

}
