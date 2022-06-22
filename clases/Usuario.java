// registro y verificación de usuario y contraseña

// importaciones
import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {

        // varibles
        Scanner in = new Scanner(System.in);
        String usuario;
        String genero;
        String contraseña;
        int intentos = 0;
        int edad = 0;
        
        // registro
        do{
            if (intentos >= 1) {
                System.out.println("Tiene que ser mayor de 18 años para continuar el registro");
            }
            System.out.print("Ingrese edad: ");
            edad = in.nextInt();
            intentos++;
        }while(edad < 18);

        System.out.print("Ingrese genero: ");
        usuario = in.nextLine();
        System.out.print("Ingrese nombre de usuario: ");
        usuario = in.nextLine();
        System.out.print("Ingrese contraseña de usuario: ");
        contraseña = in.nextLine();

        // variables de validación
        String uContraseña;
        String uUsuario;

        // validación usuario y contraseña
        System.out.print("Usuario: ");
        uUsuario = in.nextLine();
        System.out.print("Contraseña:");
        uContraseña = in.nextLine();

        if ((usuario.equals(uUsuario)) && (contraseña.equals(uContraseña))) {
            System.out.println("Usuario y contraseña correctos");
            
        } else {
            System.out.println("Usuario o contraseña incorrecta");
        }


        System.out.println("Ingrese nombre de usuarios"+usuario);
    }
    
}
