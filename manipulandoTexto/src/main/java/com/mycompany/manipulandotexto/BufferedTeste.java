package com.mycompany.manipulandotexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTeste {
    public static void main(String[] args) {
        File file = new File(".\\src\\main\\java\\logs\\logs.txt");
        
        // try with resources, usado para simplificar o codigo e deixa-lo 
        // mais limpo e performatico
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedReader br = new BufferedReader(new FileReader(file))){
                // Texto que será inserido no arquivo
            bw.write("Escrevendo uma mensagem no arquivo");
            // Irá encotrar o caracter especial de cada sistema operacional
            // que irá pular a linha
            bw.newLine();
            bw.write("Escrevendo a linha 2");
            // Irá inserir os textos dentro do arquivo
            bw.flush();
            
            //--------
            // Irá ler uma linha inteira e irá retornar uma String
            String texto = null;
            while((texto=br.readLine()) != null){
                System.out.println(texto);
                
            }
            
        }catch(IOException erro){
            erro.printStackTrace();
        }
        
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            // Texto que será inserido no arquivo
            bw.write("Escrevendo uma mensagem no arquivo");
            // Irá encotrar o caracter especial de cada sistema operacional
            // que irá pular a linha
            bw.newLine();
            bw.write("Escrevendo a linha 2");
            // Irá inserir os textos dentro do arquivo
            bw.flush();
            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            // Irá ler uma linha inteira e irá retornar uma String
            String texto = null;
            while((texto=br.readLine()) != null){
                System.out.println(texto);
                
            }
            
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
