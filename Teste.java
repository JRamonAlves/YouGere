public class Teste {
    public static void main(String [] arsgs) {
    
    System.out.println("Bem-vindo");
    
    // OBJ APARTAMENTO.

    Apartamento ap1 = new Apartamento("Casa ads", "Unifip, Bloco H, sala H8");
    
    // COLEGAS DE QUARTO - CRIAR OBJETO PASSANDO AS INFOS EM UM CONSTRUTOR 
    ColegasDeQuarto coleguinha = new ColegasDeQuarto("Lukas", 872087798, ap1);
    ColegasDeQuarto coleguinha2 = new ColegasDeQuarto("Ramon", 872087758, ap1);
    ColegasDeQuarto coleguinha3 = new ColegasDeQuarto("Vitor", 872087758, ap1);
    
    // GASTOS
    Custos moradia = new CustosFixos("Aluguel", 500, ap1);
    Custos Comodidade = new CustosAdicionais("Net/Agua/Luz", 500, ap1);

    // TAREFAS
    Tarefa lavarlouça = new Tarefa("Lavar a louça", "Todo o dia", "Todo dia", ap1);
    Tarefa limparbanheiro = new Tarefa("Limpar banheiro", "Durante a manhã", "Até a noite", ap1);
    Tarefa fazerfeira = new Tarefa("Fazer a feira", "Todo mês", "Durante o mês", ap1);


    // TESTE DOS MÉTODOS DA CLASSE APARTAMENTO

    // System.out.println(ap1.getCustos().size());

    // ap1.ExibirCustos();
    // ap1.ExibirMoradores();
    ap1.ExibirTarefas();
    System.out.println(ap1.indexTarefa);

    }
}