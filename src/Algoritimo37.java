public class Algoritimo37 {
    void main(){
        Cachorro c = new Cachorro("Rex", "auau.mp3");
        c.comer();
        c.tocarSom();
        IO.println("nome: "+c.getNome());
        
        Gato g = new Gato("Juliano", "miau.mp3");
        g.comer();
        g.tocarSom();
        IO.println("nome: "+g.getNome());
        
        JavaPorco j = new JavaPorco("Javano", "grunido.mp3");
        j.comer();
        j.tocarSom();
        IO.println("nome: "+j.getNome());
    }

}
