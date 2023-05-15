package projetos.aula1;

public class ExemploFor {
	
	public static void main(String[] args) {
		
		double soma = 0;
		for (double i = 0; i < 35 ; i++) {
			soma +=59.90;
		}
		//uma forma de arredondamento:
		//DecimalFormat formatador = new DecimalFormat("0.00"); > sysout >formatador.format(soma)
		System.out.printf("O total em estoque é %.2f %n", soma );
		
		if (soma <150) {
			System.out.println("Seu estoque está muito baixo");
		}else if(soma >= 2000) {
			System.out.println("Seu estoque está muito alto");
		}else {
			System.out.println("Seu estoque está bom");
		}
	}

}
