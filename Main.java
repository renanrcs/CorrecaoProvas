import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Prova primeiroAno = new Prova();
		int opcaoMenu;
		
		primeiroAno.mostrarMenu();
		opcaoMenu = scan.nextInt();
		
		while(opcaoMenu > 0 && opcaoMenu < 4) {
			switch(opcaoMenu) {
				case 1:
					//primeiroAno.mostrarMenu();
					//opcaoMenu = scan.nextInt();
					primeiroAno.cadastrarGabarito();
					primeiroAno.mostrarMenu();
					opcaoMenu = scan.nextInt();
					break;
				case 2:
					primeiroAno.cadastrarProva();
					primeiroAno.mostrarMenu();
					opcaoMenu = scan.nextInt();
					break;
				case 3:
					primeiroAno.verificarSituação();
					primeiroAno.mostrarMenu();
					opcaoMenu = scan.nextInt();
					break;
				default:
					break;
			}
		}

	}

}
