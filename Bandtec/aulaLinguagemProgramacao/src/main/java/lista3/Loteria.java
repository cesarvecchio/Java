package lista3;

import java.util.Random;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        
        Integer numero, sorteado, contador = 0;
        Boolean chave = false;
        
        System.out.println("Digite um numero entre 0 e 10");
        numero = leitor.nextInt();
        
        while(chave == false){
            contador++;
            sorteado = gerador.nextInt(11);
            
            if(numero == sorteado){
                
                if(contador <= 3){
                    System.out.println("Você é muito sortudo");
                
                } else if(contador >= 4 && contador <= 10) {
                    System.out.println("Você é sortudo");
                    
                } else {
                    System.out.println("É melhor você ser trabalhador");
                }
                
                chave = true;
            }
            
        }
    }
}
