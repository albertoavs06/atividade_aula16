/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16Atividade;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @autor Alberto Alexandre
 */
public class TestesSobreArquivos {
    public static void main(String[] args) {
        // File file = new File("novoDiretorio");
        // file.mkdir();
        //file.delete();

        File arquivo = new File("arquivo.txt");

        try {

            
            
            FileWriter fileWriter = new FileWriter(arquivo, true);
            BufferedWriter escrever = new BufferedWriter(fileWriter);
            
            escrever.write("escrevendo....");
            escrever.newLine();
            
            
            escrever.close();
            fileWriter.close();
            
            FileReader ler = new FileReader(arquivo);
            BufferedReader lerb = new BufferedReader(ler);
            String linha = lerb.readLine();
            
            while (linha != null){
                System.out.println(linha);
                linha = lerb.readLine();
            }
            
            // arquivo .createNewFile();
            //   arquivo.delete();
            
            File fil = new File("../JavaApplication17");
            
           File fi[] =  fil.listFiles();
           
           for (int i=0; i< fi.length; i++){
               System.out.println(fi[i]);
           }
           
           
            
        } catch (IOException ex) {
            Logger.getLogger(TestesSobreArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
