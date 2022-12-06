import java.util.Scanner;

public class Main {
    public static void main(String [] arsgs) {
    
        System.out.println("------------------------");
        System.out.println("\tBem-vindo ao YouGere");
        System.out.println();
        System.out.println("O que deseja fazer hoje ?");
        System.out.println("Digite 1 se deseja criar um novo apartamento para gerenciar");
        System.out.println("Digite 2 se deseja criar um novo perfil para um colega de quarto");
        System.out.println("Digite 3 se deseja criar uma nova tarefa para algum apartamento");
        System.out.println("Digite 4 se deseja criar um novo gasto para esse apartamento");
        System.out.println("Digite 5 se deseja acessar algum apartamento existente");
        
        Scanner scan = new Scanner(System.in);
        int resposta = scan.nextInt();
        scan.close();

        if (resposta == 1) {

            System.out.println("Qual será o nome do apartamento ?");
            String nomeApartamento = scan.nextLine();
            System.out.println("Qual será");
            scan.close();

            Apartamento apartamento = 
            
        }


    }
}