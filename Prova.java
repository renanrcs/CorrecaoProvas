import java.util.Scanner;

public class Prova {
	
	Scanner scan = new Scanner(System.in);
	char[] gabarito = new char[5];
	int media;
	
	public void mostrarMenu() {
		System.out.println("Escolha uma opção a seguir:\n 1 - Cadastrar Gabarito\n"
				+ " 2 - Cadastrar Prova\n 3 - Verificar Situação\n 4 - Sair");
	}
	
	public void cadastrarGabarito() {
		for(int i = 0; i < gabarito.length; i++) {
			System.out.println("Informe a resposta da questão: "+ (i+1));
			gabarito[i] = scan.next().charAt(0);
		}
	}
	
	public int cadastrarProva() {
		int nota = 0;
		char resposta = 'z';
		for(int i = 0; i < gabarito.length; i++) {
			System.out.println("Informe a resposta da questão: "+ (i+1));
			resposta = scan.next().charAt(0);
			if(resposta == gabarito[i]) {
				nota++;
			}
		}
		media = nota;
		return nota;
	}
	
	public void verificarSituação() {
		if(media >= 4) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
}
