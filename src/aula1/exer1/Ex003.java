package aula1.exer1;

import java.util.Scanner;

/**
 * Salário com Bônus
 * Um funcionário recebe um salário e um bônus. Escreva um programa que:
 * Leia o nome do funcionário
 * Leia o salário base
 * Leia a porcentagem do bônus
 * Calcule o valor do bônus (salário × porcentagem / 100)
 * Calcule o salário final (salário + bônus)
 * Exiba o nome, salário base, valor do bônus e salário final
 * Entrada: Nome, salário base, porcentagem de bônus Saída: Detalhamento do cálculo
 * */

public class Ex003 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o seu nome: ");
    String nome = scan.nextLine();

    System.out.print("Digite seu salário base: ");
    double salario = scan.nextDouble();

    System.out.print("Digite sua porcentagem: ");
    double porcentagem = scan.nextDouble();

    double calcPorcent = (salario * porcentagem) / 100;
    double salarioFinal = (salario + calcPorcent);

    System.out.printf("Nome: %s, Salário base: R$%.2f, " +
        "Valor do bônus: R$%.2f, " +
        "Salário final: R$%.2f"
        , nome, salario, calcPorcent, salarioFinal);
  }
}
