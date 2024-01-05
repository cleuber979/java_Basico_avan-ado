import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		
		switch(x){
			case 1:
				dia = "Domindo";
				System.out.printf(dia);
				break;
			case 2:
				dia = "Segunda";
				System.out.printf(dia);
				break;
			case 3:
				dia = "Terça-feira";
				System.out.printf(dia);
				break;
			case 4:
				dia = "Quarta-feira";
				System.out.printf(dia);
				break;
			case 5:
				dia = "Quinta-feira";
				System.out.printf(dia);
				break;
			case 6:
				dia = "Sexta-feira";
				System.out.printf(dia);
				break;
			case 7:
				dia = "Sábado";
				System.out.printf(dia);
				break;
				default:
			    dia = "Valor invalido";
			    System.out.printf(dia);
			    break;
		}
		
		
			sc.close();
		}
		
	}


