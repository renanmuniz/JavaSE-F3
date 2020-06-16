package exer4;

public class Exer4 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        //Adicionando conteudo
        str.append("Renan");
        str.append(" Muniz");
        str.append(" Merlo");

        //obter conteúdo completo
        System.out.println(str.toString());

        //obter parte do conteudo
        System.out.println(str.substring(4,10));

        //verificar tamanho
        System.out.println(str.length());

        //deletar uma parte
        str = str.delete(6,12);
        System.out.println(str.toString());

        //deletar tudo
        str.delete(0,str.length());
        System.out.println("str="+str);
    }
}
