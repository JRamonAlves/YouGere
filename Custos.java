public class Custos {
    private String nomeCusto;
    private int valorCusto;
    private Apartamento custosAp;

    public Custos(String nomeCusto, int valorCusto) {
        this.nomeCusto = nomeCusto;
        this.valorCusto = valorCusto;
    }

    public String getNomeCusto() {
        return nomeCusto;
    }
    public int getValorCusto() {
        return valorCusto;
    }
    
}


