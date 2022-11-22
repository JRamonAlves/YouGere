public class ColegasDeQuarto {
    
    private String nome;
    private int celular;
    private Apartamento moradia;
    private double custoAluno;

    public ColegasDeQuarto(String nomeColega, int celularDoColega, int taskColega, Apartamento Apartamento) {
        this.nome = nomeColega;
        this.celular = celularDoColega;
        this.moradia = Apartamento;
    
    }

    // SETS E GETS PADRÕES

    public String getNome() {
        return nome;
    }
    public int getCelular() {
        return celular;
    }
    public Apartamento getMoradia() {
        return moradia;
    }

    public double getCustos(){
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

    public void setCustoAluno(Double custo) {
        this.custoAluno += custo;
    }
}   