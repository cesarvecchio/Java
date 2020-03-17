package aula3;

import java.util.Scanner;

public class ExemploEstruturaRepeticao {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        // Exemplo de while
        Integer cont = 1, numero;
        
        while(cont <=6){
            System.out.println("Boa noite!"+ cont);
            cont++;
        }
        
        // Exemplo de for
        for(Integer i = 1; i <= 6; i++){
            System.out.println("i= "+ i);
        }
        
        // Exemplo de do-while
        cont = 5;
        do {
            System.out.println("cont = "+ cont);
            cont --;
        } while (cont >= 0);
        
        do {
            System.out.println("Digite um valor positivo");
            numero = leitor.nextInt();
        } while (numero < 0);
        
        
        
        
        System.out.println("Digite um valor positivo");
        numero = leitor.nextInt();
        
        while (numero < 0){
            System.out.println("Numero inválido! Digite novamente!");
            numero = leitor.nextInt();
        }
        
        
        
        
        numero = -1;
        while (numero < 0){
            System.out.println("Número inválido! Digite novamente!");
            numero = leitor.nextInt();
        }
    }
}
