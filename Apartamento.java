import java.util.ArrayList;


public class Apartamento {

    private  ArrayList <ColegasDeQuarto> Colegas = new ArrayList< > (); // O Arrays list do tipo ColegasDequarto recebe colegas, já instanciando a classe "ColegasDeQuarto" como  novo array.
    private ArrayList <Custos> custos = new ArrayList< > ();             // Custo total para manter apartamento. 


    // Set's e get's PADRÃO
    public ArrayList<ColegasDeQuarto> getColegas() {
        return Colegas;
    }
    
    public void setColegas(ColegasDeQuarto colega) {
    // Setando um colega do tipo "ColegasDeQuarto". Como se trata de um arrey o SET nesse caso funcionará usando 
    // funçõs do arrey e para add um elemento a um array é necessário a funcão "array.add()"
        Colegas.add(colega); 
    }

    public void setCusto(Custos custo) {
        custos.add(custo);
    }

    public ArrayList<Custos> getCusto() {
        return custos;
    }

    
    // METODOS 
    public void Exibirmoradores(){
        // Foreach - para cada obj dentro de colega de quarto me mostre cada um. 
        int i = 1; // Var aux para enumerar cada OBJ que será exibido 
        System.out.println("-----------------------"+"\n\tCOLEGAS"+"\n-----------------------");

        // Mostra nome de cada colega de quarto cadastrado.
        for(ColegasDeQuarto e: Colegas){
            System.out.println("\t" +i+"º "+ e.getNome());
            i += 1;
        }
        System.out.println("\n");
    }

    public void ExibirCustos(){
    // Foreach - para cada obj dentro de colega de quarto me mostre cada um. 
        
        double soma = 0;
        System.out.println("-------------------------------");
        System.out.println(" TIPO DESPESA -"+"\tVALOR DESPESA");
        System.out.println("-------------------------------");

        for(Custos e: custos){
            System.out.println(e.getNomeCusto()+" - R$"+e.getValorCusto()+"");
            soma += e.getValorCusto();
        }
        System.out.println("-------------------------------\nDESPESA TOTAL: R$" +soma+"\n");
    }
  
    

}
