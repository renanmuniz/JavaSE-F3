/*
 * Todos os direitos reservados a empresa Uniprime
 */
package sistema.compra;
/**
 * Representa uma operação de <b>compra</b>. Em caso de dúvidas veja o link
 * <a href="http://fernandofranzini.wordpress.com"> Tutorial </a>
 * @author Renan Muniz Merlo
 * @version 1.0 - 18/06/2020.
 */
public class Compra {
    /** Armazena o valor total. */
    private double valor;

    /**
     *  Constroe uma nova compra com valores padrões
     */
    public Compra(){
        valor = 10;
    }

    /**
     * Processa uma nova compra.
     * @param valor valor da operação.
     * @throws Exception caso ocorrer erros nas regras de compras.
     */
    public void compra(double valor) throws Exception{

    }

    /**
     * Retorna o valor da compra.
     * @return valor da compra.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Informa um novo valor da compra
     * @param valor novo valor a ser informado
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
