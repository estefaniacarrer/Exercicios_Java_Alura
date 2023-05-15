package projeto.bytebankcomposto;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente alice = new Cliente();
		alice.nome = "Alice Silva";
		alice.cpf = "232.232.232-22";
		alice.profissao = "engenheira";
		
		Conta contaDaAlice = new Conta();
		contaDaAlice.deposita(100);
		
		//associa o cliente a conta
		contaDaAlice.titular = alice;
		System.out.println(contaDaAlice.titular.nome);
		System.out.println(contaDaAlice.titular);
		System.out.println(alice);
		
	}

}
