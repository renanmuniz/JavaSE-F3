package exer20;

import java.util.HashSet;
import java.util.Set;

public class Exer20 {
    public static void main(String[] args) {
        //HashSet não permite objetos duplicados, nem garante a ordenacao!
        //HashSet<String> colecao = new HashSet<>();
        Set<String> colecao = new HashSet<>();

        System.out.println("Tamanho da colecao HashSet: +" + colecao.size());

        colecao.add("Renan");
        colecao.add("Fernando");
        colecao.add("Mateus");
        colecao.add("Angela");
        colecao.add("Vinicius");


        System.out.println("Tamanho da colecao HashSet: +" + colecao.size());

        for(String item: colecao){
            System.out.println("Elemento: " + item);
        }


        System.out.println("Tentando add um nome Renan denovo, ok? " + colecao.add("Renan"));

        for(String item: colecao){
            System.out.println("Elemento: " + item);
        }

        System.out.println("Contem 'Renan' ? " + colecao.contains("Renan"));
        System.out.println("Contem 'Neymar' ? " + colecao.contains("Neyamr"));

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
