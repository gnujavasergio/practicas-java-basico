import java.util.Locale;
import java.util.Scanner;

public class Operadores {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        int operacion;
        boolean salir = false;
        while (!salir) {
            System.out.println("Elige el tipo de operación que quieres hacer:");
            System.out.println("1 - Aritmeticos y aritmeticos");
            System.out.println("2 - Logicas y de Comparación");
            System.out.println("3 - Asignación");
            System.out.println("0 - Salir");
            operacion = entrada.nextInt();

            switch (operacion) {
                case 1:
                    System.out.println("1 - Aritmeticos y de Incremento");
                    // Ejercicio 1
                    int a = 4;
                    int b = 3;
                    int suma = a  + b;
                    int resta = a - b;
                    System.out.println("Suma: " + suma);
                    System.out.println("Resta: " + resta);
                    break;
                case 2:
                    System.out.println("2 - Logicas y de Comparación");
                    // Ejercicio 2
                    break;
                case 3:
                    System.out.println("3 - Asignación");
                    // Ejercicio 3
                    break;
                case 0:
                    System.out.println("Bye bye");
                    salir = true;
                    break;
                default:
                    System.out.println("No selecciono ninguna operación");
            }
        }
    }
}
