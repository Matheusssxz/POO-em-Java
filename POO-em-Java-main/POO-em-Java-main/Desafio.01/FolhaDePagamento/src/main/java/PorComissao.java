public class PorComissao extends Empregado implements Comissao {
    private double vendas;

    public PorComissao(String nome) {
        super(nome);
    }

    @Override
    public void setVendas(double vendas) {
        this.vendas = vendas;
        System.out.println("Numero de vendas por comissao: " +this.vendas);
    }

    public double getPay() {
       double calculoComissao =  this.vendas * CALCULO_COMISSAO;
       return calculoComissao;
    }

    @Override
    public double getPagamento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
