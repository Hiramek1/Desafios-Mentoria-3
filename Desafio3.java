// Corrigir e documentar o código abaixo

//importado Scanner
import java.util.Scanner;

class Desafio3 {
  public static void main(String[] args) {
    //Inicialização do Scanner
        Scanner sc = new Scanner(System.in);
    //Declaração de variáveis
        int n1, n2, n3;

    // Receber três valores inteiros do usuário
        System.out.print("Entre com o primeiro inteiro: ");
        n1 = sc.nextInt();
        System.out.print("Entre com o segundo inteiro: ");
        n2 = sc.nextInt();
        System.out.print("Entre com o terceiro inteiro: ");
        n3 = sc.nextInt();
    
    // Imprime o menor número comparando cada valor entre si caso n1 > n2
        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 < n3) {
                    System.out.println("O menor numero eh: " + n2);
                } else {
                    System.out.println("O menor numero eh: " + n3);
                }
                System.out.println("O menor numero eh: " + n1);
            } else {
                if (n1 < n2) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n2);
                }
                System.out.println("O menor numero eh: " + n3);
            }
    // Imprime o menor número comparando cada valor entre si caso n2 > n3
        } else {
            if (n2 > n3) {
                if (n1 < n3) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n3);
                }
                System.out.println("O menor numero eh: " + n2);
            } else {
                if (n1 < n2) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n2);
                }
                System.out.println("O menor numero eh: " + n3);
            }
        } // Incluída chave fechando o segundo bloco
    //Fechado Scanner
    sc.close();
}