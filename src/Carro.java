public class Carro extends Veiculo implements IManutencao,IMeusImpostos{
    private int numPortas;
   
    public Carro() {
        super();
    }
    public Carro(String placa, int velocidadeMax, String tipoCombustivel, String cor, int numPortas) {
        super(placa, velocidadeMax, tipoCombustivel, cor);
        this.numPortas = numPortas;
    }
    public int getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    @Override
    public void mover() {
        IO.print("o carro se moveu!");
    }
    @Override
    public void adicionar() {
        IO.print("impostos adicionados no carro de ouro");
    }
    @Override
    public void revisaoProgramada() {
        IO.println("Faça Revisão Hoje com a taxa de:"+IManutencao.TAXA);
    }

    
}
