import java.util.Scanner;

public class ArteASCIIv1 {
    
    public void figura(Scanner teclado){
        int anchura;
        int altura;
        String caracter;
        System.out.println("¿Anchura?: ");
        anchura = teclado.nextInt();
        System.out.println("¿Altura?: ");
        altura = teclado.nextInt();
        System.out.println("¿Carácter?: ");
        caracter = teclado.next();

        for (int i = 1; i <= altura; i++) {
            System.out.println(caracter);
            for (int j = 1; j < anchura; j++) {
                System.out.print(caracter);
            }
        }
    }
}
