package exercicio1;

import exercicio1.product.BoloChocolate;
import exercicio1.product.BoloMorango;
import exercicio1.product.BoloSimples;

public class Main {

    public static void main(String[]args){
        Comprar bolo1 =new BoloSimples();


        System.out.println("\n");
        System.out.println("---PRODUTOS DO CARRINHO---\n");
        
        System.out.println("\n");

        System.out.println(bolo1.listarProdutos());


        System.out.println("\n");
        System.out.println("Adicionando novos produtos \n");
        System.out.println("\n");

        Comprar bolo2 =new BoloSimples();
        bolo2 = new BoloChocolate(bolo2);
        System.out.println(bolo2.listarProdutos());

        Comprar bolo3 =new BoloSimples();
        bolo3 = new BoloMorango(bolo3);
        System.out.println(bolo3.listarProdutos());

        
        Comprar bolo4 =new BoloSimples();
        bolo4 = new BoloMorango(bolo4);
        bolo4 = new BoloChocolate(bolo4);
        System.out.println(bolo4.listarProdutos());



        

        
        

    }

    

       


    
    



}
