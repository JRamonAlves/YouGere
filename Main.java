import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] arsgs) {
      Predio predio = new Predio();

      try (Scanner input = new Scanner(System.in)) {

        
        System.out.println("\n\tBem-vindo ao YouGere");

        // PRIMEIRO WHILE INFINITO EXIBINDO MENU PRINCIPAL
        while (true){
        System.out.println("\n| O que deseja fazer? Digite o número correspondente:\n");
        System.out.println("[1] Criar um novo apartamento");
        System.out.println("[2] Gerenciar apartamentos\n[3] Sair");
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
            System.out.println("\n");
        }

          // CONDIÇÃO CASO O USUÁRIO DIGITA A OPÇÃO [2]
        else if(varEscolha1 == 2){
          
          // SEGUNDO WHILE PARA EXIBIR UM SEGUNDO MENO PARA SAIR PARA O MENU PRINCIPAL OU CONFIRMAR VER APS
          // Esse while compara uma variável booleana para que possa ser quebrado e retorne ao menu principal.
          
          boolean PrimeiroWhile = true; 
          
          while(PrimeiroWhile == true){

            // MENSAGEM QUE EXIBE OPÇÕES DE ESCOLHA | Lucas: Optei em deixar em uma linha só para economizar tamanho de arquivo.
            
            System.out.println("\nOPÇÃO ESCOLHIDA: (2)\n-------------------- \n[1] VER APARTAMENTOS\n[2] SAIR.  ");
            int varEscolha2 = input.nextInt(); // var escolha em inteiro.

            if(varEscolha2 == 2){
              PrimeiroWhile = false;
            }
            // CASO O ARRAY DE APARTAMENTOS NÃO RETORNE TRUE, ENTRAMOS NO SEGUNDO ELSE IF

            else if( varEscolha2 != 2 && varEscolha2 != 1){
              System.out.println("[ERRO] Número inválido!");
            }
            else{

              if(predio.estaVazio()){
                // CASO ESTEJA VAZIO EXIBE MENSAGEM.
                System.out.println("\n(ERRO) VOCÊ PRECISA CADASTRAR AO MENOS UM APARTAMENTO!");
                System.out.println();
                System.out.println();
  
                // QUEBRA O PRIMEIRO WHILE E RETORNA AO MENU PRINCIPAL.
                
                PrimeiroWhile = false;
              
              }else{

                predio.exibirAps();

                System.out.println("\nDigite o número  do ap que deseja gerenciar: ");
                int gerenciarAp = input.nextInt();

                ArrayList <Apartamento> listaAps = predio.getPredio();

                  for (Apartamento apartamento : listaAps) {

                  if(gerenciarAp == apartamento.getNumeroAp()){
                    boolean segundoWhile = true;
                    while(segundoWhile == true){
                      System.out.println("\n\n| AP NÚMERO: "+apartamento.getNumeroAp()+" | Nome AP: "+apartamento.getNome()+" | CUSTO TOTAL: "+apartamento.getDespesaTotal()+" |");
                      System.out.println("OPÇÕES DE GERENCIAMENTO: ");
                      System.out.println();
                      System.out.println("[01] ADD COLEGA");
                      System.out.println("[02] ADD TAREFAS");
                      System.out.println("[03] ADD CUSTO FIXO");
                      System.out.println("[04] ADD CUSTO ADICIONAL");
                    System.out.println("\n[05] MOSTRAR MORADORES DO AP");
                      System.out.println("[06] MOSTRAR TAREFAS DO AP");
                    System.out.println("\n[07] DISTRIBUIR TAREFAS");
                      System.out.println("[08] DISTRIBUIR CUSTOS");
                    System.out.println("\n[09] DELETAR COLEGA");
                      System.out.println("[10] DELETAR TAREFAS");
                      System.out.println("[11] ZERAR CUSTOS");
                      System.out.println("[12] Sair");
                      
                      // ESCOLHA TECLADO
                      int aplocal = input.nextInt();
                      String tecladolixo = input.nextLine(); // buffe \n do nextInt
 
                      switch (aplocal) {
                        case 1: // ADD COLEGA
  
                          System.out.println("Digite as infos para cadastrar COLEGA:\n");
                          
                          // DADOS DO TECLADO
                          System.out.print("Nome: ");
                          String nomeColega = input.nextLine();

                          System.out.print("Celular: ");
                          String celularCulega = input.nextLine();
  
                          ColegasDeQuarto coleguaQuarto = new ColegasDeQuarto(nomeColega, celularCulega);
                          apartamento.addColegas(coleguaQuarto);

                          System.out.println("\n[COLEGA CADASTRADO COM SUCESSO!]");
                          System.out.println("| tecle enter para voltar ao menu |");
                          input.nextLine();
                          break;
                          // FIM CASE 1
  
                        case 2: // ADD TAREFAS
  
                          // DADOS TECLADO
                          System.out.println("Digite as infos para cadastrar uma TAREFA:\n");
                          
                          System.out.print("Nome da tarefa: ");
                          String tecladoTask = input.nextLine();
                          
  
                          System.out.print("Inicio da tarefa: ");
                          String tecladoEstima = input.nextLine();
                          
  
                          System.out.print("Final da tarefa: ");
                          String tecladoPrazo = input.nextLine();
                          
                          Tarefa task = new Tarefa(tecladoTask, tecladoEstima, tecladoPrazo);
                          apartamento.addTask(task);
                          // CRIANDO NOVA INSTÂNCIA DE TAREFA E ADICIONANDO ARRAY TAREFA AP
  
                          System.out.println("\n[TAREFA CADASTRADA COM SUCESSO!]");
                          System.out.println("| tecle enter para voltar ao menu |");
                          input.nextLine();
                          break;
  
                        case 3: // ADD CUSTO FIXO
  
                          // DADOS TECLADO
                          System.out.println("| DIGITE AS INFOS PARA CADASTRAR UM CUSTO FIXO |\n");
                          
                          System.out.print("Descrição do custo: ");
                          String tecladoDescrCusto = input.nextLine();
  
                          System.out.print("Valor do custo: ");
                          int keyValorCustoFix = input.nextInt();
                          input.nextLine();
                  
                          // CRIANDO NOVA INSTÂNCIA DE TAREFA E ADICIONANDO ARRAY TAREFA AP
                          Custos custoFixo = new Custos(tecladoDescrCusto, keyValorCustoFix);
                          apartamento.addCustoFixo(custoFixo);
  
                          System.out.println("\n| CUSTO FIXO CADASTRADO COM SUCESSO!");
                          System.out.println("| tecle enter para voltar ao menu |");
                          input.nextLine();
                          break;
  
                        case 4: // ADD CUSTO ADICIONAL
                        
                          // DADOS TECLADO
                          System.out.println("| DIGITE AS INFOS PARA ADICIONAR UM CUSTO ADICIONAL |\n");
                      
                          System.out.print("Descrição do custo: ");
                          String keyDescrCustoAd = input.nextLine();
  
                          System.out.print("Valor do custo: ");
                          int keyValorCustoAd = input.nextInt();
                          input.nextLine();
                    
                          // CRIANDO NOVA INSTÂNCIA DE TAREFA E ADICIONANDO ARRAY TAREFA AP
                          Custos custoAdic = new Custos(keyDescrCustoAd, keyValorCustoAd);
                          apartamento.addCustoAdicional(custoAdic);
                          
                          System.out.println("\n[CUSTO ADICIONAL CADASTRADO COM SUCESSO!]\n");
                          System.out.println("| tecle enter para voltar ao menu |");
                          input.nextLine();
                          break;
                        
                        case 5: // MOSTRAR MORADORES DO AP
  
                          if(apartamento.getColegas().isEmpty()){
                            System.out.println("\n(error) Não há colegas cadatrados.\n");
                            System.out.println("\n| tecle enter para voltar ao menu |");
                            String saircolegavazio = input.nextLine();
                            }

                          else if(apartamento.getColegas().isEmpty() == false){
                            apartamento.ExibirMoradores();
                            System.out.println("\n| tecle enter para voltar ao menu |");
                            String sairtruecolega = input.nextLine();
                            }

                          break;
  
                        case 6: // MOSTRAR TAREFAS DO AP
  
                          if(apartamento.getTarefas().isEmpty()){
                            System.out.println("\n(error) Não há tarefas cadatradas.\n");
                            System.out.println("| tecle enter para voltar ao menu |");
                            input.nextLine();

                          }
                          else if(apartamento.getTarefas().isEmpty() == false){
                            apartamento.ExibirTarefas();
                            System.out.println("\n[CUSTO ADICIONAL CADASTRADO COM SUCESSO!]\n");
                            System.out.println("| tecle enter para voltar ao menu |");
                            input.nextLine();      
                          }
                          break;

                        case 7: // DISTRIBUIR TAREFAS

                            if(apartamento.getColegas().isEmpty()){
                              System.out.println("|NOTAS| CADASTRE COLEGAS PRIMEIRO!");
                              System.out.println("| tecle enter para voltar ao menu |");
                              String varSair = input.nextLine();
                            }
                            else{
                            apartamento.distribuiTarefas();
                            System.out.println("\n[TAREFAS DISTRIBUIDAS COM SUCESSO!]\n");
                            System.out.println("| tecle enter para voltar ao menu |");
                            String sairDistribuir = input.nextLine();
                            }
                            break;

                        case 8:
                            apartamento.DivideCustos();
                            apartamento.distribuiTarefas();
                            System.out.println("\n[CUSTOS DIVIDIDOS COM SUCESSO!]\n");
                            System.out.println("| tecle enter para voltar ao menu |");
                            String sairDividir = input.nextLine();
                            break;
                        case 9: // DELETAR COLEGA

                          if(apartamento.getColegas().isEmpty()){
                            System.out.println("|NOTA| NÃO EXISTE COLEGAS CADASTRADOS!");
                            System.out.println("| tecle enter para voltar ao menu |");
                            String sairdeletarcolega = input.nextLine();
                          }
                          else{
                          apartamento.ExibirMoradores();
                          System.out.println("\nQual colega você deseja excluir ?");
                          System.out.println("Digite o índice do colega ?"); 
                          int colegaExpulo = input.nextInt();
                          String lixoColegaExpulso = input.nextLine();
                          apartamento.deleteColegas(colegaExpulo - 1);

                          System.out.println("\n[COLEGA EXCLUIDO COM SUCESSO!]\n");
                          System.out.println("| tecle enter para voltar ao menu |");
                          String sairsucessodelet = input.nextLine();
                          }
                          break;

                        case 10: // DELETAR TAREFAS
                          if(apartamento.getTarefas().isEmpty()){
                            System.out.println("|NOTA| NÃO EXISTE TAREFAS PARA DELETAR!");
                            System.out.println("| tecle enter para voltar ao menu |");
                            String sairerrodelet = input.nextLine();
                          }
                          else{
                          apartamento.ExibirTarefas();
                          System.out.println("\nQual tarefa você deseja excluir ?");
                          System.out.println("Digite o índice da tarefa");

                          int tarefaExluida = input.nextInt();
                          String lixoTarefaex = input.nextLine();

                          apartamento.deleteTarefa(tarefaExluida);

                          System.out.println("\n[TAREFA EXCLUIDA COM SUCESSO!]\n");
                          System.out.println("| tecle enter para voltar ao menu |");
                          String sairexibirtarefas = input.nextLine();
                          }
                          break;
                        case 11: // ZERAR CUSTOS

                          System.out.println("Custos sendo todos apagados");
                          apartamento.setCustos(0);
                          System.out.println("| tecle enter para voltar ao menu |");
                          String sairexc = input.nextLine();
                          input.nextLine();

                          break;

                        case 12: // SAIR SEGUNDO WHILE 
                          segundoWhile = false;
                          break;
                                                  
                        } // Swich Case 
                      }
                    }
                  } // If Gerenciar ap - lin 81
                } // for each
              
              } //  Else if - lin 73
            } // Primeiro While 
          } // ver Apartamentos - lin 50
        else if(varEscolha1 == 3){  

          System.out.println("\n\tMuito obrigado por utilizar o YouGere");
          System.out.println();

          System.exit(0);

        }
      } // While Infinito 
    } // Try Scanner
  } // Public Static
} // Main