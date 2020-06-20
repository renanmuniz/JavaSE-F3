package exer27;

public class Download implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 500; i++){
            System.out.println("Processamento download "+ i + "%");
        }
    }
}
