package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int peso;
		double altura;
		double imc;
				
		System.out.println("Digite peso seguido de altura: ");
		Scanner teclado = 	new Scanner(System.in);
		peso = teclado.nextInt();
		altura = teclado.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.printf("IMC: %.2f", imc);

	}

}
