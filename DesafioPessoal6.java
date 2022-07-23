// Dada uma sequência de inteiros positivos, determine quantos tem três ou quatro dígitos e, dentre eles, qual é o maior. A sequência termina quando o usuário digitar um número negativo ou zero.

import java.util.Scanner;

class DesafioPessoal6 {
  public static void main(String[] args) {
        int numero = 0,
        qtd_total = 0,
        qtd_3ou4 = 0,
        maximo = 0;
 
        Scanner Teclado = new Scanner(System.in);
 
        System.out.println("Digite números... Para sair digite um número <= 0.");

        do{
            numero = Teclado.nextInt();
            qtd_total++;
 
            if(numero > 99 && numero < 10000){
                qtd_3ou4++;
                if(numero > maximo) maximo = numero;
            }
        } while(numero > 0);
 
        qtd_total--;
 
        System.out.println("Você digitou " + qtd_total + " números, dos quais " + qtd_3ou4 + " possuem 3 ou 4 dígitos.");
        System.out.println("O maior número de 3 ou 4 dígitos é " + maximo);

    Teclado.close();
    }
}