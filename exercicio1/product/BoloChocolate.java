package exercicio1.product;

import exercicio1.Comprar;

public class BoloChocolate extends BoloDecorator implements Comprar{
  

    public BoloChocolate(Comprar bolo) {
        super(bolo);
    }

    @Override
    public String adicionarProduto() {
        return super.adicionarProduto() + "Cobertura de Chocolate, ";
            
    }
    @Override
    public double valorCompra() {
        return super.valorCompra() + 20;      
    }
    
    @Override
    public String listarProdutos() {
        return("Preco:" + valorCompra() + ", Items: , " + adicionarProduto());
        
    }
}
