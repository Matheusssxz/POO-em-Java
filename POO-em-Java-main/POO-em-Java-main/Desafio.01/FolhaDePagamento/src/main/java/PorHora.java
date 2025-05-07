

public class PorHora extends Empregado {
    private double valorHora;
    private int numHora;

    public PorHora(String nome) {
        super(nome);
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setNumHora(int numHora) {
        this.numHora = numHora;
    }

    public int getNumHora() {
        return this.numHora;
    }
    public double getValorHora(){
        return this.valorHora;
    }
    @Override
    public double getPagamento() {
        return valorHora * numHora;
    }
}
