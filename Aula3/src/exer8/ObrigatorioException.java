package exer8;

public class ObrigatorioException extends Exception{
    public ObrigatorioException(String campo){
        super("Campo obrigatório - " + campo + ".");
    }
}
