class Custos {
    private String nomeCusto;
    private double valorCusto;
    

    public Custos(String nomeCusto, int valorCusto) {
        this.nomeCusto = nomeCusto;
        this.valorCusto = valorCusto;
        
    }
        
        //SET E GETS PADRÕES

    public String getNomeCusto() {
        return nomeCusto;
    }
    public double getValorCusto() {
        return valorCusto;
    }
  

    public void setNomeCusto(String nomeCusto) {
        this.nomeCusto = nomeCusto;
    }
    public void setValorCusto(int valorCusto) {
        this.valorCusto = valorCusto;
    }
   
}