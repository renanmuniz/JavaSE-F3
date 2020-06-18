/*
 * Todos os direitos reservados a empresa Uniprime
 */
package sistema.venda;

/**
 * Representa uma operação de <b>venda</b>. Em caso de dúvidas veja o link
 * <a href="http://fernandofranzini.wordpress.com"> Tutorial </a>
 * @author Renan Muniz Merlo
 * @version 1.0 18/06/2020
 */
public class Venda {

    /** Armazena o valor total. */
    private double valor;


    /**
     * Cria uma nova venda sem valor padrão
     */
    public Venda(){

    }

    /**
     * Processa uma nova venda
     * @param valor valor da operação de venda
     * @throws Exception caso ocorrer erros nas regras de venda.
     */
    public void vender(double valor) throws Exception{

    }

    /**
     * Retorna o valor da venda.
     * @return
     */
    public double getValor() {
        return valor;
    }

    /**
     * Informa um novo valor da venda.
     * @param valor novo valor da venda.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
