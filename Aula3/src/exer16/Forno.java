package exer16;


public class Forno {
    public void fabricar(Pizza pizza){
        System.out.println("Promoção: Borda de Catupiry!");
        pizza.preparar();
        pizza.assar();
        pizza.cobrar();
    }
}
