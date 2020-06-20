package exer17;

public class Programa {
    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.vender(new Dinheiro(),100);
        venda.vender(new CartaoCredito(),100);
        venda.vender(new Boleto(),100);
    }
}
