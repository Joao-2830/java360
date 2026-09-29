public class Algoritimo48 {
    public static void main(String[] args) {
        // 1. Declaração e inicialização da matriz 3x3
        int[][] matriz = {
            {20, 50, 80},
            {45, 60, 90},
            {45, 67, 89}
        };

        System.out.println("Valores da diagonal principal:");

        // 2. Laço para percorrer a matriz
        for (int i = 0; i < matriz.length; i++) {
            // 3. A diagonal principal é onde a linha (i) é igual à coluna (i)
            System.out.println(matriz[i][i]);
        }
    }
}