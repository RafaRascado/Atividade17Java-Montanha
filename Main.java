// Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
// Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
// comprar apenas latas de 18 litros;
// comprar apenas galões de 3,6 litros;
// misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double quantidadeDeTintaSolicitada;
    double LataDeTinta = 18;
    double GaleaoDeTinta = 3.6;
    double valorDaLata = 80;
    double valorDoGaleao = 25;

    System.out.println("Informe a quantidade de tinta necessária: ");

    Scanner tintaSolicitada = new Scanner(System.in);
    quantidadeDeTintaSolicitada = tintaSolicitada.nextDouble();

    double resultadoDaMetragemEmLata = Math.ceil(quantidadeDeTintaSolicitada / 6);

    if (resultadoDaMetragemEmLata > LataDeTinta) {
      double resultado = Math.ceil(resultadoDaMetragemEmLata / LataDeTinta);
      double valorTotal = valorDaLata * resultado;
      System.out.println(
          "A quantidade de lata de tinta necessária é: " + resultado + "O valor das compras serão: " + valorTotal);
    } else {
      System.out.println("Será necessário apenas uma lata de tinta e o valor é: R$ 80,00");
    }

    System.out.println("Informe a quantidade de metros que quer pintar: ");

    Scanner tecladoGaleao = new Scanner(System.in);
    double quantidadeDeTintaEmGaleao = tecladoGaleao.nextDouble();

    double resultadoEmGaleao = Math.ceil(quantidadeDeTintaEmGaleao / 6);

    if (resultadoEmGaleao > GaleaoDeTinta) {
      double resul = Math.ceil(resultadoEmGaleao / GaleaoDeTinta);
      double valorTotalGaleao = resul * valorDoGaleao;
      System.out.println("Será necessário: " + resul + " E o valor será: " + valorTotalGaleao);
    } else {
      System.out.println("Será necessário apenas uma lata de tinta e o valor será de R$ 25.00");
    }

    System.out.println("Informe novamente um valor:");
    Scanner tecladoNovamente = new Scanner(System.in);
    double quantidade = tecladoNovamente.nextDouble();

    double resultadoDaQuantidade = Math.ceil(quantidade / 6);

    if (resultadoDaQuantidade > LataDeTinta) {
      double resultadoTotal = Math.ceil(resultadoDaQuantidade / LataDeTinta);

      double sobra = resultadoTotal % 18;
      double galeaoNecessario = Math.ceil(sobra / GaleaoDeTinta);

      System.out.println("A quantidade que de lata necessária é: " + resultadoTotal
          + " E a quantidade de gaelao necessária é: " + galeaoNecessario);

    }
  }
}