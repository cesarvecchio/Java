package com.mycompany.manipulandotexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class App {
    public static void main(String[] args) {
        escrever("Texto meu irmãodddd");
        ler();
        
    }
    
    public static File file = new File(".\\src\\main\\java\\logs\\logs.txt");
    
    public static void escrever(String texto){
        try{
            // faz com que o arquivo seja escrito com o incoding UTF-8
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(file, true), 
                                        StandardCharsets.UTF_8));
            
            StackTraceElement[] aaa = new Throwable().getStackTrace();
            String classe = aaa[0].getClassName();
            String arquivo = aaa[0].getFileName();
            
            String momento = LocalDate.now().toString();
            Integer dia = LocalDateTime.now().getDayOfMonth();
            Integer mes = LocalDateTime.now().getMonthValue();
            Integer ano = LocalDateTime.now().getYear();
            Integer hora = LocalDateTime.now().getHour();
            Integer minutos = LocalDateTime.now().getMinute();
            Integer segundos = LocalDateTime.now().getSecond();
            
            bw.write(String.format("[%d/%d/%d - H %d:%d:%d] Arquivo[%s] : %s",
                    dia, mes, ano, hora, minutos, segundos, classe, texto));
            bw.newLine();
            bw.close();
            
        }catch(IOException erro){
            erro.printStackTrace();
        }
    }
    
    public static String ler(){
        String logs = "";
        try {
            // faz com que o arquivo seja lido com o incoding UTF-8
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file), 
                                        StandardCharsets.UTF_8));
            String linha = "";
            while (true) {
                if (linha != null) {
                    //System.out.println(linha);
                    logs += linha + "\n";
                } else
                    break;
                linha = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return logs;
    }
}
