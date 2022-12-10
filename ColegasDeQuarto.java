import java.util.ArrayList;

public class ColegasDeQuarto {
    
    private String nome;
    private String celular;
    private Apartamento moradia;
    private double custoAluno;
    private ArrayList <Tarefa> tarefas = new ArrayList<>();

    public ColegasDeQuarto(String nomeColega, String celularDoColega) {
        this.nome = nomeColega;
        this.celular = celularDoColega;
    }

    // SETS E GETS DOS ATRIBUTOS NORMAIS

    public String getNome() {
        return nome;
    }
    public String getCelular() {
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
    public void setCelular(String celular) {
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

    public void deleteTarefas(int index) {

        tarefas.remove(index);

    }

    public void ExibirTarefas() {

        int i = 1; // Var aux para enumerar cada OBJ que será exibido
        System.out.println("TAREFAS ATRIBUIDAS **  **  **");
        if(tarefas.isEmpty()){
            System.out.println("| Nota: Nenhuma tarefa atribuida.");
        }
        // EXIBE CADA OBJ DA CLASSE TAREFAS COM UM FOR EACH
        for(Tarefa e: tarefas){ // Foreach - para cada obj dentro de tarefas me mostre cada um.
            
            System.out.println("\n| DESCRILÇÃO TASK: "+e.getNome_tarefa()+"\n| DATA INICIO: "+e.getInicio_task()+"\n| DATA PRAZO: "+e.getPrazo_task());
            i+=1;
        }  
    }

}