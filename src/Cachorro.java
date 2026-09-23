public class Cachorro extends Animal {

    public Cachorro(String nome, String arquivoSom) {
        super(nome, arquivoSom);
        
    }

    @Override
    public void comer() {
       
        IO.println("Ração Camil para Cães");
    }

    @Override
    public void tocarSom() {
        
        IO.println("Tocando auau.mp3");
    }
    
}
