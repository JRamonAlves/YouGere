import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] arsgs) {
      Predio pr1 = new Predio();

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
        System.out.println("[1] Criar um novo apartamento");
        System.out.println("[2] Acessar apartamentos existentes\n[3] Sair");
        System.out.println("-------------------------------------------------------");
        
        
        int escolha = input.nextInt();
  
        if(escolha == 1){
          System.out.println("\n\nA opção escolhida: [1]\n(Criando apartamento...)\n---------------------------\n");
          // preenchendo informações para instância de criação do AP
          System.out.println("*******  CRIANDO APARTAMENTO  *******");
          System.out.print("| Digite o numero do apartamento: ");
          int numAp = input.nextInt();
          input.nextLine();
          System.out.print("| Digite o nome do apartamento: ");
          String nomeAp = input.nextLine();
          System.out.print("| Digite o endereço do apartamento: ");
          String enderecoAp = input.nextLine();
          Apartamento ap1 = new Apartamento(nomeAp, enderecoAp, numAp);
          pr1.addApartamento(ap1);
          System.out.println(" \nApartamento criado com sucesso! Tecle ENTER PARA VOLTAR AO MENU");
          String retorno = input.nextLine();
          System.out.println("\n\n\n\n");
        }


        else if(escolha == 2){
        boolean x = true; 
        while(x == true){
          System.out.println("\nOPÇÃO ESCOLHIDA: (2)\n-------------------- \n[1] Ver apartamentos\n[2] Sair.  ");
          int escolhaAp = input.nextInt();
          if(pr1.verifica()){
            System.out.println("\n(ERRO) VOCÊ PRECISA CADASTRAR AO MENOS UM APARTAMENTO!");
            System.out.print("TECLE ENTER PARA SAIR: ");
            String saindoWhile1 = input.nextLine();
            x = false;
          }
          else if (escolhaAp == 1){
                pr1.exibirAps();
                System.out.println("\nDigite o número  do ap que deseja gerenciar: ");
                int gerenciarAp = input.nextInt();

                ArrayList <Apartamento> listaAps = pr1.getPredio();
                
                for (Apartamento e : listaAps) {
                    if(gerenciarAp == e.getNumeroAp()){
                      boolean j = true;
                      while(j = true){
                      System.out.println("[1] ADD COLEGA");
                      System.out.println("[2]");
                      System.out.println("[3]");
                      System.out.println("[4]");
                      System.out.println("[5] Sair");
                      int aplocal = input.nextInt();
                      
                      switch (aplocal) {
                        case 1:
                          System.out.println("Digite as infos para cadastrar colega:\n");
                          
                          System.out.print("Nome:");
                          String escolhaNome = input.nextLine();
                          String lixo = input.nextLine();

                          System.out.print("Celular: ");
                          int escolhaCell = input.nextInt();


                          ColegasDeQuarto coleguaQuarto = new ColegasDeQuarto(escolhaNome, escolhaCell);
                          e.addColegas(coleguaQuarto);
                          
                          break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        j = false;
                        break;
                  }}
                }
            }
          }
          

        }
      }
  
      }
    }
  
  }
}