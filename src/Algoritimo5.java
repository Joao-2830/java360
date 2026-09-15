public class Algoritimo5 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(IO.readln("\n digite um numero: "));
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        IO.println("O antecessor:" + antecessor);
        IO.println("O sucessor:" + sucessor);

    }
}
