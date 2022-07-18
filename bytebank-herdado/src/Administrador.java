public class Administrador extends Funcionario implements Autenticavel {

  private int senha = 3333;

  @Override
  public double getBonificacao() {
    System.out.println("Chamando o método de bonificacao do ADMINISTRADOR");
    return super.getSalario() + 500;
  }

  @Override
  public boolean autentica(int senha) {
    if (this.senha == senha) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void setSenha(int senha) {
    this.senha = senha;
  }
}
