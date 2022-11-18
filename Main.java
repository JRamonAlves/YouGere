public class Main {
    public static void main(String [] arsgs) {
    
    // OBJ APARTAMENTO.
    Apartamento ap1 = new Apartamento();
    
    // COLEGAS DE QUARTO - CRIAR OBJETO PASSANDO AS INFOS EM UM CONSTRUTOR 

    ColegasDeQuarto coleguinha = new ColegasDeQuarto("Lukas", 872087798, 1, ap1);
    ColegasDeQuarto coleguinha2 = new ColegasDeQuarto("Ramon", 872087758, 2, ap1);

    // DA MESMA FORMA OS GASTOS
    
    Custos moradia = new Custos("Aluguel", 500, ap1);
    Custos Comodidade = new Custos("Net/Agua/Luz", 200, ap1);

    // TESTE DOS MÉTODOS DA CLASSE APARTAMENTO
     
    ap1.Exibirmoradores();

    ap1.setCusto(moradia);
    ap1.setCusto(Comodidade);
    // ap1.ExibirCustos();
    }
}