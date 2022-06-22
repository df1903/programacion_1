// signo de un numero en java

// importaciones
import java.util.Scanner;

public class Signo {

    public static void main(String[] args) {
        
        // variables
        Scanner in = new Scanner (System.in);
        int numero = 0;
        
        // ingreso de datos
        System.out.print("Ingrese un numero: ");
        numero = in.nextInt();

        // mostrar resultados
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if ( numero < 0) {
            System.out.println("El numero es negativo");  
        } else {
            System.out.println("El numero es un cero");
        }

        System.out.println();
        
    }   
}