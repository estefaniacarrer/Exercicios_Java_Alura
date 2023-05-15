package projetos.aula1;

//Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.

public class Desafio1 {

	public static void main(String[] args) {

		for (int n = 1; n <= 100; n++) {
			if (n % 3 == 0) {
				System.out.println(n);
			}
		}
	}
}

//ou
//
//	public static void main(String[] args) {
//
//		for (int n = 3; n <= 100; n += 3) {
//			System.out.println(n);
//		}
//	}
//}