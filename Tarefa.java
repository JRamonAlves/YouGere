public class Tarefa {
    private String nome_tarefa;
    private String inicio_task;
    private String prazo_task;

    public Tarefa(String nome_tarefa, String inicio_task, String prazo_task) {
        this.nome_tarefa = nome_tarefa;
        this.inicio_task = inicio_task;
        this.prazo_task = prazo_task;
    }

    public String getNome_tarefa() {
        return nome_tarefa;
    }

    public String getInicio_task() {
        return inicio_task;
    }
    
    public String getPrazo_task() {
        return prazo_task;
    }

    
}
