package com.mycompany.projetoencapsulamento;

public class Carro {
    private Boolean statusCarro = false;

    private Double velocidade = 0.0;
    
    
    
    public Boolean getStatusCarro() {
        return statusCarro;
    }

    public void setStatusCarro(Boolean statusCarro) {
        this.statusCarro = statusCarro;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }
    
    
    public void ligar(){
        setStatusCarro(true);
    }
    
    public void acelerar(){
        if(getStatusCarro() == true){
            setVelocidade(velocidade + 10);
        }
    }
    
    public void frear(){
        if(getStatusCarro() == true){
            setVelocidade(velocidade - 10);
        }
    }
    
    public void desligar(){
        setVelocidade(0.0);
        setStatusCarro(false);
        
    }
    
}
