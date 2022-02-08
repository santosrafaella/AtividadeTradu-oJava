package traducao2710;

import java.util.Scanner;

public class Exercicio01 {


		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			int anos, meses, dias = 0, totalDias;
			
			
			System.out.println("Digite sua idade em anos: ");
			anos = leia.nextInt();
			
			System.out.println("Digite sua idade em meses: ");
			meses = leia.nextInt();
			
			totalDias = ((anos * 365) + (meses * 30) + dias);
			
			System.out.println("O total de dias é: " + totalDias);
			
			leia.close();
			
		}

	}


