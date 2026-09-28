public class Algoritimo50 {
    void main(){
        try{//certo
            int idade = Integer.parseInt(IO.readln("Qual a sua idade"));
            String resultado = (idade >= 18) ? "maior" : "menor";
            IO.print(resultado);
        }catch(NumberFormatException e){
            //erro
            IO.print("👍👍"+e.getMessage()+"valor inválido.digite um número");
        }finally{
            IO.println("👌-Encerrando SystemSys");
        }
    }
    
}
