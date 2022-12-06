import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] arsgs) {
      
      try (Scanner input = new Scanner(System.in)) {

        
        // NÃO MEXER ****
        // String nome;
        // StringBuilder mensagem = new StringBuilder();
        // nome = JOptionPane.showInputDialog("Digite seu nome:");
        // mensagem.append("Bem-vindo ").append(nome).append("!");
        // JOptionPane.showMessageDialog(null, mensagem);
        
        while (true){
        // NÃO MEXER ****
        // nome = JOptionPane.showInputDialog("Bem-vindo ao YouGere\n| O que deseja fazer? Digite o número correspondente:\n[1] Criar um novo apartamento para gerenciar\n[2] Acessar algum apartamento existente");
        
        System.out.println("\tBem-vindo ao YouGere");
        System.out.println();
        System.out.println("| O que deseja fazer? Digite o número correspondente:\n");
        System.out.println("[1] Criar um novo apartamento para gerenciar");
        System.out.println("[2] Acessar algum apartamento existente");
        System.out.println("-------------------------------------------------------");
        
        
        int resposta = input.nextInt();
  
        if(resposta == 1){
          System.out.println("A opção escolhida: 1. [...criando apartamento]");
          
          // preenchendo informações para instância de criação do AP
          System.out.println("Digite o numero do apartamento: ");
          int numAp = input.nextInt();

          System.out.println("\n Digite o nome do apartamento: ");
          String nomeAp = input.nextLine();

          System.out.println("Digite o endereço do apartamento: ");
          String enderecoAp = input.nextLine();

          Apartamento ap = new Apartamento(nomeAp, enderecoAp, numAp);
          System.out.println("| Apartamento criado com sucesso! |");
          
        }

        else if(resposta == 2){
          System.out.println("Else if ");
        }
      }
    }
  
  }
}