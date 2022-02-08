package traducao2710;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, d, r, s;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		r = (int) Math.pow(a + b, 2);     //(a + b) * (a + b);
		s = (int) Math.pow(b + c, 2);     //(b + c) * (b + c);
		d = (r + s) / 2;
		
		System.out.println("O valor de D é: " + d);
		
		leia.close();

	}

}
