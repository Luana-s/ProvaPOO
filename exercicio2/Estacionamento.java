import java.util.ArrayList;

public class Estacionamento {
    int quantpessoascarro;
    int pessoasestaci;
    private ArrayList<Carro> carros = new ArrayList<>();

    public void estacionar(Carro carro){
        carros.add(carro);
    }
    public void quantcarros(){
        for (Carro carro : carros) {
            System.out.println(carros);
        }
    }
    public int quantpessoascarro(){
        int total = 0;
        for (Carro carro : carros){
            total += carro.getQuantpessoas();
        }
        return total;
    }

}
