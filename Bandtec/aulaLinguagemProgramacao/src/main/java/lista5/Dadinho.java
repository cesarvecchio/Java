package lista5;

import java.util.Random;

public class Dadinho {
    Integer valorDado1 = 0;
    Integer valorDado2 = 0;
    String vencedor = "";
    
    
    public String getVencedor(){
        
        if(valorDado1 < valorDado2){
            vencedor = "O Dadinho 2 venceu";
            
        } else if(valorDado1 > valorDado2){
            vencedor = "O Dadinho 1 venceu";
        
        } else{
            vencedor = "Empate";
        }
        
        return vencedor;
    }
}
