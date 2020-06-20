package exer23;

import java.util.Map;
import java.util.LinkedHashMap;

public class Exer23 {

    public static void main(String[] args) {
        //LinkedHashMap garante a ordem de inserção.
        Map<String, String> mapa = new LinkedHashMap<>();

        mapa.put("tia", "Michele Ferreira");
        mapa.put("pai", "Fernando Franzini");
        mapa.put("mae", "Anny Carla");
        mapa.put("filha", "Rebeca Galdiano");
        mapa.put("cachorro", "Spot");

        System.out.println("Tamanho do mapa: " + mapa.size());

        System.out.println("Buscar especifico: " + mapa.get("filha"));
        System.out.println("Buscar especifico: " + mapa.get("primo"));

        for(String item: mapa.values()){
            System.out.println(item);
        }

        //inserir com mesma chave sobrepoe conteudo
        mapa.put("filha", "Ana Clara");

        for(String item: mapa.values()){
            System.out.println(item);
        }

        mapa.remove("cachorro");

        for(String item: mapa.values()){
            System.out.println(item);
        }

        for(String item: mapa.keySet()){
            System.out.println("Chave: " + item + ", objeto: " + mapa.get(item));
        }

        System.out.println(mapa.containsValue("Fernando Franzini"));
        System.out.println(mapa.containsValue("Neymar"));

        System.out.println(mapa.containsKey("filha"));
        System.out.println(mapa.containsKey("tio"));

        mapa.clear();

        System.out.println("Tamanho mapa");

        for(String item: mapa.keySet()){
            System.out.println("Chave: " + item + ", objeto: " + mapa.get(item));
        }

    }
}
