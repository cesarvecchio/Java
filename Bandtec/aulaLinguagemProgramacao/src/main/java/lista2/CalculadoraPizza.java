package aula2;

import java.util.Scanner;

public class CalculadoraPizza {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Double valorPizza, valorMaxRachar, valorRachar, valorRachado;
		String saborPizza;
		Integer qtdPessoa;
		
		System.out.println("Digite o valor da pizza");
		valorPizza = leitor.nextDouble();
		
		System.out.println("Digite o sabor da pizza");
		saborPizza = leitor.next();
		
		System.out.println("Digite a quantidade de pessoas que irão rachar a pizza");
		qtdPessoa = leitor.nextInt();
		
		System.out.println("Digite a o valor máximo que deseja rachar a pizza");
		valorMaxRachar = leitor.nextDouble();
		
		valorRachar = valorMaxRachar * qtdPessoa;
		valorRachado = valorPizza / qtdPessoa;
		
		
		if(valorRachado > valorMaxRachar) {
			
			System.out.println("Deu ruim no racha. A pizza deveria custar no máximo "
					+ valorRachar);
			
		} else {
			
			System.out.println("A pizza de "+ saborPizza +" será dividida entre "+
					qtdPessoa +" pessoas. R$"+ valorRachado + " p/ cada" );
		
		}
		
		leitor.close();
	}

}
