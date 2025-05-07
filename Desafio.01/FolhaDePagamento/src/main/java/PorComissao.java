public class PorComissao extends Empregado implements Comissao {
    private double vendas;

    public PorComissao(String name) {
        super(name);
    }

    @Override
    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getPay() {
        return vendas * CALCULO_COMISSAO;
    }

    @Override
    public double getPagamento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
