import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;


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
                      System.out.println("[1] ADD COLEGA");
                      System.out.println("[2] ADD TAREFAS");
                      System.out.println("[3] ADD CUSTO FIXO");
                      System.out.println("[4] ADD CUSTO ADICIONAL");
                      System.out.println("\n[5] MOSTRAR MORADORES DO AP");
                      System.out.println("[6] MOSTRAR TAREFAS DO AP");
                      System.out.println("[7] DISTRIBUIR TAREFAS");
                      System.out.println("\n[9] DELETAR COLEGA");
                      System.out.println("[10] DELETAR TAREFAS");
                      System.out.println("[11] ZERAR CUSTOS");
                      System.out.println("[12] Sair");
                      int aplocal = input.nextInt();
 
                      switch (aplocal) {
                        case 1:
  
                          System.out.println("Digite as infos para cadastrar COLEGA:\n");
                          
                          // DADOS DO TECLADO
                          System.out.print("Nome:");
                          String nomeColega = input.next();
  
                          System.out.print("Celular: ");
                          String celularCulega = input.next();
  
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
  
                          System.out.print("Final da tarefa: ");
                          String dataPrazo = input.nextLine();
                          input.nextLine();
  
                          // CRIANDO NOVA INSTÂNCIA DE TAREFA E ADICIONANDO ARRAY TAREFA AP
  
                          System.out.println("Tarefa criada com sucesso");
                          
                          Tarefa task = new Tarefa(nomeTask, estimaInicio, dataPrazo);
                          apartamento.addTask(task);

                          break;
  
                        case 3:
  
                          // DADOS TECLADO
                          System.out.println("| DIGITE AS INFOS PARA CADASTRAR UM CUSTO FIXO |\n");
                          
                          System.out.print("Descrição do custo: ");
                          String nomeCusto = input.nextLine();
                          input.nextLine();
  
                          System.out.print("Valor do custo: ");
                          int valorCusto = input.nextInt();
                          input.nextLine();
                  
                          // CRIANDO NOVA INSTÂNCIA DE TAREFA E ADICIONANDO ARRAY TAREFA AP
                          Custos custoFix = new Custos(nomeCusto, valorCusto);
                          apartamento.addCustoFixo(custoFix);
  
                          System.out.println("\n[CUSTO FIXO CADASTRADO COM SUCESSO!]\n");
                          System.out.println("| tecle enter para voltar ao menu |");
                          input.nextLine();

                          break;
  
                        case 4:
                        
                          // DADOS TECLADO
                          System.out.println("| DIGITE AS INFOS PARA ADICIONAR UM CUSTO ADICIONAL |");
                      
                          System.out.println("Descrição do custo: ");
                          String nomeCustoAd = input.nextLine();
  
                          System.out.println("Valor do custo: ");
                          int ValorCustoAd = input.nextInt();
                    
                          // CRIANDO NOVA INSTÂNCIA DE TAREFA E ADICIONANDO ARRAY TAREFA AP
                          Custos custoAdic = new Custos(nomeCustoAd, ValorCustoAd);
                          apartamento.addCustoAdicional(custoAdic);
                          
                          System.out.println("\n[CUSTO ADICIONAL CADASTRADO COM SUCESSO!]\n");
                          System.out.println("| tecle enter para voltar ao menu |");
                          input.nextLine();
                          
                          break;
                        
                        case 5:
  
                          if(apartamento.getColegas().isEmpty()){
                            System.out.println("\n(error) Não há colegas cadatrados.\n");
                            }

                          else if(apartamento.getColegas().isEmpty() == false){
                            apartamento.ExibirMoradores();
                            }

                          System.out.println("\n| tecle enter para voltar ao menu |");
                          String sairmorador = input.nextLine();

                        break;
  
                        case 6:
  
                          if(apartamento.getTarefas().isEmpty()){
                            System.out.println("\n(error) Não há tarefas cadatradas.\n");
                            System.out.println("| tecle enter para voltar ao menu |");
                            input.nextLine();

                            }
                          else if(apartamento.getTarefas().isEmpty() == false){
                            apartamento.ExibirTarefas();
                            }
                          
                            String sairTarefas = input.nextLine();

                            System.out.println("\n[CUSTO ADICIONAL CADASTRADO COM SUCESSO!]\n");
                            System.out.println("| tecle enter para voltar ao menu |");
                            input.nextLine();
                          break;

                        case 7:

                            if(apartamento.getColegas().isEmpty()){
                              System.out.println("|NOTAS| CADASTRE COLEGAS PRIMEIRO!");
                              System.out.println("| tecle enter para voltar ao menu |");
                              String varSair = input.nextLine();
                              input.nextLine();
                            }
                            else{
                            apartamento.distribuiTarefas();
                            System.out.println("\n[TAREFAS DISTRIBUIDAS COM SUCESSO!]\n");
                            System.out.println("| tecle enter para voltar ao menu |");
                            String sairDistribuir = input.nextLine();
                            input.nextLine();
                            }
                            break;

                        case 12:
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