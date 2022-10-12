package exercicio1;

public class BoloSimples implements Bolo{
    private double preco;

    public BoloSimples(){}

    public double getPreco() {
        return 40;
    }



    public void setPreco(double preco) {
        this.preco = preco;
    }

    

    public String adicionarItem(){

        System.out.println("Bolo");
    }

    
    @Override
    public void adicionarCarrinho() {
       
        
    }


    public void ValorCompra(){}

    public void ListarProdutos(){}
        
    

    
}
