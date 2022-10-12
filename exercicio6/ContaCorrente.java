public class ContaCorrente {
    protected float saldo;

    Cliente c = new Cliente(null);
    public void Contal(){

    }
    public ContaCorrente(String nome,int agencia) {
        c.nome = nome;
        c.agencia = agencia;
    }
    public void Depositar(float valor){
        this.setSaldo(valor);;
    }

    public boolean Sacar(float valor){
        float extrato = this.saldo - valor;
        if(extrato > 0){
            this.setSaldo(extrato);
            return true;
        }
        return false;
    }

    public void transferir(float transferir){
        float resultado = this.saldo - transferir;
        if(resultado > 0){
            this.setSaldo(resultado);
        }
        else{
            System.out.println("Nao e possivel transferir ");
        }
    }
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        return "Nome do Cliente: " + c.nome + "\nSaldo: " + saldo;
    }
    
}