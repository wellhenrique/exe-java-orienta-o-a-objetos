public class TesteDesigner {
  public static void main(String[] args) {

    Designer ronaldo = new Designer();
    ronaldo.setNome("Nico Steppat");
    ronaldo.setCpf("223355646-9");
    ronaldo.setSalario(2600.00);

    System.out.println(ronaldo.getNome());
    System.out.println(ronaldo.getBonificacao());

    // nico.salario = 300.0;

  }
}
