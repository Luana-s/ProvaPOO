package exercicio5;

public abstract class UFALBluetooth {

    public UFALBluetooth(){
        abrirConexao();
        fecharConexao();
        processarDados();

    }

    public void  abrirConexao(){
        System.out.println("Abrindo conexao ao Bluetooth ");
    }

    protected abstract void processarDados();

    public void  fecharConexao(){
        System.out.println(" Fechando conexao ao Bluetooth ");
    }

    

    
    
}
   

    