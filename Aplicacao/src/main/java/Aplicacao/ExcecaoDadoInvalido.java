package Aplicacao;

public class ExcecaoDadoInvalido extends RuntimeException {
    public ExcecaoDadoInvalido() {
        super("Erro: Dado não pode ser nulo ou vazio");
    }
}
