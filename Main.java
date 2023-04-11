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
    double rendimentoDeTinta = 6;

    System.out.println("Informe a quantidade de tinta necessária: ");

    Scanner tintaSolicitada = new Scanner(System.in);
    quantidadeDeTintaSolicitada = tintaSolicitada.nextDouble();

    double resultadoDaMetragemEmLata;

    resultadoDaMetragemEmLata = Math.ceil(quantidadeDeTintaSolicitada / (LataDeTinta * rendimentoDeTinta));

    double valorTotal = valorDaLata * resultadoDaMetragemEmLata;
    System.out.println(
        "A quantidade de lata de tinta necessária é: " + resultadoDaMetragemEmLata + "O valor das compras serão: "
            + valorTotal);

    double resul = Math.ceil(quantidadeDeTintaSolicitada / (GaleaoDeTinta * rendimentoDeTinta));
    double valorTotalGaleao = resul * valorDoGaleao;
    System.out.println("Será necessário: " + resul + " E o valor será: " + valorTotalGaleao);

    double metragemMaisDezPorCento = quantidadeDeTintaSolicitada * 1.1;

    double quantidadeMisturaEmLatas = metragemMaisDezPorCento / (LataDeTinta * rendimentoDeTinta);

    double quantidadeMisturaLatasArredondadas = Math.ceil(metragemMaisDezPorCento / (LataDeTinta * rendimentoDeTinta));

    double quantidadeDesperdicioLata = quantidadeMisturaLatasArredondadas - quantidadeMisturaEmLatas;

    double quantidadeLitrosConvertendoEmGaleos = (1 - quantidadeDesperdicioLata) * LataDeTinta;

    double quantidadeEmGaloesArredondada = Math.ceil(quantidadeLitrosConvertendoEmGaleos / GaleaoDeTinta);

    double quantidadeEmLataFinal = Math.floor(quantidadeMisturaEmLatas);

    System.out.println("A quantidade que de lata necessária é: " + quantidadeEmLataFinal
        + " E a quantidade de gaelao necessária é: " + quantidadeEmGaloesArredondada);

  }
}