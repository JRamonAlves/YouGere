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
        
        int contador = 1;
        System.out.println("\n*** APARTAMENTOS CADASTRADOS NO PREDIO ***");

        for (Apartamento apartamento : predio) {
            System.out.println("| NUMERO DO AP:" + apartamento.getNumeroAp()+ "\n| DESCRIÇÃO DO AP: "+ apartamento.getNome()+ "\n| ENDEREÇO: "+apartamento.getEndereco()+"\n");
            contador++;
        }
    }
    //public void atualizarApartamento(Apartamento ap){

    public boolean estaVazio(){
        return predio.isEmpty();
    }
}

