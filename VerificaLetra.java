import java.util.Scanner;

public class VerificaLetra {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe a string
        System.out.print("Informe uma string: ");
        String inputString = scanner.nextLine();

        // Variável para contar quantas vezes 'a' aparece
        int count = 0;

        // Converte a string para minúsculas para facilitar a verificação
        String lowerCaseString = inputString.toLowerCase();

        // Verifica a ocorrência da letra 'a'
        for (int i = 0; i < lowerCaseString.length(); i++) {
            if (lowerCaseString.charAt(i) == 'a') {
                count++;
            }
        }

        // Exibe o resultado
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
