import java.util.ArrayList;
public class Predio {
    
    private ArrayList <Apartamento> predio = new ArrayList< > (); 
    
    
    public ArrayList<Apartamento> getPredio() {
        return predio;
    }

    public void addApartamento(Apartamento var) {
        predio.add(var);
    }
 
    public void exibirAps(){
        int i = 1;
        for (Apartamento apartamento : predio) {
            System.out.println("Nome ap:" + apartamento.getNome()+ "| Número do ap: "+ apartamento.getNumeroAp());
            i++;
        }
    }

    public void atualizarApartamento(Apartamento ap){

    }
}
