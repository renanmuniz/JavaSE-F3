package Exer2;

public class Exer2 {

    public static long somar(int v1, int v2){
        return v1 + v2;
    }

    public static long adicionar(int ... parans){
        long res=0;
        for(int i : parans){
            res += i;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println("Método somar padrão: " + somar(10,10));

        System.out.println("Método adicionar var-args: " + adicionar(10,10));
        System.out.println("Método adicionar var-args: " + adicionar(10,10,1));
        System.out.println("Método adicionar var-args: " + adicionar(10,10,1,2));
        System.out.println("Método adicionar var-args: " + adicionar(10,10,1,2,3));
        System.out.println("Método adicionar var-args: " + adicionar(10,10,1,2,3,4));

    }
}
