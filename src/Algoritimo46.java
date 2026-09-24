import java.util.ArrayList;
import java.util.List;

public class Algoritimo46 {
    public void main(){

        //List(Lista)- 100,60,50
       //Dictionary - 100:Maria, 40:JP, 50:



        List<String>frutas = new ArrayList<>();
        frutas.add("Goiaba");
        frutas.add("Amora");
        frutas.add("Melancia");
        frutas.add("Mamão");

        IO.println("primeira fruta:"+frutas.get(0));
        IO.println(frutas);
        frutas.set(1,"Uva");
        for(String fruta:frutas){
            IO.println("elemento:"+fruta);
        }
        IO.println("Total de frutas: "+frutas.size());
        frutas.remove("Mamão");
        frutas.remove("Goiaba");
        frutas.remove("Melancia");
         IO.println("Total de frutas: "+frutas.size());
        IO.println("lista"+frutas);
        frutas.add("Laranja");
        frutas.add("Morango");
        IO.println(frutas);

        frutas.remove(1);

        IO.println(frutas);
   
    }


    
}
