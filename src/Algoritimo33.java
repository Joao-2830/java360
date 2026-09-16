public class Algoritimo33 {
    private int chave;//atributo
    //"Aqui existe um construtor oculto"
    
    public void inserirChave(int c){
         chave = c;
    }
    public int retornarChave(){
        return chave;
    }
    public String abrirPorta(){
        String resposta;
        if(chave ==7){
          resposta = "A porta verde-água se abre";
        }else{
           resposta = "A porta de cobre se abre";
        }
        return resposta;
    }
}
