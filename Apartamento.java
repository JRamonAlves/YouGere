import java.util.ArrayList;


public class Apartamento {

    private  ArrayList <ColegasDeQuarto> Colegas = new ArrayList< > (); // O Arrays list do tipo ColegasDequarto recebe colegas, já instanciando a classe "ColegasDeQuarto" como  novo array.
    private ArrayList <Custos> custo = new ArrayList< > ();             // Custo total para manter apartamento. 


    // Set's e get's PADRÃO
    public ArrayList<ColegasDeQuarto> getColegas() {
        return Colegas;
    }
    
    public void setColegas(ColegasDeQuarto colega) {
    // Setando um colega do tipo "ColegasDeQuarto". Como se trata de um arrey o SET nesse caso funcionará usando 
    // funçõs do arrey e para add um elemento a um array é necessário a funcão "array.add()"
        Colegas.add(colega); 
    }

    public ArrayList<Custos> getCusto() {
        return custo;
    }

    
    // METODOS 
    public void moradores(){
        // Foreach - para cada obj dentro de colega de quarto me mostre cada um. 
        int i = 1; // Var aux para enumerar cada OBJ que será exibido 

        for(ColegasDeQuarto e: Colegas){
            System.out.println("\n\t" +i+"º - Colega: "+ e.getNome());
            i += 1;
        }
    }
  
    

}
