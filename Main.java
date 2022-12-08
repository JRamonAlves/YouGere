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
        System.out.println("\n| O que deseja fazer? Digite o número correspondente:\n");
        System.out.println("[1] Criar um novo apartamento para gerenciar");
        System.out.println("[2] Acessar algum apartamento existente\n[3] Sair");
        System.out.println("-------------------------------------------------------");
        
        
        String escolha = input.next();
  
        if(escolha.equals("1")){
          System.out.println("A opção escolhida: 1. [...criando apartamento]");
          
          // preenchendo informações para instância de criação do AP
          System.out.print("Digite o numero do apartamento: ");
          int numAp = input.nextInt();
          
          input.nextLine();
          
          // OBS: NEXT LINE NÃO DÁ ERRO AO DIGITAR INTEIRO
          System.out.print("Digite o nome do apartamento: ");
          String nomeAp = input.nextLine();

          System.out.print("Digite o endereço do apartamento: ");
          String enderecoAp = input.nextLine();

          Apartamento ap = new Apartamento(nomeAp, enderecoAp, numAp);
          System.out.println("Apartamento criado com sucesso!\n\n");
          System.out.println(ap.getNome() +"\n"+ ap.getNumeroAp() +"\n"+ ap.getEndereco());
          break;
          
        }

        else if(escolha.equals("2")){
          System.out.println("Else if ");
        }
        else{
          System.out.println("Saindo... ");
          break;
        }
      }
    }
  
  }
}