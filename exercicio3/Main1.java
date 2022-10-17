package exercicio3;

import exercicio3.log.Facebook;
import exercicio3.log.Formulario;
import exercicio3.log.Google;
import exercicio3.log.iCloud;

public class Main1 {
    

    public static void main(String[] args) {
        Usuario1 Maria = new Usuario1("MARIA");
        Maria.logar();
        
        String acesso=new String("093283");
        App app=new App(acesso);
        app.metodoLogin(new Google());

        System.out.println("\n");

        Usuario1 Luana = new Usuario1("LUANA");
        Luana.logar();
        
        String acesso1=new String("093283");
        App app1=new App(acesso1);
        app1.metodoLogin(new iCloud());

        System.out.println("\n");


        System.out.println("-----trocando metodo de Login------" );
        System.out.println("\n");
        Maria.logar();
        app.metodoLogin(new Formulario());
        app.metodoLogin(new Facebook());
        app.metodoLogin(new iCloud());

        System.out.println("\n");


       
       
        System.out.println("\n");
        Luana.logar();
        app.metodoLogin(new Formulario());
        app.metodoLogin(new Facebook());
       

    }
}