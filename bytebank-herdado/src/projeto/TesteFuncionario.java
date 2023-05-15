package projeto;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Silva");
		nico.setCpf("2223334445-55");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		//nico.salario = 300.0;
		
	}

}
