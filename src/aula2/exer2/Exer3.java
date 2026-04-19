package aula2.exer2;

import java.util.Scanner;

/**
 * Classificação de Notas
 * Faça um programa que leia uma nota (0 a 10) de um aluno e classifique-a conforme:
 * 9 - 10: Excelente
 * 7 - 8.9: Bom
 * 5 - 6.9: Satisfatório
 * 0 - 4.9: Insuficiente
 * Entrada: Uma nota em decimal Saída: Classificação da nota
 */

public class Exer3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite sua nota: ");
    float nota =  sc.nextFloat();

    if (nota >= 9){
      System.out.println("Excelente");
    } else if (nota >= 7){
      System.out.println("Bom");
    } else if (nota >= 5){
      System.out.println("Satisfatório");
    } else if (nota < 5){
      System.out.println("Insuficiente");
    }
  }
}
