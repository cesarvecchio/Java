package com.mycompany.cesar.vecchio.c3;

public abstract class Veterinario {
    private Integer codigo;
    private String nome;

    public abstract Double calculaSalario();
    
    
    public Veterinario(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Veterinario{\n" + ""
                + "codigo=" + codigo + ", \n"
                + "nome=" + nome + "\n" +
                '}';
    }
    
    
    
}
