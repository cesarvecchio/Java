package com.mycompany.cesar.vecchio.c3;

public class App {
    public static void main(String[] args){
        VeterinarioClinico clinico1 = new VeterinarioClinico
                                        (1234, "José", 10, 1500.0);
        VeterinarioClinico clinico2 = new VeterinarioClinico
                                            (1235, "Matias", 15, 800.0);
        VeterinarioClinico clinico3 = new VeterinarioClinico
                                            (1236, "Cleiton", 5, 2500.0);


        VeterinarioCirurgiao cirurgiao1 = new VeterinarioCirurgiao
                                            (1334, "Roberto", 3, 5000.0);
        VeterinarioCirurgiao cirurgiao2 = new VeterinarioCirurgiao
                                            (1335, "Juliano", 6, 2000.0);
        VeterinarioCirurgiao cirurgiao3 = new VeterinarioCirurgiao
                                        (1336, "Carlos", 3, 10000.0);
        
        
        ClinicaVeterinaria clinica = new ClinicaVeterinaria("Pet Care");
        clinica.contrataVeterinario(clinico1);
        clinica.contrataVeterinario(clinico2);
        clinica.contrataVeterinario(clinico3);
        clinica.contrataVeterinario(cirurgiao1);
        clinica.contrataVeterinario(cirurgiao2);
        clinica.contrataVeterinario(cirurgiao3);
        
        clinica.exibeClinicos();
        clinica.exibeCirurgioes();
        clinica.exibeFolhaDePagamento();
        
    }
}
