public class PorHoraeComissao extends Empregado implements Comissao {
    private double vendas;
    private double valorHora;
    private int numHora;

    public PorHoraeComissao(String nome) {
        super(nome);
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setNumHora(int numHora) {
        this.numHora = numHora;
    }

    @Override
    public void setVendas(double sales) {
        this.vendas = vendas;
    }

    public double getPay() {
        return (valorHora * numHora) + (vendas * CALCULO_COMISSAO);
    }

    public void printPay() {
        System.out.printf("Nome: %s - Salário: R$ %.2f (horas + comissão)\n", getNome(), getPay());
    }

    @Override
    public double getPagamento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

