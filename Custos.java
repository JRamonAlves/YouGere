public class Custos {
    private String nomeCusto;
    private int valorCusto;
    private Apartamento Ap;

    public Custos(String nomeCusto, int valorCusto, Apartamento Apartamento) {
        this.nomeCusto = nomeCusto;
        this.valorCusto = valorCusto;
        this.Ap = Apartamento;
    }
        
        //SET E GETS PADRÕES

    public String getNomeCusto() {
        return nomeCusto;
    }
    public int getValorCusto() {
        return valorCusto;
    }
    public Apartamento getAp() {
        return Ap;
    }

    public void setNomeCusto(String nomeCusto) {
        this.nomeCusto = nomeCusto;
    }
    public void setValorCusto(int valorCusto) {
        this.valorCusto = valorCusto;
    }
    public void setAp(Apartamento ap) {
        Ap = ap;
    }
}


