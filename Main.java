public class Main {
    public static void main(String [] arsgs) {
    
    // OBJ APARTAMENTO.
    Apartamento ap1 = new Apartamento();
    
    // COLEGAS DE QUARTO - CRIAR OBJETO PASSANDO AS INFOS EM UM CONSTRUTOR.
    ColegasDeQuarto coleguinha = new ColegasDeQuarto("Lukas", 872087798, 1);
    ColegasDeQuarto coleguinha2 = new ColegasDeQuarto("Ramon", 872087758, 2);

    // DA MESMA FORMA OS GASTOS.
    Custos moradia = new Custos("Aluguel", 500);
    Custos Comodidade = new Custos("Net/Agua/Luz", 200);
     
    
    ap1.setColegas(coleguinha);
    ap1.setColegas(coleguinha2);
    ap1.Exibirmoradores();

    ap1.setCusto(moradia);
    System.out.println(ap1.getDespesaTotal());
    ap1.setCusto(Comodidade);
    // ap1.ExibirCustos();
    System.out.println(ap1.getDespesaTotal());
    }
}