package tema3;
import java.util.Scanner;

public class SelectorEjercicios {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;

        while (eleccion != 6) {
            menu();
            eleccion = teclado.nextInt();

            switch (eleccion) {

                case 1:
                    ElTiempo ejercicio1 = new ElTiempo();
                    ejercicio1.riesgoHielo(teclado);
                    break;
                case 2:
                    ElTiempoV2 ejercicio2 = new ElTiempoV2();
                    ejercicio2.riesgoHielo(teclado);
                    break;
                case 3:
                    NombreMes ejercicio3 = new NombreMes();
                    ejercicio3.meses(teclado);
                    break;
                case 4:
                    TiempoCoccion ejercicio4 = new TiempoCoccion();
                    ejercicio4.receta(teclado);
                    break;
                case 5:
                    LaNomina ejercicio5 = new LaNomina();
                    ejercicio5.nominaEmpleado(teclado);
                    break;



            }
        }
        System.out.println("Saliendo . . .");
    }




    private static void menu(){
        System.out.println("\nQue ejercicio quieres ver: \n" );
        System.out.println("1. El tiempo");
        System.out.println("2. El tiempo segunda version");
        System.out.println("3. El nombre del mes");
        System.out.println("4. Tiempo de coccion");
        System.out.println("5. La nomina");
        System.out.println("6. Salir");
    }



}