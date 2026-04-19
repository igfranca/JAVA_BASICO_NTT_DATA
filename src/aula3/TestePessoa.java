package aula3;

public class TestePessoa {
  public static void main(String[] args) {

    Pessoa p1 = new Pessoa();
    Pessoa p2 = new Pessoa("TesteP2", 30, 1.80);

    System.out.println("P1");
    p1.setNome("TesteP1");
    p1.setIdade(35);
    p1.setAltura(1.85);
    System.out.println(p1.getNome());
    System.out.println(p1.getIdade());
    System.out.println(p1.getAltura());

    System.out.println("------------------------------------");

    System.out.println("P2");
    System.out.println(p2.getNome());
    System.out.println(p2.getIdade());
    System.out.println(p2.getAltura());

    System.out.println("------------------------------------");

    Aluno a1 = new Aluno("TesteA1", 34, 1.70, "12345");
    System.out.println("A1");
    System.out.println(a1.getNome());
    System.out.println(a1.getIdade());
    System.out.println(a1.getAltura());
    System.out.println(a1.getMatricula());

    System.out.println("------------------------------------");

    Professor prof1 = new Professor("TesteProf1", 50, 1.80, 4000, "Math");
    System.out.println("PROF1");
    System.out.println(prof1.getNome());
    System.out.println(prof1.getIdade());
    System.out.println(prof1.getAltura());
    System.out.println(prof1.getSalario());
    System.out.println(prof1.getDisciplina());

    prof1.aumentarSalario(300);
    System.out.println(prof1.getSalario());

    System.out.println("------------------------------------");

    Calculadora calc = new Calculadora();
    System.out.println(calc.somar(5, 6));
    System.out.println(calc.subtrair(5, 6));
    System.out.println(calc.multiplicar(5, 6));
    System.out.println(calc.dividir(5, 6));
    System.out.println(calc.pontencia(5, 6));

  }
}
