package traducao2710;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 double nota1, nota2, nota3, media;
		 
		 System.out.println("Digite a Nota 1: ");
		 nota1 = leia.nextDouble();
		 
		 System.out.println("Digite a Nota 2: ");
		 nota2 = leia.nextDouble();
		 
		 System.out.println("Digite a Nota 3: ");
		 nota3 = leia.nextDouble();
		 
		 media = ((nota1 * 2.0) + (nota2 * 3.0) + (nota3 * 5.0) / 10.0);
		 
		 System.out.println("A média final do aluno é: " + media);
		 
		 leia.close();

	}

}
