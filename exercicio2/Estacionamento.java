import java.util.ArrayList;

public class Estacionamento {
    int quantpessoascarro;
    private ArrayList<Carro> carros = new ArrayList<>();

    public void estacionar(Carro carro){
        carros.add(carro);
    }
    public void quantcarros(){
        for (Carro carro : carros) {
            System.out.println(carro);
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
