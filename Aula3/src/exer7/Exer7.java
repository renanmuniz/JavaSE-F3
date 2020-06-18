package exer7;

public class Exer7 {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa();

        try {
            joao.calcularIdade(null,null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            joao.calcularIdade(1990,null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            joao.calcularIdade(null,2020);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            joao.calcularIdade(2020,1990);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int idade = joao.calcularIdade(1990,2020);
            System.out.println("idade é = " + idade);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
