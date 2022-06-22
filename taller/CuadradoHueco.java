// cuadrado hueco java

// importaciones java
import java.util.Scanner;

public class CuadradoHueco {

    public static void main(String[] args) {
        
        //variables
        Scanner in = new Scanner(System.in);
        int horizontal = 0;
        int vertical = 0;
        
        // ingreso de datos
        System.out.print("Ingrese el tamaño horizontal  del Cuadrado: ");
        horizontal = in.nextInt();
        System.out.print("Ingrese el tamaño vertical del Cuadrado: ");
        vertical = in.nextInt();        
        
        // mostrar cuadro
        for (int i = 0; i < vertical; i++) {
            if (i == 0 || i == (vertical - 1)) {
                for (int j = 0; j < horizontal; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < vertical; j++) {
                    if (j == 0 || j == (horizontal - 1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }                   
                }
            } 
            System.out.println();            
        }
        System.out.println();
    }
}
