package tema3;
import java.util.Scanner;
public class ElTiempo{
  //Ejercicio2

    public double riesgoHielo(Scanner teclado){
        System.out.println("Introduce la temperatura en grados centígrados(ºC): ");
        double temperatura = teclado.nextFloat();

        if(temperatura < 2){
          System.out.println("Riesgo de hielo");
        }
        else if(temperatura >= 2 && temperatura < 15){
          System.out.println("Hace frío");
        }
        else if(temperatura >= 15 && temperatura < 30){
            System.out.println("Buena temperatura");
        }else if(temperatura >= 30){
            System.out.println("Demasiado calor");
        }
    }
}