import java.util.Scanner;
public class ElTiempo{

    public double riesgoHielo(Scanner teclado){
        System.out.println("Introduce la temperatura: ");
        double temperatura = teclado.nextFloat();

        if(temperatura < 2){
          System.out.println("!La temperatura es inferior a 2º¡ !Riesgo de hielo!");
        }
    }
}