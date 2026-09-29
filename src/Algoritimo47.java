import java.util.Scanner;
public class Algoritimo47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variável que controla se o programa continua ou não
        int continuar = 1; 

        // 1. Laço externo (WHILE): Enquanto continuar for 1, repete tudo
        while (continuar == 1) {
            
            // 2. ATENÇÃO: As variáveis precisam ser criadas DENTRO do loop
            // para serem "zeradas" a cada nova rodada!
            int[] vetor = new int[10];
            int soma = 0;

            System.out.println("\n--- Iniciando nova rodada ---");
            
            // 3. Laço interno (FOR): Lê os 10 números
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o " + (i + 1) + "º valor inteiro: ");
                vetor[i] = scanner.nextInt();
                soma += vetor[i]; 
            }

            // 4. Calcula e mostra a média
            double media = soma / 10.0; // Usar 10.0 para ter casas decimais
            System.out.println("A média dos valores é: " + media);

            // 5. Pergunta ao usuário se ele quer repetir
            System.out.println("\nDeseja digitar 10 novos números?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não (Sair do programa)");
            System.out.print("Escolha uma opção: ");
            continuar = scanner.nextInt();
        }

        // 6. Mensagem final quando o usuário decidir sair
        System.out.println("Programa encerrado. Até logo!");
        scanner.close();
    }
}