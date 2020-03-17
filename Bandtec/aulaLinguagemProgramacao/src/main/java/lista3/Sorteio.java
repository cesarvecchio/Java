package lista3;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        Integer numero, pares = 0, impares = 0, sorteado;
        Boolean acertou = false;
        
        System.out.println("Digite um numero de 1 a 100");
        numero = leitor.nextInt();
        
       if(numero >= 1 && numero <=100){
            for(int contador = 1; contador <= 400; contador++){
                sorteado = gerador.nextInt(100)+1;
                
                if(acertou == false){
                    if(numero == sorteado){
                        
                    System.out.println(String.format("O seu numero foi sorteado "
                            + "na %dª vez", contador));
                    acertou = true;
                    
                    }
                }
                    
                if(sorteado%2 == 0){
                    pares ++;
                
                } else {
                    impares ++;
                }
            }
            if(acertou == false){
                System.out.println("Seu numero não foi sorteado nenhuma vez");
            }
            System.out.println("Total de números pares sorteados: "+ pares);
            System.out.println("Total de números impares sorteados: "+ impares);
            
        } else {
            System.out.println("Número invalido");
        }
    }
}
