import java.util.ArrayList;

public class Estacionamento {
    int quantPessoasCarro;
    private ArrayList<Carro> carros = new ArrayList<>();

    public void estacionar(Carro carro){
        carros.add(carro);
    }
    public void quantCarros(){
        for (Carro carro : carros) {
            System.out.println(carro);
        }
      
    }
    public int quantPessoasCarro(){
        int total = 0;
        for (Carro carro : carros){
            total += carro.getQuantPessoas();
        }
        return total;
    }

}
