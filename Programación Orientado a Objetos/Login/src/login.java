
import java.util.Scanner;

public class login {

    public static void main(String[] args) {
        String usuario = "", password ="";
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el Nombre del usuario:");
        usuario = entrada.nextLine();
        System.out.print("Ingrese la Contraseña");
        password = entrada.nextLine();
        
        if(usuario.equals("Neisser")&& password.equals("123456")){
            System.out.print("Inicio de Sesión correcta");
        } else{
            System.out.print("Inicio de Sesión Incorrecta");
        }
        
        
        
        
    }
    
}
