public class Algoritimo41 {
    public void main(){
        /*
            

        */
        int[][] m = {
            {21,25},
            {33,35}
        };
        int soma=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                soma += m[i][j];
            }
        }
        IO.print(soma);
    }
}
