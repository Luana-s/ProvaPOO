package exercicio3;

public abstract class App {

    Login login;
    public void setLogin(Login login){
        this.login=login;
    }

    public void LogarGoogle(){
        if (this.login != null) {
            this.login.LogarGoogle();
        } else {
            System.out.println("Não há login do usuario pelo Google!");
        }
    }
    public void LogarFormulario(){
        if (this.login != null) {
            this.login.LogarFormulario();
        } else {
            System.out.println("Não há login do usuario pelo Formulario!");
        }
    }
    public void LogariCloud(){
        if (this.login != null) {
            this.login.LogariCloud();
        } else {
            System.out.println("Não há login do usuario pelo iCloud!");
        }
     }

     public void LogarFacebook(){
        if (this.login != null) {
            this.login.LogarFacebook();
        } else {
            System.out.println("Não há login do usuario pelo Facebook!");
        }
     }

        

    }

    
    
    

