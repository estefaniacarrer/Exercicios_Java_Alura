package projetos.aula1;

//imprimir os fatoriais de 1 a 10!
//ex: O fatorial de 4! = 1 x 2 x 3 x 4 = 24

public class Desafio2 {
	
	public static void main(String[] args) {
		
		int fat = 1;
		for (int m = 1; m <= 10; m++) {
			fat *= m;
			System.out.println("O fatorial de " + m + " é " + fat);
		}
	}

}
