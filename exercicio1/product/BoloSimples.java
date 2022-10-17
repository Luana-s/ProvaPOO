package exercicio1.product;

import exercicio1.Comprar;


public class BoloSimples implements Comprar{
    
    @Override
    public String adicionarProduto(){
        return "Bolo Simples, ";
    }

    @Override
    public double valorCompra(){
        return 40;
    }

    @Override
    public String listarProdutos() {
        return("Preco:" + valorCompra() + ", Items: , " + adicionarProduto());    
    } 
        
    

    

    
}
