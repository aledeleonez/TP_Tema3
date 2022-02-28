package tema3;

import java.util.Scanner;

public class TiempoCoccion {
        public void receta (Scanner teclado) {
            int tipoCarne = 0;
            int modoCoccion = 0;
            int gramos = 0;
            boolean carne = true;
            boolean modo = true;
            boolean peso = true;

            while (carne) {
                System.out.println("¿Que tipo de carne es?\n1. Vacuno\n2. Cordero");
                tipoCarne = teclado.nextInt();
                if (tipoCarne == 1 || tipoCarne == 2) {
                    carne = false;
                } else {
                    System.out.println("Tipo de carne no valido");
                }
            }
            while (modo) {
                System.out.println("¿Como desea la carne?\n1. Casi cruda\n2. Al punto\n3. Bien hecha");
                modoCoccion = teclado.nextInt();
                if (modoCoccion == 1 || modoCoccion == 2 || modoCoccion == 3) {
                    modo = false;
                } else {
                    System.out.println("Modo de coccion no valido");
                }
            }
            while (peso) {
                System.out.println("Introduzca el peso en gramos: ");
                gramos = teclado.nextInt();
                if (gramos > 0) {
                    peso = false;
                } else {
                    System.out.println("Introduzca un valor correcto");
                }
            }
            if (tipoCarne == 1) {
                if (modoCoccion == 1) {
                    System.out.println("El tiempo de coccion sera: " + ((gramos * 10) / 500) * 60);
                } else if (modoCoccion == 2) {
                    System.out.println("El tiempo de coccion sera: " + ((gramos * 17) / 500) * 60);
                } else {
                    System.out.println("El tiempo de coccion sera: " + ((gramos * 25) / 500) * 60);
                }
            } else {
                if (modoCoccion == 1) {
                    System.out.println("El tiempo de coccion sera: " + ((gramos * 15) / 500) * 60);
                } else if (modoCoccion == 2) {
                    System.out.println("El tiempo de coccion sera: " + ((gramos * 25) / 500) * 60);
                } else {
                    System.out.println("El tiempo de coccion sera: " + ((gramos * 40) / 500) * 60);
                }


            }

        }

}
