package aula1;

public class Variaveis {
  public static void main(String[] args) {

    System.out.println("Hello World!");

    // int
    int idade = 30;
    System.out.println("Sua idade é: " + idade);

    // String
    String nome = "Igor";
    System.out.println("Seu nome é: " + nome);

    // float
    float altura = 1.85f;
    System.out.println("Minha altura é: " + altura);

    // double
    double  peso = 90.5d;
    System.out.println("Meu peso é: " + peso + "Kg");

    // boolean
    boolean estudante = true;
    System.out.println("Sou estudando? " + estudante);

    // char
    char genero = 'M';
    System.out.println("Meu gênero é: " + genero);


    // Array
    int[] notas = {8, 7, 9, 10};
    String[] nomes = {"Igor", "Teste", "120"};
    System.out.println("Primeira nota: " + notas[0]);
    System.out.println("Quantidade de noras: " + notas.length);

  }
}
