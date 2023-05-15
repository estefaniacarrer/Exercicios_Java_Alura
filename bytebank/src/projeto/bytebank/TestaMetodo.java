package projeto.bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaTeste = new Conta();
		contaTeste.saldo = 100;
		contaTeste.deposita(50);
		System.out.println(contaTeste.saldo);
		
		boolean conseguiuRetirar = contaTeste.saca(50);
		System.out.println(contaTeste.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = contaDaMarcela.transfere(400, contaTeste);
		
		if(sucessoTransferencia) {
			System.out.println("\nTransferencia realizada com sucesso!");
		} else {
			System.out.println("\nFaltou dinheiro!");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaTeste.saldo);
		
		contaTeste.titular = "Alice da Silva";
		System.out.println(contaTeste.titular);
		
	}

}
