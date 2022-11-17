public class ColegasDeQuarto {
    
    private String nome;
    private int celular;

    public ColegasDeQuarto(String nomeColega, int celularDoColega, int taskColega, Apartamento Apartamento) {
        this.nome = nomeColega;
        this.celular = celularDoColega;
        Apartamento.setColegas(this); // Implementação para que assim que seja criado um "ColegasDeQuarto" seja necessário colocar o apartamento que ele irá morar
    
    }

    public String getNome() {
        return nome;
    }

    public int getCelular() {
        return celular;
    }


    
}
