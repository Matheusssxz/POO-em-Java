package Aplicacao;

public class AlunoIniciacaoCientifica extends AlunoProjeto {
    
    private String nomeProjeto;

    public AlunoIniciacaoCientifica(String nomeProjeto, String area, double valor, String nome, int matricula, int periodo) {
        super(area, valor, nome, matricula, periodo);
        this.nomeProjeto = nomeProjeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        if(nomeProjeto == null){        
        throw new ExcecaoDadoInvalido();
        }
        this.nomeProjeto = nomeProjeto;
    }
    
}
