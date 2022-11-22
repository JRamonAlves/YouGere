import java.util.ArrayList;
import java.util.Scanner;

public class Apartamento {
    
    private ArrayList <ColegasDeQuarto> Colegas = new ArrayList< > ();  // O Arrays list do tipo ColegasDequarto recebe colegas, já instanciando a classe "ColegasDeQuarto" como  novo array.
    private ArrayList <Custos> Custos = new ArrayList < > ();           // Lista com os custos do apartamento. 
    private ArrayList <Tarefa> Tarefas = new ArrayList < > ();      // Lista com as tarefas do apartamento que precisam ser feitas.

    private double DespesaFixa;                                     // Total das despesas fixas que a moradia possui.
    private double DespesaAdicional;                                // Total das despesas adicionais do mês, do periodo de tempo determinado.
    private double DespesaTotal;

    //GETS DAS DESPESAS 
    public double getDespesaTotal() {
        return this.DespesaTotal;
    }
    public double getDespesaFixa() {
        return DespesaFixa;
    }
    public double getDespesaAdicional() {
        return DespesaAdicional;
    }


    // GETS DOS ARRAYS
    public ArrayList<ColegasDeQuarto> getColegas() {
        return Colegas;
    }
    public ArrayList<Custos> getCustos() {
        return Custos;
    }
    public ArrayList<Tarefa> getTarefas() {
        return Tarefas;
    }
    

    //Métodos para adição de elementos no Array
    public void addColegas(ColegasDeQuarto colega) {
        Colegas.add(colega);    // Setando um colega do tipo "ColegasDeQuarto". Como se trata de um arrey o SET nesse caso funcionará usando 
    }                           // funçõs do arrey e para add um elemento a um array é necessário a funcão "array.add()"
    public void addCustoFixo(Custos custo) {
        Custos.add(custo);      // Setando um Custo do tipo "Custos". Como se trata de um arrey o SET nesse caso funcionará usando funçõs do arrey e para add um elemento a um array é necessário a funcão "array.add()
        
        double ValorCusto = custo.getValorCusto();
        DespesaFixa += ValorCusto;
        DespesaTotal += ValorCusto;
    }  
    public void addCustoAdicional(Custos custo){
        Custos.add(custo);
        double ValorCusto = custo.getValorCusto();
        DespesaAdicional += ValorCusto;
        DespesaTotal += ValorCusto;
    
    }
    public void addTask(Tarefa task) {
        Tarefas.add(task);  // Setando um Custo do tipo "Custos". Como se trata de um arrey o SET nesse caso funcionará usando 
                                // funçõs do array e para add um elemento a um array é necessário a funcão "array.add()"    
    }


    // Métodos para exclusão de elementos dos Arrays
    public void deleteColegas(ColegasDeQuarto colegas) {
        Colegas.remove(colegas);
    }
    public void deleteColegas(int index) {
        Colegas.remove(index);
    }
    public void deleteCustos(Custos custos) {
        Custos.remove(custos);
    }      
    public void deleteCustos(int index) {
        Custos.remove(index);
    }
    public void deleteTarefa(Tarefa tarefa) {
        Tarefas.remove(tarefa);
    }
    public void deleteTarefa(int index) {
        Tarefas.remove(index);
    }
    

    // Métodos particulares da classe "Apartamento"
    public void ExibirMoradores(){

        int i = 1; // Variável auxiliar para contagem do ciclo de repetições

        System.out.println("\n-----------------------"+"\n\tCOLEGAS");
        System.out.println("-----------------------");

        for(ColegasDeQuarto e: Colegas){ // Foreach - para cada obj dentro de colega de quarto me mostre cada um. 

            System.out.println("\t" +i+"º "+ e.getNome()); // Mostra nome de cada colega de quarto cadastrado.
            i += 1;
        }
    }
    public void ExibirCustos(){

        int i = 1; // Variável auxiliar para contagem do ciclo de repetições

        
        double soma = 0;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("\n-------------------------------");
            System.out.println("| TIPO DESPESA -"+" VALOR DESPESA |");
            System.out.println("-------------------------------");

            // EXIBE CADA DESPESA DA CLASSE CUSTOS COM UM FOR EACH
            
            for(Custos e: Custos){ // Foreach - para cada obj dentro de colega de quarto me mostre cada um.
                System.out.println(i +" "+e.getNomeCusto()+" - R$"+e.getValorCusto()+"");
                soma += e.getValorCusto();
                i+=1;
            }

            // EXIBE A DESPESA TOTAL 
            
            System.out.println("\nDESPESA ADICIONAL: R$" +DespesaAdicional+"\n"+"DESPESA FIXA: R$" +DespesaFixa+"\nDESPESA TOTAL: R$" +soma);
            System.out.println("Deseja dividir os igualmente para todos os membros? S/N");
            String escolha = in.nextLine();  
            
            if (escolha.toLowerCase() == "s"){
                DivideCustos();
            }
        }

     }
    public void DivideCustos(){
        int qntdColegas = Colegas.size();
        double DivideCustos = DespesaTotal / qntdColegas;

        for(ColegasDeQuarto c: Colegas){
            c.setCustoAluno(DivideCustos);
        }
    
    }
    public void ExibirTarefas() {

        int i = 1; // Var aux para enumerar cada OBJ que será exibido
        
        System.out.println("-------------------------------");
        System.out.println("TAREFAS   -  PESSOA RESPONSÁVEL");
        System.out.println("-------------------------------");

        // EXIBE CADA DESPESA DA CLASSE TAREFAS COM UM FOR EACH
        for(Tarefa e: Tarefas){ // Foreach - para cada obj dentro de colega de quarto me mostre cada um.
            System.out.println(i + "º " + e.getNome_tarefa() + "-" + e.getColega());
            i+=1;
        }  
    }

}