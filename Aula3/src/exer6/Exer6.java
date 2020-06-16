package exer6;

import java.io.File;

public class Exer6 {
    public static void main(String[] args) {
        String nome=null;
        try{
            File arquivo = new File(nome);
        }catch(NullPointerException e){
            //e.printStackTrace();
            System.out.println("Não abriu o arquivo.");
        }

        System.out.println("continua o programa...");

        try {
            int res=10/0;
        }catch(Exception e){
            System.out.println("Não fez a operação.");
        }
        System.out.println("Continua o programa");
    }

    public static void main2(String[] args) {
        String nome=null;
        File arquivo = new File(nome);
        System.out.println("continua o programa...");

        int res=10/0;
        System.out.println("Continua o programa");
    }
}
