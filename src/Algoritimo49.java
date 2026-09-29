import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Algoritimo49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Cria uma lista dinâmica de Strings
        List<String> laboratorios = new ArrayList<>();
        int opcao = 0;

        // Loop continua enquanto a opção não for 2 (Sair)
        while (opcao != 2) {
            System.out.println("\n1 - Adicionar laboratório");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado (muito importante!)

            if (opcao == 1) {
                System.out.print("Qual laboratório quer adicionar (ex: F03, F05): ");
                String lab = scanner.nextLine();
                laboratorios.add(lab); // Adiciona na lista
            } else if (opcao == 2) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        // Mostra os resultados finais
        System.out.println("\n--- Resultados Finais ---");
        System.out.println("Quantidade de laboratórios adicionados: " + laboratorios.size());
        System.out.println("Laboratórios: " + laboratorios);
        
        scanner.close();
    }
}