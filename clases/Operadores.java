import java.util.Scanner;


public class Operadores {

    
    public static void main(String[] args) {

        System.out.println();

        // imports

        Scanner in = new Scanner(System.in);
        
        // variables

        double numero1 = 0;
        double numero2 = 0;
        double suma = 0;
        double suma2 = 0;
        double resta = 0;
        double multiplicacion = 0; 
        double division = 0;
        double mod = 0;
        
        // constantes

        final int incremento = 10;

        // ingreso de datos
        
        System.out.print("Ingrese el primer numero: ");
        numero1 = in.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        numero2 = in.nextInt();

        // operaciones
        suma = numero1 + numero2;
        suma2 = suma + incremento;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        
        // mostrar resultados 
        System.out.println("\nResultados");
        System.out.println("Suma: "+ suma);
        System.out.println("Resta: division "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.println("Suma + incremento: "+suma2 );

        if(numero2 != 0){
            division = (numero1 / numero2);
            mod= (numero1 % numero2);

            System.out.println("División: "+division);
            System.out.println("Residuo de la división: " + mod); 
        }else{
            System.out.println("La división no se puede hacer");
        }

        if( suma * incremento > multiplicacion ){
            suma = suma * incremento;
        }

        if (numero1%numero2==0){
            System.out.println("El primer numero es múltiplo del segundo");
        }else{
            System.out.println("El primer numero no es múltiplo del segundo");
        }
            
    }
    
}
