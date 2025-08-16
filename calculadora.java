import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la operación (suma, resta, multiplicacion, division):");
        String opcion = sc.next();
        
        System.out.println("Ingrese un numero:");
        int N1 = sc.nextInt();

        System.out.println("Ingrese otro numero:");
        int N2 = sc.nextInt();

        int n = 1;
        do {
            switch (opcion) {
                case "suma":
                    System.out.println("Resultado de la suma: " + (N1 + N2));
                    break;
                case "resta":
                System.out.println("Resultado de la resta: " + (N1 - N2));
                break;
            case "multiplicacion":
                System.out.println("Resultado de la multiplicación: " + (N1 * N2));
                break;
            case "division":
                if (N2 != 0) {
                    System.out.println("Resultado de la división: " + (N1 / N2));
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            default:
                System.out.println("Operación no reconocida. Se realiza suma.");
        }
        System.out.println("Desea realizar otra operacion? (1: Si, 0: No)");
        n = sc.nextInt();
    } while (n > 0);
    sc.close();
    }
}