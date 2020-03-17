package aula2;

import java.util.Scanner;

public class IndiceMassaCorporal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Double altura, peso, imc;
		Integer sexo;
		
		System.out.println("Digite a sua altura");
		altura = leitor.nextDouble();
		
		System.out.println("Digite a seu peso");
		peso = leitor.nextDouble();
		
		System.out.println("Qual seu sexo?");
		System.out.println("| Mulher | Homem |");
		System.out.println("|________________|");
		System.out.println("|   1    |   2   |");
		System.out.println("|________________|");
		
		sexo = leitor.nextInt();
		
		imc = peso / (altura * altura);
		
		if(sexo == 1) {
			if(imc < 19.1) {
				System.out.println("Abaixo do peso");
				
			} else if (imc >= 19.1 && imc < 25.8) {
				System.out.println("No peso normal");
						
			} else if (imc >= 25.8 && imc < 27.3) {
				System.out.println("Marginalmente acima do peso");
						
			} else if (imc >= 27.3 && imc < 32.3) {
				System.out.println("Acima do peso ideal");
						
			} else {
				System.out.println("Obeso");
			}
			
			
		} else if(sexo == 2) {
			if(imc < 20.7) {
				System.out.println("Abaixo do peso");
				
			} else if (imc >= 20.7 && imc < 26.4) {
				System.out.println("No peso normal");
						
			} else if (imc >= 26.4 && imc < 27.8) {
				System.out.println("Marginalmente acima do peso");
						
			} else if (imc >= 27.8 && imc < 31.1) {
				System.out.println("Acima do peso ideal");
						
			} else {
				System.out.println("Obeso");
			}
			
			
		} else {
			System.out.println("Opção inválida");
			
		}
		
		
		leitor.close();
	}
}
