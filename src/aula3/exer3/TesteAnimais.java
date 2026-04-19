package aula3.exer3;

public class TesteAnimais {
  public static void main(String[] args) {

    Cachorro c1 = new Cachorro("Max", "Chachorro", 4);

    System.out.println("C1: ");
    System.out.println(c1.tipo);
    System.out.println(c1.nome);
    System.out.println(c1.idade);
    c1.fazerSom();

    System.out.println("-------------------------------");

    Gato g1 = new Gato("Cat", "Gato", 2);
    System.out.println("G1");
    System.out.println(g1.tipo);
    System.out.println(g1.nome);
    System.out.println(g1.idade);
    g1.fazerSom();
  }
}
