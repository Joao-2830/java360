//import javax.swing.JOptionPane;

public class Principal {
  public static void main(String[] args){
        //É  uma instância de uma classe
    Algoritimo31 objeto = new Algoritimo31();
    /*classe      obj   at ope construtor*/
    IO.println(objeto.getALOMUNDO());
    objeto.printarNaTela();

    Algoritimo32 objeto2 = new Algoritimo32();
    String nome = IO.readln("Digite seu nome");
    objeto2.mostrarSalaEco("JP Max plus");
    objeto2.mostrarSalaEco(nome);
   
    Algoritimo32 objeto3 = new Algoritimo32();
    IO.println(objeto3.mostrarSala("Maria Eduarda"));
    //String nome3 = JOptionPane.showInputDialog(objeto3);
    //
    //Classe objeto = new Construtor();
    // construtor default
    Algoritimo33 alg33 = new Algoritimo33();
    alg33.inserirChave(3);
    IO.println(alg33.retornarChave());

    IO.println(alg33.abrirPorta());

    Algoritimo34 alg34 = new Algoritimo34();
    alg34.setPrimeiroNumero(10);
    alg34.setSegundoNumero(5);
    IO.println(alg34.getPrimeiroNumero());
    IO.println(alg34.getSegundoNumero());

    Algoritimo35 alg35 = new Algoritimo35();
    alg35.setModelo("Fusca");
    alg35.setPlaca("abc1234");
    alg35.setCavalos(300);
    IO.println(alg35.getModelo());
    IO.println(alg35.getPlaca());
    IO.println(alg35.getCavalos());
   } 
}
