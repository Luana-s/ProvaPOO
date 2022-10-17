package exercicio1.product;

import exercicio1.Comprar;

public class BoloMorango extends BoloDecorator implements Comprar{

    public BoloMorango(Comprar bolo) {
        super(bolo);
        
    }
    @Override
    public String adicionarProduto() {
        return super.adicionarProduto() + "Cobertura de Morango, ";
        
        
    }
    @Override
    public double valorCompra() {
        return super.valorCompra() + 15;
    }            
    @Override
    public String listarProdutos() {
        return("Preco:" + valorCompra() + ", Items: , " + adicionarProduto());
        
    }
      
}


    

