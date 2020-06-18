package exer7;

public class Pessoa {
    public int calcularIdade(Integer anoNasc, Integer anoAtual) throws Exception{
    if(anoNasc == null){
        throw new Exception("Ano do nascimento é obrigatório");
    }
    if(anoAtual == null){
        throw new Exception("Ano do atual é obrigatório");
    }
    if(anoAtual <= anoNasc){
        throw new Exception("Ano do atual deve ser maior que ano de nascimento");
    }

    return anoAtual - anoNasc;

    }
}
