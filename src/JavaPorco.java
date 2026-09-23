public class JavaPorco extends Animal {

    public JavaPorco(String nome, String arquivoSom) {
        super(nome, arquivoSom);
    }

    @Override
    public void comer() {
        IO.println("platações rurais");
    }

    @Override
    public void tocarSom() {
        IO.println("grunido.mp3");
    }
    
}
