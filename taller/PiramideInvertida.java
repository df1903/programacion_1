// pirámide invertida java

// importaciones
import java.util.Scanner;

public class PiramideInvertida {

    public static void main(String[] args) {

        // variables
        Scanner in = new Scanner(System.in);
        int base = 0;

        // ingreso de datos 
        System.out.print("Ingrese base de la pirámide invertida: ");
        base = in.nextInt();

        System.out.println();
        
        // mostrar pirámide invertida
        for (int i = base; i > 0; i--) {
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
