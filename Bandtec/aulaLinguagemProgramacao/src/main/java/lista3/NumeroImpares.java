package lista3;

public class NumeroImpares {
    public static void main(String[] args){
        System.out.println("Números ímpares de 0 a 90");
        
        Integer contador = 1;
        
        while(contador <= 90){
            System.out.println(contador);
            contador += 2;
        }
    }
}
