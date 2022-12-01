public class CustosAdicionais extends Custos {

    public CustosAdicionais(String nomeCusto, int valorCusto, Apartamento Apartamento) {
        
        super(nomeCusto, valorCusto, Apartamento);
        Apartamento.addCustoAdicional(this);
    
    }
    
}
