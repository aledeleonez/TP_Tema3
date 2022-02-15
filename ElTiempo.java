import java.util.Scanner;
public class ElTiempo{

    public double riesgoHielo(Scanner teclado){
        System.out.println("Introduce la temperatura en grados centígrados(ºC): ");
        double temperatura = teclado.nextFloat();

        if(temperatura < 2){
          System.out.println("!La temperatura es inferior a 2º¡ !Riesgo de hielo!");
        }else{
          System.out.println("No hay riesgo de hielo");
        }
    }
}