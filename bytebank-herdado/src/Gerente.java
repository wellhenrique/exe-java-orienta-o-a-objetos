public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario() * 2;
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autentica(senha);
	}

}
