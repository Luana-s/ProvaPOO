import java.util.ArrayList;

public class Cliente {
    protected String nome;
    protected int agencia;
    private ArrayList<ContaCorrente> contaCorrente = new ArrayList<>();

    public ArrayList<ContaCorrente> getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ArrayList<ContaCorrente> contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public Cliente(String string) {
    }

    @Override
    public String toString() {
        return "Nome do Cliente: " + nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void cliente(String string) {
    }

    public void quantContaCorrente(){
        for (ContaCorrente conta :  contaCorrente) {
            System.out.println(conta);
        }
    }
}
