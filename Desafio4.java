// Fazer um programa em Java, implementando uma estrutura de repetição, que armazene o nome, a idade e a altura dos usuários e no final mostre como saída quantas pessoas acima de 25 anos e maiores de 1.75 participaram da pesquisa.
import java.util.Scanner;

class Desafio4 {
  public static void main(String[] args) {
    // Declaração de instâncias para loop de até 10 entidade
    String[] nome = new String[10];
    int[] idade = new int[10];
    double[] altura = new double[10];
    int i = 0, endLoop = 1;

    //Inicialização do Scanner
    Scanner input = new Scanner(System.in);

    // Aviso de limitação ao usuário
    System.out.println("Insira até 10 pessoas");

    //Loop para receber até 10 usuários
    do {
      System.out.println("Digite seu nome: ");
      nome[i] = input.nextLine();
      System.out.println("Digite sua idade: ");
      idade[i] = input.nextInt();
      System.out.println("Digite sua altura: ");
      altura[i] = input.nextInt();
      
      // Opção para parar o loop
      System.out.println("Entre 0 para finalizar, outro inteiro para continuar cadastrando");
      endLoop = input.nextInt();

      // Incremento dos contadores
      i++;
      endLoop++;
      
    // Condição para fim do loop
    } while (endLoop == 10 || endLoop == 0);

    // Loop para imprimir os valores na condição solicitada
    for (int j = 0; j < i; j++){
      if (idade[j] > 25 && altura[j] > 1.75) {
        System.out.println(nome[j] + " tem " + altura[j] + " de altura e " + idade[j] + " anos.");
      }
    }

    // Boa prática de fechar o Scanner
    input.close();
    }
}