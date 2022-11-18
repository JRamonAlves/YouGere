import java.util.ArrayList;

public class Apartamento {
    
    private ArrayList <ColegasDeQuarto> Colegas = new ArrayList< > (); // O Arrays list do tipo ColegasDequarto recebe colegas, já instanciando a classe "ColegasDeQuarto" como  novo array.
    private ArrayList <Custos> Custos = new ArrayList < > (); // Lista com os custos do apartamento. 
    private ArrayList <Tarefa> TarefasDoAp = new ArrayList < > (); // Lista com as tarefas do apartamento que precisam ser feitas.

    private double DespesaTotal = 0; // Total das depesas que a moradia possui no periodo de tempo determinado.
    private double DespesaFixa = 0; // Total das despesas fixas que a moradia possui.
    private double DespesaAdicional = 0; // Total das despesas adicionais do mêsm, do periodo de tempo determinado.

        //SETS E GETS DAS DESPESAS

    public void setDespesaTotal(double despesaTotal) {
        DespesaTotal = despesaTotal;
    }
    public void setDespesaFixa(double despesaFixa) {
        DespesaFixa = despesaFixa;
    }
    public void setDespesaAdicional(double despesaAdicional) {
        DespesaAdicional = despesaAdicional;
    }
    
    public double getDespesaTotal() {
        return DespesaTotal;
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
    public ArrayList<Tarefa> getTarefasDoAp() {
        return TarefasDoAp;
    }
    
        //Métodos para adição de elementos no Array

    public void addColegas(ColegasDeQuarto colega) {
        Colegas.add(colega);    // Setando um colega do tipo "ColegasDeQuarto". Como se trata de um arrey o SET nesse caso funcionará usando 
    }                           // funçõs do arrey e para add um elemento a um array é necessário a funcão "array.add()"
    
    public void addCusto(Custos custo) {
        Custos.add(custo); // Setando um Custo do tipo "Custos". Como se trata de um arrey o SET nesse caso funcionará usando funçõs do arrey e para add um elemento a um array é necessário a funcão "array.add()
        
        double ValorCusto = custo.getValorCusto();
        DespesaTotal += ValorCusto;
    }  

    public void addTask(Tarefa task) {
        TarefasDoAp.add(task);  // Setando um Custo do tipo "Custos". Como se trata de um arrey o SET nesse caso funcionará usando 
                            // funçõs do arrey e para add um elemento a um array é necessário a funcão "array.add()"    
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
        TarefasDoAp.remove(tarefa);
    }

    public void deleteTarefa(int index) {
        TarefasDoAp.remove(index);
    }
    
        // Métodos particulares da classe "Apartamento"

    public void ExibirMoradores(){

        int i = 1; // Var aux para enumerar cada OBJ que será exibido

        System.out.println("-----------------------"+"\n\tCOLEGAS");
        System.out.println("");

        for(ColegasDeQuarto e: Colegas){ // Foreach - para cada obj dentro de colega de quarto me mostre cada um. 

            System.out.println("\t" +i+"º "+ e.getNome()); // Mostra nome de cada colega de quarto cadastrado.
            i += 1;
        }
        
        System.out.println("");
    }

    public void ExibirCustos(){

        int i = 1; // Var aux para enumerar cada OBJ que será exibido
        
        double soma = 0;
        System.out.println("-------------------------------");
        System.out.println("{TIPO DESPESA -"+"\tVALOR DESPESA}");
        System.out.println("");

        // EXIBE CADA DESPESA DA CLASSE CUSTOS COM UM FOR EACH
        for(Custos e: Custos){ // Foreach - para cada obj dentro de colega de quarto me mostre cada um.
            System.out.println(i +" "+e.getNomeCusto()+" - R$"+e.getValorCusto()+"");
            soma += e.getValorCusto();
            i+=1;
        }

        // EXIBE A DESPESA TOTAL 
        System.out.println("\nDESPESA TOTAL: R$" +soma+"\n"+"DESPESA FIXA: R$" +DespesaFixa+"\n"+"DESPESA ADICIONAL: R$" +DespesaAdicional+"\n");
    }

    public void ExibirTarefas() {

        int i = 1; // Var aux para enumerar cada OBJ que será exibido
        
        System.out.println("-------------------------------");
        System.out.println("{TAREFAS   -  PESSOA RESPONSÁVEL}");
        System.out.println("");

        // EXIBE CADA DESPESA DA CLASSE TAREFAS COM UM FOR EACH
        for(Tarefa e: TarefasDoAp){ // Foreach - para cada obj dentro de colega de quarto me mostre cada um.
            System.out.println(i + "º " + e.getNome_tarefa() + "-" + e.getColega());
            i+=1;
        }  
    }

}