import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int opçoes = 6;
        Scanner select = new Scanner(System.in);
        ArrayList<String> contas = new ArrayList<>();

        do {
            System.out.println("------------------------------------------");
            System.out.println("--------------MENU DE OPÇOES--------------");
            System.out.println("------------------------------------------");
            System.out.println("1 - Cadastro de contas");
            System.out.println("2 - Realizar Depósito");
            System.out.println("3 - Realizar Saques");
            System.out.println("4 - Consultar Saldo");
            System.out.println("5 - Consultar Historico de Movimentações");
            System.out.println("6 - Trasferir Valor entre contas");
            System.out.println("------------------------------------------");

            System.out.print("Digite a opção que deseja acessar: ");
            opçoes = select.nextInt();
            select.nextLine();

            switch (opçoes) {
                case 1: System.out.println("-----------------------------------------");
                        System.out.println("------------Cadastro de Conta------------");
                        System.out.println("-----------------------------------------");
                    break;

                case 2: System.out.println("-----------------------------------------");
                        System.out.println("------------Realizar Depósito------------");
                        System.out.println("-----------------------------------------");  
                    break; 

                case 3: System.out.println("-----------------------------------------");
                        System.out.println("-------------Realizar Saque--------------");
                        System.out.println("-----------------------------------------"); 
                    break;

                case 4: System.out.println("-----------------------------------------");
                        System.out.println("-------------Consultar Saldo-------------");
                        System.out.println("-----------------------------------------");
                    break;

                case 5: System.out.println("-----------------------------------------");
                        System.out.println("---Consultar Histórico de Movimentações---");
                        System.out.println("-----------------------------------------");
                    break;

                case 6: System.out.println("-----------------------------------------");
                        System.out.println("------Trasferir Valor Entre Contas-------");
                        System.out.println("-----------------------------------------");
                    break;
                    
                default:
                        System.out.println("-----------------------------------------");
                        System.out.println("--------Esse valor não é Valido---------");
                        System.out.println("-----------------------------------------");
                    break;            
            }

        } while (opçoes != 6);
            select.close();
            System.out.print("Finalizado");  

    }
    
}
