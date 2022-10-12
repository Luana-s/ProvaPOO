package exercicio1;

import java.util.ArrayList;

public class Produto {
    private String nomeProduto;
    private ArrayList<Item> items;


    public Produto(String nomeProduto, ArrayList<Item> items){
        this.nomeProduto=nomeProduto;
        this.items=items;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void adicionar(){

    }
    
}
