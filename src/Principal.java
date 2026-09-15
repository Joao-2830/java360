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

   } 
}
