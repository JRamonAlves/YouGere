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
                int gerenciarAp = input.nextByte();

                ArrayList <Apartamento> listaAps = predio.getPredio();
                
                for (Apartamento apartamento : listaAps) {
                    if(gerenciarAp == apartamento.getNumeroAp()){
                      boolean segundoWhile = true;
                      System.out.println("OPÇÕES DE GERENCIAMENTO: ");
                      while(segundoWhile = true){
                      System.out.println("[1] ADD COLEGA");
                      System.out.println("[2] ADD TAREFAS");
                      System.out.println("[3] ADD CUSTO FIXO");
                      System.out.println("[4] ADD CUSTO ADICIONAL");
                      System.out.println("[6] MOSTRAR MORADORES DO AP");
                      System.out.println("[5] Sair");
                      int aplocal = input.nextInt();
                      
                      
                      if(aplocal == 6 && apartamento.getColegas().isEmpty()){
                        System.out.println("\n(error) Não há colegas cadatrados.\n");
                      }
                      else if(aplocal == 6 && apartamento.getColegas().isEmpty() == false){
                        apartamento.ExibirMoradores();
                      }
                      
                      switch (aplocal) {
                        case 1:

                            System.out.println("Digite as infos para cadastrar COLEGA:\n");
                            
                            // DADOS DO TECLADO
                            System.out.print("Nome:");
                            String nomeColega = input.next();
                            String lixo = input.nextLine();

                            System.out.print("Celular: ");
                            String celularCulega = input.nextLine();


                            ColegasDeQuarto coleguaQuarto = new ColegasDeQuarto(nomeColega, celularCulega);
                            apartamento.addColegas(coleguaQuarto);
                            break;
                            // FIM CASE 1

                        case 2:

                          // DADOS TECLADO
                            System.out.println("Digite as infos para cadastrar uma TAREFA:\n");
                            
                            System.out.print("Nome da tarefa:");
                            String nomeTask = input.nextLine();
                            input.nextLine();

                            System.out.print("Inicio da tarefa: ");
                            String estimaInicio = input.nextLine();
                            input.nextLine();

                            System.out.print("Inicio da tarefa: ");
                            String dataPrazo = input.nextLine();
                            input.nextLine();

                            // CRIANDO NOVA INSTÂNCIA DE TAREFA E ADICIONANDO ARRAY TAREFA AP
                            Tarefa task = new Tarefa(nomeTask, estimaInicio, dataPrazo);
                            apartamento.addTask(task);

                        case 3:
                               // DADOS TECLADO
                            System.out.println("Digite as infos para cadastrar um CUSTO FIXO:\n");
                            
                            System.out.print("Descrição do custo:");
                            String nomeCusto = input.nextLine();
                            input.nextLine();

                            System.out.print("Valor do custo: ");
                            int valorCusto = input.nextInt();
                    
                            // CRIANDO NOVA INSTÂNCIA DE TAREFA E ADICIONANDO ARRAY TAREFA AP
                            Custos custoFix = new Custos(nomeCusto, valorCusto);
                            apartamento.addCustoFixo(custoFix);

                        case 4:
                            // DADOS TECLADO
                            System.out.println("Digite as infos para cadastrar um CUSTO ADICIONAL:\n");
                        
                            System.out.print("Descrição do custo:");
                            String nomeCustoAd = input.nextLine();
                            input.nextLine();
  
                            System.out.print("Valor do custo: ");
                            int ValorCustoAd = input.nextInt();
                      
                            // CRIANDO NOVA INSTÂNCIA DE TAREFA E ADICIONANDO ARRAY TAREFA AP
                            Custos custoAdic = new Custos(nomeCustoAd, ValorCustoAd);
                            apartamento.addCustoAdicional(custoAdic);
                        case 5:
                            segundoWhile = false;
                            break;

                        
                        
                      } // Swich Case 
                }
                }
            }
          }
          

        }
      }
  
      }
    }
  
  }
}