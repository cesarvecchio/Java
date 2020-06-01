package com.mycompany.manipulandotexto;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args){
        //recebe o diretorio onde o arquivo ficara e o nome dele
        File file = new File(".\\src\\main\\java\\logs\\logs.txt");
        
        try{
            //retorna um valor booleano, arquivo caso ele não exista
            //precisa de tratamento de exceção
            //se criar retorna true, se não criar retorna false
            System.out.println(file.createNewFile());
            System.out.println(file.getAbsoluteFile());
            
            
        }catch(IOException erro){
           erro.printStackTrace();
        }
    }
}