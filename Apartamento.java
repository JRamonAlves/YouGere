import java.util.ArrayList;


public class Apartamento {
    
    private  ArrayList <ColegasDeQuarto> Colegas = new ArrayList< > (); // O Arrays list do tipo ColegasDequarto recebe colegas, já instanciando a classe "ColegasDeQuarto" como  novo array.
    private ArrayList <Custos> Custos = new ArrayList< > ();             // Custo total para manter apartamento. 
    private ArrayList <Tarefa> Task = new ArrayList< > ();

    private double DespesaTotal = 0;
    private double DespesaFixa = 0;
    private double DespesaAdicional = 0;

    public void setDespesaTotal(double despesaTotal) {
        DespesaTotal = despesaTotal;
    }

    public double getDespesaTotal() {
        return DespesaTotal;
    }

    public double getDespesaFixa() {
        return DespesaFixa;
    }

    public double getDespesaAdicional() {
        return DespesaAdicional;
    }

    // Set's e get's PADRÃO
    public ArrayList<ColegasDeQuarto> getColegas() {
        return Colegas;
    }
    
    public void setColegas(ColegasDeQuarto colega) {
        Colegas.add(colega);    // Setando um colega do tipo "ColegasDeQuarto". Como se trata de um arrey o SET nesse caso funcionará usando 
    }                           // funçõs do arrey e para add um elemento a um array é necessário a funcão "array.add()"

    public void setCusto(Custos custo) {
        Custos.add(custo); // Setando um Custo do tipo "Custos". Como se trata de um arrey o SET nesse caso funcionará usando 
        double v = custo.getValorCusto();
        DespesaTotal += v;
    }                      // funçõs do arrey e para add um elemento a um array é necessário a funcão "array.add()"  


    public void setTask(Tarefa task) {
        Task.add(task);  // Setando um Custo do tipo "Custos". Como se trata de um arrey o SET nesse caso funcionará usando 
                            // funçõs do arrey e para add um elemento a um array é necessário a funcão "array.add()"    
    }
    
    

    // METODOS 

    int i = 1; // Var aux para enumerar cada OBJ que será exibido 
    public void Exibirmoradores(){

        // Foreach - para cada obj dentro de colega de quarto me mostre cada um. 
        System.out.println("-----------------------"+"\n\tCOLEGAS"+"\n-----------------------");

        // Mostra nome de cada colega de quarto cadastrado.
        for(ColegasDeQuarto e: Colegas){
            System.out.println("\t" +i+"º "+ e.getNome());
            i += 1;
        }
        i = 1;
        System.out.println("\n");
    }

    public void ExibirCustos(){
    // Foreach - para cada obj dentro de colega de quarto me mostre cada um. 
        
        double soma = 0;
        System.out.println("-------------------------------");
        System.out.println(" TIPO DESPESA -"+"\tVALOR DESPESA");
        System.out.println("-------------------------------");

        // EXIBE CADA DESPESA DA CLASSE CUSTOS COM UM FOR EACH
        for(Custos e: Custos){
            System.out.println(i+" "+e.getNomeCusto()+" - R$"+e.getValorCusto()+"");
            soma += e.getValorCusto();
            i+=1;
        }
        i = 1;

        // EXIBE A DESPESA TOTAL 
        System.out.println("-------------------------------\nDESPESA TOTAL: R$" +soma+"\n"+"DESPESA FIXA: R$" +DespesaFixa+"\n"+"DESPESA ADICIONAL: R$" +DespesaAdicional+"\n");
    }
  
    

}
