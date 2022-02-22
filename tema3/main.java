package tema3;
import java.util.Scanner;

public class main{
   public static void selectorEjercicios (String[] args){
    Scanner teclado = new Scanner(System.in);
    seleccionarprograma();
    int eleccion = teclado.nextInt();
    switch (eleccion){
        case 3:
        
        
        NombreMes meses = new NombreMes();
        meses.meses(teclado);

    
    
  }
     }




  private static void seleccionarprograma(){
            System.out.println("Que ejercicio quieres ver: \n" );
            System.out.println("1. El tiempo");
            System.out.println("2. El tiempo versión 2");
            System.out.println("3. El nombre del mes");
         }



}
