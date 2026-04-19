package aula3;

public class Funcoes {
  public static void main(String[] args) {

    int a = 5;
    int b = 10;

    int soma = a + b;
    System.out.println(soma);
    System.out.println("Resultado: " +  somar(a, b));

    dizerOi();

  }

  public static int somar(int num1, int num2) {
    int resultado = num1 + num2;
    return resultado;
  }

  public static void dizerOi() {
    System.out.println("Oi");
  }
}
