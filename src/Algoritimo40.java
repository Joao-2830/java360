public class Algoritimo40 {
    public void main(){
        //vetor - matriz unidimensional
        /*
            tabela - matriz bidimensional
            //banco de dados, planilha Excel

            3D - matriz tridimensional
            //Cinema,Séries,Desenhos,Animação


        
        */
        //vetor ou matriz unidimensional
        //https://www.somatematica.com.br/emedio/matrizes/matrizes1.php
        //             0 1 2  3 4
        int[] notas = {7,9,5,10,6};
        int maior = notas[3];
        IO.println(maior);
        //Muito util para Big Data
        for(int i=1;i<notas.length;i++){
            if(notas[i]> maior){
                maior = notas[i];

            }
        }
        IO.println("Maior nota:"+maior);





    }
}
