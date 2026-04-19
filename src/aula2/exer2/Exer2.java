package aula2.exer2;

import java.util.Scanner;

/**
 * Soma de N Números
 * Desenvolva um programa que:
 * Leia a quantidade de números a serem informados
 * Leia N números inteiros
 * Calcule a soma de todos os números
 * Calcule a média
 * Exiba soma e média
 * Entrada: Quantidade N, seguida de N números Saída: Soma e média dos números
 */

public class Exer2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos número você pretende entrar: ");
    int n = sc.nextInt();
    double[] numeros = new double[n];
    int soma = 0;

    for (int i = 0; i < n; i++) {
      numeros[i] = sc.nextDouble();
    }

    for (int i = 0; i < n; i++) {
      soma += numeros[i];
    }

    System.out.println(soma);

    sc.close();
  }
}
