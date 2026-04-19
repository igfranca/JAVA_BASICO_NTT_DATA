package aula3.exer3;

/**
 * Animais
 * Crie uma classe Animal com:
 * Atributos: nome (String), idade (int), tipo (String)
 * Métodos: getNome(), setNome(), getIdade(), setIdade(), getTipo(), setTipo()
 * Crie duas subclasses:
 * Cachorro que herde as caracteristicas de Animal e que possua um metodo fazer_som() para exibir "Au au!"
 * Gato que herde as caracteristicas de Animal e que possua  um metodo fazer_som() para exibir "Miau!"
 * Crie um programa teste que instancie um cachorro e um gato e chame o método fazer_som().
 *  */

public class Animal {

  String nome, tipo;
  int idade;

  public Animal(String nome, String tipo, int idade) {
    this.nome = nome;
    this.tipo = tipo;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}
