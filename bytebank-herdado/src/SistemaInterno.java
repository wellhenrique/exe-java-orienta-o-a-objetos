public class SistemaInterno {

  private int senha = 2222;

  public void autenticacao(Autenticavel g) {
    boolean autenticado = g.autentica(this.senha);

    if (autenticado) {
      System.out.println("Pode entrar no sistema!");
    } else {
      System.out.println("Não pode entrar no sistema!");
    }

  };
};
