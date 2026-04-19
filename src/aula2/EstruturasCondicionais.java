package aula2;

import java.util.Scanner;

public class EstruturasCondicionais {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Digite sua idade: ");
    int idade = sc.nextInt();

    if (idade <= 12) {
      System.out.println("Você é criança");
    } else if (idade > 12 && idade <= 18) {
      System.out.println("Você é adolescente");
    } else {
      System.out.println("Você é maior de idade");
    }
    sc.close();
  }
}
