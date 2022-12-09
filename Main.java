import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String [] arsgs) {
      Predio predio = new Predio();

      try (Scanner input = new Scanner(System.in)) {

        // PRIMEIRO WHILE INFINITO EXIBINDO MENU PRINCIPAL
        while (true){
        System.out.println("\tBem-vindo ao YouGere");
        System.out.println("\n| O que deseja fazer? Digite o número correspondente:\n");
        System.out.println("[1] Criar um novo apartamento");
        System.out.println("[2] Acessar apartamentos existentes\n[3] Sair");
        System.out.println("-------------------------------------------------------");
        
        // VARIÁVEL DE ESCOLHA DO MENU PRINCIPAL
        int varEscolha1 = input.nextInt();
          
        // CONDIÇÃO CASO USUÁRIO DIGITE OPÇÃO [1]
        if(varEscolha1 == 1){

          System.out.println("\n\nA opção escolhida: [1]\n(Criando apartamento...)\n---------------------------\n");
          System.out.println("*******  CRIANDO APARTAMENTO  *******");
          System.out.print("| Digite o numero do apartamento: ");
          
          // ALIMENTANDO VARIÁVEIS PARA PASSAR PARA INSTÂNCIA DO NOVO APARTAMENTO.
          int numAp = input.nextInt();
          input.nextLine();
          
          System.out.print("| Digite o nome do apartamento: ");
          String nomeAp = input.nextLine();
          
          System.out.print("| Digite o endereço do apartamento: ");
          String enderecoAp = input.nextLine();
          
          // INSTANCIANDO NOVO APARTAMENTO POR CONSTRUTOR E EM SEGUIDA SETANDO AO OBJ "PR1" (linha7)
          Apartamento ap1 = new Apartamento(nomeAp, enderecoAp, numAp);
          predio.addApartamento(ap1);

          // MENSAGEM DE CONFIRMAÇÃO E RETORNO AO MENU PRINCIPAL. 
          System.out.println(" \nApartamento criado com sucesso! Tecle ENTER PARA VOLTAR AO MENU");
          String retorno = input.nextLine();
          System.out.println("\n\n\n\n");
        }

        // CONDIÇÃO CASO O USUÁRIO DIGITA A OPÇÃO [2]
        else if(varEscolha1 == 2){
        
        // SEGUNDO WHILE PARA EXIBIR UM SEGUNDO MENO PARA SAIR PARA O MENU PRINCIPAL OU CONFIRMAR VER APS
        // Esse while compara uma variável booleana para que possa ser quebrado e retorne ao menu principal.
        boolean PrimeiroWhile = true; 
        while(PrimeiroWhile == true){

          // MENSAGEM QUE EXIBE OPÇÕES DE ESCOLHA | Lucas: Optei em deixar em uma linha só para economizar tamanho de arquivo.
          System.out.println("\nOPÇÃO ESCOLHIDA: (2)\n-------------------- \n[1] Ver apartamentos\n[2] Sair.  ");
          int varEscolha2 = input.nextInt(); // var escolha em inteiro.
          
          // VERIFICA SE O ARRAY DE APARTAMENTOS ESTÁ VAZIO
          if(predio.estaVazio()){
            // CASO ESTEJA VAZIO EXIBE MENSAGEM.
            System.out.println("\n(ERRO) VOCÊ PRECISA CADASTRAR AO MENOS UM APARTAMENTO!");
            System.out.print("TECLE ENTER PARA SAIR: ");

            // QUEBRA O PRIMEIRO WHILE E RETORNA AO MENU PRINCIPAL.
            String saindoWhile1 = input.nextLine();
            PrimeiroWhile = false;
          }

          // CASO O ARRAY DE APARTAMENTOS NÃO RETORNE TRUE, ENTRAMOS NO SEGUNDO ELSE IF
          else if (varEscolha2 == 1){
                predio.exibirAps();
                System.out.println("\nDigite o número  do ap que deseja gerenciar: ");
                int gerenciarAp = input.nextInt();

                ArrayList <Apartamento> listaAps = predio.getPredio();
                
                for (Apartamento apartamento : listaAps) {
                    if(gerenciarAp == apartamento.getNumeroAp()){
                      boolean segundoWhile = true;
                      while(segundoWhile = true){
                      System.out.println("[1] ADD COLEGA");
                      System.out.println("[2] ADD TAREFAS");
                      System.out.println("[3] ADD CUSTO FIXO");
                      System.out.println("[4] ADD CUSTO ADICIONAL");
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
                          apartamento.addColegas(coleguaQuarto);
                          
                          break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        segundoWhile = false;
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