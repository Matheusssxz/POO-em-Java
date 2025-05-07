

public class PorHora extends Empregado {
    private double valorHora;
    private int numHora;

    public PorHora(String name) {
        super(name);
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setNumHora(int numHora) {
        this.numHora = numHora;
    }

    public int getNumHora() {
        return numHora;
    }

    @Override
    public double getPagamento() {
        return valorHora * numHora;
    }
}
