package tema3;
import java.util.Scanner;

public class LaNomina{
    //Ejercicio 5
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
              System.out.println("Número de horas trabajadas:");
              int horas = teclado.nextInt();
              System.out.println("Tarifa horaria:");
              double tarifa = teclado.nextFloat();
              System.out.println("Número de hijos: ");
              int hijos = teclado.nextInt();
              System.out.println(String.format("Nómina de %s %s", nombre, apellido));
              String estado[] = {"", "Agente de servicio", "Empleado de oficina", "Directivo"};
              System.out.println(String.format("Estado: %s", estado[puesto]));
              System.out.println(String.format("Salario bruto: %.2f €", salarioBruto(horas,tarifa)));
              System.out.println("Contribución para el pago de la deuda social y contingencias comunes imponible: ");
              System.out.println(String.format("%.2f x 3,49 %% = %.2f €", salarioBruto(horas,tarifa), salarioBruto(horas,tarifa)*0.0349));
              System.out.println("Contribución de contingencias comunes no imponible: ");
              System.out.println(String.format("%.2f x 6,15 %% = %.2f €", salarioBruto(horas,tarifa), salarioBruto(horas,tarifa)*0.0615));
              System.out.println("Seguro médico: ");
              System.out.println(String.format("%.2f x 0,95 %% = %.2f €", salarioBruto(horas,tarifa), salarioBruto(horas,tarifa)*0.0095));
              System.out.println("Fondo de pensiones: ");
              System.out.println(String.format("%.2f x 8,44 %% = %.2f €", salarioBruto(horas,tarifa), salarioBruto(horas,tarifa)*0.0844));
              System.out.println("Seguro de desempleo: ");
              System.out.println(String.format("%.2f x 3,05 %% = %.2f €", salarioBruto(horas,tarifa), salarioBruto(horas,tarifa)*0.0305));
              System.out.println("Pensión complementaria (Entidad privada): ");
              System.out.println(String.format("%.2f x 3,81 %% = %.2f €", salarioBruto(horas,tarifa), salarioBruto(horas,tarifa)*0.0381));
              System.out.println("Contribución de jubilación anticipada: ");
              System.out.println(String.format("%.2f x 1,02 %% = %.2f €", salarioBruto(horas,tarifa), salarioBruto(horas,tarifa)*0.0102));
              double total = salarioBruto(horas, tarifa);
              double suma = total*0.0349+total*0.0615+total*0.0095+total*0.0844+total*0.0305+total*0.0381+total*0.0102;
              System.out.println(String.format("Deducciones totales de los empleados: %.2f", suma));
              System.out.println(String.format("Salario neto: %.2f €", total-suma));
              System.out.println(String.format("Prima familiar: ", primaFamiliar(hijos)));
              System.out.println(String.format("Salario neto a pagar: %.2f €", (total-suma)+primaFamiliar(hijos)));
                
          
        }

        private static double salarioBruto(int horas, double tarifa){
                double salBruto = 0;
                if(horas < 169){
                        salBruto = horas*tarifa;
                }
                else if(horas >= 169 && horas < 180){
                        salBruto = (169*tarifa)+((horas-169)*((tarifa*0.5)+tarifa));
                }
                else if(horas >= 180){
                        salBruto = (169*tarifa)+((horas-169)*((tarifa*0.5)+tarifa))+(((horas-180)*(tarifa*0.6))+tarifa);
                }

                return salBruto;
        }

        private static int primaFamiliar(int hijos){
            int prima = 0;
            if(hijos == 1){
                prima = 10;
            }
            else if(hijos == 2){
                prima = 50;
            }
            else if (hijos > 2){
                prima = 70 + 20*hijos;
            }

            return prima;
        }
}