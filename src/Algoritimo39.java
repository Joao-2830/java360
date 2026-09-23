import javax.swing.JOptionPane;

public class Algoritimo39 {
    /*Revisão:Classe Abstrata, Interfaces, Polimorfismo
    Encapsulamento e Static

    Transporte
    Onibus
    Metro
    
    */
   public void main(){
   Onibus o1 = new Onibus("PCU 5678");
   Onibus o2 = new Onibus("ZRE 4533");
   Onibus o3 = new Onibus("FGH 5079");

   Metro m1 = new Metro("WEA 1232");
   Metro m2 = new Metro("OPK 2934");
   Metro m3 = new Metro("QRW 2039");
   
   int op;
   do {
     String opcao = JOptionPane.showInputDialog("1-Onibus 2-Metro");
       op =Integer.parseInt(opcao);
    if (op ==1){
        JOptionPane.showMessageDialog(null,o1.calcularTarifa());
        JOptionPane.showMessageDialog(null, "Frota"+Onibus.getCont());
    }else if(op ==2){
        JOptionPane.showMessageDialog(null, m1.calcularTarifa());

    }else if (op == 3){
        JOptionPane.showMessageDialog(null, "Fechando o sistema");
    
    }else{
        JOptionPane.showMessageDialog(null, "Opção invalida", 
        "Senai", JOptionPane.ERROR_MESSAGE);

    }

   }while (op != 3);

 }



}



