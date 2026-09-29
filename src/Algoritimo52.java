import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Algoritimo52 {
    public void main(){

        int r = 0;
        do{
            try{

                String duvida = IO.readln();
            }catch(Exception e){
                IO.print(e.getMessage());
            }
            IO.println("adicionar mgs:1[sim] 0[não]");
            r = Integer.parseInt(IO.readln());

        }while(r==1);
    }
}

