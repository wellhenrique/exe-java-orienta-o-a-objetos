public class TesteAdministrador {
  public static void main(String[] args) {

    Administrador ronaldo = new Administrador();
    ronaldo.setNome("Nico Steppat");
    ronaldo.setCpf("223355646-9");
    ronaldo.setSalario(2600.00);

    System.out.println(ronaldo.getNome());
    System.out.println(ronaldo.getBonificacao());

    // nico.salario = 300.0;

  }
}
