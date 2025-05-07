
public class FolhaDePagamento {
    public static void main(String[] args) {

        PorComissao p1 = new PorComissao("Carlos");
        p1.setVendas(5000);

        PorHora p2 = new PorHora("Ana");
        p2.setValorHora(50);
        p2.setNumHora(40);

        PorHoraeComissao p3 = new PorHoraeComissao("João");
        p3.setValorHora(30);
        p3.setNumHora(20);
        p3.setVendas(3000);

        
    }
}

