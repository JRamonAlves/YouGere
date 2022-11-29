import java.util.ArrayList;

public class ColegasDeQuarto {
    
    private String nome;
    private int celular;
    private Apartamento moradia;
    private double custoAluno;
    private ArrayList <Tarefa> tarefas = new ArrayList<>();

    public ColegasDeQuarto(String nomeColega, int celularDoColega, Apartamento Apartamento) {
        this.nome = nomeColega;
        this.celular = celularDoColega;
        this.moradia = Apartamento;
    
    }

    // SETS E GETS DOS ATRIBUTOS NORMAIS

    public String getNome() {
        return nome;
    }
    public int getCelular() {
        return celular;
    }
    public Apartamento getMoradia() {
        return moradia;
    }
    public double getCustoAluno(){
        return custoAluno;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCelular(int celular) {
        this.celular = celular;
    }
    public void setMoradia(Apartamento moradia) {
        this.moradia = moradia;
    }
    
    public void setCustoAluno(double custoAluno) {
       this.custoAluno = custoAluno;
    }

    // FUNÇÕES DO ARRAYLIST

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }
    
    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    
    public void addTarefas(Tarefa Tarefa) {

        tarefas.add(Tarefa);

    }

    public void deleteTarefas(Tarefa Tarefa) {

        tarefas.remove(Tarefa);

    }

    public void deleteTarefas(int index) {

        tarefas.remove(index);

    }

    public void ExibirTarefas() {

        int i = 1; // Var aux para enumerar cada OBJ que será exibido
        
        System.out.println("-------------------------------");
        System.out.println("          TAREFAS");
        System.out.println("-------------------------------");

        // EXIBE CADA OBJ DA CLASSE TAREFAS COM UM FOR EACH

        for(Tarefa e: tarefas){ // Foreach - para cada obj dentro de tarefas me mostre cada um.
            
            System.out.println(i + "º " + e.getNome_tarefa());
            i+=1;
        }  
    }

}