// par o impar en java

// importaciones
import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        
        // variables
        Scanner in= new Scanner (System.in);
        int numero = 0;

        // ingreso de datos
        System.out.print("ingrese un numero entero: ");
        numero = in.nextInt();

        // mostrar resultados
        if (numero % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es un numero impar");
        }
        
        System.out.println();
        
    }
}



