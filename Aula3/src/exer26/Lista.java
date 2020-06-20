package exer26;

public class Lista extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <= 500; i++){
            System.out.println("Atualização de lista de preco "+ i + "%");
        }
    }
}
