package Aplicacao;

public class AlunoMonitoria extends AlunoProjeto {

    private String disciplina;

    public AlunoMonitoria(String disciplina, String area, double valor, String nome, int matricula, int periodo) {
        super(area, valor, nome, matricula, periodo);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if(disciplina == null ){
        throw new ExcecaoDadoInvalido();
        }
        this.disciplina = disciplina;
    }
    
}
