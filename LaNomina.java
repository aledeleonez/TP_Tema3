import java.util.Scanner;

public class LaNomina{

        public void nominaEmpleado(Scanner teclado){
                System.out.println("Apellido del empleado: ");
                String apellido = teclado.next();
                System.out.println("Nombre del empleado: ");
                String nombre = teclado.next();
                System.out.println("Puesto del empleado: ");
                System.out.println("1. Agente de servicio");
                System.out.println("2. Empleado de oficina");
                System.out.println("3. Directivo");
                int puesto = teclado.nextInt();

        }
}