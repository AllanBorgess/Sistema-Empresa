
public class Administrador extends Funcionario implements Autenticavel{
	
	public AutenticacaoUtil autenticou;
	
	public Administrador() {
		 autenticou = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticou.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticou.autentica(senha);
	}


}
