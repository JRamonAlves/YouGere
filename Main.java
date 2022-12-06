import java.util.Scanner;

public class Main {
    public static void main(String [] arsgs) {

        System.out.println("\tBem-vindo ao YouGere");
        System.out.println();
        System.out.println("| O que deseja fazer? Digite o número correspondente:\n");
        System.out.println("[1] Criar um novo apartamento para gerenciar");
        System.out.println("[2] Criar um novo perfil para um colega de quarto");
        System.out.println("[3] Criar uma nova tarefa para algum apartamento");
        System.out.println("[4] Criar um novo gasto para esse apartamento");
        System.out.println("[5] Acessar algum apartamento existente");
        System.out.println("-------------------------------------------------------");
        
        Scanner scan = new Scanner(System.in);
        int resposta = scan.nextInt();
       

        switch (resposta) {
            case 1:
              System.out.println("A opção escolhida: 1. [...criando apartamento]");
              break;
            case 2:
              System.out.println("A opção escolhida: 2.");
              break;
            case 3:
              System.out.println("A opção escolhida: 3.");
              break;
            case 4:
              System.out.println("A opção escolhida: 4.");
              break;
            case 5:
              System.out.println("O número escolhido foi: 5.");
              break;
            default:
              System.out.println("O opção escolhida é inválida! Digite um número entre 1 a 5.");
        }

        scan.close(); // Deixar o scan fechado ao final do código para impedir conflitos.
    }
}