package exercicio3;

public class Google implements Login {
    public Google() {
    }

    @Override
    public void LogarGoogle() {
        System.out.println("logando pelo Google!");
        
    }

    @Override
    public void LogarFacebook() {
        System.out.println("logando pelo Facebook!");
        
    }

    @Override
    public void LogarFormulario() {
        System.out.println("logando pelo Formulario!");
    }

    @Override
    public void LogariCloud() {
        System.out.println("logando pelo iCloud!");
       
    }
    

}
