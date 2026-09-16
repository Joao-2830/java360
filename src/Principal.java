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
   } 
}
