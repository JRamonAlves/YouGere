public class Tarefa {
    private String nome_tarefa;
    private String inicio_task;
    private String prazo_task;
    private ColegasDeQuarto colega;
    private Apartamento apartamento;

    public Tarefa(String nome_tarefa, String inicio_task, String prazo_task) {
        this.nome_tarefa = nome_tarefa;
        this.inicio_task = inicio_task;
        this.prazo_task = prazo_task;
    }

        //GETS E SETS PADRÕES

    public String getNome_tarefa() {
        return nome_tarefa;
    }
    public String getInicio_task() {
        return inicio_task;
    }
    public String getPrazo_task() {
        return prazo_task;
    }
    public ColegasDeQuarto getColega() {
        return colega;
    }
    public Apartamento getApartamento() {
        return apartamento;
    }
    
    public void setNome_tarefa(String nome_tarefa) {
        this.nome_tarefa = nome_tarefa;
    }
    public void setInicio_task(String inicio_task) {
        this.inicio_task = inicio_task;
    }
    public void setPrazo_task(String prazo_task) {
        this.prazo_task = prazo_task;
    }
    public void setColega(ColegasDeQuarto colega) {
        this.colega = colega;
        colega.addTarefas(this);
    }
}