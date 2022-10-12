package exercicio3;


public class Usuario1 {
    protected String nome;

    /**
     * @param nome
     */
    public Usuario1(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Logar(){
        System.out.println(getNome());
    }

    
    

    
}
