package aula2.exer2;

import java.util.Scanner;

/**
 * Validação de Login
 * Crie um programa que simule um login. O programa deve:
 * Ler um nome de usuário e uma senha
 * Verificar se o usuário é "admin" E a senha é "1234"
 * Se ambos estiverem corretos, exiba "Login realizado!"
 * Caso contrário, exiba "Usuário ou senha incorretos"
 * Entrada: Usuário e senha Saída: Mensagem de sucesso ou erro
 */

public class Exer1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String user = sc.nextLine();
    System.out.println("Digite sua senha: ");
    int senha = sc.nextInt();

    if (user.equalsIgnoreCase("admin") && senha == 1234){
      System.out.println("Login realizado com sucesso!");
    } else {
      System.out.println("Senha incorreta!");
    }
  }
}
