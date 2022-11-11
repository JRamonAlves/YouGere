public class ColegasDeQuarto {
    private String nome;
    private int celular;
    private Tarefa task;

    public ColegasDeQuarto(String nomeColega, int celularDoColega, Tarefa taskColega) {
        this.nome = nomeColega;
        this.celular = celularDoColega;
        this.task = taskColega;
    }

    public String getNome() {
        return nome;
    }

    public int getCelular() {
        return celular;
    }

    public Tarefa getTask() {
        return task;
    }

    
}
