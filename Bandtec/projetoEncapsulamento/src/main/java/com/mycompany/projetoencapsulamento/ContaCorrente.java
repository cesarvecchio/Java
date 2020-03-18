package com.mycompany.projetoencapsulamento;

public class ContaCorrente {
    private Double saldo = 0.0;
    private Integer operacoes = 0;
    
    
    
    public Double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
    
    public Integer getOperacoes(){
        return operacoes;
    }
    
    public void setOperacoes(){
        this.operacoes++;
    }
    
    public void depositar50(){
        saldo += 50;
        setOperacoes();
    }
    
    
    public void sacar50(){
        if(saldo >= 50){
            saldo -= 50;
            setOperacoes();
        }
    }
}
