package aplication;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	double pg, total, produto1, produto2, resultado;
	
	System.out.println("Digite o valor do produto ");
	
	produto1 = sc.nextDouble();
	
	System.out.println("Digite o valor do produto2 ");
	
	produto2 = sc.nextDouble();
	
	total = produto1 + produto2;
	
	System.out.println("Digite o valor do pagamento ");
	
	pg = sc.nextDouble();
	
	resultado = pg - total; 
	
	if(pg>total) {
		System.out.println("O seu troco e de " + resultado);	
	}else {
		System.out.println("Saldo insuficiente para pagamento ");
	}
	
	
	sc.close();

	}

}