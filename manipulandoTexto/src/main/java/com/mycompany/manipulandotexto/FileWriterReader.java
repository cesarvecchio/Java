package com.mycompany.manipulandotexto;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileWriterReader {
    public static void main(String[] args) {
        File file = new File(".\\src\\main\\java\\logs\\logs.txt");
        
        try{
            //Precisa de tratamento de exceção
            FileWriter fw = new FileWriter(file);
            //Texto que irá ser inserido no arquivo
            fw.write("[ "+ LocalDateTime.now() +" ] : \n");
            //Insere o texto escrito dentro do arquivo
            fw.flush();
            //Fecha a comunicação com o arquivo
            fw.close();
            
            
            FileReader fr = new FileReader(file);
            System.out.println(fr.read());
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
