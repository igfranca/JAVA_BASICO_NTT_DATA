package aula1.exer1;

import java.util.Scanner;

/**
 * Cálculo do IMC
 * Desenvolva um programa que calcule o Índice de Massa Corporal (IMC) de uma pessoa. O programa deve:
 * Ler o nome, peso (em kg) e altura (em metros)
 * Calcular o IMC usando a fórmula: IMC = peso / (altura²)
 * Exibir o nome da pessoa e seu IMC
 * Entrada: Nome (String), peso (double), altura (double) Saída: Mensagem com nome e IMC
 *  */

public class Ex002 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String nome;
    double peso, altura, calcIMC;

    System.out.println("Digite seu nome: ");
    nome = sc.nextLine();
    System.out.println("Digite seu peso: ");
    peso = sc.nextDouble();
    System.out.println("Digite sua altura: ");
    altura = sc.nextDouble();

    calcIMC = peso / Math.pow(altura, 2);

    System.out.println("Nome: " + nome + " / Peso: " + peso + " / Altura: " + altura);
    System.out.printf("Seu IMC é: %.2f%n", calcIMC);

    sc.close();
  }
}
