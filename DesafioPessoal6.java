// Dada uma sequência de inteiros positivos, determine quantos tem três ou quatro dígitos e, dentre eles, qual é o maior. A sequência termina quando o usuário digitar um número negativo ou zero.

import java.util.Scanner;

class DesafioPessoal6 {
  public static void main(String[] args) {
    // Declaração e inicialização de variáveis
        int numero = 0,
        qtd_total = 0,
        qtd_3ou4 = 0,
        maximo = 0;

    //Inicialização do Scanner
        Scanner Teclado = new Scanner(System.in);
    // Solicitar entrada ao usuário
        System.out.println("Digite números... Para sair digite um número <= 0.");

    //Estrutura de repetição
        do{
            numero = Teclado.nextInt();
            qtd_total++;
          // Condição de incremento do resultado
            if(numero > 99 && numero < 10000){
                qtd_3ou4++;
                if(numero > maximo) maximo = numero;
            }
          // Condição de parada do loop
        } while(numero > 0);
    // Decremento do contador
        qtd_total--;

    // Impressão do resultado na tela
        System.out.println("Você digitou " + qtd_total + " números, dos quais " + qtd_3ou4 + " possuem 3 ou 4 dígitos.");
        System.out.println("O maior número de 3 ou 4 dígitos é " + maximo);

    // Boa prática sempre fechar o Scanner
    Teclado.close();
    }
}