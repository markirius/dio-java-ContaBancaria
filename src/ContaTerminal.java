/* dio-java-ContaBanco
 * DIO - Trilha Java Básico
 * 
 * Marcos Fernandes
 * 01-05-2024
 */

import java.util.Locale;
import java.util.Scanner;

class ContaTerminal {

   public static void main(String[] args) throws Exception {

       // cria o scanner para tratar os valores inseridos no terminal
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite o número da Agência: ");
       int numeroAg = scanner.nextInt();

       System.out.println("Digite a Agência: ");
       String agencia = scanner.next();

       // utilizdo o nextLine para permitir o uso do nome com espaços
       scanner.nextLine();
       System.out.println("Digite o nome do Cliente: ");
       String nomeCliente = scanner.nextLine();

       System.out.println("Digite o saldo: ");
       double saldoCliente = scanner.nextDouble();

       // limpa a tela
       System.out.print("\033[H\033[2J");
       System.out.flush();

       // imprime valores inseridos
       System.out.println("Olá " + nomeCliente + ",\nobrigado por criar uma conta em nosso banco, sua agência é " + agencia + " ,conta " + numeroAg + " e seu saldo de " + saldoCliente + " já está disponível para saque.");

       scanner.close();
   }
}
