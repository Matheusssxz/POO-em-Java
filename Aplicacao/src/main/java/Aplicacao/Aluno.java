package Aplicacao;

public class Aluno {
    private String nome;
    private int matricula, periodo;

    public Aluno(String nome, int matricula, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
        throw new ExcecaoDadoInvalido();
        }
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula <= 0){
        throw new ExcecaoDadoInvalido();
        }
        this.matricula = matricula;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        if(periodo <= 0){
        throw new ExcecaoDadoInvalido();
        }
        this.periodo = periodo;
    }

    
    
}
