package Aplicacao;


public class AlunoProjeto extends Aluno{
    
    private String area;
    private double valor;

    public AlunoProjeto(String area, double valor, String nome, int matricula, int periodo) {
        super(nome, matricula, periodo);
        this.area = area;
        this.valor = valor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area){
        if(area == null){
        throw new ExcecaoDadoInvalido();
        }
        this.area = area;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor <= 0){
        throw new ExcecaoDadoInvalido();
        }
        this.valor = valor;
    }
    
}
