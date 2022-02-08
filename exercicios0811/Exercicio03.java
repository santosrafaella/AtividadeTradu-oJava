package traducao2710;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int segundos, minutos, horas;
		
		System.out.println("Escreva a duração do evento em segundos: ");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		minutos = ((segundos % 3600) / 6);
		segundos = ((segundos % 3600) % 60);
		
		System.out.println("A duração do evento foi de " + horas + " horas" + minutos + " minutos" + segundos + "segundos");
		
		leia.close();
		

	}

}
