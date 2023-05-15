package projeto;

public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());
		
		Cliente marcia = new Cliente();
		marcia.setNome("marcia ferreira");
		
		conta.setTitular(marcia);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//outra forma:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(marcia);
		System.out.println(conta.getTitular());
		
		
	}

}
