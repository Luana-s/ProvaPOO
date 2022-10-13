package exercicio1.product;

import exercicio1.Comprar;


public class BoloSimples implements Comprar{
    
    
    public String adicionarProduto(){
        return "Bolo Simples, ";
    }

    public double ValorCompra(){
        return 40;

    }

    @Override
    public String ListarProdutos() {
        return("Preco:" + ValorCompra() + ", Items: , " + adicionarProduto());    
    } 
        
    

    

    
}
