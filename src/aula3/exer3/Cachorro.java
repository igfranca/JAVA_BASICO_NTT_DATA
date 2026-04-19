package aula3.exer3;

public class Cachorro extends Animal{

  public Cachorro(String nome, String tipo, int idade){
    super(nome, tipo, idade);
  }

  public void fazerSom(){
    System.out.println("Au Au!");
  }
}
