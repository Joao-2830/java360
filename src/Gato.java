public class Gato extends Animal 
{

    public Gato(String nome, String arquivoSom) {
        super(nome, arquivoSom);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
       IO.println("Leite para gatos");
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
       IO.println("tocando o som do gato miau"+ super.getArquivoSom());
    }
    

}
