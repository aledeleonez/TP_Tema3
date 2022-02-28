package tema3;
import java.util.Scanner;

public class NombreMes{
    //Ejercicio 3

    public void meses (Scanner teclado){
        boolean x = true;
        while(x){

        System.out.println("Introduce el numero del mes");
        int mes = teclado.nextInt();



        switch(mes) {
            case 1:
                System.out.println("Enero");
                x = false;
                break;
            case 2:
                System.out.println("Febrero");
                x = false;
                break;
            case 3:
                System.out.println("Marzo");
                x = false;
                break;
            case 4:
                System.out.println("Abril");
                x = false;
                break;
            case 5:
                System.out.println("Mayo");
                x = false;
                break;
            case 6:
                System.out.println("Junio");
                x = false;
                break;
            case 7:
                System.out.println("Julio");
                x = false;
                break;
            case 8:
                System.out.println("Agosto");
                x = false;
                break;
            case 9:
                System.out.println("Septiembre");
                x = false;
                break;
            case 10:
                System.out.println("Octubre");
                x = false;
                break;
            case 11:
                System.out.println("Noviembre");
                x = false;
                break;
            case 12:
                System.out.println("Diciembre");
                x = false;
                break;
            default:
                System.out.println("Valor no valido");

           }
        }
    }
}