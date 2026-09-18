public class JavaPorco extends Animal {

    public JavaPorco(String nome, String arquivoSom) {
        super(nome, arquivoSom);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        IO.println("platações rurais");
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
        IO.println("grunido.mp3");
    }
    
}
