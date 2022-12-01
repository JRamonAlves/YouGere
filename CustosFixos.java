public class CustosFixos extends Custos {

    public CustosFixos(String nomeCusto, int valorCusto, Apartamento Apartamento){

        super(nomeCusto, valorCusto, Apartamento);
        Apartamento.addCustoFixo(this);

    }
    
}
