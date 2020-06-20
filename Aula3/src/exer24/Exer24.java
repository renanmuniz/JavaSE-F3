package exer24;

import java.util.LinkedList;

public class Exer24 {
    public static void main(String[] args) {

        LinkedList<String> fila = new LinkedList<>();

        System.out.println(fila.size());

        fila.add("Fernando");
        fila.add("Rebeca");
        fila.add("Anny");
        fila.add("Jonas");


        System.out.println(fila.size());


        for(String item: fila){
            System.out.println(item);
        }

        fila.add("Fernando");

        for(String item: fila){
            System.out.println(item);
        }

        System.out.println(fila.contains("Rebeca"));
        System.out.println(fila.contains("Neymar"));

        System.out.println(fila.remove("Rebeca"));
        System.out.println(fila.remove("Neymar"));

        for(String item: fila){
            System.out.println(item);
        }

        String item = null;

        while((item = fila.poll())!=null){
            System.out.println("Fila: " + item);
        }

        System.out.println(fila.size());


    }
}
