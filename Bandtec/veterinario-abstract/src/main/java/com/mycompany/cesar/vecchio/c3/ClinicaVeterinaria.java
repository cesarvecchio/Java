package com.mycompany.cesar.vecchio.c3;

import java.util.ArrayList;
import java.util.List;
import javax.sound.midi.Soundbank;

public class ClinicaVeterinaria {
    private String nome;
    private List<Veterinario> listVeterinarios;
    
    
    public void contrataVeterinario(Veterinario veterinario){
        listVeterinarios.add(veterinario);
    }
    
    public void exibeClinicos(){
        if(!listVeterinarios.isEmpty()){
            System.out.println("----- Veterinarios Clinicos -----");
            
            for(Veterinario veterinario : listVeterinarios){
                if(veterinario instanceof VeterinarioClinico){
                    System.out.println(veterinario + "\n");
                }
            }
            System.out.println("-----------------------------------");
            
        } else {
            System.out.println("Lista vazia!!!");
        }
    }
    
    public void exibeCirurgioes(){
        if(!listVeterinarios.isEmpty()){
            System.out.println("----- Veterinarios Cirurgiões -----");
            
            for(Veterinario veterinario : listVeterinarios){
                if(veterinario instanceof VeterinarioCirurgiao){
                    System.out.println(veterinario + "\n");
                }
            }
            System.out.println("-----------------------------------");
            
        } else {
            System.out.println("Lista vazia!!!");
        }
    }
    
    public void exibeFolhaDePagamento(){
        Double valorTotalPagamento = 0.0;
        
        if(!listVeterinarios.isEmpty()){
            System.out.println("----- Folha de pagamento -----");
            
            for(Veterinario veterinario : listVeterinarios){
                System.out.println(String.format("Nome: %s | Salario: %.2f",
                        veterinario.getNome(), veterinario.calculaSalario()));
                
                valorTotalPagamento += veterinario.calculaSalario();
            }
            
            System.out.println("------------------------------");
            
            System.out.println(String.format(
                "O valor necessario para realizar os pagamentos é de %.2f",
                    valorTotalPagamento));
            
            System.out.println("______________________________");
            
            
        } else {
            System.out.println("Lista vazia!!!");
        }
    }
    

    public ClinicaVeterinaria(String nome) {
        this.nome = nome;
        this.listVeterinarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Veterinario> getListVeterinarios() {
        return listVeterinarios;
    }

    public void setListVeterinarios(List<Veterinario> listVeterinarios) {
        this.listVeterinarios = listVeterinarios;
    }

    @Override
    public String toString() {
        return "ClinicaVeterinaria{" + "\n"
                + "nome=" + nome + ", \n"
                + "listVeterinarios=" + listVeterinarios + '}';
    }

}
