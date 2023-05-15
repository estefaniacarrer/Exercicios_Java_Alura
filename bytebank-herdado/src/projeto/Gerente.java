package projeto;

//Gerente é um funcionario. Ele herda da classe Funcionario

public class Gerente extends Funcionario {

    private int senha;
    
    public Gerente() {
	}
    
    public void setSenha(int senha) {
		this.senha = senha;
	}
    
    public boolean autentica(int senha) {
    	if (this.senha == senha) {
    		return true;
    	}else {
    		return false;
    	}
    }
		
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getBonificacao() + super.getSalario();
	}
	
}