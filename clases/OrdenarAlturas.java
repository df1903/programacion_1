// ordenar alturas

// importaciones
import java.util.Scanner;

public class OrdenarAlturas {

   public static void main(String[] args) {

      // variables
      Scanner in = new Scanner (System.in);
      int estatura1 = 0;
      int estatura2 = 0;
      int estatura3 = 0;

      // ingreso de datos
      System.out.print("Ingrese la primera estatura: ");
      estatura1= in.nextInt();
      System.out.print("Ingrese la segunda  estatura:");
      estatura2= in.nextInt();
      System.out.print("Ingrese la tercera estatura: ");
      estatura3= in.nextInt();  

      // mostrar resultados
      if ((estatura1 > estatura2) && (estatura1 > estatura3)) {
         if (estatura2 > estatura3) {
            System.out.println(estatura1 + "\n" + estatura2 + "\n"+ estatura3);
         } else {
            System.out.println(estatura1 + "\n" + estatura3 + "\n"+ estatura2);
         }
      } else if ((estatura2 > estatura1) && (estatura2 > estatura3)) {
         if (estatura1 > estatura2) {
            System.out.println(estatura2 + "\n" + estatura1 + "\n"+ estatura3);
         } else {
            System.out.println(estatura2 + "\n" + estatura3 + "\n"+ estatura1);
         }
      } else {
         if (estatura1 > estatura2){
            System.out.println(estatura3 + "\n" + estatura1 + "\n"+ estatura2);
         } else {
            System.out.println(estatura3 + "\n" + estatura2 + "\n"+ estatura1);
         }
      }     
   }
}
