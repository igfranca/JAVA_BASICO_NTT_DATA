package aula1.exer;

import java.util.Scanner;

public class Ex001 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a temperatura em graus celsius: ");
    double tempoCelcius = sc.nextFloat();

    double convertF = (tempoCelcius * 9/5) + 32;

    System.out.println("Fahrenheit: " + convertF + "ºF");

    sc.close();
  }
}
