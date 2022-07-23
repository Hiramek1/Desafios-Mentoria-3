// Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.

class DesafioPessoal3 {
  public static void main(String[] args) {
    // Declaração de variáveis
        double hp, lp, ha, la, qtd;
    // Inicialização das variáveis
        hp = 2.6;
        lp = 1.6;
        ha = 0.35;
        la = 0.3;
    // Calculo da proposta
        qtd = (hp * lp) / (ha * la);
    // Impressão do resultado na tela
        System.out.println("Quantidade de azulejos necessários para cobrir a parede: " + qtd);
    }
}