
public class FolhaDePagamento {
    public static void main(String[] args) {

        PorComissao p1 = new PorComissao("Carlos");
        p1.setVendas(5000);
        double calculoComissao= p1.getPay();
        System.out.println(p1.getNome()+ " Comissao: " + calculoComissao);

        PorHora p2 = new PorHora("Ana");
        p2.setValorHora(50);
        p2.setNumHora(40);
        int numHora = p2.getNumHora();
        System.out.println("Numero de horas: " +numHora);
        double valorHora = p2.getValorHora();
        System.out.println(p2.getNome() + " Salário: " +valorHora);

        PorHoraeComissao p3 = new PorHoraeComissao("João");
        p3.setValorHora(30);
        p3.setNumHora(20);
        p3.setVendas(3000);
        p3.getPay();
        p3.printPay();
        
    }
}

