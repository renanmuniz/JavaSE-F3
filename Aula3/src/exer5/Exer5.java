package exer5;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exer5 {
    public static void main(String[] args) {
        FileReader arquivo = null;
        try{
            arquivo=new FileReader("D:/renan.txt");
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.exit(-1);
        }
        BufferedReader leitor = new BufferedReader(arquivo);
        try{
            String conteudo=leitor.readLine();
            JOptionPane.showMessageDialog(null,"Conteudo do arquivo:\n"+conteudo);
        }catch(IOException e){
            e.printStackTrace();
            System.exit(-2);
        }
        try{
            leitor.close();
            arquivo.close();
        }catch(IOException e){
            e.printStackTrace();
            System.exit(-3);
        }
        System.exit(0);
    }
}
