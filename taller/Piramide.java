// pirámide java

// importaciones
import java.util.Scanner;

public class Piramide {

    public static void main(String[] args) {
        
        // variables
        Scanner in = new Scanner(System.in);
        int base = 0;
        
        // ingreso de datos 
        System.out.print("Ingrese base de la pirámide: ");
        base = in.nextInt();
        
        System.out.println();

        // mostrar pirámide
        for (int i = 1; i <= base; i++) {
            for (int j = i; j < base; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
