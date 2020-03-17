package lista3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        Integer numero, resultado;
        
        System.out.println("Digite um número");
        numero = leitor.nextInt();
        
        for(int contador = 0; contador <= 10; contador ++){
            resultado = numero * contador;
            System.out.println(numero +" X "+ contador +" = "+ resultado);
        }
    }
}
