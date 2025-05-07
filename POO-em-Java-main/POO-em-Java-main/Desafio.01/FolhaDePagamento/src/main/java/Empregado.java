public abstract class Empregado {
    
    private String nome;

    public Empregado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public abstract double getPagamento();
    
    public void printPagamento(String nome){
        System.out.println("Nome:" + nome + "Salário:" + getPagamento());
    }
    
}
