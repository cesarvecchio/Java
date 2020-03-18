package com.mycompany.projetoencapsulamento;

public class TesteConta {

    public static void main(String[] args) {
        ContaCorrente conta01 = new ContaCorrente();
        
        System.out.println("Depositando 50");
        
        conta01.setSaldo(4.0);
        
        System.out.println("Saldo atual: " + conta01.getSaldo());
    }
}
