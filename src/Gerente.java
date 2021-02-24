 
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticou;
	
	public Gerente(){
		 this.autenticou = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		System.out.println("chamando o metodo de bonificacao do gerente");
		return super.getSalario();
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
	
	
	

