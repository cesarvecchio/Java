package aula2;

import java.util.Scanner;

public class Sorveteria {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Integer tipoProduto;
		
		System.out.println("Escolha o produto que deseja \n "
				+ "1- Casquinha \n "
				+ "2- Sundae \n "
				+ "3- Milkshake");
		
		tipoProduto = leitor.nextInt();
		
		switch(tipoProduto) {
		
		case 1:
			System.out.println("Casquinha custa R$ 2,00");
			break;
			
		case 2:
			System.out.println("sundae custa R$ 5,00");
			break;
			
		case 3:
			System.out.println("Milkshake custa R$ 7,00");
			break;
			
		default:
			System.out.println("Produto inválido");
		}
		
		leitor.close();
	}
}
