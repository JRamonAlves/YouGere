import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Apartamento {

    private String nome;
    private String endereco;
    private int numeroAp;
    
    private ArrayList <ColegasDeQuarto> Colegas = new ArrayList< > ();  // O Arrays list do tipo ColegasDequarto recebe colegas, já instanciando a classe "ColegasDeQuarto" como  novo array.
    private ArrayList <Custos> Custos = new ArrayList < > ();           // Lista com os custos do apartamento. 
    private ArrayList <Tarefa> Tarefas = new ArrayList < > ();          // Lista com as tarefas do apartamento que precisam ser feitas.

    private double DespesaFixa;                                         // Total das despesas fixas que a moradia possui.
    private double DespesaAdicional;                                    // Total das despesas adicionais do mês, do periodo de tempo determinado.
    private double DespesaTotal;

    //CONSTRUTORES

    Apartamento(String nome, String endereco, int numero){
        this.nome = nome;
        this.endereco = endereco;
        this.numeroAp = numero;
    }

    //GETS E SETS DOS ATRIBUTOS SIMPLES 

    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getNumeroAp() {
        return numeroAp;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setNumeroAp(int telefone) {
        this.numeroAp = telefone;
    }

    //GETS DOS ATRIBUTOS 

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
    
    // Métodos para gerenciamento dos Arrays
    
    // Colegas do Apartamento

    public void addColegas(ColegasDeQuarto colega) {
        Colegas.add(colega);    // Setando um colega do tipo "ColegasDeQuarto". Como se trata de um arrey o SET nesse caso funcionará usando 
    }                           // funçõs do arrey e para add um elemento a um array é necessário a funcão "array.add()"
    
    public void deleteColegas(ColegasDeQuarto colegas) {
        Colegas.remove(colegas);
    }
    public void deleteColegas(int index) {
        Colegas.remove(index);
    }
    
        // Custos

    public void addCustoFixo(Custos custo) {
        Custos.add(custo);      // Setando um Custo do tipo "Custos". Como se trata de um arrey o SET nesse caso funcionará usando funçõs do arrey e para add um elemento a um array é necessário a funcão "array.add()
        
        double ValorCusto = custo.getValorCusto();
        DespesaFixa += ValorCusto;
        DespesaTotal += ValorCusto;
    }      
    public void addCustoAdicional(Custos custo) {
        Custos.add(custo);
        double ValorCusto = custo.getValorCusto();
        DespesaAdicional += ValorCusto;
        DespesaTotal += ValorCusto;
    
    }
    
    public void deleteCustos(Custos custos) {
        Custos.remove(custos);
    }      
    public void deleteCustos(int index) {
        Custos.remove(index);
    }
    
        // Tarefas

    private int indexTarefa;
    private Boolean primeiro = true;
    
    public void addTask(Tarefa task) {
                    
        Tarefas.add(task);  // Setando um Custo do tipo "Custos". Como se trata de um arrey o SET nesse caso funcionará usando funçõs do array e para add um elemento a um array é necessário a funcão "array.add()"
    
        int numeroTarefas = Tarefas.size(); // Contagem do numero de tarefas e de colegas para que assim as tarefas sejam
        int numeroColegas = Colegas.size(); // adicionadas de acordo.
    
        if (primeiro == true) {

            Random random = new Random();
            indexTarefa = random.nextInt(numeroColegas); // Iterável adicional utilizado nas condicionais a seguir    
            primeiro = false;        
            
        }
        
        for (int i = 0; i < numeroTarefas; i++) {

            Tarefas.get(i).setColega(Colegas.get(indexTarefa));
            indexTarefa = indexTarefa + 1;

            if (indexTarefa == numeroColegas) { 
                indexTarefa = 0;
            }            
        }
    
    }

    public void deleteTarefa(Tarefa tarefa) {
        Tarefas.remove(tarefa);
    }
    public void deleteTarefa(int index) {
        Tarefas.remove(index);
    }
    
    // Métodos particulares da classe "Apartamento"

    public void ExibirMoradores() {

        int i = 1; // Variável auxiliar para contagem do ciclo de repetições

        System.out.println("-----------------------\n\tCOLEGAS");
        System.out.println("-----------------------");

        for(ColegasDeQuarto e: Colegas){ // Foreach - para cada obj dentro de colega de quarto me mostre cada um. 

            System.out.println("\t" +i+"º "+ e.getNome()); // Mostra nome de cada colega de quarto cadastrado.
            i += 1;
        }
        System.out.println();

    }
    public void ExibirCustos() {

        int i = 1; // Variável auxiliar para contagem do ciclo de repetições
        
        double soma = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("-------------------------------");
            System.out.println("| TIPO DESPESA -"+" VALOR DESPESA |");
            System.out.println("-------------------------------");

            // EXIBE CADA DESPESA DA CLASSE CUSTOS COM UM FOR EACH
            
            for(Custos e: Custos){ // Foreach - para cada obj dentro de colega de quarto me mostre cada um.
                System.out.println(i + " " + e.getNomeCusto() + " - R$" + e.getValorCusto() + "");
                soma += e.getValorCusto();
                i+=1;
            }

            // EXIBE A DESPESA TOTAL 
            
            System.out.println("DESPESA ADICIONAL: R$" + DespesaAdicional);
            System.out.println("DESPESA FIXA: R$" + DespesaFixa);
            System.out.println("DESPESA TOTAL: R$" + soma);
            System.out.println();

            System.out.println("Deseja dividir os igualmente para todos os membros? S/N");
            String escolha = in.nextLine();  
            
            if (escolha.equalsIgnoreCase("S")){
                DivideCustos();
            }
            else{
                System.out.println("Divisão não realizada!");
            }
        }
    
    public void DivideCustos() {
        
        int qntdColegas = Colegas.size();
        double DivideCustos = DespesaTotal / qntdColegas;
        System.out.println(DivideCustos);

        for(ColegasDeQuarto aluno: Colegas){
            aluno.setCustoAluno(DivideCustos);
        }
    
    }
    public void ExibirTarefas() {

        int i = 1; // Var aux para enumerar cada OBJ que será exibido
        
        System.out.println("-------------------------------");
        System.out.println("TAREFAS   -  PESSOA RESPONSÁVEL");
        System.out.println("-------------------------------");

        // EXIBE CADA DESPESA DA CLASSE TAREFAS COM UM FOR EACH
        
        for(Tarefa e: Tarefas){ // Foreach - para cada obj dentro de colega de quarto me mostre cada um.
            System.out.println(i + "º " + e.getNome_tarefa() + " - " + e.getColega().getNome());
            i+=1;
        }  
        System.out.println();
    }

}