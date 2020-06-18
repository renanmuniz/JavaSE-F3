package exer8;

public class Pessoa {
    public int calcularIdade(Integer anoNasc, Integer anoAtual) throws ObrigatorioException, InvalidoException{
    if(anoNasc == null){
        throw new ObrigatorioException("Ano do nascimento");
    }
    if(anoAtual == null){
        throw new ObrigatorioException("Ano atual");
    }
    if(anoAtual <= anoNasc){
        throw new InvalidoException("Ano atual deve ser maior que ano de nascimento");
    }

    return anoAtual - anoNasc;

    }
}
