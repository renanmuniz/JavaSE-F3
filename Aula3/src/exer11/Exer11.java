package exer11;

public class Exer11 {
    public static void main(String[] args) {
        Torcedor torcedor = new Torcedor();
        System.out.println("Torcedor:");
        torcedor.torcer();

        torcedor = new Corinthians();
        System.out.println("Torcedor corinthiano:");
        torcedor.torcer();

        torcedor  = new Palmeiras();
        System.out.println("Torcedor Palmeirense:");
        torcedor.torcer();

        torcedor  = new Santos();
        System.out.println("Torcedor Santista:");
        torcedor.torcer();


    }
}
