public class Main {
    public static void main(String [] arsgs) {
    
    // OBJ APARTAMENTO.
    Apartamento ap1 = new Apartamento();
    
    // COLEGAS DE QUARTO - CRIAR OBJETO PASSANDO AS INFOS EM UM CONSTRUTOR 

    ColegasDeQuarto coleguinha = new ColegasDeQuarto("Lukas", 872087798, ap1);
    ColegasDeQuarto coleguinha2 = new ColegasDeQuarto("Ramon", 872087758, ap1);

    // GASTOS
    
    Custos moradia = new Custos("Aluguel", 500, ap1);
    Custos Comodidade = new Custos("Net/Agua/Luz", 200, ap1);

    // TAREFAS

    Tarefa lavarlouça = new Tarefa("Lavar a louça", "Todo o dia", "Todo dia", ap1);
    Tarefa limparbanheiro = new Tarefa("Limpar banheiro", "Durante a manhã", "Até a noite", ap1);

    // TESTE DOS MÉTODOS DA CLASSE APARTAMENTO
    
    //ap1.addColegas(coleguinha2);
    //ap1.addColegas(coleguinha);
    //ap1.addCustoAdicional(Comodidade);
    //ap1.addCustoFixo(moradia);
    //ap1.ExibirMoradores();
    //ap1.ExibirCustos();
    //System.out.println(coleguinha.getCustos());
    //ap1.DivideCustos();
    //System.out.println(coleguinha.getCustoAluno());
    
    //coleguinha.addTarefas(limparbanheiro);
    //coleguinha.ExibirTarefas();

    }
}