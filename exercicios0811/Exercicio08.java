package traducao2710;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoC, custoF, d, i;
		
		System.out.println("Digite i valor do custo de fábrica do carro: ");
		custoF = leia.nextDouble();
		
		d = ((custoF / 100) * 28);
		i = ((custoF / 100) * 45);
		custoC = custoF + d + i;
		
		System.out.println("O custo do carro ao consumidor será de: R$" + custoC);
		
		leia.close();
	}

}
