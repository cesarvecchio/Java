package com.mycompany.cesar.vecchio.c3;

public class VeterinarioCirurgiao extends Veterinario{
    private Integer cirurgias;
    private Double valorCirurgia;

    @Override
    public Double calculaSalario() {
        Double salario;
        salario = cirurgias * valorCirurgia;
        
        return salario;
    }

    public VeterinarioCirurgiao(Integer codigo, String nome, 
                    Integer cirurgias, Double valorCirurgia) {
        super(codigo, nome);
        this.cirurgias = cirurgias;
        this.valorCirurgia = valorCirurgia;
    }

    public Integer getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(Integer cirurgias) {
        this.cirurgias = cirurgias;
    }

    public Double getValorCirurgia() {
        return valorCirurgia;
    }

    public void setValorCirurgia(Double valorCirurgia) {
        this.valorCirurgia = valorCirurgia;
    }

    @Override
    public String toString() {
        return "VeterinarioCirurgiao{" + "\n"
                + super.toString()
                + "cirurgias=" + cirurgias + ", \n"
                + "valorCirurgia=" + valorCirurgia + ", \n" 
                + "salario="+ calculaSalario() +'}';
    }
    
    
}
