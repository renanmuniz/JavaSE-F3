package exer16;


public class Napolitana implements Pizza {
    @Override
    public void preparar() {
        System.out.println("molho,presunto,queijo, tomate e orégano");
    }

    @Override
    public void assar() {
        System.out.println("19 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$18,00");
    }
}
