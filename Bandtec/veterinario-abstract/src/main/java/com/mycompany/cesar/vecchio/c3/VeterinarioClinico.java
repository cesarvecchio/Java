package com.mycompany.cesar.vecchio.c3;

public class VeterinarioClinico extends Veterinario{
    private Integer consultas;
    private Double valorConsulta;

    @Override
    public Double calculaSalario() {
        Double salario;
        salario = consultas * valorConsulta;
        
        return salario;
    }

    public VeterinarioClinico(Integer codigo, String nome, 
                    Integer consultas, Double valorConsulta) {
        
        super(codigo, nome);
        this.consultas = consultas;
        this.valorConsulta = valorConsulta;
    }

    public Integer getConsultas() {
        return consultas;
    }

    public void setConsultas(Integer consultas) {
        this.consultas = consultas;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    @Override
    public String toString() {
        return "VeterinarioClinico{" + "\n"
                + super.toString()
                + "consultas=" + consultas + ", \n"
                + "valorConsulta=" + valorConsulta + ", \n"
                + "salario=" + calculaSalario() + '}';
    }
    
    
    
    
}
