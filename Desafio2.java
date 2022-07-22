// Faça um programa em Java para ler um número que é um código de usuário. Caso este código seja diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’
import java.util.Scanner;

class Desafio2 {
  public static void main(String[] args) {
    int usuario, senha;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o código de usuário: ");
		usuario = entrada.nextInt();
		
		if (usuario == 1234) {
			System.out.print("Insira a senha: ");
			senha = entrada.nextInt();
			if(senha == 9999) {
				System.out.println("Acesso permitido");
			} else {
				System.out.println("Senha incorreta");
			}
		} else {
			System.out.println("Usuário inválido!");
		}
		
		entrada.close();
    }
}