package exercicio3;

import exercicio3.log.Facebook;
import exercicio3.log.Formulario;
import exercicio3.log.Google;
import exercicio3.log.iCloud;

public class Main1 {
    

    public static void main(String[] args) {
        Usuario1 Maria = new Usuario1("MARIA");
        Maria.Logar();
        
        String acesso=new String("093283");
        App app=new App(acesso);
        app.MetodoLogin(new Google());

        System.out.println("\n");

        System.out.println("-----trocando metodo de Login------" );
        System.out.println("\n");
        Maria.Logar();
        app.MetodoLogin(new Formulario());
        app.MetodoLogin(new Facebook());
        app.MetodoLogin(new iCloud());

        System.out.println("\n");


        Usuario1 Luana = new Usuario1("LUANA");
        Luana.Logar();
        
        String acesso1=new String("093283");
        App app1=new App(acesso1);
        app1.MetodoLogin(new iCloud());

        System.out.println("\n");

        System.out.println("-----trocando metodo de Login------" );
        System.out.println("\n");
        Luana.Logar();
        app.MetodoLogin(new Formulario());
        app.MetodoLogin(new Facebook());
       

    }
}