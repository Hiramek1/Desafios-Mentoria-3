// Escreva um programa para determinar a quantidade de cavalos necessários para se levantar uma massa de m quilogramas a uma altura de h metros em t segundos. Considere cavalos = (m * h / t) / 745,6999

class DesafioPessoal5 {
  public static void main(String[] args) {
    // Declaração de variáveis
        double m, h, t, cavalos;
    // Inicialização das variáveis
        m = 21;
        h = 2.2;
        t = 1.4;

    // Calculo da proposta
        cavalos = (m * h / t) / 745.6999;

    // Impressão do resultado na tela
        System.out.println("A quantidade de cavalos necessários é " + cavalos);
    }
}