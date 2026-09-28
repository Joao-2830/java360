import java.util.Scanner;

public class Algoritimo51 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; // Variável de controle do loop

        while (continuar) {
            try {
                System.out.println("\n--- NOVA DIVISÃO ---");
                System.out.print("Entre com o número (ou 0 para sair): ");
                int numero = scanner.nextInt();

                // Condição de saída do loop
                if (numero == 0) {
                    System.out.println("Encerrando a calculadora...");
                    continuar = false; // Isso faz o loop parar
                    continue; // Pula o resto do código e volta para o while
                }

                System.out.print("Entre com o divisor: ");
                int divisor = scanner.nextInt();

                int resultado = numero / divisor;
                System.out.println("Resultado da divisão: " + resultado);

            } 
            catch (ArithmeticException e) {
                System.out.println("Erro: Não é possível dividir por zero! 🤖");
            } 
            catch (Exception e) {
                System.out.println("Erro: Você digitou algo que não é um número!");
                // ⚠️ MUITO IMPORTANTE: Limpar o "lixo" que ficou no Scanner
                scanner.nextLine(); 
            } 
            finally {
                System.out.println("Fim da operação.");
            }
        }
        
        System.out.println("Programa finalizado com sucesso!");
        scanner.close();
    }
}
