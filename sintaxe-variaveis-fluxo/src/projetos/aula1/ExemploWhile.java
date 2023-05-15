package projetos.aula1;

public class ExemploWhile {
	
public static void main(String[] args) {
		
		double soma = 0;
	    int contador = 0;
	    
	    while(contador < 35) {
	    	double valorLivro = 59.90;
	    	soma += valorLivro;
	    	contador++;
		}
	    
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
