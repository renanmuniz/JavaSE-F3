package exer19;

import java.util.ArrayList;
import java.util.List;

public class Exer19 {
    public static void main(String[] args) {
        //ArrayList<String> colecao = new ArrayList<>();
        List<String> colecao = new ArrayList<>();

        System.out.println("Elementos no arraylist: " + colecao.size());

        colecao.add("Renan");
        System.out.println("Adicionado o elemento: " + colecao.get(colecao.size()-1));

        colecao.add("Fernando");
        System.out.println("Adicionado o elemento: " + colecao.get(colecao.size()-1));

        colecao.add("Mateus");
        System.out.println("Adicionado o elemento: " + colecao.get(colecao.size()-1));

        colecao.add("Angela");
        System.out.println("Adicionado o elemento: " + colecao.get(colecao.size()-1));

        System.out.println("Elementos no arraylist: " + colecao.size());

        for(String item: colecao){
            System.out.println("Elemento: " + item);
        }

        colecao.add("Fernando");
        System.out.println("Adicionado o elemento: " + colecao.get(colecao.size()-1));

        for(String item: colecao){
            System.out.println("Elemento: " + item);
        }

        System.out.println("Existe 'Renan' na colecao? " + colecao.contains("Renan"));
        System.out.println("Existe 'Neymar' na colecao? " + colecao.contains("Neymar"));

        System.out.println("Remover 'Renan' da colecao, ok? " + colecao.remove("Renan"));
        System.out.println("Existe 'Neymar' da colecao, ok? " + colecao.remove("Neymar"));

        for(String item: colecao){
            System.out.println("Elemento: " + item);
        }

        colecao.clear();

        System.out.println("Elementos no arraylist: " + colecao.size());

        for(String item: colecao){
            System.out.println("Elemento: " + item);
        }
    }
}
