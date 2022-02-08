package traducao2710;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dia = 0, dias;
		
		System.out.println("Digite a idade em dias: ");
		dias = leia.nextInt();
		
		anos = dias / 365;
		meses = ((dias / 365) / 30);
		dia = ((dias / 365) % 30);
		
		System.out.println("Você tem " + anos + "anos, " + meses + "meses e " + dia + "dias.");
		
		leia.close();
	}


}
