// exponencial java

// importaciones
import java.util.Scanner;

public class Exponencial {

    public static void main(String[] args) {
        
        // variables
        Scanner in =new Scanner(System.in);
        int base = 0;
        int exponente = 0;
        
        // ingreso de datos
        System.out.print("Ingrese la base: ");
        base = in.nextInt();
        System.out.print("Ingrese el exponente: ");
        exponente = in.nextInt();

        // mostrar resultados
        System.out.println("Resultado = " + Math.pow(base, exponente)); 

        System.out.println();
    }
    
}
